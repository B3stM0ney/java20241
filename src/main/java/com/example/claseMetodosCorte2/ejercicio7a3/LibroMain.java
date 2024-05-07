package com.example.claseMetodosCorte2.ejercicio7a3;

public class LibroMain {

    public static void main(String[] args) {

        Libro libro1 = new Libro("El nombre del viento", "Patrick Rothfuss", 5);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 3);

        System.out.println("Prestar libro1: " + libro1.prestar()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Prestar libro1: " + libro1.prestar()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Prestar libro1: " + libro1.prestar()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Prestar libro1: " + libro1.prestar()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Prestar libro1: " + libro1.prestar()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Prestar libro1: " + libro1.prestar()); // false (ya no hay ejemplares disponibles)

        System.out.println("Prestar libro2: " + libro2.prestar()); // true
        System.out.println("Prestar libro2: " + libro2.prestar()); // true
        System.out.println("Prestar libro2: " + libro2.prestar()); // true
        System.out.println("Prestar libro2: " + libro2.prestar()); // false (ya no hay ejemplares disponibles)

        // Devolver algunos libros
        System.out.println("Devolver libro1: " + libro1.devolver()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Devolver libro1: " + libro1.devolver()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Devolver libro1: " + libro1.devolver()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Devolver libro1: " + libro1.devolver()); // false (no hay ejemplares prestados)
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Devolver libro1: " + libro1.devolver()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());
        System.out.println("Devolver libro1: " + libro1.devolver()); // true
        System.out.println(libro1.getNumEjemplaresPrestados());

        System.out.println("Devolver libro2: " + libro2.devolver()); // true
        System.out.println("Devolver libro2: " + libro2.devolver()); // true
        System.out.println("Devolver libro2: " + libro2.devolver()); // false (no hay ejemplares prestados)
    }

}
