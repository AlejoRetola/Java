package parcial_veterinaria.vete;
import java.util.*;
import java.time.*;
public class Medico {
	private String nombre;
	private LocalDate fecha;
	private int honorarios;
	private List<Servicios> serviciosRealizados;
	
	public Medico(String unNombre , LocalDate fechaIngreso , int valorHonorarios) {
		this.nombre = unNombre;
		this.fecha = fechaIngreso;
		this.honorarios = valorHonorarios;
		this.serviciosRealizados = new ArrayList<Servicios>();
	}
	public int getHonorarios() {
		return honorarios;
	}
	
	public int getAntiguedad() {
		return LocalDate.now().getYear() - this.fecha.getYear();
	}
}
