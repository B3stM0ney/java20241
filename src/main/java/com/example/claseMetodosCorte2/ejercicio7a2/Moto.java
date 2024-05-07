package com.example.claseMetodosCorte2.ejercicio7a2;

class Moto {

    private int velocidad;

    
    public Moto() {
        velocidad = 0; 
    }

    
    public void acelerar(int cantidad) {
        if (velocidad + cantidad <= 150) {
            velocidad += cantidad;
        } else {
            System.out.println("No se puede acelerar más, velocidad máxima alcanzada (150)");
        }
        System.out.println("La velocidad actual de la moto es: " + velocidad);
    }

    
    public void frenar(int cantidad) {
        if (velocidad >= cantidad) {
            velocidad -= cantidad;
        } else {
            velocidad = 0; // No podemos tener velocidades negativas
        }
        System.out.println("La velocidad actual de la moto es: " + velocidad);
    }


    public int getVelocidad() {
        return velocidad;
    }
}