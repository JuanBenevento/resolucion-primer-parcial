package Modelo;

import Interface.Idescuento;

public class Impresora extends ProdInformatico implements Idescuento {

    private Integer impPorMin;

    public Impresora(Integer stock, String nombre, Double precio, String nomFabricante, Integer impPorMin) {
        super(stock, nombre, precio, nomFabricante);
        this.impPorMin = impPorMin;
    }

    public Integer getImpPorMin() {
        return impPorMin;
    }

    public void setImpPorMin(Integer impPorMin) {
        this.impPorMin = impPorMin;
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
        return "Impresora{" +
                "nomFabricante='" + nomFabricante + '\'' +
                ", impPorMin=" + impPorMin +
                ", Stock=" + Stock +
                ", Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                '}';
    }

}
