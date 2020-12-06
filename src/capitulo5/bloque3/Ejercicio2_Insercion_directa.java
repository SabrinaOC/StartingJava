package capitulo5.bloque3;

import utils.UtilsArrays;

/**
 * Capítulo 5, bloque 3, ejercicio 2 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre 0 y 1.000. Una vez que lo hayas
 * conseguido debes realizar implementar el algoritmo de ordenación llamado
 * "Inserción directa", con el objetivo de ordenar el array completamente.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_Insercion_directa {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {


		int array [] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(10, 0, 1000);
		int auxiliar;
		
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[i]) {
					
				}
			}
			array[i] = array[i-1];
			System.out.print(array[i] + " ");
		}
	}

}
