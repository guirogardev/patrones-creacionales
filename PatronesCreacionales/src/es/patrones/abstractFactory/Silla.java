package es.patrones.abstractFactory;

/**
 * Mueble concreto.
 */
public class Silla extends Mueble {
	
	private int patas;

	public Silla(double precio, String fabricante, int patas) {
		super(precio, fabricante);
		this.patas = patas;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	@Override
	public void utilizar() {
		System.out.println("Utilizando silla");
	}
	
}
