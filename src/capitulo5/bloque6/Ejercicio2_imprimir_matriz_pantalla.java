package capitulo5.bloque6;

import Utils.utilsMatrices;

/**
	 * Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x 5 columnas
	 * @author F541U
	 *
	 */

public class Ejercicio2_imprimir_matriz_pantalla {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {


		int matriz [] [] = new int [5] [5]; //Creamos matriz
		utilsMatrices.rellenarMatrizAzar(matriz); //Usamos método para rellenar matriz con números al azar
		mostrarMatrizPantalla(matriz); //Mostramos matriz en pantalla

	}

	/**
	 * Método que imprima la matriz en pantalla.
	 * @param matriz
	 */
	
	public static void mostrarMatrizPantalla (int matriz [] []) {
		
		for (int i = 0; i < matriz.length; i++) { //Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { //Recorremos columnas
				System.out.print(matriz[i][j] + "\t");; //Mostramos en pantalla
			}
			System.out.println();
		}
	}
}
