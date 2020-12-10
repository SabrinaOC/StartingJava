package capitulo5.bloque6;

import utils.UtilsMatrices;

/**
 * Crea un m�todo que compruebe si la matriz es triangular superior. (Todos los
 * elementos que est�n por debajo de la diagonal principal son nulos).
 * 
 * @author F541U
 *
 */

public class Ejercicio5_comprobar_matriz_triangular_superior {

	/**
	 * M�todo principal
	 * @param args
	 */
	
	public static void main(String[] args) {

		//Creamos matriz y damos valores
		int matriz [][] = new int [][] { { 1, 0, 0, 0, 74 }, 
			   							 { 0, 1, 0, 5, 0 }, 
			   							 { 0, 0, 1, 0, 0 }, 
			   							 { 0, 0, 0, 1, 0 },
			   							 { 7, 0, 0, 0, 1 }};
		
		UtilsMatrices.mostrarMatrizPantalla(matriz); //Mostramos matriz en pantalla a modo de comprobaci�n
		System.out.println();							
		
		boolean esTriangular = comprobarMatrizTriangularSuperior(matriz);

		if (esTriangular) { // Definimos distintos mensajes dependiendo si esDiagonal es true o false
			// despu�s de recorrer la matriz
			System.out.print("La matriz es triangular superior");
		} else {
			System.out.print("La matriz no es triangular superior");
		}

	}

	/**
	 * M�todo para comprobar matriz triangular superior
	 * @param matriz
	 * @return
	 */
	
	public static boolean comprobarMatrizTriangularSuperior(int matriz[][]) {

		

		for (int i = 1; i <= matriz.length - 1; i++) { //Recorremos i desde 1 ya que la posici�n 0 forma parte de la trangular superior
			for (int j = 0; j < i; j++) { //Recorremos j hasta que su valor sea igual a i - 1
				if (matriz[i][j] != 0) { //Si en alguna de esas posiciones se encuentra un valor distinto de 0
					return false; //esTriangular pasa a falso
				}
			}
		}
		return true; //Devolvemos boolean

	}

}
