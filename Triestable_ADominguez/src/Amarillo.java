
public class Amarillo extends EstadoTriestable {

	public Amarillo(Triestable triestable) {
		super(triestable);
	}

	@Override
	public void abrir() {
		Estado verde = new Verde(triestable);
		triestable.cambiarEstado(verde);		
	}
	
	@Override
	public void cerrar() {
		Estado rojo = new Rojo(triestable);
		triestable.cambiarEstado(rojo);
	}

	@Override
	public String toString() {
		return "Precaución";
	}

}
