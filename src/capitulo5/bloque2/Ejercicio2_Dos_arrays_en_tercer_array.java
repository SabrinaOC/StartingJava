package capitulo5.bloque2;

import Utils.UtilsArrays;

/**
 * Capítulo 5, Bloque 2, Ejercicio 2 
 * Realiza un ejercicio que inicialice dos arrays de 150 elementos enteros al azar entre 0 y 100. 
 * Debes crear un tercer array, compuesto de la siguiente forma: 
 * en los elementos de índice impar del tercer array debes copiar los elementos de índice impar del primer array; 
 * en los elementos de índice par del tercer array debes copiar los elementos de índice par del segundo array.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_Dos_arrays_en_tercer_array {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array1[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100);
		int array2[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100);
		int array3[] = new int[150];

		// Recorremos el array 1 para mostrar los valores que deberían aparecer en el
		// array 3, solo a modo de comprobación
		System.out.println("Array 1");
		for (int i = 1; i < array1.length; i += 2) {
			System.out.print(array1[i] +", ");
		}

		// Recorremos el array 2 para mostrar los valores que deberían aparecer en el
		// array 3, solo a modo de comprobación
		System.out.println("\nArray 2");
		for (int i = 0; i < array2.length; i += 2) {
			System.out.print(array2[i] +", ");
		}

		// Iniciamos array 3 para asignar índices pares del array 2
		for (int i = 0; i < array3.length; i += 2) {

			array3[i] = array2[i];
		}

		// Iniciamos array 3 para asignar índices impares del array 1
		for (int i = 1; i < array3.length; i += 2) {

			array3[i] = array1[i];

		}
		// Mostramos en pantalla el array 3 completo
		System.out.println("\nArray 3");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] +", ");
		}

	}
}
