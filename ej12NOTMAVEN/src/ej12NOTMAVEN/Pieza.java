package ej12NOTMAVEN;

public abstract class Pieza  {
	private String material;
	private String color;
	
	public String getNombre() {
		return this.material;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public abstract double getVolumen();
	public abstract double getSuperficie();
}
