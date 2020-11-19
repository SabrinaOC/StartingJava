package capitulo5.bloque6;

import javax.swing.JOptionPane;

import Utils.utilsMatrices;

/**
 * Crea un método que pida al usuario un número de fila sobre una matriz. Debes
 * crear una matriz igual a la original pero eliminando el número de fila que el
 * usuario ha especificado. El método recibirá una matriz y un valor entero, que
 * representa una fila de la matriz, y devuelve una nueva matriz.
 * 
 * @author F541U
 *
 */

public class Ejercicio11_eliminar_fila_matriz_elegida_usuario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		// Creamos matriz y damos valores
		int matriz [][] = new int [][] { { 0, 1, -2, 10 }, 
										 { 1, -1, 3, 12 }, 
										 { 2, 3, 1, -14 }};

		utilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla a modo de comprobación
		System.out.println();

		int matrizMod[][] = eliminarFilaMatrizEligeUsiario(matriz);
		utilsMatrices.mostrarMatrizPantalla(matrizMod);

	}

	public static int[][] eliminarFilaMatrizEligeUsiario(int matriz[][]) {

		// Creamos contador para filas y columnas de la matriz
		int columnas = 0;
		int filas = 0;

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para establecer dimensiones nueva matriz
													// (filas/columnas)
			filas++;
			for (int j = 0; j <= matriz.length; j++) {

				columnas++;
			}
		}
		columnas = columnas / filas;

		String str = JOptionPane.showInputDialog("Introduzca un número entre 0 y " + (filas - 1)); // Pedimos número a
																									// usuario
		int num = Integer.parseInt(str);

		int matrizMod[][] = new int[filas - 1][columnas]; // Creamos nueva matriz con las dimensiones calculadas
		int k = 0; // Creamos variable para índice filas matriz modificada
		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para darle valores a la matriz modificada
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != num) { // Si el valor de i, es decir, la fila, coincide con el número del usuario, la
								// saltamos
					matrizMod[k][j] = matriz[i][j];

				}

			}
			if (i != num) { // Si i es distinto de num el contador j aumenta 1
				k++;
			}
		}

		return matrizMod;
	}

}
