package Parcial2;

public class Prueba {
    public static void main(String[] args) {
        // Crear un vehículo sin placa inicial
        Vehiculo vehiculo = new Vehiculo("Toyota", 20000, 2500);

        // Imprimir los detalles del vehículo antes de matricularlo
        System.out.println("Placa: " + vehiculo.getPlaca()); // Debería ser null inicialmente
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Precio: " + vehiculo.getPrecio());
        System.out.println("Cilindraje: " + vehiculo.getCilindraje());
        System.out.println("Impuesto de circulación: " + vehiculo.getImpuestoCirculacion());

        // Crear un auto con características específicas
        Auto miAuto = new Auto("Toyota", 30000, 2500, true, true);
        // Intentar matricular el auto con una placa válida
        boolean resultadoMatriculaAuto = miAuto.matricular("XYZ789");
        System.out.println("Matriculación exitosa del auto: " + resultadoMatriculaAuto);
        System.out.println(miAuto.toString());

        Vehiculo vehiculo2 = new Vehiculo("Honda", 15000, 400);
        System.out.println("Placa: " + vehiculo2.getPlaca()); // Debería ser null inicialmente
        System.out.println("Marca: " + vehiculo2.getMarca());
        System.out.println("Precio: " + vehiculo2.getPrecio());
        System.out.println("Cilindraje: " + vehiculo2.getCilindraje());
        System.out.println("Impuesto de circulación: " + vehiculo2.getImpuestoCirculacion());

        // Crear una moto con características específicas

        Moto miMoto = new Moto("Honda", 15000, 500, true); // Supongamos que tiene sidecar
        // Intentar matricular la moto con una placa válida
        boolean resultadoMatriculaMoto = miMoto.matricular("CTJ48S");
        System.out.println("Matriculación exitosa de la moto: " + resultadoMatriculaMoto);
        System.out.println(miMoto.toString());

    }
}
