package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {

	protected static final Logger logger = LogManager.getLogger();

	public Double division(Double dividendo, Double divisor){
		logger.info( "Iniciando división de {} entre {}", dividendo, divisor );
		if(divisor==0){
			logger.error( "Se esta intentanto dividir por cero" );
			return null;
		}

		var resultado = dividendo / divisor;

		logger.info( "{} dividido entre {} es igual a {}", dividendo, divisor, resultado);

		return resultado;
	}
}
