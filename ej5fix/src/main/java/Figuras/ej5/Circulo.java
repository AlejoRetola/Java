package Figuras.ej5;

import java.lang.Math;

public class Circulo implements Figura {
	private double radio;
	
	
	
	@Override
	public double getPerimetro() {
		return this.getDiametro() * Math.PI; 
	}

	
	
	@Override
	public double getArea() {
		return (this.radio * this.radio) * Math.PI; 
	}



	public double getDiametro() {
		return this.getRadio() * 2;
	}




	public double getRadio() {
		return this.radio;
	}



	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
