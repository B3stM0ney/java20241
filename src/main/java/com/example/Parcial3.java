package com.example;

import java.util.Random;
import java.util.Arrays;

public class Parcial3 {
    public static void main(String[] args) {
        Random random = new Random();
        int carrerasMax = random.nextInt(20) + 1;

        String[] nombresJockeys = {"Ana", "Pedro", "Juan", "Cesar", "Diana", "Maria"};
        // Arreglo para información de los jockeys: [1ros puestos, 2dos puestos, 3ros puestos, puntuación total, tiempo total].
        int[][] jockeysInfo = new int[nombresJockeys.length][5];

        for (int carrera = 0; carrera < carrerasMax; carrera++) {
            int[] tiemposCarrera = new int[nombresJockeys.length];
            for (int i = 0; i < nombresJockeys.length; i++) {
                // Generar tiempo aleatorio para cada jockey en la carrera.
                tiemposCarrera[i] = random.nextInt(300) + 300; // Intervalo de 300 segundos.
            }

            // Ordenar a los jockeys basados en sus tiempos para determinar las posiciones.
            Integer[] ordenCarrera = Arrays.stream(tiemposCarrera)
                                            .boxed()
                                            .sorted()
                                            .toArray(Integer[]::new);

            // Actualizar información de jockeysInfo con los resultados de la carrera.
            for (int i = 0; i < ordenCarrera.length; i++) {
                int jockeyIndex = Arrays.asList(ordenCarrera).indexOf(tiemposCarrera[i]);
                jockeysInfo[jockeyIndex][4] += tiemposCarrera[i]; // Suma tiempo total.

                if (i == 0) { // Ganador
                    jockeysInfo[jockeyIndex][0]++;
                    jockeysInfo[jockeyIndex][3] += 5;
                } else if (i == 1) { // Segundo lugar
                    jockeysInfo[jockeyIndex][1]++;
                    jockeysInfo[jockeyIndex][3] += 3;
                } else if (i == 2) { // Tercer lugar
                    jockeysInfo[jockeyIndex][2]++;
                    jockeysInfo[jockeyIndex][3] += 1;
                }
            }
        }

        // Ordenar jockeys por puntuación total.
        Integer[] indicesOrdenados = new Integer[nombresJockeys.length];
        for (int i = 0; i < nombresJockeys.length; i++) {
            indicesOrdenados[i] = i;
        }
        Arrays.sort(indicesOrdenados, (a, b) -> jockeysInfo[b][3] - jockeysInfo[a][3]);

        // Imprimir información detallada de los jockeys.
        System.out.println("Número total de carreras: " + carrerasMax);
        System.out.println("\nPodio del torneo:");
        for (int i = 0; i < 3 && i < nombresJockeys.length; i++) {
            int idx = indicesOrdenados[i];
            System.out.println((i + 1) + "º lugar: " + nombresJockeys[idx] + " con " + jockeysInfo[idx][3] + " puntos");
        }

        System.out.println("\nInformación detallada de los jockeys con tiempos:");
        for (int i = 0; i < nombresJockeys.length; i++) {
            int idx = indicesOrdenados[i];
            System.out.println("Código Jockey: " + idx +
                               ", Nombre: " + nombresJockeys[idx] +
                               ", 1º puestos: " + jockeysInfo[idx][0] +
                               ", 2º puestos: " + jockeysInfo[idx][1] +
                               ", 3º puestos: " + jockeysInfo[idx][2] +
                               ", Puntuación total: " + jockeysInfo[idx][3] +
                               ", Tiempo total: " + jockeysInfo[idx][4]);
        }
    }
}
