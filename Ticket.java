package ejercicio4.ej4;

import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	
	public Ticket(int cant , double pesoT, double precioT) {
		this.fecha = LocalDate.now();
		this.cantidadDeProductos = cant;
		this.pesoTotal = pesoT;
		this.precioTotal = precioT;
	}
	
	public double impuesto() {
		return this.precioTotal * 0.21;
	}

	public double getPrecioTotal() {
		return this.precioTotal;
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}

	public double getPesoTotal() {
		return this.pesoTotal;
	}

	public LocalDate getFecha() {
		return this.fecha;
	}
}
