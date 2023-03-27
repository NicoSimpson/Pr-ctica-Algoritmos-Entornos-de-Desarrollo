package com.entornos.NicolasSimpsonPadilla.algoritmos;

public class algoritmos {


	public static long fibonacci(int n) {
		long fibo1=1;
		long fibo2=1;
		for (int i=2;i<=n;i++) {
			fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
		}
		return fibo2;
	}
	
	public static long factorial (int n) {
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
		return factorial;
	}
	
	public static boolean primo (int n) {
		int cont = 0;
		boolean primo = false;
		for (int i = 1; i <= n; i++) {
			if (n%i==0) cont++;
		}
		if (cont == 0) primo = true;
		return primo;
	}
}
