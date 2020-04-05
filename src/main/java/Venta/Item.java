package Venta;
import Prenda.*;

public class Item {

    int cantidad;
    Prenda prenda;

    public Item(int cantidad, Prenda prenda) {
        this.cantidad = cantidad;
        this.prenda = prenda;

    }
    public  double calcularImporte(){
        return cantidad*prenda.calcularPrecio();
    }

}
