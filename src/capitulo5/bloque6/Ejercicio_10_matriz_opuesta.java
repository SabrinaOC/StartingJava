package capitulo5.bloque6;

import utils.UtilsMatrices;

/**
	 * Crea un m�todo que realice la matriz opuesta de la que recibe.
	 * @author F541U
	 *
	 */

public class Ejercicio_10_matriz_opuesta {

	/**
	 * M�todo principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Creamos matriz y damos valores
		int matriz [][] = new int [][] { { 0, 1, -2, 10 }, 
										 { 1, -1, 3, 12 }, 
										 { 2, 3, 1, -14 }};

		UtilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla a modo de comprobaci�n
		System.out.println();
		
		int opuesta [][] = matrizOpuesta(matriz);
		UtilsMatrices.mostrarMatrizPantalla(opuesta);
		
		

	}
	
	public static int [][] matrizOpuesta (int matriz [][]) {
		
		int columnas = 0;
		int filas = 0;
		
		for (int i = 0; i < matriz.length; i++) { //Recorremos matriz para establecer dimensiones nueva matriz (filas/columnas)
			filas++;
			for (int j = 0; j <= matriz.length; j++) {
				 
				columnas++;
			}
		}
		columnas = columnas /filas;
		System.out.println("filas " + filas +" columnas " + columnas);
		
		
		int opuesta [][] = new int [filas] [columnas]; //Creamos nueva matriz con las dimensiones calculadas
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				opuesta[i][j] = -matriz[i][j];
			}
		}
		return opuesta;
	}
}
