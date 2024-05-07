package com.example;

import java.util.Random;

//DIEGO GARRIDO CALDERON U20232217117//

public class Parcial4 {
    public static void main(String[] args) {
        Random random = new Random();

        int CarrerasMax = random.nextInt(20) + 1;
        String[] nombresJockeys = {"Ana", "Pedro", "Juan", "Cesar", "Diana", "Maria"};
        int[] puntuacionJockey = new int[nombresJockeys.length];

        for (int i = 0; i < CarrerasMax; i++) {
            int[] tiempos = new int[nombresJockeys.length];
            int[] posicion = new int[nombresJockeys.length];
            
            for (int j = 0; j < nombresJockeys.length; j++) {
                tiempos[j] = random.nextInt(100) + 100; // Genera tiempo
                posicion[j] = j; // Asignar posición original
            }

            // Ordenar los jockeys por tiempo usando el método de selección
            for (int j = 0; j < nombresJockeys.length; j++) {
                for (int k = j + 1; k < nombresJockeys.length; k++) {
                    if (tiempos[j] > tiempos[k]) {
                        int temp = tiempos[j];
                        tiempos[j] = tiempos[k];
                        tiempos[k] = temp;
                        
                        // Intercambiar también las posiciones para saber qué jockey tiene cada tiempo
                        temp = posicion[j];
                        posicion[j] = posicion[k];
                        posicion[k] = temp;
                    }
                }
            }

            // Asignar puntos según las posiciones
            puntuacionJockey[posicion[0]] += 5; // 5 puntos para el ganador
            puntuacionJockey[posicion[1]] += 3; // 3 puntos para el segundo lugar
            puntuacionJockey[posicion[2]] += 1; // 1 punto para el tercer lugar

            // Guardar y mostrar resultados de la carrera
            System.out.println("No. Carrera " + i +
                               ", Ganador: Código " + posicion[0] + " (" + nombresJockeys[posicion[0]] + "), Tiempo Ganador: " + tiempos[0] +
                               ", Segundo: Código " + posicion[1] + " (" + nombresJockeys[posicion[1]] + "), Tiempo Segundo: " + tiempos[1] +
                               ", Tercero: Código " + posicion[2] + " (" + nombresJockeys[posicion[2]] + "), Tiempo Tercero: " + tiempos[2]);
        }

        // Determinar y mostrar el podio final basado en la puntuación total
        for (int i = 0; i < 3; i++) {
            int maxPuntos = -1;
            int jockeyConMaxPuntos = -1;
            for (int j = 0; j < puntuacionJockey.length; j++) {
                if (puntuacionJockey[j] > maxPuntos) {
                    maxPuntos = puntuacionJockey[j];
                    jockeyConMaxPuntos = j;
                }
            }
            System.out.println((i + 1) + "º lugar: " + nombresJockeys[jockeyConMaxPuntos] + " con " + maxPuntos + " puntos");
            puntuacionJockey[jockeyConMaxPuntos] = -1; // Esto evita que el mismo jockey sea seleccionado de nuevo
        }
    }
}
