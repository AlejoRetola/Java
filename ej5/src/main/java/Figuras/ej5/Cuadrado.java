package Figuras.ej5;

public class Cuadrado implements Figura{
	private double Lado;
	
	public void setLado(double unLado) {
		this.Lado = unLado;
	}
	
	public double getLado() {
		return this.Lado;
	}

	@Override
	public double getPerimetro() {
		return this.Lado * 4;
	}

	@Override
	public double getArea() {
		return (this.Lado * this.Lado);
	}
	
}
