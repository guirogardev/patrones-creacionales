package es.patrones.abstractFactory;

/**
 * Mueble abstracto.
 */
public abstract class Mueble {
	
	private double precio;
	private String fabricante;

	public Mueble(double precio, String fabricante) {
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public abstract void utilizar();
}
