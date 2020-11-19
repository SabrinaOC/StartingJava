package capitulo5.bloque6;

import Utils.utilsMatrices;

/**
 * Crea un método que compruebe si la matriz es simétrica. (Los elementos de la
 * matriz (i, j) y (j, i), si existen, son iguales). El método recibirá una
 * matriz y devolverá un boolean.
 * 
 * @author F541U
 *
 */

public class Ejercicio8_comprobar_matriz_simetrica {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Creamos matriz y damos valores
	int matriz [][] = new int [][] { { 0, 1, 2 }, 
									 { 1, 1, 3 }, 
									 { 2, 3, 1 }};

		utilsMatrices.mostrarMatrizPantalla(matriz); // Mostramos matriz en pantalla a modo de comprobación
	    System.out.println();

	    boolean esSimetrica = comprobarMatrizSimetrica(matriz);
	    if (esSimetrica) { // Definimos distintos mensajes dependiendo si esDiagonal es true o false
					     // después de recorrer la matriz
	    	System.out.print("La matriz es simétrica");
		} else {
			System.out.print("La matriz no es simétrica");
		}

	}
	
	/**
	 * Método comprueba matriz simétrica
	 * @param matriz
	 * @return
	 */
	
	public static boolean comprobarMatrizSimetrica (int matriz [][]) {
		boolean esSimetrica = true; //Creamos boolean que devolveremos al main
		
		for (int i = 0; i < matriz.length; i ++) { //Recorremos matris
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) { //Como la diagonal principal no se ha de tener en cuenta, comprobamos el resto de posiciones
					if (matriz[i][j] != matriz[j][i]) { //Como la relación es espejo, si no se cumple esa condición
						esSimetrica = false;			//esSimetrica es falso
					}
				}
			}
		}
		
		return esSimetrica; //Devolvemos boolean al main
		
	}

}
