package es.patrones.builder;

/**
 * Objeto a contruir con el patrón builder.
 */
public class Casa {
	
	private String paredes;
	
	private int numPuertas;
	
	private String materialTejado;

	public String getParedes() {
		return paredes;
	}

	public void setParedes(String paredes) {
		this.paredes = paredes;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String getMaterialTejado() {
		return materialTejado;
	}

	public void setMaterialTejado(String materialTejado) {
		this.materialTejado = materialTejado;
	}

	@Override
	public String toString() {
		return "Casa [paredes=" + paredes + ", numPuertas=" + numPuertas + ", materialTejado=" + materialTejado + "]";
	}
	
}
