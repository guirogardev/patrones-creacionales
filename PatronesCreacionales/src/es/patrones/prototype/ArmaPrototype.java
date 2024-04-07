package es.patrones.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Gestor de prototipos de arma. Este patrón se utiliza especialmente si se
 * necesita partir de un objeto ya existente. Por ejemplo, clonando el objeto y
 * modificando el clon en lugar de instanciar el objeto y rellenarlo propiedad a
 * propiedad.
 * 
 * Sin olvidar, además, que clonar un objeto es más rápido que crearlo.
 */
public class ArmaPrototype {

	private Map<String, Arma> prototipos = new HashMap<>();

	public ArmaPrototype() {
		prototipos.put("Pistola", new Pistola(120.50, "Pistola 9mm Parabellum", 800));
		prototipos.put("Espada", new Espada(250.75, "Gladio romano", 1));
	}

	public Object prototipo(String tipo) throws CloneNotSupportedException {
		return this.prototipos.get(tipo).clone();
	}

}
