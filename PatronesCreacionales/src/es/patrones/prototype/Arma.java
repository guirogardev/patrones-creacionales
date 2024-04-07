package es.patrones.prototype;

/**
 * Arma abstracta.
 */
public abstract class Arma implements Cloneable {
	
	private double precio;
	private String descripcion;
	
	public Arma(double precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
