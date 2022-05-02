
public class Biestable {

	private Estado estado;

	public void cambiarEstado(Estado estado) {
		this.estado = estado;
	}

	public void abrir() {
		estado.abrir();
	}

	public void cerrar() {
		estado.cerrar();
	}

	public Biestable() {
		estado = new Rojo(this);
		
	}
	
	public String estado() {
		return estado.toString();
	}
	
	

}
