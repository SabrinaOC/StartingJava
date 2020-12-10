package capitulo5.bloque6;

import utils.UtilsMatrices;

/**
 * Crea un m�todo que realice la matriz traspuesta de la que recibe. El m�todo
 * recibe una matriz y devuelve otra matriz, la traspuesta
 * 
 * @author F541U
 *
 */

public class Ejercicio9_comprobar_matriz_traspuesta {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Creamos matriz y damos valores
		int matriz [][] = new int [][] { { 0, 1, 2, 10 }, 
										 { 1, 1, 3, 12 }, 
										 { 2, 3, 1, 14 }};

		UtilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla a modo de comprobaci�n
		System.out.println();
		
		int traspuesta [][] = matrizTraspuesta(matriz); //Creamos matriz para m�todo
		UtilsMatrices.mostrarMatrizPantalla(traspuesta); //Mostramos matriz en pantalla

	}
	
	/**
	 * M�todo para crear matriz traspuesta
	 * @param matriz
	 * @return
	 */

	public static int[][] matrizTraspuesta(int matriz[][]) {
		int filas = 0;
		int columnas = 0;

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para establecer dimensiones nueva matriz
													// (filas/columnas)
			columnas++;
			for (int j = 0; j <= matriz.length; j++) {

				filas++;
			}
		}
		filas = filas / columnas;

		int traspuesta[][] = new int[filas][columnas]; // Creamos nueva matriz con las dimensiones calculadas

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para asignar valores a traspuesta
			for (int j = 0; j < matriz[i].length; j++) {
				traspuesta[j][i] = matriz[i][j]; // Asignaci�n opuesta, cambiamos filas por columnas

			}
		}

		return traspuesta;
	}

}
