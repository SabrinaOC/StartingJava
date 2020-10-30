package capitulo5.bloque1;

import Utils.UtilsArrays;

/** Capitulo 5, Bloque 1, Ejercicio 5
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
 * Debes mostrar al usuario la suma de los elementos cuyo índice sea par.
 * @author F541U
 *
 */

public class Ejecicio5_Array_suma_indices {

	public static void main(String[] args) {

		
		//Inicializamos el array de números aleatorios
		int array [] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100);
		
		//Recorremos el array para imprimir los valores en pantalla, pero a paso +2
		for (int i = 0; i < array.length; i += 2) {
			System.out.println(array[i] +" en posición " + i);
		}
		
	}

}
