package Modelo;

public class Notebook extends ProdInformatico{

    private Integer memoria;

    public Notebook(Integer stock, String nombre, Double precio, String nomFabricante, Integer memoria) {
        super(stock, nombre, precio, nomFabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "NomFabricante='" + nomFabricante + '\'' +
                ", memoria=" + memoria +
                ", Stock=" + Stock +
                ", Nombre='" + Nombre + '\'' +
                ", Precio=" + Precio +
                '}';
    }

    @Override
    public Double calcularPrecio(Double porcentaje) {
        return Precio = Precio + (Precio * (porcentaje)/100);
    }

}
