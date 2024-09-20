package Modelo;

public abstract class Producto {
    protected Integer Stock;
    protected String Nombre;
    protected Double Precio;

    public Producto(Integer stock, String nombre, Double precio) {
        this.Stock = stock;
        this.Nombre = nombre;
        this.Precio = precio;
    }

    public Integer getStock() {
        return Stock;
    }

    public void setStock(Integer stock) {
        Stock = stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    abstract Double calcularPrecio(Double porcentaje);

}
