package com.entornos.NicolasSimpsonPadilla.algoritmos;

public class Principal {

	public static void main(String[] args) {
		int [] lista = new int [5];
		for (int i = 0; i < lista.length; i++) {
			lista [i] = (int)((Math.random()*(20-1+1))+1);
		}
		long [] resultadoFibonacci = new long [5];
		for (int i = 0; i < lista.length; i++) {
			resultadoFibonacci[i] = algoritmos.fibonacci(lista [i]);
		}
		long [] resultadoFactorial = new long [5];
		for (int i = 0; i < lista.length; i++) {
			resultadoFactorial[i] = algoritmos.factorial(lista [i]);
		}
		boolean [] resultadoPrimos = new boolean [5];
		for (int i = 0; i < lista.length; i++) {
			resultadoPrimos[i] = algoritmos.primo(lista [i]);
		}
	}

}
