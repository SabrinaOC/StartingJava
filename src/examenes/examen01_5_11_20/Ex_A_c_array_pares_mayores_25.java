package examenes.examen01_5_11_20;

import utils.UtilsArrays;

/**
 * Examen A, ejercicio c Crea una clase con un método “main” que cree un array
 * de 20. Debes rellenar el array con números generados al azar, pares, mayores
 * de 25 y menores de 100.
 * 
 * @author F541U
 *
 */

public class Ex_A_c_array_pares_mayores_25 {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creo e inicio array de números aleatorios
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(20, 25, 100);

		// Recorro array para comprobar si los valores son pares o no
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) { // Uso un módulo para averiguar si es un número par y, si no lo es, le sumo uno
				array[i] = array[i] + 1;
			}
			System.out.print(array[i] + " "); // Muestro el array en pantalla
		}

	}

}
