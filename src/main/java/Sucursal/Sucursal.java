package Sucursal;

import java.time.LocalDate;
import java.util.ArrayList;
import Venta.*;

public class Sucursal {
    ArrayList<Venta> ventas = new ArrayList<Venta>();


    public double calcularVentasDeFecha( LocalDate unDia){

    return  ventas
            .stream()
            .filter(venta -> venta.esDeFecha(unDia))
            .mapToDouble(venta->venta.calcularImporte())
            .sum();

    }

    public void registrarVenta(Venta unaVenta){

        ventas.add(unaVenta);
    }
}
