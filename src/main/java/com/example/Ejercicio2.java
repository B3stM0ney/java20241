package com.example;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de llantas a comprar: ");

        int cantidadLlantas = scanner.nextInt();
        int precioPorLlanta;

        // if (cantidadLlantas < 5){
        // precioPorLlanta = 100;
        // } else if (cantidadLlantas <=10){
        // precioPorLlanta = 75;
        // } else {
        // precioPorLlanta = 50;
        // }

        int categoria = cantidadLlantas < 5 ? 1 : cantidadLlantas <= 10 ? 2 : 3;

        switch (categoria) {
            case 1:
                precioPorLlanta = 100;
                break;
            case 2:
                precioPorLlanta = 75;
                break;
            case 3:
                precioPorLlanta = 50;
                break;
            default:
                precioPorLlanta = 0; // Este caso no debería ocurrir
                break;
        }

        int totalPagar = precioPorLlanta * cantidadLlantas;

        System.out.println("Precio por llanta: $" + precioPorLlanta);
        System.out.println("Total a pagar por las " + cantidadLlantas + " Llantas: $" + totalPagar);

        scanner.close();
    }
}
