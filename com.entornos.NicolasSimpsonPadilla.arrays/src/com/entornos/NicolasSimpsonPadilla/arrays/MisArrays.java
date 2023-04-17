package com.entornos.NicolasSimpsonPadilla.arrays;

public abstract class MisArrays {

	/*
	 * En este ejercicio realizaremos los siguientes calculos:
	 * - La media de un array
	 * - La mediana de un array
	 * - El maximo de un array
	 * - El minimo de un array
	 * 
	 * @version 1.0
	 * 
	 * @autor Nicolas Simpson Padilla
	 * */

	/*calcular la media
	 * @param media - numero con decimales que ira sumando los valores del array
	 * @return - devolvemos la media
	 */
	
	public static double media (int[] array) {
		double media = 0.0;
		for (int i=0; i < array.length; i++) {
			 media = media + array[i];
		}
		media = media / 2;
		return media;
	}
	
	/*calcular la mediana
	 * @param mediana - es el numero que estara en la mitad del array
	 * @param mitad - es el numero que estara en la mitad del array
	 * @return - devolvemos la media
	 */
	
	public static double mediana (int[] array) {
		double mediana;
		int mitad = array.length / 2;
		
		if (array.length % 2 == 0) {
		 mediana = (array[mitad-1] + array[mitad]) / 2.0;
		} else {
		 mediana = array[mitad];
		}
		return mediana;
	}

}
