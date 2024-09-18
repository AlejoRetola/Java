package ejercicio4.ej4;

import java.util.List;
import java.util.ArrayList;

public class Balanza extends ClasePadre {
    private List<Producto> listaP;

    public Balanza() {
        super(0, 0, 0);
        this.listaP = new ArrayList<Producto>();
    }

    public void ponerEnCero() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0;
        this.pesoTotal = 0;
        this.listaP.clear();
    }

    public void agregarProducto(Producto unProducto) {
        this.cantidadDeProductos++;
        this.precioTotal += unProducto.getPrecio();
        this.pesoTotal += unProducto.getPeso();
        this.listaP.add(unProducto);
    }

    public Ticket emitirTicket() {
        return new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal, this.listaP);
    }
}
