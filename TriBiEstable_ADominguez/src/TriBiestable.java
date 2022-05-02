
public class TriBiestable {

	private Estado estado;

	public TriBiestable() {
		this.estado = new RojoBiestable(this);		
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
	
	public void cambio() {
		estado.cambio();
	}
	
	public String estado() {
		return estado.toString();
	}
	

}
