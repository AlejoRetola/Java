package Figuras.ej5;

public class Cuerpo3D  {
	private Figura caraBasal;
	private double altura;
	
	
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Figura caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getVolumen() {
		return caraBasal.getArea() * this.altura;
	}
	
	public double getSuperficieExterior() {
		return (2 * this.caraBasal.getArea() + this.caraBasal.getPerimetro() * this.altura);
	}
	
}
