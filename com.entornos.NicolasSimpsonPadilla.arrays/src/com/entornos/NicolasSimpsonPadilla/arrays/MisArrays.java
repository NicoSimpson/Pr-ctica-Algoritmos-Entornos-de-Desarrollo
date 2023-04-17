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
	 * @return - devolvemos la mediana
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

	/*calcular el valor maximo
	 * @param maximo - recoge el numero mas alto del array
	 * @return - devolvemos el valor maximo
	 */
	
	public static int maximo (int[] array) {
		int maximo=0;
		
		for (int i=0; i < array.length; i++) {
			if (array[i]>maximo) {
				maximo=array[i];
			}
		}
		return maximo;
	}
	
	/*calcular el valor minimo
	 * @param minimo - recoge el numero mas bajo del array
	 * @return - devolvemos el valor minimo
	 */
	
	public static int minimo (int[] array) {
		int minimo=999999999;
		
		for (int i=0; i < array.length; i++) {
			if (array[i]<=minimo) {
				minimo=array[i];
			}
		}
		return minimo;
	}
}
