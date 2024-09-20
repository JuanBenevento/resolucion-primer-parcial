package Modelo;

import Interface.Idescuento;

public class Silla extends Producto implements Idescuento {

    private Integer nroRuedas;

    public Silla(Integer stock, String nombre, Double precio, Integer nroRuedas) {
        super(stock, nombre, precio);
        this.nroRuedas = nroRuedas;
    }

    public Integer getNroRuedas() {
        return nroRuedas;
    }

    public void setNroRuedas(Integer nroRuedas) {
        this.nroRuedas = nroRuedas;
    }

    @Override
    public void calcularDescuento(Double descuento) {
        Precio = Precio - (Precio* descuento/100);
    }

    @Override
    public Double calcularPrecio(Double porcentaje) {
        return Precio = Precio + (Precio* porcentaje/100);
    }

    @Override
    public String toString() {
        return "Silla{" +
                "nroRuedas= " + nroRuedas +
                ", Stock= " + Stock +
                ", Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
