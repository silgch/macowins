package Sucursal;

import Prenda.*;
import Venta.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class SucursalTest {

    Prenda pantalonNuevo;
    Prenda sacoPromocion;
    Prenda camisaLiquidacion;
    Venta venta1;
    Venta venta2;
    Venta venta3;
    Sucursal sucursal1;


    @Before
    public void inizializar() throws Exception {
        pantalonNuevo = new Prenda(new Nueva(), 890.0, TipoDePrenda.PANTALON);
        sacoPromocion= new Prenda(new Promocion(100.0), 400.0, TipoDePrenda.SACO);
        camisaLiquidacion= new Prenda(new Liquidacion(), 500.0, TipoDePrenda.CAMISA);
        venta1= new Venta(LocalDate.of(2020,01,20));
        venta2= new Venta(LocalDate.of(2020,01,20));
        venta3= new Venta(LocalDate.of(2020,01,21));

        venta1.agregarItem(new Item(2, pantalonNuevo));
        venta1.agregarItem(new Item(1, sacoPromocion));
        venta2.agregarItem(new Item(1, camisaLiquidacion));
        venta3.agregarItem(new Item(1, camisaLiquidacion));

        sucursal1= new Sucursal();

    }

    @Test
    public void calcularVentasDeFecha() {
        sucursal1.registrarVenta(venta1);
        Assert.assertEquals(2080.0, sucursal1.calcularVentasDeFecha(LocalDate.of(2020,01,20)), 0);
        sucursal1.registrarVenta(venta2);
        Assert.assertEquals(2330.0, sucursal1.calcularVentasDeFecha(LocalDate.of(2020,01,20)), 0);
        sucursal1.registrarVenta(venta3);
        Assert.assertEquals(2330.0, sucursal1.calcularVentasDeFecha(LocalDate.of(2020,01,20)), 0);
        Assert.assertEquals(250.0, sucursal1.calcularVentasDeFecha(LocalDate.of(2020,01,21)), 0);


    }


}