package capitulo5.optativo01;

import utils.Utils;


/**
 * Realiza un programa que dibuje en la pantalla una onda aleatoria de
 * asteriscos. Para resolver este problema utilizar�s matrices de tipo char. En
 * un tipo char guardas un car�cter. Por ejemplo, la l�nea "char variable =
 * 'p';" crea una variable de tipo char y le asigna la letra 'p' min�scula. Crea
 * una matriz de 10 filas y 30 posiciones por fila, de tipo char, a continuaci�n
 * genera en cada fila un n�mero aleatorio de asteriscos, cuando acabes en cada
 * fila de introducir asteriscos, rellena el resto de la fila con espacios en
 * blanco. Finalmente muestra la matriz en consola. Ejemplo:
 *
 *********
 ****************
 *******
 **********************
 ****
 **************************
 **
 ****
 *******
 ** .
 * 
 * @author F541U
 *
 */

public class Ejercicio2_onda_de_asteriscos {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		char matriz[][] = new char[10][30]; // creamos matriz

		char letra = 'p'; // creamos variable para rellenar matriz
		int posicionesRellenar; // variable para llevar cuenta de posiciones a rellenar

		for (int i = 0; i < matriz.length; i++) {
			posicionesRellenar = Utils.obtenerNumeroAzar(0, 30); // Genero n�mero al azar para ver cu�ntas posiciones
																	// contendr�n *
			for (int j = 0; j < matriz[i].length; j++) {

				if (j <= posicionesRellenar) { // si la columna es inferior a posici�n rellenamos con *
					matriz[i][j] = letra;
				} else {
					matriz[i][j] = ' '; // De lo contrario, ponemos un espacio en blanco
				}
				System.out.print(matriz[i][j] + "\t"); // Mostramos en pantalla
			}
			System.out.println();
		}

	}

}
