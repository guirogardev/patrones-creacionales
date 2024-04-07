package es.patrones.abstractFactory;

/**
 * Color abstracto.
 */
public abstract class Color {
	
	private double opacidad;

	public Color(double opacidad) {
		this.opacidad = opacidad;
	}

	public double getOpacidad() {
		return opacidad;
	}

	public void setOpacidad(double opacidad) {
		this.opacidad = opacidad;
	}
	
	public abstract void verColor();
}
