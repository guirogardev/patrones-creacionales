package es.patrones.abstractFactory;

/**
 * Factoría abstracta de muebles pintados.
 */
public abstract class MueblePintadoAbstractFactory {
	public abstract Mueble crearMueble();
	public abstract Color crearColor();
}
