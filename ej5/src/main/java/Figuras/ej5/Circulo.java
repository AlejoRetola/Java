package Figuras.ej5;

import java.lang.Math;

public class Circulo implements Figura {
	private double diametro;
	private double radio;
	
	
	
	@Override
	public double getPerimetro() {
		return this.diametro * Math.PI; 
	}

	
	
	@Override
	public double getArea() {
		return (this.radio * this.radio) * Math.PI;
	}



	public double getDiametro() {
		return this.diametro;
	}



	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}



	public double getRadio() {
		return this.radio;
	}



	public void setRadio(double radio) {
		setDiametro(radio * 2);
		this.radio = radio;
	}
	
}
