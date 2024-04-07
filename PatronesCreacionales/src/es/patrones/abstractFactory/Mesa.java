package es.patrones.abstractFactory;

/**
 * Mueble concreto.
 */
public class Mesa extends Mueble {
	
	private double alto;
	private double ancho;

	public Mesa(double precio, String fabricante, double alto, double ancho) {
		super(precio, fabricante);
		this.alto = alto;
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}
	
	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public void utilizar() {
		System.out.println("Utilizando mesa");
	}
	
}
