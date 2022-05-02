import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBiestable_ADominguez {
	
	private Biestable biestable;

	@BeforeEach
	public void TestBiestable() {
		biestable = new Biestable();
	}

	@Test
	public void testInicial() {
		// Comprobamos que cuando se inicia un biestable su primera posici�n es "cerrado"
		assertEquals("cerrado", biestable.estado());
	}
	
	@Test
	public void testCerrar() {
		// Comprobamos que tras la creaci�n de un biestble y volverlo a cerrar su posici�n es "cerrado"
		biestable.cerrar();
		assertEquals("cerrado", biestable.estado());
		// Comprobamos que tras la creaci�n de un biestable abrirlo y volverlo a cerrar su posici�n es "cerrado"
		biestable.abrir();
		biestable.cerrar();
		assertEquals("cerrado", biestable.estado());
	}
	
	@Test
	public void testAbrir() {
		// Comprobamos que tras la creaci�n de un biestble y abrirlo su posici�n es "abierto"
		biestable.abrir();
		assertEquals("abierto", biestable.estado());
		// Comprobamos que tras la creaci�n de un biestble y abrirlo dos veces consecutivas su posici�n es "abierto"
		biestable.abrir();
		assertEquals("abierto", biestable.estado());

	}

}
