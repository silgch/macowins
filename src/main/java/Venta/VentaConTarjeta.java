package Venta;

import java.time.LocalDate;

public class VentaConTarjeta extends  Venta{

    Double coeficiente;
    int cantidadCuotas;

    public VentaConTarjeta() {
    }

    public VentaConTarjeta(LocalDate fecha, Double coeficiente, int cantidadCuotas) {
        super(fecha);
        this.coeficiente = coeficiente;
        this.cantidadCuotas = cantidadCuotas;
    }

    public  double calcularImporte(){
        //En el caso que sea con tarjeta, tienen el mismo comportamiento que en efectivo (
        // el cual no modifica el precio), solo que se le aplica un recargo según la
        // cantidad de cuotas seleccionadas
        // (cantidad de cuotas * un coeficiente fijo + 0.01 del valor de cada prenda).”

        return (coeficiente* cantidadCuotas + 1.01) * super.calcularImporte();


    }

}
