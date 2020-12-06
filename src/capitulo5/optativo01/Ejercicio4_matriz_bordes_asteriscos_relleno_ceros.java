package capitulo5.optativo01;

import utils.Utils;

/**
 * Realizar un programa que cree una matriz de tipo char, con 20 filas y 10
 * columnas. Los elementos que constituyen el borde de la matriz se deben
 * rellenar, mediant bucles, con un asterisco. En el interior de la matriz, no
 * en los bordes, debes crear un caracter '0' en una posición aleatoria. El
 * resto de la matriz debe tener espacios en blanco. Muestra la matriz por
 * consola. Ejemplo:
 * 
 ********************
*                   *
*                   *
*                   *
*                   *
*                   *
*           0       *
*                   *
*                   *
********************
 * @author F541U
 *
 */

public class Ejercicio4_matriz_bordes_asteriscos_relleno_ceros {

	public static void main(String[] args) {

		char matriz[][] = new char[10][5]; // creamos matriz
		char asterisco = '*';
		// int posicion[][] = new int [matriz.length-2][matriz.length-2]; //creamos
		// variable para posición, ha de ser una matriz porque para indicar la posición
		// necesitamos
		int fila; // i y j. La dimensión es la de la matriz principal menos dos (borde sup e
					// inferior/ derecha e izq)
		int columna;

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para rellenar con asteriscos o 0
			for (int j = 0; j < matriz[i].length; j++) {

				if (i == 0 || j == 0 || i == matriz.length - 1 || j == matriz[i].length - 1) { // Si la posición es
																								// alguna de
					// los bordes, introducimos
					// asterisco
					matriz[i][j] = asterisco;

				} else {
					fila = Utils.obtenerNumeroAzar(1, matriz.length - 2); // Creamos número al azar entre las posiciones
																			// de la matriz que no son borde
					columna = Utils.obtenerNumeroAzar(1, matriz[0].length - 2);
					matriz[fila][columna] = '0';

				}
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
