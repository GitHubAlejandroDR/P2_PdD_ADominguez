import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTriestable_ADominguez {

	private Triestable triestable;

	@BeforeEach
	public void TestBiestable() {
		triestable = new Triestable();
	}

	@Test
	public void testInicial() {
		// Comprobamos que cuando se inicia un biestable su primera posici�n es
		// "cerrado"
		assertEquals("Cerrado", triestable.estado());
	}

	@Test
	public void testCerrar() {
		// Comprobamos que tras la creaci�n de un biestble y volverlo a cerrar su
		// posici�n es "cerrado"
		triestable.cerrar();
		assertEquals("Cerrado", triestable.estado());
		// Comprobamos que tras la creaci�n de un biestable abrirlo y volverlo a cerrar
		// su posici�n es "cerrado"
		triestable.abrir();
		triestable.cerrar();
		assertEquals("Cerrado", triestable.estado());
		// Comprobamos que tras la creaci�n de un triestable abrirlo dos veces inicialmente y cerrarlo su posici�n es "precauci�n"
		triestable.abrir();
		triestable.abrir();
		triestable.cerrar();
		assertEquals("Precauci�n", triestable.estado());


	}

	@Test
	public void testAbrir() {
		// Comprobamos que tras la creaci�n de un triestable y abrirlo su posici�n es
		// "precauci�n"
		triestable.abrir();
		assertEquals("Precauci�n", triestable.estado());
		// Comprobamos que tras la creaci�n de un biestble y abrirlo dos veces
		// consecutivas su posici�n es "abierto"
		triestable.abrir();
		assertEquals("Abierto", triestable.estado());

	}

}
