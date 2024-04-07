package es.patrones.builder;

/**
 * Constructor concreto de una casa barata.
 */
public class CasaBarataBuilder extends CasaBuilder {

	@Override
	public void buildParedes() {
		super.casa.setParedes("Pladur");
	}

	@Override
	public void buildNumPuertas() {
		super.casa.setNumPuertas(1);
	}

	@Override
	public void buildTejado() {
		super.casa.setMaterialTejado("Chapa");
	}

}
