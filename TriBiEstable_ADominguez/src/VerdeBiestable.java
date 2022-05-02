
public class VerdeBiestable extends EstadoTriBiestable{

	public VerdeBiestable(TriBiestable tribiestable) {
		super(tribiestable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cerrar() {
		Estado rojo = new RojoBiestable(tribiestable);
		tribiestable.cambiarEstado(rojo);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cambio() {
		Estado cambioBiestable = new CambioBiestable(tribiestable);
		tribiestable.cambiarEstado(cambioBiestable);
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Abierto";
	}

}
