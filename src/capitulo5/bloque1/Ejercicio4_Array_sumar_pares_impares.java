package capitulo5.bloque1;

import Utils.UtilsArrays;

/**
 * Capitulo 5, Bloque 1, Ejercicio 4 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre 0 y 100. Debes obtener la suma
 * de los números pares y los impares en variables separadas.
 * 
 * @author F541U
 *
 */

public class Ejercicio4_Array_sumar_pares_impares {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int sumaPar = 0;
		int sumaImpar = 0;
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100); // Creamos e iniciamos array de
																						// números al azar

		for (int i = 0; i < array.length; i++) { // Recorremos el array para realizar las sumas

			if (array[i] % 2 == 0) { // Módulo para comprobar si el número es par o impar y poder sumarlos de forma
										// independiente
				sumaPar += array[i];
			} else {
				sumaImpar += array[i];
			}
		}
		// Mostramos en pantalla las sumas
		System.out.println(
				"La suma de los números pares es: " + sumaPar + "\nLa suma de los números impares es: " + sumaImpar);
	}

}
