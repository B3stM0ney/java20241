package com.example;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el numero de computadoras a comprar:");
        int numeroPcs = scanner.nextInt();

        double precioPc = 500.0;
        double descuento;
        double totalSinDesc = numeroPcs * precioPc;
        double totalConDesc;

        if (numeroPcs < 5) {
            descuento = totalSinDesc * 0.10;
        } else if (numeroPcs <= 10) {
            descuento = totalSinDesc * 0.20;
        } else {
            descuento = totalSinDesc * 0.40;
        }

        totalConDesc = totalSinDesc - descuento;

        System.out.println("Precio total sin descuento: $" + totalSinDesc);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Precio total con descuento: $" + totalConDesc);
    }
}
