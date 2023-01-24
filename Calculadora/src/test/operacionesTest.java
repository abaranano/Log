package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class operacionesTest {

	@Test
	void testSumar() {
		Operaciones ObjetoOperaciones = new Operaciones();
		int numero1=5,numero2=2;
		int resultado =ObjetoOperaciones.sumar(numero1, numero2);
		assertEquals(7,resultado);
	}

	@Test
	void testRestar() {
		Operaciones ObjetoOperaciones = new Operaciones();
		int numero1=5,numero2=2;
		int resultado =ObjetoOperaciones.restar(numero1, numero2);
		assertEquals(3,resultado);
	}

	@Test
	void testMultiplicar() {
		Operaciones ObjetoOperaciones = new Operaciones();
		int numero1=5,numero2=2;
		int resultado =ObjetoOperaciones.multiplicar(numero1, numero2);
		assertEquals(10,resultado);
	}

	@Test
	void testDividir() {
		Operaciones ObjetoOperaciones = new Operaciones();
		int numero1=5,numero2=2;
		int resultado =ObjetoOperaciones.dividir(numero1, numero2);
		assertEquals(2,resultado);
	}

	@Test
	void testResto() {
		Operaciones ObjetoOperaciones = new Operaciones();
		int numero1=5,numero2=2;
		int resultado =ObjetoOperaciones.resto(numero1, numero2);
		assertEquals(1,resultado);
	}

}
