package es.patrones.prototype;

/**
 * Arma concreta pistola.
 */
public class Pistola extends Arma {
	
	private int alcanceMetros;

	public Pistola(double precio, String descripcion, int alcanceMetros) {
		super(precio, descripcion);
		this.alcanceMetros = alcanceMetros;
	}

	public int getAlcanceMetros() {
		return alcanceMetros;
	}

	public void setAlcanceMetros(int alcanceMetros) {
		this.alcanceMetros = alcanceMetros;
	}

	@Override
	public String toString() {
		return "Pistola [getAlcanceMetros()=" + getAlcanceMetros()
				+ ", getPrecio()=" + getPrecio() + ", getDescripcion()=" + getDescripcion() + "]";
	}

	
}
