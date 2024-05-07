package com.example;

import java.util.Arrays;
import java.util.Random;

//DIEGO GARRIDO CODIGO: U20232217117//

public class Parcial {
   public static void main(String[] args) {

      Random random = new Random(); // se crea generador de numeros aleatorios//
      
      int CarrerasMax = random.nextInt(20) + 1; //escoge numero aleatorio de carreras entre 1 y 20//

      final int DatosCarrera = 6; // se registran los datos requeridos por carrera//

      String[] nombresJockeys = {"Ana", "Pedro", "Juan","Cesar", "Diana","Maria"};  //lista de los jockeys que participan//

      int[] resultadosCarreras = new int [CarrerasMax * DatosCarrera]; //arreglo para guardar los resultados de todas las carreras//
      int[] puntuacionJockey = new int [nombresJockeys.length]; // arreglo para llevar la puntuacion de cada jockey//

      //se llena la matriz con los resultados de las carrerras//

      for (int i = 0; i < resultadosCarreras.length; i += DatosCarrera) {
         int ganador, segundo, tercero;
     
         // se elige ganador, segundo y tercero//
         ganador = random.nextInt(nombresJockeys.length); // Ganador
         do {
             segundo = random.nextInt(nombresJockeys.length);
         } while (segundo == ganador);
         do {
             tercero = random.nextInt(nombresJockeys.length);
         } while (tercero == ganador || tercero == segundo);
         
         //se asignan los resultados a la carrerra//
         
         resultadosCarreras[i] = ganador; // Código del ganador
         resultadosCarreras[i + 1] = random.nextInt(100) + 100; // Tiempo del ganador (un numero entre 0 y 100 + 100 para que el resultado sea un numero aleatorio entre 100 y 199 segundos)
         resultadosCarreras[i + 2] = segundo; // Código del segundo lugar
         resultadosCarreras[i + 3] = random.nextInt(100) + 100; // Tiempo del segundo lugar
         resultadosCarreras[i + 4] = tercero; // Código del tercer lugar
         resultadosCarreras[i + 5] = random.nextInt(100) + 100; // Tiempo del tercer jockey
     }
      
      //calcular la puntuacion de cada jockey
      for (int i = 0; i < resultadosCarreras.length; i += DatosCarrera) {
         puntuacionJockey[resultadosCarreras[i]] += 5; //5 puntos para el ganador//
         puntuacionJockey[resultadosCarreras[i+2]] += 3; //3 puntos para el segundo lugar//
         puntuacionJockey[resultadosCarreras[i+4]] += 1; //1 punto para el tercer lugar//
      }

      //determinar podio//
      Integer[] indiceJockey = new Integer[nombresJockeys.length];
        for (int i = 0; i < nombresJockeys.length; i++) {
            indiceJockey[i] = i; 
        }

      // se ordenan los jockeys por puntuación de mayor a menor
      Arrays.sort(indiceJockey, (a, b) -> puntuacionJockey[b] - puntuacionJockey[a]);
      
      //se imprimen los resultados de cada carrera//
      System.out.println("Resultados de las carreras:");
        for (int i = 0; i < CarrerasMax; i++) {
            System.out.println("No. Carrera " + i + ", Ganador: Código " + resultadosCarreras[i*DatosCarrera] + " ("
                + nombresJockeys[resultadosCarreras[i*DatosCarrera]] + "), Tiempo Ganador: " + resultadosCarreras[i*DatosCarrera+1]
                + ", Segundo: Código " + resultadosCarreras[i*DatosCarrera+2] + " ("
                + nombresJockeys[resultadosCarreras[i*DatosCarrera+2]] + "), Tiempo Segundo: " + resultadosCarreras[i*DatosCarrera+3]
                + ", Tercero: Código " + resultadosCarreras[i*DatosCarrera+4] + " ("
                + nombresJockeys[resultadosCarreras[i*DatosCarrera+4]] + "), Tiempo Tercero: " + resultadosCarreras[i*DatosCarrera+5]);

               //  resultadosCarreras[i*DatosCarrera] obtiene el indice o cidgo del jockey ganador de la carrera almacenado en "resultadosCarreras" que contiene los resultados
               //  de todas las carreras por lo que i*datoscarrera calcula el inicio correspondiente a la carrera actual
               //nombresJockeys[resultadosCarreras[i*DatosCarrera]] utiliza el codigo del paso anterior como indice para acceder al arreglo nombresJockey y recupera
               //el nombre del jockey ganador
               //para el segundo y tercer lugar se repite el proceso acciendo los codigos de cada jockey y tiempos de los resultados de las carreras.
               
        }

        // Imprimir podio final
                System.out.println("\nPodio del torneo:");
                for (int i = 0; i < 3; i++) {
                    int indiceJockeyActual = indiceJockey[i];
                    System.out.println((i + 1) + "º lugar: " + nombresJockeys[indiceJockeyActual] + " con " + puntuacionJockey[indiceJockeyActual] + " puntos");
                }
        
   }
}