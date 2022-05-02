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
		// Comprobamos que cuando se inicia un tribiiestable su primera posición es
		// "cerrado"
		assertEquals("Cerrado", tribiestable.estado());
	}

	@Test
	public void testCerrar() {
		// Comprobamos que tras la creación de un tribiestble y volverlo a cerrar su
		// posición es "cerrado"
		tribiestable.cerrar();
		assertEquals("Cerrado", tribiestable.estado());
		// Comprobamos que tras la creación de un tribiestable abrirlo y volverlo a cerrar
		// su posición es "cerrado"
		tribiestable.abrir();
		tribiestable.cerrar();
		assertEquals("Cerrado", tribiestable.estado());
		// Comprobamos que tras la creación de un tribiestable y realizar la secuencia
		// [cambio,cerrar] su posición es "precaución
		tribiestable.cambio();
		tribiestable.cerrar();
		assertEquals("Precaución", tribiestable.estado());

	}

	@Test
	public void testAbrir() {
		// Comprobamos que tras la creación de un tribiestable y abrirlo su posición es
		// "Abierto"
		tribiestable.abrir();
		assertEquals("Abierto", tribiestable.estado());
		// Comprobamos que tras la creación de un tribiestble y abrirlo dos veces
		// consecutivas su posición es "abierto"
		tribiestable.abrir();
		assertEquals("Abierto", tribiestable.estado());
		// Comprobamos que tras la creación de un tribiestable y realizar la secuencia
		// [cambio,cerrar] su posición es "precaución
		tribiestable.cambio();
		tribiestable.abrir();;
		assertEquals("Precaución", tribiestable.estado());
	}

	@Test
	public void testCambiar() {
		// Comprobamos que tras la creación de un triestable y realizar la secuencia [cambio,cerrar,cerrar,abrir,cambio,cerrar] su posición es "cerrado
		tribiestable.cambio();
		tribiestable.cerrar();
		tribiestable.cerrar();
		tribiestable.abrir();
		tribiestable.cambio();
		tribiestable.cerrar();
		assertEquals("Cerrado", tribiestable.estado());
		// Añadimos la secuencia [cambio,cerrar,cerrar,abrir,cambio,abrir] y comprobamos que su posición es "Abierto"
		tribiestable.cambio();
		tribiestable.cerrar();
		tribiestable.cerrar();
		tribiestable.abrir();
		tribiestable.cambio();
		tribiestable.abrir();
		assertEquals("Abierto", tribiestable.estado());

	}

}
