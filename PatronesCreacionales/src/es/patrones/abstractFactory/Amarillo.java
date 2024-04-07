package es.patrones.abstractFactory;

public class Amarillo extends Color {
	private String nombre;
	
	public Amarillo(double opacidad) {
		super(opacidad);
		this.nombre = "Amarillo";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void verColor() {
		System.out.println("Color " + this.nombre + " con opacidad " + super.getOpacidad());
	}
}
