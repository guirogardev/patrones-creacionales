package es.patrones.builder;

/**
 * Constructor concreto de una casa cara.
 */
public class CasaCaraBuilder extends CasaBuilder {

	@Override
	public void buildParedes() {
		super.casa.setParedes("Ladrillo");
	}

	@Override
	public void buildNumPuertas() {
		super.casa.setNumPuertas(7);
	}

	@Override
	public void buildTejado() {
		super.casa.setMaterialTejado("Panel ultra impermeable");
	}

}
