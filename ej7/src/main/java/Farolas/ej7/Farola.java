package Farolas.ej7;


import java.util.List;
import java.util.ArrayList;
/**
 * De esta forma crearemos las clases del ejercicio
 *
 */
public class Farola {
	private int id;
	private  int estado;
	private  List<Farola> vecinas;

	public Farola () {
		this.estado = 0;
		this.vecinas = new ArrayList<>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		vecinas.add(otraFarola);
		otraFarola.vecinas.add(this);
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors () {
		return this.vecinas;
	}

	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	
	public boolean isOn() {
		if (this.estado == 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOff() {
		if (this.estado == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void turnOn() {
		if (isOff()) {
			this.estado = 1;
			vecinas.stream().forEach(f -> f.turnOn());
		}
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if (isOn()) {
			this.estado = 0;
			vecinas.stream().forEach(f -> f.turnOff());
		}
	}


}
