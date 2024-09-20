package Modelo;

public abstract class ProdInformatico extends Producto{
    protected String nomFabricante;

    public ProdInformatico(Integer stock, String nombre, Double precio, String nomFabricante) {
        super(stock, nombre, precio);
        this.nomFabricante = nomFabricante;
    }

    public abstract Double calcularPrecio(Double porcentaje);

}
