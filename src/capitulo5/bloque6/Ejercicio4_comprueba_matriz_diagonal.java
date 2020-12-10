package capitulo5.bloque6;

import utils.UtilsMatrices;

/**
 * Crea un m�todo que compruebe si la matriz es diagonal (Todos los elementos
 * que no est�n en la diagonal principal son nulos).
 * 
 * @author F541U
 *
 */

public class Ejercicio4_comprueba_matriz_diagonal {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int matriz[][] = new int[][] { { 1, 0, 0, 0, 0 }, 
									   { 0, 1, 0, 0, 0 }, 
									   { 0, 0, 1, 0, 0 }, 
									   { 0, 0, 0, 1, 0 },
									   { 0, 0, 0, 0, 1 } }; // Creamos matriz y le damos valores

		UtilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos en pantalla a modo de comprobaci�n
		boolean esDiagonal = comprobarMatrizDiagonal(matriz); // Usamos m�todo comprobarMatrizDiagonal y lo recogemos en
																// un boolean

		if (esDiagonal) { // Definimos distintos mensajes dependiendo si esDiagonal es true o false
			// despu�s de recorrer la matriz
			System.out.print("La matriz es diagonal");
		} else {
			System.out.print("La matriz no es diagonal");
		}

	}

	/**
	 * M�todo que comprueba si la matriz es diagonal
	 * 
	 * @param matriz
	 */

	public static boolean comprobarMatrizDiagonal(int matriz[][]) {

		boolean esDiagonal = true; // Creamos boolean a modo de bandera, partimos de que es diagonal, si en alg�n
									// valor no lo es, pasa a false

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) { // Las posiciones que pueden contener un valor distinto de cero, son aquellas en
								// las que i y j conciden
					if (matriz[i][j] != 0) { // por tanto, si en una posici�n fuera de estas encontramos un valor
												// distinto de 0,
						esDiagonal = false; // esDiagonal pasar�a a falso
					}
				}
			}
		}

		return esDiagonal; // Devolvemos boolean
	}

}
