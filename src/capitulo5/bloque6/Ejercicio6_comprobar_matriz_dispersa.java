package capitulo5.bloque6;

import Utils.utilsMatrices;

/**
	 * Realiza un programa que cree un array bidimensional, una matriz, de 5 filas x
	 * 5 columnas.
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
		int matriz [][] = new int [][] { { 0, 0, 0 }, 
										 { 1, 1, 1 }, 
										 { 1, 1, 1 }};

		utilsMatrices.mostrarMatrizPantalla(matriz); //Mostramos matriz en pantalla a modo de comprobación
		System.out.println();
		
		boolean esDispersa = comprobarMatrizDispersa(matriz);
		if (esDispersa) { // Definimos distintos mensajes dependiendo si esDiagonal es true o false
			// después de recorrer la matriz
			System.out.print("La matriz es dispersa");
		} else {
			System.out.print("La matriz no es dispersa");
		}

	}

	
	public static boolean comprobarMatrizDispersa (int matriz [][]) {
		int contador = 0; //Creamos contador para ver cuántos 0 encontramos
		
		boolean esDispersa = false; //Creamos boolean que devolveremos al método principal
		for (int i = 0; i < matriz.length; i++) { //Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (contador <= i) {
				if (matriz [i][j] == 0) {
					contador ++;
					
				}
				}
			}
		}
		if (contador == matriz.length) {
			esDispersa = true;
		}
		return esDispersa;
	}
}
