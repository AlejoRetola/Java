package Figuras.ej5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCirculo {

	private Circulo circulo;

	@BeforeEach
	public void setUp() {
		circulo = new Circulo();
		circulo.setRadio(3);
	}

	@Test
	public void testDiametro() {
		System.out.print(circulo.getDiametro());
		assertEquals(6, circulo.getDiametro());
	}

	@Test
	public void testArea() {
		assertEquals(28.27, circulo.getArea(), 0.01);
	}

	@Test
	public void testPerimetro() {
		assertEquals(18.85, circulo.getPerimetro(), 0.01);
	}

	@Test
	public void testRadio() {
		assertEquals(3, circulo.getRadio());
	}
}