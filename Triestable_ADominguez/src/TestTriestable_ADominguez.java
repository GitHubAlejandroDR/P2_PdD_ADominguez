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
		// Comprobamos que cuando se inicia un biestable su primera posición es
		// "cerrado"
		assertEquals("Cerrado", triestable.estado());
	}

	@Test
	public void testCerrar() {
		// Comprobamos que tras la creación de un biestble y volverlo a cerrar su
		// posición es "cerrado"
		triestable.cerrar();
		assertEquals("Cerrado", triestable.estado());
		// Comprobamos que tras la creación de un biestable abrirlo y volverlo a cerrar
		// su posición es "cerrado"
		triestable.abrir();
		triestable.cerrar();
		assertEquals("Cerrado", triestable.estado());
		// Comprobamos que tras la creación de un triestable abrirlo dos veces inicialmente y cerrarlo su posición es "precaución"
		triestable.abrir();
		triestable.abrir();
		triestable.cerrar();
		assertEquals("Precaución", triestable.estado());


	}

	@Test
	public void testAbrir() {
		// Comprobamos que tras la creación de un triestable y abrirlo su posición es
		// "precaución"
		triestable.abrir();
		assertEquals("Precaución", triestable.estado());
		// Comprobamos que tras la creación de un biestble y abrirlo dos veces
		// consecutivas su posición es "abierto"
		triestable.abrir();
		assertEquals("Abierto", triestable.estado());

	}

}
