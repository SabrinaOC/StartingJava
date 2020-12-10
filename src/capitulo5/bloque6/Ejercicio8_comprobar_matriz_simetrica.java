package capitulo5.bloque6;

import utils.UtilsMatrices;

/**
 * Crea un m�todo que compruebe si la matriz es sim�trica. (Los elementos de la
 * matriz (i, j) y (j, i), si existen, son iguales). El m�todo recibir� una
 * matriz y devolver� un boolean.
 * 
 * @author F541U
 *
 */

public class Ejercicio8_comprobar_matriz_simetrica {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Creamos matriz y damos valores
	int matriz [][] = new int [][] { { 0, 1, 2 }, 
									 { 5, 1, 3 }, 
									 { 2, 3, 1 }};

		UtilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla a modo de comprobaci�n
	    System.out.println();

	    boolean esSimetrica = comprobarMatrizSimetrica(matriz);
	    if (esSimetrica) { // Definimos distintos mensajes dependiendo si esDiagonal es true o false
					     // despu�s de recorrer la matriz
	    	System.out.print("La matriz es sim�trica");
		} else {
			System.out.print("La matriz no es sim�trica");
		}

	}
	
	/**
	 * M�todo comprueba matriz sim�trica
	 * @param matriz
	 * @return
	 */
	
	public static boolean comprobarMatrizSimetrica (int matriz [][]) {
		boolean esSimetrica = true; //Creamos boolean que devolveremos al main
		
		for (int i = 0; i < matriz.length; i ++) { //Recorremos matris
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) { //Como la diagonal principal no se ha de tener en cuenta, comprobamos el resto de posiciones
					if (matriz[i][j] != matriz[j][i]) { //Como la relaci�n es espejo, si no se cumple esa condici�n
						esSimetrica = false;			//esSimetrica es falso
					}
				}
			}
		}
		
		return esSimetrica; //Devolvemos boolean al main
		
	}

}
