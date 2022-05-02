
public class Amarillo extends EstadoTriBiestable {

	public Amarillo(TriBiestable tribiestable) {
		super(tribiestable);
	}

	public void abrir() {
		Estado verde = new VerdeTriestable(tribiestable);
		tribiestable.cambiarEstado(verde);
	}

	public void cerrar() {
		Estado rojo = new RojoTriestable(tribiestable);
		tribiestable.cambiarEstado(rojo);
	}

	public void cambio() {
		Estado cambioTriestable = new CambioTriestable(tribiestable);
		tribiestable.cambiarEstado(cambioTriestable);
	}

	@Override
	public String toString() {
		return "Precaución";
	}

}
