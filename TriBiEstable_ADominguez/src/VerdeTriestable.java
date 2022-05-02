
public class VerdeTriestable extends EstadoTriBiestable{

	public VerdeTriestable(TriBiestable tribiestable) {
		super(tribiestable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cerrar() {
		Estado amarillo = new Amarillo(tribiestable);
		tribiestable.cambiarEstado(amarillo);
	}

	@Override
	public void abrir() {
		// No action VerdeTriestable
	}

	@Override
	public String toString() {
		return "Abierto";
	}

	@Override
	public void cambio() {
		
	}
	
	
}
