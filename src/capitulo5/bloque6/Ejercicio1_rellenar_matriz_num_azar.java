package capitulo5.bloque6;

import utils.Utils;
import utils.utilsMatrices;

/**
 * Crea un método que rellena la matriz con valores creados al azar. El método
 * recibirá la matriz y devolverá "void".
 * 
 * @author F541U
 *
 */

public class Ejercicio1_rellenar_matriz_num_azar {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int matriz[][] = new int[5][5]; // Creamos matriz

		rellenarMatrizAzar(matriz); // Llamamos al método para rellenar matriz
		
		utilsMatrices.mostrarMatrizPantalla(matriz); //Utilizamos método creado para mostrar matriz en pantalla
		

	}

	/**
	 * Método que rellena la matriz con valores creados al azar.
	 * 
	 * @param matriz
	 */

	public static void rellenarMatrizAzar(int matriz[][]) { //Creamos método vacío que recibe una matriz

		for (int i = 0; i < matriz.length; i++) { //Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { //Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(); //Damos valores aleatorios
			}
		}
	}
}
