package ejercicio4.ej4;

import java.time.LocalDate;
import java.util.List;

public class Ticket{
    private LocalDate fecha;
    private List<Producto> productos;
    protected int cantidadDeProductos;
    protected double pesoTotal;
    protected double precioTotal;

    public Ticket(int cantidad, double peso, double precio, List<Producto> productos) {
        this.cantidadDeProductos = cantidad;
        this.pesoTotal = peso;
        this.precioTotal = precio;
        this.fecha = LocalDate.now();
        this.productos = productos;
    }

    public double impuesto() {
        return this.precioTotal * 0.21;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }
    

    public int getCantidadDeProductos() {
        return this.cantidadDeProductos;
    }

    public double getPesoTotal() {
        return this.pesoTotal;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }
    
}
