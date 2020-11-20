package capitulo5.bloque6;

import Utils.utilsMatrices;

/**
 * Crea un método que compruebe si la matriz es positiva. (Todos sus elementos
 * mayores o iguales a cero). El método recibirá una matriz y devolver un valor
 * "boolean", indicando si la matriz es o no es positiva.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_comprobar_matriz_positiva {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int matriz[][] = new int[5][5]; // Creamos matriz
		utilsMatrices.rellenarMatrizAzarLimites(matriz, -100, 100); // Usamos método para rellenar matriz con números al
																	// azar entre límites
		utilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla para demostrar que el método
														// mostrarMatrizPantalla funciona
		boolean esPositivo = comprobarMatrizPositiva(matriz);// Llamamos a método

		if (esPositivo) { // Definimos distintos mensajes dependiendo si esPositivo es true o false
			// después de recorrer la matriz
			System.out.print("Todos los valores de la matriz son positivos");
		} else {
			System.out.print("Se han encontrado valores negativos en la matriz");
		}
	}

	/**
	 * Método que compruebe si la matriz es positiva
	 * 
	 * @param matriz
	 */

	public static boolean comprobarMatrizPositiva(int matriz[][]) { // Creamos método vacío que recibe matriz

		boolean esPositivo = true; // Creamos boolean paracomprobar si algún valor es negativo

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) { // Si algún valor es menor que 0 esPositivo pasa a ser negativo
					esPositivo = false;
				}
			}
		}

		return esPositivo; // Devolvemos boolean

	}

}