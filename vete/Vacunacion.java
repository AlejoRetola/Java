package parcial_veterinaria.vete;

import java.time.LocalDate;

public class Vacunacion extends ServicioVeterinario{
	private String nombreVacuna;
	private int costo;
	
	public Vacunacion(Medico unMedico, Mascota unaMascota , String nombre , int unCosto) {
		super(LocalDate.now(), unaMascota, unMedico);
		this.costo = unCosto;
		this.nombreVacuna = nombre;
	}
	
	public int calcularCosto() {
		return super.calcularCosto() + 500 + this.costo;
	}
}
