package capitulo5.bloque1;

import utils.UtilsArrays;

/**
 * Capítulo 5, Bloque 1, Ejercicio 2 
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Después de su inicialización debéis imprimir el array en orden inverso.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_Array_limites_aleatorio_inverso {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Utilizamos el método para crear arrays con números aleatorios longitud y
		// límites
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100);

		// recorremos el array hacia atrás
		for (int i = array.length - 1; i >= 0; i--) {

			System.out.println("El valor de i en la posición " + i + " es " + array[i]); // Mostramos el array al revés
		}

	}

}
