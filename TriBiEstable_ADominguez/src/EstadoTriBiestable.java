
public abstract class EstadoTriBiestable implements Estado{

	protected TriBiestable tribiestable;

	public EstadoTriBiestable(TriBiestable tribiestable) {
		this.tribiestable = tribiestable;
	}
	
	public abstract void cambio();
	
}
