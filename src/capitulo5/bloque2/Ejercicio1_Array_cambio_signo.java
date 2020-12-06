package capitulo5.bloque2;

import utils.UtilsArrays;

/**
 * Capitulo 5, Bloque 2, Ejercicio 1 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre -100 y 100. Debes conseguir que
 * todos los n�meros pares del array cambien de signo, los positivos deben pasar
 * a negativos y viceversa.
 * 
 * @author F541U
 *
 */

public class Ejercicio1_Array_cambio_signo {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Usamos m�todo para crear e inicializar array de enteros al azar con l�mites
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, -100, 100);

		// Recorremos el array para cambiar los signos
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
				System.out.print(array[i] + ",  ");
			}

		}

	}

}
