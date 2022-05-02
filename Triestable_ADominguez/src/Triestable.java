
public class Triestable {

	private Estado estado;

	public Triestable() {
		this.estado = new Rojo(this);		
	}
	
	public void cambiarEstado(Estado estado) {
		this.estado = estado;
	}

	public void abrir() {
		estado.abrir();
	}

	public void cerrar() {
		estado.cerrar();
	}
	
	public String estado() {
		return estado.toString();
	}
	
}
