package parcial_veterinaria.vete;

import java.time.LocalDate;

public class Guarderia extends Servicios  {
	private int cantidadDias;
	
	public Guarderia(Mascota unaMascota , int periodoDias) {
		super(LocalDate.now(), unaMascota);
		this.cantidadDias = periodoDias;
	}
	
	public int calcularCosto() {
		int costoTotal = cantidadDias * 500;
		if(this.mascotaTratada.getServiciosRecibidos().size() >= 5) {
			return (int) (costoTotal - (costoTotal * 0.1));
		}
		else {
			return costoTotal;
		}
	}
}
