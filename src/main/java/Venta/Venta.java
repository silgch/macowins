package Venta;

import java.time.LocalDate;
import java.util.ArrayList;


public class Venta {
    ArrayList<Item> items = new ArrayList<Item>();
    LocalDate fecha;


    public Venta() {

    }

    public Venta(ArrayList<Item> items, LocalDate fecha) {
        this.items = items;
        this.fecha = fecha;
    }

    public Venta(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double calcularImporte() {

        return items.stream()
                .mapToDouble(o -> o.calcularImporte())
                .sum();
    }

    public void agregarItem(Item unItem) {
        items.add(unItem);
    }

    public boolean esDeFecha(LocalDate unaFecha) {
        return 0== fecha.compareTo(unaFecha);
    }


}
