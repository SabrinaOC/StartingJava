package capitulo5.bloque6;

import utils.UtilsArrays;
import utils.UtilsMatrices;

/**
 * Ejercicio 7. Crea un m�todo que construya un array unidimensional con todos
 * los elementos de la matriz. El m�todo recibir� una matriz y devolver� un
 * array.
 * 
 * @author F541U
 *
 */

public class Ejercicio7_matriz_a_array {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Creamos matriz y damos valores
		int matriz[][] = new int[][] { { 72, 8, 1 }, 
									   { 90, 3, 0 }, 
									   { 17, 2, 14 }};

		UtilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla a modo de comprobaci�n
		System.out.println();

		int arrayDeMatriz[] = matrizAArray(matriz); // Usamos m�todo para convertir matriz en array unidimensional

		UtilsArrays.mostrarArray(arrayDeMatriz); // Mostramos en pantalla

	}

	/**
	 * Matriz a array unidimensional
	 * 
	 * @param matriz
	 * @return
	 */

	public static int[] matrizAArray(int matriz[][]) {
		int cont = 0; // Creo contador para ver cu�ntas posiciones tiene la matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para saber posiciones totales
			for (int j = 0; j < matriz[i].length; j++) {
				cont++; // Aumentamos contador en cada posici�n
			}
		}

		int array[] = new int[cont]; // Creamos array con longitud de posiciones totales de matriz
		int k = 0; // Creamos �ndice para array
		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para dar valores a array
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz[i][j];
				k++; // Aumentamos �ndice array en cada vuelta

			}

		}

		return array; // Devolvemos array
	}

}
