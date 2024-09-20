package Servicio;

import Modelo.*;
import Modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class AdmServicio {
    private List<Producto> inventario;

    public AdmServicio() {
        this.inventario = new ArrayList<Producto>();
    }

    public List<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    public void addProducto(Producto producto){
        inventario.add(producto);
    }

    public void mostrarInventario() {
        for (Producto producto : inventario) {
            System.out.println(producto.toString());
        }
    }

    public List<Producto> modificarPrecioDescuento (Double descuentoSilla,Double descuentoImpresora){
        for (Producto producto : inventario) {
            if (producto instanceof Silla)
                ((Silla) producto).calcularDescuento(descuentoSilla);
            if (producto instanceof Impresora)
                ((Impresora) producto).calcularDescuento(descuentoImpresora);
        }
        return inventario;
    }

    public List<Producto> modificarPrecio(Double porcentajeSilla,Double porcentajeImpresora,Double porcentajeNotebook,Double porcentajeEscritorio){
        for (Producto producto : inventario) {
            if (producto instanceof Silla)
                ((Silla) producto).calcularPrecio(porcentajeSilla);
            if (producto instanceof Impresora)
                ((Impresora) producto).calcularPrecio(porcentajeImpresora);
            if (producto instanceof Notebook)
                ((Notebook) producto).calcularPrecio(porcentajeNotebook);
            if (producto instanceof Escritorio)
                ((Escritorio) producto).calcularPrecio(porcentajeEscritorio);
        }
        return inventario;
    }

}
