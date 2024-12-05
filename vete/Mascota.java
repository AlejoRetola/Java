package parcial_veterinaria.vete;
import java.util.*;
import java.time.*;
public class Mascota {
	private String nombre;
	private LocalDate nacimiento;
	private String especie;
	private List<Servicios> serviciosRecibidos;
	 
	public Mascota(String unNombre , LocalDate fechaNacimiento , String unaEspecie) {
		this.nombre = unNombre;
		this.nacimiento = fechaNacimiento;
		this.especie = unaEspecie;
		this.serviciosRecibidos = new ArrayList<Servicios>();
	}
	
	public int montoRecaudadoPorServicios(LocalDate unaFecha) {
		
		return serviciosRecibidos.stream()
				.filter(s -> s.getFecha().isEqual(unaFecha))
				.mapToInt(s -> s.calcularCosto()).sum();

	}
	
	public List<Servicios> getServiciosRecibidos() {
		return serviciosRecibidos;
	}
}
