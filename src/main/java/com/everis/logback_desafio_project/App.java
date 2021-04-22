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
		LOGGER.info("Inicio del método");
		
		// Iteraciones hasta N.
		for (int i = 0; i <= 5000; i++) {
			LOGGER.debug("Iteración número: {}",i);
		}
		
		LOGGER.info("Fin del método");

	}
}
