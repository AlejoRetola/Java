package ej13.ej13;

public class Archivo {
	private String nombre;
	
	public Archivo(String unNombre) {
		this.nombre = unNombre;
	}
	
	public int Tamaño() {
		return this.nombre.length();
	}
}
