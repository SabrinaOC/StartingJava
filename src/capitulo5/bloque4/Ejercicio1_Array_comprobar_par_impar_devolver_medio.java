package capitulo5.bloque4;

import utils.Utils;

/**
 * Capítulo 5, bloque 4, ejercicio 1 Crea un método que reciba un array de
 * números enteros creados al azar entre 0 y 100. El método debe examinar la
 * longitud del array, comprobar que la longitud es un valor impar y devolver el
 * valor que se encuentre en la posición media. En caso de que la longitud del
 * array sea un número par se debe devolver un valor -1.
 * 
 * @author F541U
 *
 */

public class Ejercicio1_Array_comprobar_par_impar_devolver_medio {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array[] = new int[Utils.obtenerNumeroAzar()]; // Creamos array con longitud aleatoria
		for (int i = 0; i < array.length; i++) { // Recorremos el array para asignar valores aleatorios entre 0 y 100
			array[i] = Utils.obtenerNumeroAzar(0, 100);
			System.out.print(array[i] + " "); // Mostramos el array en pantalla para poder comprobar que el método
												// funciona
		}
		int num = posicionMediaArray(array); // Guardamos valor del método en una variable
		System.out.println("\n" + num); // Imprimimos variable
	}

	public static int posicionMediaArray(int array[]) {
		int medio = 0; // Creamos variables para el valor medio y para el -1
		int nada = -1;
		if (array.length % 2 == 0) { // Si el resto de la longitud entre 2 es 0, entonces devolvemos -1
			return nada;
		} else {
			for (int i = (array.length / 2); i <= (array.length / 2); i++) { // Si no, recorremos el array para guardar
																				// el valor medio
				medio = array[i];

			}
			return medio; // Devolvemos valor medio
		}
	}
}
