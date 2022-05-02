
public class Rojo extends EstadoBiestable{

	public Rojo(Biestable biestable) {
		super(biestable);
	}
	
	@Override
	public String toString() {
		return "cerrado";
	}

	@Override
	public void cerrar() {
		
		
	}

	@Override
	public void abrir() {
		Estado verde = new Verde(biestable);
		biestable.cambiarEstado(verde);
	}

	
	

}
