package parcial_veterinaria.vete;
import java.util.*;
import java.time.LocalDate;

public class Consulta extends ServicioVeterinario{
	
	public Consulta(Medico unMedico, Mascota unaMascota) {
		super(LocalDate.now(), unaMascota, unMedico);
	}
	
	public int calcularCosto() {
		return super.calcularCosto() + 300 + this.veterinarioACargo.getAntiguedad();
	}
}
