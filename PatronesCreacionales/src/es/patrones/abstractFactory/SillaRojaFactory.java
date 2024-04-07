package es.patrones.abstractFactory;

/**
 * Factoría concreta de sillas rojas.
 */
public class SillaRojaFactory extends MueblePintadoAbstractFactory {

	@Override
	public Mueble crearMueble() {
		return new Silla(74.99, "Muebles Paco", 4);
	}

	@Override
	public Color crearColor() {
		return new Rojo(73.00);
	}

}
