package capitulo5.bloque6;

import utils.Utils;
import utils.UtilsMatrices;

/**
 * Crea un m�todo que rellena la matriz con valores creados al azar. El m�todo
 * recibir� la matriz y devolver� "void".
 * 
 * @author F541U
 *
 */

public class Ejercicio1_rellenar_matriz_num_azar {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int matriz[][] = new int[5][5]; // Creamos matriz

		rellenarMatrizAzar(matriz); // Llamamos al m�todo para rellenar matriz
		
		UtilsMatrices.mostrarMatrizPantalla(matriz); //Utilizamos m�todo creado para mostrar matriz en pantalla
		

	}

	/**
	 * M�todo que rellena la matriz con valores creados al azar.
	 * 
	 * @param matriz
	 */

	public static void rellenarMatrizAzar(int matriz[][]) { //Creamos m�todo vac�o que recibe una matriz

		for (int i = 0; i < matriz.length; i++) { //Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { //Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(); //Damos valores aleatorios
			}
		}
	}
}
