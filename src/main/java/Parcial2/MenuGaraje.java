
////////////////////////////////////////
//////@AUTHOR: DIEGO GARRIDO CALDERON//
///@CODIGO: 20232217117///////////////
//////////////////////////////////////

package Parcial2;

import java.util.List;
import java.util.Scanner;

public class MenuGaraje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garaje garaje = new Garaje();
        int opcion;

        do {
            System.out.println("\nGestión del Garaje");
            System.out.println("1.- Alquilar un espacio");
            System.out.println("2.- Retirar vehículo");
            System.out.println("3.- Consulta de ingresos mensuales");
            System.out.println("4.- Consulta proporción autos / motos");
            System.out.println("5.- Listado de matrículas y cuota mensual y tipo vehículo");
            System.out.println("0.- Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de vehículo (1- Auto, 2- Moto):");
                    int tipoVehiculo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    System.out.println("Ingrese marca del vehículo:");
                    String marca = scanner.nextLine();
                    System.out.println("Ingrese precio del vehículo:");
                    double precio = scanner.nextDouble();
                    System.out.println("Ingrese cilindraje del vehículo:");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer después de leer int
                    System.out.println("Ingrese placa del vehículo:");
                    String placa = scanner.nextLine();

                    Vehiculo vehiculo = null;
                    if (tipoVehiculo == 1) {
                        System.out.println("Tiene radio? (true/false):");
                        boolean tieneRadio = scanner.nextBoolean();
                        System.out.println("Tiene navegador? (true/false):");
                        boolean tieneNavegador = scanner.nextBoolean();
                        vehiculo = new Auto(marca, precio, cilindraje, tieneRadio, tieneNavegador);
                    } else if (tipoVehiculo == 2) {
                        System.out.println("Tiene sidecar? (true/false):");
                        boolean tieneSidecar = scanner.nextBoolean();
                        vehiculo = new Moto(marca, precio, cilindraje, tieneSidecar);
                    }
                    vehiculo.setPlaca(placa);

                    if (garaje.agregarVehiculo(vehiculo)) {
                        System.out.println("Vehículo añadido exitosamente.");
                    } else {
                        System.out.println("No se pudo añadir el vehículo. Verifique la información y las restricciones del garaje.");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la placa del vehículo a retirar:");
                    String placaRetiro = scanner.nextLine();
                    if (garaje.retirarVehiculo(placaRetiro)) {
                        System.out.println("Vehículo retirado exitosamente.");
                    } else {
                        System.out.println("No se encontró un vehículo con esa placa.");
                    }
                    break;
                case 3:
                    System.out.println("Ingresos mensuales: " + garaje.calcularIngresos());
                    break;
                case 4:
                    int autos = garaje.calcularOcupacionPorTipoVehiculo(new Auto("Generic", 0, 0, false, false));
                    int motos = garaje.calcularOcupacionPorTipoVehiculo(new Moto("Generic", 0, 0, false));
                    System.out.println("Proporción Autos/Motos: " + autos + "/" + motos);
                    break;
                case 5:
                    List<String> listado = garaje.listarVehiculos();
                    for (String veh : listado) {
                        System.out.println(veh);
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
