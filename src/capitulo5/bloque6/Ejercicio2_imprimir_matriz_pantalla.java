package capitulo5.bloque6;

import utils.UtilsMatrices;

/**
 * Crea un m�todo que imprima la matriz en consola. El m�todo recibir� la matriz
 * y devolver� "void"
 * 
 * @author F541U
 *
 */

public class Ejercicio2_imprimir_matriz_pantalla {

	/**
	 * M�todo principal
	 * @param args
	 */
	
	public static void main(String[] args) {


		int matriz [] [] = new int [5] [5]; //Creamos matriz
		UtilsMatrices.rellenarMatrizAzar(matriz); //Usamos m�todo para rellenar matriz con n�meros al azar
		mostrarMatrizPantalla(matriz); //Mostramos matriz en pantalla

	}

	/**
	 * M�todo que imprima la matriz en pantalla.
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
