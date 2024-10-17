package ej11.ej11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionesTest {
	protected Inversor Pablo;
	protected PlazoFijo unPlazoFijo = new PlazoFijo(15000.0 , 0.01);
	
	private void crearInversores() {
		Pablo = new Inversor("Pablo");
	}
	
	@BeforeEach
	void setUp() {
		this.crearInversores();
	}
	
	private void agregarInversiones() {
		Pablo.agregarInversion(new InversionAcciones("Boca SA" , 10 , 50.0));
		Pablo.agregarInversion(unPlazoFijo);
		Pablo.agregarInversion(new InversionAcciones("912 Recuerdos" , 9 , 12.0));
	}
	
	
	@Test
	
	void TestArrayInversiones() {
		agregarInversiones();
		assertTrue(Pablo.getInversiones().contains(unPlazoFijo));
		assertTrue(Pablo.getInversiones().size() == 3);
	}
	
	@Test
	
	void TestValores() {
		agregarInversiones();
		assertTrue(Pablo.valorTotal() == 15608.0);
		assertFalse(Pablo.valorTotal() == 912.0);
	}
	
	@Test
	void TestInversionesVacias() {
	    Inversor nuevoInversor = new Inversor("Nuevo");
	    assertEquals(0.0, nuevoInversor.valorTotal());
	}
	
	@Test
	
	void TestInversionIndividual() {
		agregarInversiones();
		assertTrue(Pablo.getInversiones().get(0).valorActual() == 500.0);
		assertTrue(Pablo.getInversiones().get(2).valorActual() == 108.0);
		assertFalse(Pablo.getInversiones().get(2).valorActual() == 100.0);
	}

}



/*
package ej11.ej11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversionesTest {
	protected Inversor Pablo;
	
	private void crearInversores() {
		Pablo = new Inversor("Pablo");
	}
	
	@BeforeEach
	void setUp() {
		this.crearInversores();
	}
	
	private void agregarInversiones() {
		Pablo.agregarInversion(new InversionAcciones("Boca SA" , 10 , 50.0));
		Pablo.agregarInversion(new PlazoFijo(15000.0 , 0.01));
		Pablo.agregarInversion(new InversionAcciones("912 Recuerdos" , 9 , 12.0));
	}
	
	
	@Test
	
	void TestArrayInversiones() {
		agregarInversiones();
		PlazoFijo auxInversion = new PlazoFijo(15000.0 , 0.01);
		System.out.print(Pablo.getInversiones());
		assertTrue(Pablo.getInversiones().contains(auxInversion));
	}
}


*/