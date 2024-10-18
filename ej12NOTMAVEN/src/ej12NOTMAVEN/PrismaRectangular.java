package ej12NOTMAVEN;

public class PrismaRectangular extends Pieza {
	private int ladoMayor;
	private int ladoMenor;
	private int altura;
	
	public double getVolumen() {
		return (double) (ladoMayor*ladoMenor*altura);
	}
	
	public double getSuperficie() {
		return (double) 2*((ladoMayor * ladoMenor) + ladoMayor * altura + ladoMenor * altura);
	}
}
