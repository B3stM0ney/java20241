package Parcial2;

public class Moto extends Vehiculo {

    private boolean tieneSideCar;

    public Moto(String marca, double precio, int cilindraje, boolean tieneSidecar) {
        super(marca, precio, cilindraje);
        this.tieneSideCar = tieneSidecar;
        ajustarImpuestoCirculacion();
        ajustarCuotaMesGaraje();
    }

    private void ajustarImpuestoCirculacion() {
        if (tieneSideCar) {
            double impuestoAnterior = getImpuestoCirculacion();
            double impuestoAdicional = impuestoAnterior * 0.10;
            setImpuestoCirculacion(impuestoAnterior + impuestoAdicional);
        }
    }

    private void ajustarCuotaMesGaraje() {
        if (tieneSideCar) {
            double cuotaAnterior = getCuotaMesGaraje();
            double aumentoCuota = cuotaAnterior * 0.50;
            setCuotaMesGaraje(cuotaAnterior + aumentoCuota);
        }
    }

    @Override
    public String toString() {
        return "Moto {\n" +
                "\tplaca='" + getPlaca() + "',\n" +
                "\tmarca='" + getMarca() + "',\n" +
                "\tprecio=" + getPrecio() + ",\n" +
                "\tcilindraje=" + getCilindraje() + ",\n" +
                "\timpuestoCirculacion=" + getImpuestoCirculacion() + ",\n" +
                "\tcuotaMesGaraje=" + getCuotaMesGaraje() + ",\n" +
                "\ttieneSideCar=" + tieneSideCar + "\n" +
                "}";
    }

}
