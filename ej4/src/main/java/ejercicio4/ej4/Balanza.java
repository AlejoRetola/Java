package ejercicio4.ej4;

import java.util.List;
import java.util.ArrayList;

public class Balanza {
    private List<Producto> listaP;

    public Balanza() {
       // super(0, 0, 0);
        this.listaP = new ArrayList<Producto>();
    }

    public void ponerEnCero() {
        this.listaP = new ArrayList<Producto> () ;
    }

    public void agregarProducto(Producto unProducto) {
        this.listaP.add(unProducto);
    }

    public int getCantidadDeProductos() {
    	return (int) this.listaP.stream().count();
    }
    
    public double getPesoTotal() {
    	return this.listaP.stream().mapToDouble(producto -> producto.getPeso()).sum();
    }
    
    public double getPrecioTotal() {
    	return this.listaP.stream().mapToDouble(producto -> producto.getPrecio()).sum();
    }
    
    public List<Producto> getListaProductos() {
    	List<Producto> copia = this.listaP; // USAR ARRAYS.UTILS
    	return copia;
    }
    
    public Ticket emitirTicket() {
        return new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal(), this.listaP);
    }
}
