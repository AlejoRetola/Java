package ejercicio4.ej4;

public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;

	
	public Producto() {
		this.peso = .0;
		this.precioPorKilo = .0;
		this.descripcion = "";
	}
	
	public Producto (double unPeso, double porKilo , String desc) {
		this.peso = unPeso;
		this.precioPorKilo = porKilo;
		this.descripcion = desc;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public double getPrecio() {
		return this.precioPorKilo * this.peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setPeso(double d) {
		this.peso = d;
	}

	public void setPrecioPorKilo(int i) {
		this.precioPorKilo = i;
	}

	public void setDescripcion(String string) {
		this.descripcion = string;
	}
}
