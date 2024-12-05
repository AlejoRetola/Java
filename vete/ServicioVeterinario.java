package parcial_veterinaria.vete;

import java.time.LocalDate;

public class ServicioVeterinario extends Servicios {
	protected Medico veterinarioACargo;
	public ServicioVeterinario(LocalDate unaFecha, Mascota unaMascota,Medico unVeterinario) {
		super(unaFecha, unaMascota);
		this.veterinarioACargo = unVeterinario;
	}
	
	
	public int calcularCosto() {
		int aux = 0;
		if (this.getFecha().getDayOfWeek().getValue() == 7) {
			aux += 200;
		}
		return aux + this.veterinarioACargo.getHonorarios();
	}
}
