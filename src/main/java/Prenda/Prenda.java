package Prenda;

public class Prenda {
    TipoDePrenda tipo;
    double precio;
    Estado estado;

    public Prenda(Estado estado, double precioBase, TipoDePrenda tipo) {
        this.estado = estado;
        this.precio = precioBase;
        this.tipo = tipo;
    }

    public TipoDePrenda getTipo() {
        return tipo;
    }

    public double calcularPrecio(){
        return estado.calcularPrecio(precio);
    }

}
