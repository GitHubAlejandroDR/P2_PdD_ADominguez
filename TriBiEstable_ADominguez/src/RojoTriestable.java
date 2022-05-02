
public class RojoTriestable extends EstadoTriBiestable{

	public RojoTriestable(TriBiestable tribiestable) {
		super(tribiestable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cerrar() {
		// No action RojoTriestable
	}

	@Override
	public void abrir() {
		Estado amarillo = new Amarillo(tribiestable);
		tribiestable.cambiarEstado(amarillo);
	}

	@Override
	public String toString() {
		return "Cerrado";
	}

	@Override
	public void cambio() {
		
	}

	
	

}
