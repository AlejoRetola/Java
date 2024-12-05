package parcial_veterinaria.vete;
import java.time.*;
public abstract class Servicios {
	protected Mascota mascotaTratada;
	private LocalDate fechaServicio;
	
	public Servicios(LocalDate unaFecha, Mascota unaMascota) {
		this.fechaServicio = unaFecha;
		this.mascotaTratada = unaMascota;
	}
	
	public abstract int calcularCosto();
	
	public LocalDate getFecha() {
		return this.fechaServicio;
	}
}
