package Mamiferos.Mamiferos;

import java.util.List;
import java.util.ArrayList;


public class Mamifero {
	private	Mamifero padre;
	private Mamifero madre;
	private String id;
	private String especie;
	
	
	public Mamifero() {
		
	}
	
	public Mamifero(String unNombre) {
		this.id = unNombre;
	}
	
	public Mamifero (Mamifero unPadre, Mamifero unaMadre , String unID, String unaEspecie) {
		this.padre = unPadre;
		this.madre = unaMadre;
		this.id = unID;
		this.especie = unaEspecie;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public String getIdentificador() {
		return id;
	}
	public void setIdentificador(String id) {
		this.id = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.madre != null) {
		return this.madre.getMadre();
	}
		else {
			return null;
		}
	}
	
	/* EL PROBLEMA ESTA EN QUE EN LOS TEST ACCEDO A NULL POINTERS Y ROMPE TODO, TENGO QUE CHECKEAR LA POSIBILIDAD
	 * DE QUE NO TENGA ABUELO O MADRE UN ANIMAL PORQUE DE POR SI NO TIENE NI MADRE POBRESITO?
	 * O EL PROBLEMA VA MAS ALLA DE ESO?
	 * HAGO SOLO EL != NULL DE GETABUELA PARA PODER PREGUNTAR A UN AYUDANTE SI ERA ESA LA TRAMPA DEL EJERCICIO*/
	
	public Mamifero getAbueloMaterno() {
		return this.madre.getPadre();
	}
	
	public Mamifero getAbuelaPaterna() {
		return this.padre.getMadre();
	}
	
	public Mamifero getAbueloPaterno() {
		return this.padre.getPadre();
	}
	
	public List<Mamifero> getAncestros() {
		ArrayList <Mamifero> aux = new ArrayList<Mamifero>();
		aux.add(madre); aux.add(padre);
		aux.add(getAbuelaMaterna()); aux.add(getAbuelaPaterna());
		aux.add(getAbueloPaterno()); aux.add(getAbueloMaterno());
		return aux;
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		List<Mamifero> lista = getAncestros();
		boolean resultado = lista.stream().anyMatch(animal -> animal.equals(unMamifero));
		return resultado;
	}
}