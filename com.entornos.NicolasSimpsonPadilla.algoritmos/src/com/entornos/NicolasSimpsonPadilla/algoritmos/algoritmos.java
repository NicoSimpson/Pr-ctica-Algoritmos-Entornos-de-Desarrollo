package com.entornos.NicolasSimpsonPadilla.algoritmos;

public class algoritmos {


	public static int fibonacci(int n) {
		int fibo1=1;
		int fibo2=1;
		for (int i=2;i<=n;i++) {
			fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
		}
		return fibo2;
	}
	
	public static int factorial (int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		return n;
	}
	
}
