package com.entornos.NicolasSimpsonPadilla.algoritmos;

public class algoritmos {

	/*
	 * En este ejercicio realizaremos los siguientes calculos:ç
	 * - fibonacci
	 * - factorial
	 * - saber si es primo
	 * 
	 * @version 1.0
	 * 
	 * @autor Nicolas Simpson Padilla
	 * */

	//calcular el numero fibonacci
	public static long fibonacci(int n) {
		long fibo1=1;
		long fibo2=1;
		for (int i=2;i<n;i++) {
			fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
		}
		return fibo2;
	}
	
	//calcular el numero factorial
	public static long factorial (int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		return factorial;
	}
	
	//saber si el numero es primo
	public static boolean primo (int n) {
		int cont = 0;
		boolean primo = false;
		for (int i = 1; i < n; i++) {
			if (n%i==0) cont++;
		}
		if (cont == 1) primo = true;
		return primo;
	}
}
