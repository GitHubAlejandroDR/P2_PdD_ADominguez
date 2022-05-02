
public class Verde extends EstadoBiestable{

	public Verde(Biestable biestable) {
		super(biestable);
	}
	
	@Override
	public String toString() {
		return "abierto";
	}

	@Override
	public void cerrar() {
		Estado rojo = new Rojo(biestable);
		biestable.cambiarEstado(rojo);
		
	}

	@Override
	public void abrir() {
		
	}
	
	
}
