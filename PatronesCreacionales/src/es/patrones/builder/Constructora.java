package es.patrones.builder;

/**
 * Director de construcción. Conviene que esta clase sea un singleton.
 */
public class Constructora {

	private CasaBuilder builder;
	
	public void construirCasa() throws ClassNotFoundException {
		if (this.builder == null) {
			throw new ClassNotFoundException("No se ha definido un constructor.");
		}
		this.builder.crearCasa();
		this.builder.buildParedes();
		this.builder.buildNumPuertas();
		this.builder.buildTejado();
	}

	public void setBuilder(CasaBuilder builder) {
		this.builder = builder;
	}
	
	public Casa getCasa() {
		return this.builder.getCasa();
	}
}
