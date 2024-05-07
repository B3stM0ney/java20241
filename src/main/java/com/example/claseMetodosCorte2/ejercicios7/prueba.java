package com.example.claseMetodosCorte2.ejercicios7;

import java.util.Scanner;

public class prueba {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del triángulo:");
        int base = scanner.nextInt();
        System.out.println("Ingrese la altura del triángulo:");
        int altura = scanner.nextInt();
        Triangulo triangulo = new Triangulo(base, altura);

        // Consultar atributos y calcular área
        System.out.println("Triángulo creado con base: " + triangulo.getBase() + " y altura: " + triangulo.getAltura());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());

        // Cambiar valores de atributos
        System.out.println("Ingrese el nuevo valor de la base del triángulo:");
        base = scanner.nextInt();
        System.out.println("Ingrese el nuevo valor de la altura del triángulo:");
        altura = scanner.nextInt();
        triangulo.setBase(base);
        triangulo.setAltura(altura);

        // Consultar atributos y calcular área nuevamente
        System.out.println("Triángulo con nuevos valores: base = " + triangulo.getBase() + ", altura = " + triangulo.getAltura());
        System.out.println("Área del triángulo con nuevos valores: " + triangulo.calcularArea());

        scanner.close();
    }
}
