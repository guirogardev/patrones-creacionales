package es.patrones.prototype;

/**
 * Arma concreta espada.
 */
public class Espada extends Arma {

	private int longitudMetros;

	public Espada(double precio, String descripcion, int longitudMetros) {
		super(precio, descripcion);
		this.longitudMetros = longitudMetros;
	}

	public int getLongitudMetros() {
		return longitudMetros;
	}

	public void setLongitudMetros(int longitudMetros) {
		this.longitudMetros = longitudMetros;
	}

	@Override
	public String toString() {
		return "Espada [getLongitudMetros()=" + getLongitudMetros() + ", getPrecio()=" + getPrecio()
				+ ", getDescripcion()=" + getDescripcion() + "]";
	}
	
}
