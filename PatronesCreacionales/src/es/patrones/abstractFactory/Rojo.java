package es.patrones.abstractFactory;

public class Rojo extends Color {
	private String nombre;
	
	public Rojo(double opacidad) {
		super(opacidad);
		this.nombre = "Rojo";
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
