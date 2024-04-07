package es.patrones.builder;

/**
 * Constructor abstracto.
 */
public abstract class CasaBuilder {
	
	protected Casa casa;

	public Casa getCasa() {
		return this.casa;
	}
	
	public void crearCasa() {
		this.casa = new Casa();
	}
	
	public abstract void buildParedes();
	
	public abstract void buildNumPuertas();
	
	public abstract void buildTejado();
}
