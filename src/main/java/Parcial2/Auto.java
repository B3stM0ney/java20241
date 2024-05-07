package Parcial2;

public class Auto extends Vehiculo {

    private boolean tieneRadio;
    private boolean tieneNavegador;

    // Constructor que asigna los atributos específicos y heredados.
    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje); // Llama al constructor de la clase base Vehiculo
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        ajustarImpuestoCirculacion();
        ajustarCuotaMesGaraje();
    }

    // Método para ajustar el impuesto de circulación basado en si tiene radio y
    // navegador.
    private void ajustarImpuestoCirculacion() {
        super.calcularImpuestoCirculacion(); // Llama primero al método de la clase base
        if (tieneRadio) {
            setImpuestoCirculacion(getImpuestoCirculacion() + getPrecio() * 0.01); // Añade 1% extra si tiene radio
        }
        if (tieneNavegador) {
            setImpuestoCirculacion(getImpuestoCirculacion() + getPrecio() * 0.02); // Añade 2% extra si tiene navegador
        }
    }

    // Método para ajustar la cuota del garaje basado en el cilindraje.
    private void ajustarCuotaMesGaraje() {
        if (getCilindraje() > 2499) {
            setCuotaMesGaraje(getCuotaMesGaraje() * 1.20); // Aumenta la cuota en 20% si el cilindraje es mayor a 2499
        }
    }

    public String toString() {
        return "Auto {\n" +
                "\tplaca='" + getPlaca() + "',\n" +
                "\tmarca='" + getMarca() + "',\n" +
                "\tprecio=" + getPrecio() + ",\n" +
                "\tcilindraje=" + getCilindraje() + ",\n" +
                "\timpuestoCirculacion=" + getImpuestoCirculacion() + ",\n" +
                "\tcuotaMesGaraje=" + getCuotaMesGaraje() + ",\n" +
                "\ttieneRadio=" + tieneRadio + ",\n" +
                "\ttieneNavegador=" + tieneNavegador + "\n" +
                "}";
    }
}