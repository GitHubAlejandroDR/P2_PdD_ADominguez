
public class CambioTriestable extends EstadoTriBiestable {

	public CambioTriestable(TriBiestable tribiestable) {
		super(tribiestable);
	
	}

	@Override
	public void cerrar() {
		Estado rojo = new RojoBiestable(tribiestable);
		tribiestable.cambiarEstado(rojo);
	}

	@Override
	public void abrir() {
		Estado verde = new VerdeBiestable(tribiestable);
		tribiestable.cambiarEstado(verde);
		
	}

	@Override
	public void cambio() {
		
	}

	@Override
	public String toString() {
		return "Intermedio Triestable - Biestable";
	}

}
