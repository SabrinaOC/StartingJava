package capitulo5.bloque1;

import utils.UtilsArrays;

/**
 * Cap�tulo 5, Bloque 1, Ejercicio 2 
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Despu�s de su inicializaci�n deb�is imprimir el array en orden inverso.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_Array_limites_aleatorio_inverso {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Utilizamos el m�todo para crear arrays con n�meros aleatorios longitud y
		// l�mites
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100);

		// recorremos el array hacia atr�s
		for (int i = array.length - 1; i >= 0; i--) {

			System.out.println("El valor de i en la posici�n " + i + " es " + array[i]); // Mostramos el array al rev�s
		}

	}

}
