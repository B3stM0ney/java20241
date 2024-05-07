package com.example;

import java.util.Scanner;

public class Ejercicio3 {
   public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            
            System.out.println("ingrese el precio sin iva del reproductor");
            double precioSinIva = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Ingrese la marca del reproductor: ");
            String marca = scanner.nextLine();

            String marcaNosy = "NOSY";

            if (precioSinIva >= 500){

                precioSinIva -= precioSinIva * 0.10;

            }
            if (marca.equalsIgnoreCase(marcaNosy) ) {
                precioSinIva -= precioSinIva * 0.05; // Descuento adicional del 5%
            }


            //Calcular el IvA

            double iva = precioSinIva * 0.19;

            //Calcular el precio total a pagar con el iva incluido

            double precioTotal = precioSinIva + iva;

            //Mostrar resultado

            int precioTotal1 = (int) precioTotal;
            System.out.println("El precio total a pagar por el reproductor con iva incluido es $: " + precioTotal1);

            scanner.close();



        }
}
