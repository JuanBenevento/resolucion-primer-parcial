package Modelo;

public class Escritorio extends Producto{

    private Double alto;
    private Double ancho;

    public Escritorio(Integer stock, String nombre, Double precio, Double alto, Double ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    @Override
    public Double calcularPrecio(Double porcentaje) {
        return Precio = Precio + (Precio* porcentaje/100);
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", Stock=" + Stock +
                ", Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}
