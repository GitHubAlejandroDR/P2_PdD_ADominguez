
public class CambioBiestable extends EstadoTriBiestable{

	public CambioBiestable(TriBiestable tribiestable) {
		super(tribiestable);
	
	}
	@Override
	public void abrir() {
		Estado amarillo = new Amarillo(tribiestable);
		tribiestable.cambiarEstado(amarillo);
	}
	@Override
	public void cerrar() {
		Estado amarillo = new Amarillo(tribiestable);
		tribiestable.cambiarEstado(amarillo);
	}

	@Override
	public void cambio() {
	
	}

	@Override
	public String toString() {
		return "Intermedio Biestable - Triestable";
	}

}
