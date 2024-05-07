package Parcial2;

import java.util.ArrayList;
import java.util.List;

public class Garaje implements iGaraje {
    private Vehiculo[] espacios;
    private static final int NUMERO_DE_ESPACIOS = 10; // Total espacios
    private int cantidadMotos = 0;

    public Garaje() {
        this.espacios = new Vehiculo[NUMERO_DE_ESPACIOS];
    }

    @Override
    public double calcularIngresos() {
        double ingresos = 0;
        for (Vehiculo v : espacios) {
            if (v != null) {
                ingresos += Vehiculo.getCuotaMesGaraje();
            }
        }
        return ingresos;
    }

    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        int count = 0;
        for (Vehiculo veh : espacios) {
            if (veh != null && veh.getClass().equals(v.getClass())) {
                count++;
            }
        }
        return count;
    }

    public boolean agregarVehiculo(Vehiculo v) {
        if (v.getPlaca() == null || v.getPlaca().isEmpty()) {
            return false; // No se puede alquilar sin matrícula
        }

        if (v instanceof Moto && cantidadMotos >= NUMERO_DE_ESPACIOS * 0.8) {
            return false; // No se puede superar el 80% de motos
        }

        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] == null) {
                espacios[i] = v;
                if (v instanceof Moto) {
                    cantidadMotos++;
                }
                return true;
            }
        }
        return false; // No hay espacio disponible
    }

    public boolean retirarVehiculo(String placa) {
        for (int i = 0; i < espacios.length; i++) {
            if (espacios[i] != null && espacios[i].getPlaca().equals(placa)) {
                if (espacios[i] instanceof Moto) {
                    cantidadMotos--;
                }
                espacios[i] = null;
                return true;
            }
        }
        return false;
    }

    public List<String> listarVehiculos() {
        List<String> listado = new ArrayList<>();
        for (Vehiculo v : espacios) {
            if (v != null) {
                listado.add("Placa: " + v.getPlaca() + ", Cuota: " + Vehiculo.getCuotaMesGaraje() + ", Tipo: " + v.getClass().getSimpleName());
            }
        }
        return listado;
    }

    public Vehiculo[] obtenerEspacios() {
        return espacios;
    }
}
