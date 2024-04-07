package es.patrones.main;

import javax.naming.NameNotFoundException;

import es.patrones.abstractFactory.EnsambladorMueblesPintados;
import es.patrones.abstractFactory.MesaAmarillaFactory;
import es.patrones.abstractFactory.MueblePintado;
import es.patrones.abstractFactory.SillaRojaFactory;
import es.patrones.builder.CasaBarataBuilder;
import es.patrones.builder.CasaCaraBuilder;
import es.patrones.builder.Constructora;
import es.patrones.factory.FactoriaSuperheroes;
import es.patrones.factory.Superheroe;
import es.patrones.prototype.Arma;
import es.patrones.prototype.ArmaPrototype;
import es.patrones.singleton.ObjetoSingleton;

public class PatronesCreacionales {

	public static void main(String[] args) {
		ejecutarPatronFactoria();
		ejecutarPatronFactoriaAbstracta();
		ejecutarPatronBuilder();
		ejecutarPatronPrototype();
		ejecutarPatronSingleton();
	}
	
	/**
	 * Prueba del patrón creacional Factory Method.
	 */
	private static void ejecutarPatronFactoria() {
		System.out.println("[INICIO PATRÓN FACTORÍA]");
		try {
			final Superheroe superheroeAcuatico = FactoriaSuperheroes.getSuperheroe("acuatico");
			final Superheroe superheroeElectrico = FactoriaSuperheroes.getSuperheroe("electrico");
			superheroeAcuatico.utilizarPoder();
			superheroeElectrico.utilizarPoder();
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}	
		System.out.println("[FIN PATRÓN FACTORÍA]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón creacional Abstract Factory.
	 */
	private static void ejecutarPatronFactoriaAbstracta() {
		System.out.println("[INICIO PATRÓN FACTORÍA ABSTRACTA]");
		final MueblePintado mesaAmarilla = EnsambladorMueblesPintados.ensamblar(new MesaAmarillaFactory());
		mesaAmarilla.getColor().verColor();
		mesaAmarilla.getMueble().utilizar();
		
		final MueblePintado sillaRoja = EnsambladorMueblesPintados.ensamblar(new SillaRojaFactory());
		sillaRoja.getColor().verColor();
		sillaRoja.getMueble().utilizar();
		System.out.println("[FIN PATRÓN FACTORÍA ABSTRACTA]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón creacional Builder.
	 */
	private static void ejecutarPatronBuilder() {
		System.out.println("[INICIO PATRÓN BUILDER]");
		final Constructora constructora = new Constructora();
		constructora.setBuilder(new CasaBarataBuilder());
		try {
			constructora.construirCasa();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(constructora.getCasa().toString());
		
		constructora.setBuilder(new CasaCaraBuilder());
		
		try {
			constructora.construirCasa();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(constructora.getCasa().toString());
		
		System.out.println("[FIN PATRÓN BUILDER]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón creacional Prototype.
	 */
	private static void ejecutarPatronPrototype() {
		System.out.println("[INICIO PATRÓN PROTOTYPE]");
		final ArmaPrototype	armaPrototype = new ArmaPrototype();
		try {
			final Arma arma = (Arma) armaPrototype.prototipo("Pistola");
			System.out.println(arma.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("[FIN PATRÓN PROTOTYPE]");
		System.out.println("\r\n");
	}
	
	/**
	 * Prueba del patrón creacional Singleton.
	 */
	private static void ejecutarPatronSingleton() {
		System.out.println("[INICIO PATRÓN SINGLETON]");
		final ObjetoSingleton objetoSingleton = ObjetoSingleton.getInstancia();
		final ObjetoSingleton objetoSingleton2 = ObjetoSingleton.getInstancia();

		System.out.println("Los objetos son el mismo: " + (objetoSingleton == objetoSingleton2));
		System.out.println("[FIN PATRÓN SINGLETON]");
	}

}
