package ej12NOTMAVEN;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public double getVolumen() {
		return  (Math.PI * (radio * radio) * altura);
	}
	
	public double getSuperficie() {
		return ( 2* Math.PI * radio * (altura + 2) * Math.PI * (radio * radio));
	}
}
