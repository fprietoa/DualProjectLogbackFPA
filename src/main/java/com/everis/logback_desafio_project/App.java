package com.everis.logback_desafio_project;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Formación - Desafío Logback
 * 
 * @author fprietoa
 *
 */
public class App {

	/** LOGGER */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {	
		
		LOGGER.info("Proyecto de Logback");
		
		LOGGER.info("Inicio del método");
		
		// Iteraciones hasta N.
		for (int i = 0; i <= 5000; i++) {
			LOGGER.debug("Iteración número: {}",i);
		}
		
		LOGGER.info("Fin del método");
		
		
		LOGGER.info("Segundo bucle");
		
		LOGGER.info("Inicio del array");
		
		// Array con los niveles.
		String[] logger = {"Trace", "Debug", "Info", "Warn", "Error"};
		
		// Iteraciones niveles Logger.
		for(int i = 0; i<logger.length; i++) {
			System.out.println("Niveles ordenados por importancia: " + logger[i]);		
			LOGGER.debug("Iteración número: {}", i);
		}
		
		LOGGER.info("Fin del array");

	}
}
