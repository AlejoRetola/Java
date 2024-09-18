package ar.edu.unlp.info.oo1.ejercicio1;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String nombre, int cant , double costo) {
		this.detalle = nombre;
		this.cantidad = cant;
		this.costoUnitario = costo;
	}
	
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}

	public double getCostoUnitario() {
		return this.costoUnitario;
	}

	public String getDetalle() {
		return detalle;
	}
}
