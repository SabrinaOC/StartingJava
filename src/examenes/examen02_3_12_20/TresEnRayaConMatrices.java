package examenes.examen02_3_12_20;

import utils.Utils;
import utils.UtilsMatrices;

public class TresEnRayaConMatrices {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {

		//Creamos matriz para el juego y rellenamos con 0
		int tres [][] = new int [][] {{0, 0, 0},
									  {0, 0, 0},
									  {0, 0, 0}};
		int opcion;
		int jugador1 = 1;
		int jugador2 = 2;
									  
		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 0:
				System.out.print("¡Hasta la próxima!");
				break;
			case 1:
				utils.UtilsMatrices.mostrarMatrizPantalla(tres);
				pedirUbicacionJugador(tres, jugador1);
				//comprobarGanador(tres);
				//comprobarDiagonalSuperior(tres);
				break;
			case 2:
				utils.UtilsMatrices.mostrarMatrizPantalla(tres);
				pedirUbicacionJugador(tres, jugador2);
				//comprobarGanador(tres);
				break;
			}
		} while (opcion != 0);
	}

	
	
	/**
	 * Método para mostrar menú en pantalla
	 * 
	 * @return
	 */

	public static int mostrarMenu() {

		String strMenu = "\n\nMenú" 
				+ "\n0.- Abandonar el programa" 
				+ "\n1.- Jugador 1 intorduca su jugada"
				+ "\n2.- Jugador 2 introduce su jugada";
		// Muestro el menú
	
		System.out.println(strMenu +"\n");
		// Pido una opción al usuario
		
		System.out.println("Elige una opción");
		int opcionUsuario = Utils.obtenerEnteroPorScanner();
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	
	}

	/**
	 * Método para colocar ficha en sitio libre
	 * 
	 * @param tres
	 * @param jugador
	 */

	public static void pedirUbicacionJugador(int tres[][], int jugador) {
		boolean ocupado = false;// boolean para escape de bucle
		do {// bucle hasta encontrar posicion del tablero vacía
			ocupado = false;
			System.out.println("¿En qué fila colocamos ficha?" // Pedimos fila al jugador
					+ "\nFila superior = 0" + "\nFila medio = 1" + "\nFila inferior = 2");
			int fila = Utils.obtenerEnteroPorScanner();

			System.out.println("¿En qué columna colocamos ficha?" // Pedimos columna al jugador
					+ "\nColumna izquierda = 0" + "\nColumna central = 1" + "\nColumna derecha = 2");
			int columna = Utils.obtenerEnteroPorScanner();

			for (int i = 0; i < tres.length; i++) { // Recorremos matriz hasta llegar a posición indicada por el usuario
				for (int j = 0; j < tres[i].length; j++) {
					if (i == fila && j == columna) {
						if (tres[i][j] == 0) { // Si en esa posición hay un 0, colocamos número jugador
							if (jugador == 1) {
								tres[i][j] = 1;
							}
							if (jugador == 2) {
								tres[i][j] = 2;
							}
						} else { // Si ese sitio está ocupado, ocupado pasa a ser true y volvemos a pedir valores
							ocupado = true;
							System.out.println("Ya hay ficha en esa ubicación, por favor, indique otra");
							System.out.println("");
							UtilsMatrices.mostrarMatrizPantalla(tres);
							break;
						}
					}
				}
			}

		} while (ocupado);

	}

	public static void comprobarGanador(int tres [][]) {
		//comprobarFilas(tres);
		comprobarColumnas(tres);
		comprobarDiagonalSuperior(tres);
		
	}

	/**
	 * Método para verificar filas
	 * 
	 * @param tres
	 */

	public static void comprobarFilas(int tres[][]) {

		for (int i = 0; i < tres.length; i++) { //Recorremos la matriz para ver si los valores de las
			for (int j = 0; j < tres[i].length; j++) {//filas son iguales
				if (tres[i + 1][j] == tres[i][j] && tres[i][j] == tres[tres.length-1][j]) {
					if (tres[i][j] == 1) { //Si se encuentra un 1 en todos los valores, ese jugador ha ganado
					System.out.println("el jugador 1 ha ganado la partida");
					}
					if (tres[i][j] == 2) {
						System.out.println("el jugador 1 ha ganado la partida");
						}
				}
			}
		}
	}

	/**
	 * Método para verificar columnas
	 * 
	 * @param tres
	 */

	public static void comprobarColumnas(int tres[][]) {
		for (int i = 0; i < tres.length; i++) {//Recorremos matriz para ver si los valores de las posiciones
			for (int j = 0; j < tres[i].length; j++) {//de las columnas son iguales
				if (tres[j + 1][i] == tres[j][i] && tres[j][i] == tres[j + 2][i]) {
					if (tres[j][i] == 1) {
					System.out.println("el jugador 1 ha ganado la partida");
					}
					if (tres[j][i] == 2) {//Si se encuentra un 2 en esos valores, el jugador 2 ha ganado
						System.out.println("el jugador 2 ha ganado la partida");
						}
				}
			}
		}
	}

	public static void comprobarDiagonalSuperior(int tres[][]) {

		for (int i = 0; i < tres.length; i++) { // Recorremos matriz
			for (int j = 0; j < tres[i].length; j++) {
				if (i != j) { // Las posiciones que pueden contener un valor distinto de cero, son aquellas en
								// las que i y j conciden
					if (tres[i][j] == 1) { // por tanto, si en una posici�n fuera de estas encontramos un valor
											// distinto de 0,
						System.out.println("el jugador 1 ha ganado la partida"); // esDiagonal pasar�a a falso
					}
					if (tres[i][j] == 2) { // por tanto, si en una posici�n fuera de estas encontramos un valor
						// distinto de 0,
						System.out.println("el jugador 2 ha ganado la partida");
					}
				}
			}
		}

	}

}
