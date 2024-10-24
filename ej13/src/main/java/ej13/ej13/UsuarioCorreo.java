package ej13.ej13;

import java.util.*;
import java.util.stream.Collectors;

public class UsuarioCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public UsuarioCorreo() {
		carpetas = new ArrayList<Carpeta>(); // mi primer carpeta va a ser inbox carpetas[0]
		inbox = new Carpeta();
		carpetas.add(inbox);
		}
	
	public void recibir(Email email) {
		inbox.agregarEmail(email);
	}
	
	public void agregarCarpeta(Carpeta nuevaCarpeta) {
		this.carpetas.add(nuevaCarpeta);
	}
	
	public Email buscar(String texto) {
		
		List<Email> aux = this.carpetas.stream().map(e -> e.buscarEmail(texto)).collect(Collectors.toList()); // busco mails por carpeta
		aux = aux.stream().filter(e -> e != null).collect(Collectors.toList()); // filtro en las carpetas donde no hay (null)
		if(!aux.isEmpty()) { // si existe el mail
			return aux.getFirst(); // devuelvo el primer match
		} 
		return null;
	}
	/*
	 * Posiblemente tire error por 2 cosas 
	 * 1 ) No existe el mail y se rompe todo porque retorno cualquier cosa
	 * 2 ) Cuando hago el map, quiza en la primera carpeta no existe, pero en la segunda si, pero en el map
	 * me queda guardado el null de la primer "buscarEmail" y en el getFirst, devuelvo ese null y no el match
	 * deberia hacer un anyMatch e -> e != null? // lo solucione quiza??? idk
	 */
	
	public int EspacioOcupado() {
		return this.carpetas.stream().mapToInt(e -> e.calcularTamaño()).sum();
	}
	
	public List<Carpeta> getCarpetas() {
		return this.carpetas;
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
}
