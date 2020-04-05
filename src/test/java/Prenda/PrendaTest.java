package Prenda;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import Venta.*;

import static org.junit.Assert.*;

public class PrendaTest {
    Prenda pantalonNuevo;
    Prenda pantalonPromocion;
    Prenda pantalonLiquidacion;
    Prenda sacoNuevo;
    Prenda sacoPromocion;
    Prenda camisaLiquidacion;
    Venta venta1;

    @Before
    public void setUp() throws Exception {
        pantalonNuevo = new Prenda(new Nueva(), 890.0, TipoDePrenda.PANTALON);
        pantalonPromocion= new Prenda(new Promocion(100.0), 890.0, TipoDePrenda.PANTALON);
        pantalonLiquidacion= new Prenda(new Liquidacion(), 890.0, TipoDePrenda.PANTALON);
        sacoNuevo = new Prenda(new Nueva(), 700.0, TipoDePrenda.SACO);
        sacoPromocion= new Prenda(new Promocion(100.0), 400.0, TipoDePrenda.SACO);
        camisaLiquidacion= new Prenda(new Liquidacion(), 500.0, TipoDePrenda.CAMISA);
        venta1= new Venta(LocalDate.of(2020,01,20));

    }

    @Test
    public void getTipoTest() {
    Assert.assertEquals(TipoDePrenda.PANTALON, pantalonNuevo.getTipo());
    Assert.assertEquals(TipoDePrenda.PANTALON, pantalonPromocion.getTipo());
    Assert.assertEquals(TipoDePrenda.PANTALON, pantalonLiquidacion.getTipo());
    Assert.assertEquals(TipoDePrenda.SACO, sacoNuevo.getTipo());
    Assert.assertEquals(TipoDePrenda.SACO, sacoPromocion.getTipo());
    Assert.assertEquals(TipoDePrenda.CAMISA, camisaLiquidacion.getTipo());


    }

    @Test
    public void calcularPrecioTest() {

        Assert.assertEquals(890.0, pantalonNuevo.calcularPrecio(),0);
        Assert.assertEquals(790.0, pantalonPromocion.calcularPrecio(),0);
        Assert.assertEquals(445.0, pantalonLiquidacion.calcularPrecio(),0);
        Assert.assertEquals(700.0, sacoNuevo.calcularPrecio(),0);
        Assert.assertEquals(300.0, sacoPromocion.calcularPrecio(),0);
        Assert.assertEquals(250.0, camisaLiquidacion.calcularPrecio(),0);
    }
}