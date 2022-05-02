
public class Rojo extends EstadoTriestable {
	
	public Rojo(Triestable triestable) {
		super(triestable);
	}
	
	@Override
	public void abrir() {
		Estado amarillo = new Amarillo(triestable);
		triestable.cambiarEstado(amarillo);
	}

	@Override
	public void cerrar() {
		// No action Rojo state
	}

	@Override
	public String toString() {
		return "Cerrado";
	}

}
