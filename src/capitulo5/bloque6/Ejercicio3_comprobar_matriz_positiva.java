package capitulo5.bloque6;

import utils.UtilsMatrices;

/**
 * Crea un m�todo que compruebe si la matriz es positiva. (Todos sus elementos
 * mayores o iguales a cero). El m�todo recibir� una matriz y devolver un valor
 * "boolean", indicando si la matriz es o no es positiva.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_comprobar_matriz_positiva {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int matriz[][] = new int[5][5]; // Creamos matriz
		UtilsMatrices.rellenarMatrizAzarLimites(matriz, -100, 100); // Usamos m�todo para rellenar matriz con n�meros al
																	// azar entre l�mites
		UtilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla para demostrar que el m�todo
														// mostrarMatrizPantalla funciona
		boolean esPositivo = comprobarMatrizPositiva(matriz);// Llamamos a m�todo

		if (esPositivo) { // Definimos distintos mensajes dependiendo si esPositivo es true o false
			// despu�s de recorrer la matriz
			System.out.print("Todos los valores de la matriz son positivos");
		} else {
			System.out.print("Se han encontrado valores negativos en la matriz");
		}
	}

	/**
	 * M�todo que compruebe si la matriz es positiva
	 * 
	 * @param matriz
	 */

	public static boolean comprobarMatrizPositiva(int matriz[][]) { // Creamos m�todo vac�o que recibe matriz

		boolean esPositivo = true; // Creamos boolean paracomprobar si alg�n valor es negativo

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) { // Si alg�n valor es menor que 0 esPositivo pasa a ser negativo
					esPositivo = false;
				}
			}
		}

		return esPositivo; // Devolvemos boolean

	}

}