package ej13.ej13;

import java.util.*;
public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> archivos;
	
	public Email(String unTitulo, String unCuerpo) {
		this.titulo = unTitulo;
		this.cuerpo = unCuerpo;
		this.archivos = new ArrayList<Archivo>();
	}
	
	public Email(String unTitulo, String unCuerpo, List<Archivo> archivosAdjuntos) {
		this.titulo = unTitulo;
		this.cuerpo = unCuerpo;
		this.archivos = archivosAdjuntos;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public List<Archivo> adjuntos() {
		return this.archivos;
	}; // devuleve Archivos adjuntados al email
	
	public int getTamaño() {
		return (this.titulo.length() + this.cuerpo.length() + 
				this.archivos.stream().mapToInt(e -> e.Tamaño()).sum());
	}
	
}
