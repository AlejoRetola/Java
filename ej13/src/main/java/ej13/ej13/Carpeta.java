package ej13.ej13;

import java.util.*;

public class Carpeta {
	private List<Email> listaEmails;
	
	public Carpeta() {
		listaEmails = new ArrayList<>();
	}
	
	public void agregarEmail(Email email) {
		if (!listaEmails.contains(email)) {
			this.listaEmails.add(email);
		}
	}
	
	public List<Email> getEmails() {
		return this.listaEmails;
	}
	
	public void mover( Email email, Carpeta destino) {
		destino.agregarEmail(email);
		this.listaEmails.remove(email);
	}
	
	
	public int calcularTamaño() {
		return this.listaEmails.stream().mapToInt(e -> e.getTamaño()).sum();
	}
	
	public Email buscarEmail(String texto) {
		List<Email> lista = this.listaEmails.stream().filter(e -> (e.getTitulo() == texto) || (e.getCuerpo() == texto)).toList();
		Email resultado = lista.getFirst();
		
		if (resultado != null) {
			return resultado;
		} else {
			return null;
		}
	}
	
	
	
}
