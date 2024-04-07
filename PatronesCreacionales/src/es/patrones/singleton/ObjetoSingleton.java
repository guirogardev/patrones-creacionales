package es.patrones.singleton;

/**
 * Objeto singleton. Esta clase sólo podrá ser instanciada una vez.
 * 
 * El objetivo del patrón singleton es que sólo pueda existir una instancia del
 * objeto que implementa este patrón. Si no existe se crea y, si ya existe, se
 * devuelve.
 */
public class ObjetoSingleton implements Cloneable {

	/**
	 * Instancia de ObjetoSingleton.
	 */
	private static ObjetoSingleton INSTANCIA = null;

	/**
	 * El constructor se establece como privado para evitar una instanciación al
	 * uso.
	 */
	private ObjetoSingleton() {
	}
	
	/**
	 * Devuelve la instancia única.
	 * 
	 * @return ObjetoSingleton.
	 */
	public static ObjetoSingleton getInstancia() {
		if (INSTANCIA == null) {
			crearInstancia();
		}
		System.out.println("Devolviendo instancia");
        return INSTANCIA;
	}

	/**
	 * Crea la instancia si no existe. Se marca como synchronized para evitar una
	 * instanciación múltiple en caso de acceso multihilo.
	 */
	private synchronized static void crearInstancia() {
		if (INSTANCIA == null) {
			System.out.println("Creando instancia");
			INSTANCIA = new ObjetoSingleton();
		}
	}

	/**
	 * Con esto evitamos que se pueda crear otra instancia a través de la clonación.
	 */
	public Object clone() throws CloneNotSupportedException {
    	throw new CloneNotSupportedException(); 
	}
}
