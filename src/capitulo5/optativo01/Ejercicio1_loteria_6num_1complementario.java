package capitulo5.optativo01;

import utils.Utils;
import utils.UtilsArrays;

/**
 * Realiza un programa que genere una apuesta aleatoria de la lotería primitiva.
 * Consiste en generar seis números y otro complementario entre 1 y 49 que no se
 * repitan. Ejemplo: Combinación: 2 14 20 37 39 41 complementario: 13. Utiliza
 * un array, en el ejemplo expuesto sería un array de 7 posiciones
 * correspondiendo la séptima posición al "complementario" de la loteria.
 * 
 * @author F541U
 *
 */

public class Ejercicio1_loteria_6num_1complementario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int primitiva[] = new int[7]; // Creamos array para números
		boolean coincide = true;

		primitiva[0] = Utils.obtenerNumeroAzar(0, 100); // El primer valor es imposible que esté repetido, así que lo
														// asignamos antes
		for (int i = 1; i < primitiva.length; i++) { // de entrar en el bucle

			do {
				primitiva[i] = Utils.obtenerNumeroAzar(0, 100); // Damos valor al azar
				if (i != 0) {
					for (int j = i - 1; j >= 0; j--) {// creamos j descendiente para ir comparando valores
						if (primitiva[j] == primitiva[i]) { // si se encuentra el mismo valor en una posición anterior,
							primitiva[i] = Utils.obtenerNumeroAzar(0, 100);// se genera otro número al azar
							j = i - 1; // y j retoma su valor inicial para comparar con todos de nuevo
						} else {
							coincide = false;
						}
					}
				}
			} while (coincide); // realizamos estas comparaciones mientras sea true
		}

		UtilsArrays.mostrarArray(primitiva); // mostramos en pantalla

	}

}
