package capitulo5.bloque6;

import Utils.utilsMatrices;

/**
 * Crea un método que compruebe si la matriz es dispersa. (Todos las filas y
 * todas las columnas contienen al menos un elemento nulo).
 * 
 * @author F541U
 *
 */

public class Ejercicio6_comprobar_matriz_dispersa {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		//Creamos matriz y damos valores
		int matriz [][] = new int [][] { { 1, 1, 1 }, 
										 { 1, 0, 1 }, 
										 { 2, 0, 1 }};

		utilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla a modo de comprobación
		System.out.println();

		boolean esDispersa = comprobarMatrizDispersa(matriz);
		if (esDispersa) { // Definimos distintos mensajes dependiendo si esDiagonal es true o false
			// después de recorrer la matriz
			System.out.print("La matriz es dispersa");
		} else {
			System.out.print("La matriz no es dispersa");
		}

	}

	public static boolean comprobarMatrizDispersa(int matriz[][]) {
		int contadori = 0; // Creamos contador para ver cuántos 0 encontramos
		int contadorj = 0; // Creamos contador para ver cuántos 0 encontramos
		boolean esDispersa = false; // Creamos boolean que devolveremos al método principal

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (contadori <= i) { // Para registrar solo un 0 por vuelta
					if (matriz[i][j] == 0) {
						contadori++;

					}
				}
			}
		}
		
		if (contadori > matriz.length) { //Si no se ha encontrado al menos un 0 en cada fila, devolvemos esDispersa = false
			return esDispersa;
		}

		for (int j = 0; j < matriz.length; j++) { // Recorremos matriz al revés para comprobar nulos columnas
			for (int i = 0; i < matriz[j].length; i++) {
				if (contadorj <= j) { // Para registrar solo un 0 por vuelta
					if (matriz[i][j] == 0) {
						contadorj++;

					}
				}

			}

		}

		if (contadori == matriz.length && contadorj == matriz.length) { //Establecemos condición para devolver boolean
			esDispersa = true;
		}
		return esDispersa;
	}
}
