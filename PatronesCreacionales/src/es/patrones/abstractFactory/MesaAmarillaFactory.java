package es.patrones.abstractFactory;

/**
 * Factoría concreta de mesas amarillas.
 */
public class MesaAmarillaFactory extends MueblePintadoAbstractFactory {

	@Override
	public Mueble crearMueble() {
		return new Mesa(169.99, "IKEA", 1.50, 2.00);
	}

	@Override
	public Color crearColor() {
		return new Amarillo(100.00);
	}

}
