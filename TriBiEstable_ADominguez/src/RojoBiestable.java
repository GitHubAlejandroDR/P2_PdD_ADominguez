
public class RojoBiestable extends EstadoTriBiestable{

	public RojoBiestable(TriBiestable tribiestable) {
		super(tribiestable);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abrir() {
		Estado verde = new VerdeBiestable(tribiestable);
		tribiestable.cambiarEstado(verde);
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
		return "Cerrado";
	}

}
