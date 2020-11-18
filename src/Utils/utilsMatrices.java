package Utils;

public class utilsMatrices {

	/**
	 * Método que rellena la matriz con valores creados al azar.
	 * 
	 * @param matriz
	 */

	public static void rellenarMatrizAzar(int matriz[][]) { // Creamos método vacío que recibe una matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(); // Damos valores aleatorios
			}
		}
	}

	/**
	 * Método que rellena la matriz con valores creados al azar entre límites
	 * 
	 * @param matriz
	 * @param min
	 * @param max
	 */

	public static void rellenarMatrizAzarLimites(int matriz[][], int min, int max) { // Creamos método vacío que recibe
																						// una matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(min, max); // Damos valores aleatorios
			}
		}
	}

	/**
	 * Método que imprima la matriz en pantalla.
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
	 * Método que comprueba si la matriz es diagonal
	 * 
	 * @param matriz
	 */

	public static boolean comprobarMatrizDiagonal(int matriz[][]) {

		boolean esDiagonal = true; // Creamos boolean a modo de bandera, partimos de que es diagonal, si en algún
									// valor no lo es, pasa a false

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) { // Las posiciones que pueden contener un valor distinto de cero, son aquellas en
								// las que i y j conciden
					if (matriz[i][j] != 0) { // por tanto, si en una posición fuera de estas encontramos un valor
												// distinto de 0,
						esDiagonal = false; // esDiagonal pasaría a falso
					}
				}
			}
		}

		return esDiagonal; // Devolvemos boolean
	}

	
	/**
	 * Método para comprobar matriz triangular superior
	 * @param matriz
	 * @return
	 */
	
	public static boolean comprobarMatrizTriangularSuperior(int matriz[][]) {

		boolean esTriangular = true; //Creamos boolean de comprobación, el mismo que devolveremos al main

		for (int i = 1; i <= matriz.length - 1; i++) { //Recorremos i desde 1 ya que la posición 0 forma parte de la trangular superior
			for (int j = 0; j < i; j++) { //Recorremos j hasta que su valor sea igual a i - 1
				if (matriz[i][j] != 0) { //Si en alguna de esas posiciones se encuentra un valor distinto de 0
					esTriangular = false; //esTriangular pasa a falso
				}
			}
		}
		return esTriangular; //Devolvemos boolean

	}


}
