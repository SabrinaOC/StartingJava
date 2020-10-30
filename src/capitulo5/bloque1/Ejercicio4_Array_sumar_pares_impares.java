package capitulo5.bloque1;

import Utils.UtilsArrays;

/** Capitulo 5, Bloque 1, Ejercicio 4
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes obtener la suma de los números pares y los impares en variables separadas.
 * 
 * @author F541U
 *
 */

public class Ejercicio4_Array_sumar_pares_impares {

	public static void main(String[] args) {


		int sumaPar = 0;
		int sumaImpar = 0;
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100);
		
		for (int i = 0; i < array.length; i++) {
			
			if (array [i] % 2 == 0) {
				sumaPar += array[i];
			} else {
				sumaImpar += array[i];
			}
		}
		
		System.out.println("La suma de los números pares es: " + sumaPar
				+ "\nLa suma de los números impares es: " + sumaImpar);
	}

}
