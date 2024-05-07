package com.example.claseMetodosCorte2.ejercicio7a2;

public class PruebaMoto {
    public static void main(String[] args) {
        // Crear un objeto de la clase Moto
        Moto moto = new Moto();

        // Acelerar la moto
        System.out.println("Acelerando la moto...");
        moto.acelerar(20);

        // Frenar la moto
        System.out.println("Frenando la moto...");
        moto.frenar(10);

        // Acelerar más la moto
        System.out.println("Acelerando más la moto...");
        moto.acelerar(150);
    }
}