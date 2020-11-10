package capitulo5.bloque3;

import Utils.UtilsArrays;

/**
 * Capítulo 5, bloque 3, ejercicio 1 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre 0 y 1.000. Una vez que lo hayas
 * conseguido debes realizar implementar el algoritmo de ordenación llamado
 * "Burbuja", con el objetivo de ordenar el array completamente.
 * 
 * @author F541U
 *
 */

public class Ejercicio1_Burbuja {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array [] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 1000);
		int auxiliar;
		boolean intercambio = false;
		
		do {
			intercambio = false;
		for (int i = 0; i < array.length-1; i ++) {
			if (array[i]>array[i+1]) {
				auxiliar = array[i+1];
				array[i+1] = array [i];
				array[i] = auxiliar;
				intercambio = true;
								
			} 
		}
		} while (intercambio);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
