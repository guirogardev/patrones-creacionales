package es.patrones.abstractFactory;

/**
 * Objeto concreto completo a instanciar a través de la factoría abstracta.
 */
public class MueblePintado {
	
	private Mueble mueble;
	
	private Color color;
	
	public MueblePintado(Mueble mueble, Color color) {
		this.mueble = mueble;
		this.color = color;
	}

	public Mueble getMueble() {
		return mueble;
	}

	public void setMueble(Mueble mueble) {
		this.mueble = mueble;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
