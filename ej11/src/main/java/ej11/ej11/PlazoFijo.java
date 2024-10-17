package ej11.ej11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDeInteresDiario;
	
	
	public PlazoFijo(double montoD , double porcentajeDiario) {
		this.fechaDeConstitucion = LocalDate.now();
		this.montoDepositado = montoD;
		this.porcentajeDeInteresDiario = porcentajeDiario;
	}
	
	/*
	 * 
	 * El valor actual de un PlazoFijo equivale al montoDepositado incrementado como corresponda 
	 * por el porcentaje de interés diario, desde la fecha de constitución a la fecha actual 
	 * (la del momento en el que se hace el cálculo).
	 */
	@Override
	public double valorActual() {
		int tiempotranscurrido = (int) fechaDeConstitucion.until(LocalDate.now() , ChronoUnit.DAYS);
	
		return montoDepositado * Math.pow(1 + porcentajeDeInteresDiario, tiempotranscurrido);
	}
	
	

}
