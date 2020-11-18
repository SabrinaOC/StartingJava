package Utils;

public class utilsMatrices {

	/**
	 * M�todo que rellena la matriz con valores creados al azar.
	 * 
	 * @param matriz
	 */

	public static void rellenarMatrizAzar(int matriz[][]) { // Creamos m�todo vac�o que recibe una matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(); // Damos valores aleatorios
			}
		}
	}

	/**
	 * M�todo que rellena la matriz con valores creados al azar entre l�mites
	 * 
	 * @param matriz
	 * @param min
	 * @param max
	 */

	public static void rellenarMatrizAzarLimites(int matriz[][], int min, int max) { // Creamos m�todo vac�o que recibe
																						// una matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(min, max); // Damos valores aleatorios
			}
		}
	}

	/**
	 * M�todo que imprima la matriz en pantalla.
	 * 
	 * @param matriz
	 */

	public static void mostrarMatrizPantalla(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				System.out.print(matriz[i][j] + "\t");
				; // Mostramos en pantalla
			}
			System.out.println();
		}
	}
	
	
	/**
	 * M�todo que comprueba si la matriz es diagonal
	 * 
	 * @param matriz
	 */

	public static boolean comprobarMatrizDiagonal(int matriz[][]) {

		boolean esDiagonal = true; // Creamos boolean a modo de bandera, partimos de que es diagonal, si en alg�n
									// valor no lo es, pasa a false

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) { // Las posiciones que pueden contener un valor distinto de cero, son aquellas en
								// las que i y j conciden
					if (matriz[i][j] != 0) { // por tanto, si en una posici�n fuera de estas encontramos un valor
												// distinto de 0,
						esDiagonal = false; // esDiagonal pasar�a a falso
					}
				}
			}
		}

		return esDiagonal; // Devolvemos boolean
	}

	
	/**
	 * M�todo para comprobar matriz triangular superior
	 * @param matriz
	 * @return
	 */
	
	public static boolean comprobarMatrizTriangularSuperior(int matriz[][]) {

		boolean esTriangular = true; //Creamos boolean de comprobaci�n, el mismo que devolveremos al main

		for (int i = 1; i <= matriz.length - 1; i++) { //Recorremos i desde 1 ya que la posici�n 0 forma parte de la trangular superior
			for (int j = 0; j < i; j++) { //Recorremos j hasta que su valor sea igual a i - 1
				if (matriz[i][j] != 0) { //Si en alguna de esas posiciones se encuentra un valor distinto de 0
					esTriangular = false; //esTriangular pasa a falso
				}
			}
		}
		return esTriangular; //Devolvemos boolean

	}


}
