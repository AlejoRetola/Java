package ej11.ej11;

public class InversionAcciones implements Inversion {
	private String nombre;
	private int cantidad;
	private double valorUnitario;

	/*
	 * 
	 El valor actual de una InversionEnAcciones se calcula multiplicando
	  el número de acciones por el valor unitario de las mismas.

	 */
	
	public InversionAcciones(String unNombre, int unaCant , double porUnidad) {
		this.nombre = unNombre;
		this.cantidad = unaCant;
		this.valorUnitario = porUnidad;
	}
	
	@Override
	public double valorActual() {
		double total = 0;
		if (cantidad > 0 ) {
			total = this.cantidad * this.valorUnitario;
		}
		return total;
	}

}
