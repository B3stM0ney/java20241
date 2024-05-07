package com.example.claseMetodosCorte2.ejercicio7a3;

class Libro {

    private String titulo;
    private String autor;
    private int numEjemplaresTotal;
    private int numEjemplaresPrestados;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEjemplaresTotal() {
        return numEjemplaresTotal;
    }

    public void setNumEjemplaresTotal(int numEjemplaresTotal) {
        this.numEjemplaresTotal = numEjemplaresTotal;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public Libro(String titulo, String autor, int numEjemplaresTotal) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplaresTotal = numEjemplaresTotal;

    }

    public boolean prestar() {
        if (numEjemplaresPrestados < numEjemplaresTotal) {
            numEjemplaresPrestados++;
            System.out.println("Libro prestado exitosamente");
            return true;
        } else {
            System.out.println("Todos los ejemplares se encuentran prestados");
            return false;
        }
    }

    public boolean devolver() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            System.out.println("Libro devuelto exitosamente");
            return true;
        } else {
            System.out.println("No se puede devolver el libro. No hay ejemplares prestados.");
            return false;
        }
    }

}