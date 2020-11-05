package examenes;

import Utils.UtilsArrays;

/**
 * Examen A, ejercicio d Crea una clase con un método “main” que cree un array
 * de 20 posiciones con números enteros generados al azar entre 0 y 100. Muestra
 * el array. Para cada número del array debes mostrar en pantalla sus divisores.
 * 
 * @author F541U
 *
 */

public class Ex_A_d_array_divisores {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creo e inicio array
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(20, 0, 100);

		// Recorro el array para ir pasando por cada valor y ver sus divisores
		for (int i = 0; i < array.length; i++) {
			for (int j = array[i]-1; j > 0; j--) {// al entrar en cada valor lo divido entre él mismo y los menores y si
												// dan resto 0 los muestro en pantalla
				if (array[i] % j == 0) {
					System.out.println(j + " es divisor de " + array[i]);
				}
			}
		}
	}

}
