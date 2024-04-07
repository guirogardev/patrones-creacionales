package es.patrones.factory;

import java.util.Map;
import java.util.function.Supplier;

import javax.naming.NameNotFoundException;

import static java.util.Map.entry;

/**
 * Factoría de superhéroes por tipo. La idea es indicar un tipo de superhéroe y
 * la factoría tiene como responsabilidad crear la instancia adecuada.
 */
public class FactoriaSuperheroes {

	/**
	 * Mapa con los superhéroes de la factoría.
	 */
	private static final Map<String, Supplier<Superheroe>> superheroesFactoryMap = Map
			.ofEntries(entry("acuatico", SuperheroeAcuatico::new), entry("electrico", SuperheroeElectrico::new));

	/**
	 * Generador de superhéroes concretos dado su tipo.
	 * 
	 * @param tipo Tipo de superhéroe a crear.
	 * @return Superhéroe concreto.
	 * @throws NameNotFoundException Excepción lanzada al indicar un tipo
	 *                               incorrecto.
	 */
	public static Superheroe getSuperheroe(String tipo) throws NameNotFoundException {
		Supplier<Superheroe> factory = superheroesFactoryMap.get(tipo);
		if (factory == null) {
			throw new NameNotFoundException("No se encuentran superhéroes del tipo indicado.");
		}
		return factory.get();
	}

}
