package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class CalculadoraTest {

	@Test
	void al_dividir_dos_numeros_diferentes_de_cero_el_la_division_debe_ejecutarse_correctarmente() {
		var numero1 = 10D;
		var numero2 =2D;

		Calculadora calculadora = new Calculadora();

		var resultado =  calculadora.division( numero1, numero2 );

		assertEquals(5D, resultado);
	}

	@Test
	void al_dividir_un_numero_entre_cero_la_division_debe_devolver_un_valor_nulo() {
		var numero1 = 10D;
		var numero2 =0D;

		Calculadora calculadora = new Calculadora();

		var resultado =  calculadora.division( numero1, numero2 );

		assertNull(resultado);
	}
}
