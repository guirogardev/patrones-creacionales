package es.patrones.abstractFactory;

/**
 * Ensamblador de muebles pintados.
 */
public class EnsambladorMueblesPintados {
	
	public static final MueblePintado ensamblar(MueblePintadoAbstractFactory factory) {
		return new MueblePintado(factory.crearMueble(), factory.crearColor());
	}

}
