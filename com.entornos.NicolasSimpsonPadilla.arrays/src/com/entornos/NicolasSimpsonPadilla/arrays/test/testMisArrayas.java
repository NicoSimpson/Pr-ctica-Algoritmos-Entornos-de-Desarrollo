package com.entornos.NicolasSimpsonPadilla.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entornos.NicolasSimpsonPadilla.arrays.MisArrays;

class testMisArrayas {

	int array1 [] = new int [] {1,1,1,1,1};
	int array2 [] = new int [] {1,2,3,4};
	int array3 [] = new int [] {5,5,5,5};
	@Test
	void testMedia() {
		double resultado1 = MisArrays.media(array1);
		double resultadoEsperado1 = 2.5;
		double resultado2 = MisArrays.media(array2);
		double resultadoEsperado2 = 5;
		double resultado3 = MisArrays.media(array3);
		double resultadoEsperado3 = 10;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	
	@Test
	void testMediana() {
		double resultado1 = MisArrays.mediana(array1);
		double resultadoEsperado1 = 1;
		double resultado2 = MisArrays.mediana(array2);
		double resultadoEsperado2 = 2.5;
		double resultado3 = MisArrays.mediana(array3);
		double resultadoEsperado3 = 5;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	
	@Test
	void testMaximo() {
		double resultado1 = MisArrays.maximo(array1);
		double resultadoEsperado1 = 1;
		double resultado2 = MisArrays.maximo(array2);
		double resultadoEsperado2 = 4;
		double resultado3 = MisArrays.maximo(array3);
		double resultadoEsperado3 = 5;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}
	
	@Test
	void testMinimo() {
		double resultado1 = MisArrays.minimo(array1);
		double resultadoEsperado1 = 1;
		double resultado2 = MisArrays.minimo(array2);
		double resultadoEsperado2 = 1;
		double resultado3 = MisArrays.minimo(array3);
		double resultadoEsperado3 = 5;
		
		assertEquals(resultadoEsperado1, resultado1);
		assertEquals(resultadoEsperado2, resultado2);
		assertEquals(resultadoEsperado3, resultado3);
	}

}
