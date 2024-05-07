package Parcial2;

public class Vehiculo {

    private String placa = null; // Se inicializa a null por defecto.
    private String marca;
    private double precio;
    private int cilindraje;
    private double impuestoCirculacion;
    private static double cuotaMesGaraje = 100; // Valor constante inicializado correctamente.

    public Vehiculo() {

    }

    // Constructor que no incluye placa ni impuestoCirculacion.
    public Vehiculo(String marca, double precio, int cilindraje) {
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        calcularImpuestoCirculacion(); // Calcula el impuesto al crear el objeto.
    }

    public void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02; // 2% del precio del vehículo.
    }

    public boolean matricular(String matricula) {
        if (matricula != null && matricula.length() == 6) {
            this.placa = matricula;
            return true;
        } else {
            return false;
        }
    }

    // Setters y Getters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
        calcularImpuestoCirculacion(); // Recalcular impuesto si el precio cambia.
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public static double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public static void setCuotaMesGaraje(double cuotaNueva) {
        if (cuotaNueva >= 0) {
            cuotaMesGaraje = cuotaNueva;
        } else {
            System.out.println("La cuota mensual del garaje no puede ser negativa");
        }
    }
}
