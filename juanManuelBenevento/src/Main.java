import Modelo.*;
import Servicio.AdmServicio;

public class Main {
    public static void main(String[] args) {
        AdmServicio inventario = new AdmServicio();


        Silla silla = new Silla(10, "Steel", 1000.0, 4);
        Escritorio escritorio = new Escritorio(12, "Madera", 1200.0, 155.0, 100.0);
        Impresora impresora = new Impresora(5, "Hp Ink", 10000.0, "HP", 10);
        Notebook notebook = new Notebook(9, "Lenovo series 8", 150000.0, "Lenovo", 1000);

        inventario.addProducto(silla);
        inventario.addProducto(escritorio);
        inventario.addProducto(impresora);
        inventario.addProducto(notebook);

        inventario.mostrarInventario();

        System.out.println();

        inventario.modificarPrecioDescuento(10.0, 15.0);

        inventario.mostrarInventario();

        System.out.println();

        inventario.modificarPrecio(5.0, 15.0, 20.0, 10.0);

        inventario.mostrarInventario();

    }
}