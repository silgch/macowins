import Prenda.*;
import Venta.*;
import Sucursal.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // REQUERIMIENTOS:   1. Saber el precio de una prenda: prenda.



        System.out.println("Este es el ejercicio nro 1. MACOWINS\n");

        // Creamos una prenda  Estado estado, double precioBase, TipoDePrenda tipo) {

        Prenda pantalonNuevo = new Prenda(new Nueva(), 890.0, TipoDePrenda.PANTALON);
        Prenda pantalonPromocion= new Prenda(new Promocion(100.0), 890.0, TipoDePrenda.PANTALON);
        Prenda pantalonLiquidacion= new Prenda(new Liquidacion(), 890.0, TipoDePrenda.PANTALON);


        System.out.println("Probando REQUERIMIENTO 1: SABER EL PRECIO DE UNA PRENDA\n");
        System.out.println("Pantalon, estado Nuevo, precio Base $890, precio final:" + pantalonNuevo.calcularPrecio() );
        System.out.println("Pantalon, estado Promocion, precio Base $890,  descuento $100, precio final:" + pantalonPromocion.calcularPrecio() );
        System.out.println("Pantalon, estado Liquidacion, precio Base $890,   precio final:" + pantalonLiquidacion.calcularPrecio() +"\n\n");




        // REQUERIMIENTOS:  2.Saber el tipo de una prenda.

        Prenda sacoNuevo = new Prenda(new Nueva(), 700.0, TipoDePrenda.SACO);
        Prenda sacoPromocion= new Prenda(new Promocion(100.0), 400.0, TipoDePrenda.SACO);
        Prenda camisaLiquidacion= new Prenda(new Liquidacion(), 500.0, TipoDePrenda.CAMISA);


        System.out.println("Probando REQUERIMIENTO 2: SABER EL TIPO DE UNA PRENDA\n");
        System.out.println("Pantalon, estado Nuevo, Tipo: " + pantalonNuevo.getTipo());
        System.out.println("Pantalon, estado Promocion, precio Base $890,  descuento $100, Tipo: " + pantalonPromocion.getTipo() );
        System.out.println("Pantalon, estado Liquidacion, precio Base $890,   Tipo: " + pantalonLiquidacion.getTipo() );
        System.out.println("Saco, estado Nuevo, Tipo: " + sacoNuevo.getTipo());
        System.out.println("Saco, estado Promocion, precio Base $400,  descuento $100, Tipo: " + sacoPromocion.getTipo() );
        System.out.println("Camisa, estado Liquidacion, precio Base $500,   Tipo: " + camisaLiquidacion.getTipo()+"\n" );


        // REQUERIMIENTOS:  3.Registrar una venta.

        //Probando con metodo agregar item:
        System.out.println("Probando REQUERIMIENTO 3: REGISTRAR UNA VENTA\n");
        System.out.println("El día 20/01/2020 se vendio: ");
        Venta venta1= new Venta(LocalDate.of(2020,01,20));
        venta1.agregarItem(new Item(2, pantalonNuevo));
        //System.out.println("El importe de 2 pantalones nuevos es " + venta1.calcularImporte());
        venta1.agregarItem(new Item(1, sacoNuevo));
        System.out.println("El importe de 2 pantalones nuevos(890$) + 1 saco nuevo ($700)es " + venta1.calcularImporte());


        ArrayList<Item> itemsVenta2 = new ArrayList();
        itemsVenta2.add(new Item(1,pantalonPromocion));
        itemsVenta2.add(new Item(1, camisaLiquidacion));
        Venta venta2= new Venta(itemsVenta2, LocalDate.of(2020,01,20));
        System.out.println("El importe de 1 pantalones promocion(790$) + 1 camisa liquidacion ($250)es " + venta2.calcularImporte());




        // REQUERIMIENTOS:  4.Saber las ganancias de un determinado día.
        System.out.println("Probando REQUERIMIENTO 4: CALCULAR LAS VENTAS DE DETERMINADO DIA \n");
        Sucursal macowins = new Sucursal();
        macowins.registrarVenta(venta1);
        macowins.registrarVenta(venta2);
        System.out.println("Las ventas del 20/01/2020 fueron: $ "
                            + macowins.calcularVentasDeFecha(LocalDate.of(2020,01,20)));
    }
}
