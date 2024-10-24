package ej13.ej13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUsuarioCorreto {
	private UsuarioCorreo correoDePepe;
	private Email EmailDePrueba;
	private Carpeta carpetaExtra = new Carpeta();
	@BeforeEach
	
	void setUp() {
		correoDePepe = new UsuarioCorreo();
		EmailDePrueba = new Email("Hola", "QueriaMandarte a ver como estas");
	}
	
	public void recibirVariosCorreos() {
		correoDePepe.recibir(new Email("Reunión de equipo", "No olvides la reunión de mañana a las 10 AM."));
	    correoDePepe.recibir(new Email("Informe mensual", "Aquí tienes el informe mensual que solicitaste."));
	    correoDePepe.recibir(new Email("Receta de galletas", "Te envié la receta de galletas que mencionamos."));
	    correoDePepe.recibir(new Email("Viaje de negocios", "Los detalles sobre el viaje de negocios están confirmados."));
	}
	public void agregarCorreos() {
		recibirVariosCorreos();
	    correoDePepe.agregarCarpeta(carpetaExtra);
	    carpetaExtra.agregarEmail(new Email("Propuesta de colaboración", "Me gustaría discutir una posible colaboración entre nuestras empresas."));
	    carpetaExtra.agregarEmail(new Email("Cumpleaños de Juan", "No olvides que el cumpleaños de Juan es este fin de semana."));
	    carpetaExtra.agregarEmail(new Email("Cambio de contraseña", "Has solicitado un cambio de contraseña. Por favor, sigue el enlace para proceder."));
	}
	
	@Test
	
	public void CheckearCarpetas() {
		assertFalse(correoDePepe.getCarpetas().isEmpty());
		assertTrue(correoDePepe.getCarpetas().get(0) == correoDePepe.getInbox());
	}
	
	@Test
	
	public void CheckearRecibir() {
	
		correoDePepe.recibir(EmailDePrueba);
		assertTrue(correoDePepe.getCarpetas().size() == 1);
		assertTrue(correoDePepe.getInbox().getEmails().contains(EmailDePrueba)); // checkear si se mando al inbox
		correoDePepe.recibir(EmailDePrueba);
		assertTrue(correoDePepe.getCarpetas().size() == 1); // sin duplicados, deberia dar lo mismo que cuando agregue el mail de prueba
		recibirVariosCorreos();
		assertTrue(correoDePepe.getInbox().getEmails().size() == 5);
	}
	
	@Test
	
	public void CheckearEspacioOcupado() {
		assertTrue(0 == correoDePepe.EspacioOcupado());
		correoDePepe.recibir(EmailDePrueba);
		assertTrue(35 == correoDePepe.EspacioOcupado());
		recibirVariosCorreos();
		assertTrue(298 == correoDePepe.EspacioOcupado());
	}
	
	
	@Test
	public void CheckearBuscar() {
		agregarCorreos();
		assertEquals(EmailDePrueba , correoDePepe.buscar("Hola"));
		assertNotEquals(EmailDePrueba, correoDePepe.buscar("Receta de Galletas"));
		assertEquals(null , correoDePepe.buscar("Oferta por Cristian Medina"));
	}
}
