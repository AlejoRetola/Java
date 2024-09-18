package ejercicio4.ej4;

public class Balanza {
	private int cantidadProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.ponerEnCero();
	}
	
	public void ponerEnCero() {
		this.cantidadProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto unProducto) {
		this.cantidadProductos += 1;
		this.precioTotal += unProducto.getPrecio();
		this.pesoTotal += unProducto.getPeso();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadProductos ,  this.pesoTotal ,  this.precioTotal);
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}

	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public Integer getCantidadDeProductos() {
		return this.cantidadProductos;
	}
}
