
public class Verde extends EstadoTriestable {
		
	public Verde(Triestable triestable) {
		super(triestable);
	}

	@Override
	public void abrir() {
		// No action Verde state
	}
	
	@Override
	public void cerrar() {
		Estado amarillo = new Amarillo(triestable);
		triestable.cambiarEstado(amarillo);
	}
	
	@Override
	public String toString() {
		return "Abierto";
	}

}
