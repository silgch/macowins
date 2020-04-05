package Prenda;

public class Promocion implements Estado {
    double descuento;

    public Promocion(double descuento){
        this.descuento=descuento;
    }

    public double calcularPrecio(double precioBase){

        return precioBase-descuento;}
}
