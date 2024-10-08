package Mamiferos.Mamiferos;

import java.util.List;
import java.util.Objects;
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
		return this.padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getMadre() {
		return this.madre;
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
		if (!Objects.isNull(this.madre)) {
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
		if (!Objects.isNull(this.madre)) {
			return this.madre.getPadre();
		}
			else {
				return null;
			}
	}
	
	public Mamifero getAbuelaPaterna() {
		if (!Objects.isNull(this.padre)) {
			return this.padre.getMadre();
		}
			else {
				return null;
			}
	}
	
	public Mamifero getAbueloPaterno() {
			if (!Objects.isNull(this.padre)) {
			return this.padre.getPadre();
		}
			else {
				return null;	
			}
	}
	
	public boolean equals(Object o) {
		return ((Mamifero) o).getIdentificador() == this.getIdentificador();
	}

	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    if (unMamifero == null) {
	        return false; 
	    }

	  /*
	   *   if (this.equals(unMamifero)) {
	        return false;
	    }

	   */
	    boolean resultado = false;
	    
	    if (this.padre != null && this.padre.equals(unMamifero)) {
	        return true;
	    }
	    if (this.madre != null && this.madre.equals(unMamifero)) {
	        return true;
	    }
	    
	    
	    if (!resultado && this.padre != null) {
	        resultado = this.padre.tieneComoAncestroA(unMamifero);
	    }
	    if (!resultado && this.madre != null) {
	        resultado = this.madre.tieneComoAncestroA(unMamifero);
	    }
	    
	    return resultado;
	}

}


ARREGLAOD EL 
