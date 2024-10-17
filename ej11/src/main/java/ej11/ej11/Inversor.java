package ej11.ej11;

import java.util.List;
import java.util.ArrayList;

/*
* El valor actual de las inversiones 
* de un inversor es la suma de los valores actuales 
* de cada una de las inversiones en su cartera (su colección de inversiones). 
*/
public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String unNombre) {
		this.nombre = unNombre;
		this.inversiones = new ArrayList<Inversion>();
	}
	
	public void agregarInversion(Inversion unaInversion) {
		this.inversiones.add(unaInversion);
	}
	
	public List<Inversion> getInversiones() {
		return inversiones;
	}
	
	public double valorTotal() {
		if (!inversiones.isEmpty()) {
			double total = inversiones.stream().mapToDouble(elem -> elem.valorActual()).sum();			
			return total;
		} else {
			return 0.0;
		}
	}
}
