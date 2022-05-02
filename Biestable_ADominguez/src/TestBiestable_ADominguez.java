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
		// Comprobamos que cuando se inicia un biestable su primera posición es "cerrado"
		assertEquals("cerrado", biestable.estado());
	}
	
	@Test
	public void testCerrar() {
		// Comprobamos que tras la creación de un biestble y volverlo a cerrar su posición es "cerrado"
		biestable.cerrar();
		assertEquals("cerrado", biestable.estado());
		// Comprobamos que tras la creación de un biestable abrirlo y volverlo a cerrar su posición es "cerrado"
		biestable.abrir();
		biestable.cerrar();
		assertEquals("cerrado", biestable.estado());
	}
	
	@Test
	public void testAbrir() {
		// Comprobamos que tras la creación de un biestble y abrirlo su posición es "abierto"
		biestable.abrir();
		assertEquals("abierto", biestable.estado());
		// Comprobamos que tras la creación de un biestble y abrirlo dos veces consecutivas su posición es "abierto"
		biestable.abrir();
		assertEquals("abierto", biestable.estado());

	}

}
