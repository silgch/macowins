package Venta;

import Prenda.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class VentaTest {
    Prenda pantalonNuevo;
    Prenda pantalonPromocion;
    Prenda pantalonLiquidacion;
    Prenda sacoNuevo;
    Prenda sacoPromocion;
    Prenda camisaLiquidacion;
    Venta venta1;
    Venta venta2;


    @Before
    public void inicializar() throws Exception {
        pantalonNuevo = new Prenda(new Nueva(), 890.0, TipoDePrenda.PANTALON);
        pantalonPromocion= new Prenda(new Promocion(100.0), 890.0, TipoDePrenda.PANTALON);
        pantalonLiquidacion= new Prenda(new Liquidacion(), 890.0, TipoDePrenda.PANTALON);
        sacoNuevo = new Prenda(new Nueva(), 700.0, TipoDePrenda.SACO);
        sacoPromocion= new Prenda(new Promocion(100.0), 400.0, TipoDePrenda.SACO);
        camisaLiquidacion= new Prenda(new Liquidacion(), 500.0, TipoDePrenda.CAMISA);
        venta1= new Venta(LocalDate.of(2020,01,20));
    }

    @Test
    public void calcularImporte() {
        Assert.assertEquals(0.0,venta1.calcularImporte(),0);
        venta1.agregarItem(new Item(1, pantalonNuevo));
        Assert.assertEquals(890.0,venta1.calcularImporte(), 0 );
        venta1.agregarItem(new Item(1, pantalonPromocion));
        Assert.assertEquals(1680.0,venta1.calcularImporte(), 0 );
        venta1.agregarItem(new Item(2, pantalonLiquidacion));
        Assert.assertEquals(2570.0,venta1.calcularImporte(), 0 );
        venta1.agregarItem(new Item(1, sacoNuevo));
        Assert.assertEquals(3270.0,venta1.calcularImporte(), 0 );
        venta1.agregarItem(new Item(1, sacoPromocion));
        Assert.assertEquals(3570.0,venta1.calcularImporte(), 0 );
        venta1.agregarItem(new Item(1, camisaLiquidacion));
        Assert.assertEquals(3820.0,venta1.calcularImporte(), 0 );
    }


    @Test
    public void esDeFecha() {
        Assert.assertTrue(venta1.esDeFecha(LocalDate.of(2020,01,20)));
    }
}