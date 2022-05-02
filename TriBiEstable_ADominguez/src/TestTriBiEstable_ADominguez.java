import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTriBiEstable_ADominguez {

	private TriBiestable tribiestable;

	@BeforeEach
	public void TestBiestable() {
		tribiestable = new TriBiestable();
	}

	@Test
	public void testInicial() {
		// Comprobamos que cuando se inicia un tribiiestable su primera posici�n es
		// "cerrado"
		assertEquals("Cerrado", tribiestable.estado());
	}

	@Test
	public void testCerrar() {
		// Comprobamos que tras la creaci�n de un tribiestble y volverlo a cerrar su
		// posici�n es "cerrado"
		tribiestable.cerrar();
		assertEquals("Cerrado", tribiestable.estado());
		// Comprobamos que tras la creaci�n de un tribiestable abrirlo y volverlo a cerrar
		// su posici�n es "cerrado"
		tribiestable.abrir();
		tribiestable.cerrar();
		assertEquals("Cerrado", tribiestable.estado());
		// Comprobamos que tras la creaci�n de un tribiestable y realizar la secuencia
		// [cambio,cerrar] su posici�n es "precauci�n
		tribiestable.cambio();
		tribiestable.cerrar();
		assertEquals("Precauci�n", tribiestable.estado());

	}

	@Test
	public void testAbrir() {
		// Comprobamos que tras la creaci�n de un tribiestable y abrirlo su posici�n es
		// "Abierto"
		tribiestable.abrir();
		assertEquals("Abierto", tribiestable.estado());
		// Comprobamos que tras la creaci�n de un tribiestble y abrirlo dos veces
		// consecutivas su posici�n es "abierto"
		tribiestable.abrir();
		assertEquals("Abierto", tribiestable.estado());
		// Comprobamos que tras la creaci�n de un tribiestable y realizar la secuencia
		// [cambio,cerrar] su posici�n es "precauci�n
		tribiestable.cambio();
		tribiestable.abrir();;
		assertEquals("Precauci�n", tribiestable.estado());
	}

	@Test
	public void testCambiar() {
		// Comprobamos que tras la creaci�n de un triestable y realizar la secuencia [cambio,cerrar,cerrar,abrir,cambio,cerrar] su posici�n es "cerrado
		tribiestable.cambio();
		tribiestable.cerrar();
		tribiestable.cerrar();
		tribiestable.abrir();
		tribiestable.cambio();
		tribiestable.cerrar();
		assertEquals("Cerrado", tribiestable.estado());
		// A�adimos la secuencia [cambio,cerrar,cerrar,abrir,cambio,abrir] y comprobamos que su posici�n es "Abierto"
		tribiestable.cambio();
		tribiestable.cerrar();
		tribiestable.cerrar();
		tribiestable.abrir();
		tribiestable.cambio();
		tribiestable.abrir();
		assertEquals("Abierto", tribiestable.estado());

	}

}
