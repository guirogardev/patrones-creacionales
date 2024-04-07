package es.patrones.factory;

/**
 * Superhéroe abstracto. En este caso es una clase abstracta, pero el patrón
 * funciona también con interfaces.
 */
public abstract class Superheroe {
	private String nombre;
	private double puntosPoder;

	public abstract void utilizarPoder();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPuntosPoder() {
		return puntosPoder;
	}

	public void setPuntosPoder(double puntosPoder) {
		this.puntosPoder = puntosPoder;
	}

}
