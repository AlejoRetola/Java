package ejercicio4.ej4;

import java.time.LocalDate;
import java.util.List;

public class Ticket extends ClasePadre {
    private LocalDate fecha;
    private List<Producto> productos;

    public Ticket(int cantidad, double peso, double precio, List<Producto> productos) {
        super(cantidad, peso, precio);
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
}
