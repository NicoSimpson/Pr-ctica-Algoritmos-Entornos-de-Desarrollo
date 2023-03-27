package com.entornos.NicolasSimpsonPadilla.algoritmos;

public class Principal {

	/*
	 * El main con los arrays. 
	 * @version 1.0
	 * 
	 * @autor Nicolas Simpson Padilla
	 * */
	
	public static void main(String[] args) {
		
		//array con numeros randoms del 1 al 20
		int [] lista = new int [5];
		for (int i = 0; i < lista.length; i++) {
			lista [i] = (int)((Math.random()*(20-1+1))+1);
		}
		
		//array con el numero fibonacci de cada numero random del anterior array
		long [] resultadoFibonacci = new long [5];
		for (int i = 0; i < lista.length; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(lista [i]);
		}
		
		//array con el numero factorial de cada numero random del anterior array
		long [] resultadoFactorial = new long [5];
		for (int i = 0; i < lista.length; i++) {
			resultadoFactorial[i] = algoritmos.factorial(lista [i]);
		}
		
		//metemos en un array si el numero random del primer array es primo o no
		boolean [] resultadoPrimos = new boolean [5];
		for (int i = 0; i < lista.length; i++) {
			resultadoPrimos[i] = algoritmos.primo(lista [i]);
		}
	}

}
