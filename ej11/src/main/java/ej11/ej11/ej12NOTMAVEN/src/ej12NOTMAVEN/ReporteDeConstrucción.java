package ej12NOTMAVEN;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ReporteDeConstrucción {
	private List<Pieza> listaPiezas;
	
	public double getVolumenDeMaterial(String nombreMaterial) {
		return this.listaPiezas.stream().
				filter(e -> e.getNombre().equals(nombreMaterial))
				.mapToDouble(e -> e.getVolumen()).sum();

	}
	public double getSuperficieDeCOlor(String colorMaterial) {
		return this.listaPiezas.stream().
				filter(e -> e.getNombre().equals(colorMaterial))
				.mapToDouble(e -> e.getSuperficie()).sum();
	
	}
	
}
