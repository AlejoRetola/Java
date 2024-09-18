package ar.edu.unlp.info.oo1.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	public Presupuesto(String nombre) {
		this.fecha = LocalDate.now();
		this.cliente = nombre;
		this.items = new ArrayList<Item>();
	}
	
	
	public void agregarItem(Item unItem) {
		this.items.add(unItem);
	}
	
	
	public double calcularTotal() {
		return items.stream().mapToDouble(item -> item.costo()).sum();
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public String getCliente() {
		return cliente;
	}
}
