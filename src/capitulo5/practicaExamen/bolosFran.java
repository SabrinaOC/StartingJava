package capitulo5.practicaExamen;

import javax.swing.JOptionPane;

import utils.Utils;

public class bolosFran {

	public static void main(String[] args) {

		// Declaro el primer array
		int array[] = new int[10];

		// Declaro el segundo array
		int array2[] = new int[10];

		// LLamo al método e inicializo el primer array
		for (int i = 0; i < array.length; i++) {
			array = inicializacionDeBolos(array);
		}

		// Llamo al método e inicializo el segundo array
		for (int i = 0; i < array2.length; i++) {
			array2 = inicializacionDeBolos(array2);
		}

		// Esta variable, será usada para tirar una bola, si se introduce un 1, o para
		// salir, si se introduce un 0
		int escape;

		// Muestra por primera vez los bolos del j1 en pantalla
		System.out.println("La disposición de los bolos del J1 es:");
		System.out.println();
		muestraLosBolosEnPantalla(array);
		System.out.println();
		System.out.println();

		// Muestra por primera vez los bolos del j2 en pantalla
		System.out.println("La disposición de los bolos del J2 es:");
		System.out.println();
		muestraLosBolosEnPantalla(array2);
		System.out.println();
		System.out.println();

		// Declaro la variable que guardará los puntos de la partida, y la inicio en 0
		int puntosj1 = 0;
		int puntosj2 = 0;

		// Declaro la variable de la ronda en la que se encuentra la partida
		int ronda = 0;

		// Coloca un 0 en la posición de i, si el número al azar que sale es mayor o
		// igual de 50
		do {
			// Sumo 1, en la variable ronda, a cada vuelta del bucle

			ronda++;

			// Pido la probabilidad de que se derriben los bolos al usuario
			int probabilidad = 70;

			// Código del J1
			escape = Integer.parseInt(
					JOptionPane.showInputDialog("J1" + "\nIntroduce -0- para salir" + "\nIntroduce -1- para tirar bola"));
			if (escape == 1) {

				int num;
				for (int i = 0; i < array.length; i++) {
					num = Utils.obtenerNumeroAzar(0, 100);
					if (num <= probabilidadEntre30Y70(ronda, probabilidad)) {
						array[i] = 0;
					}

				}
				// Código del J2
				escape = Integer.parseInt(
						JOptionPane.showInputDialog("J2" + "\nIntroduce -0- para salir" + "\nIntroduce -1- para tirar bola"));
				if (escape == 1) {

					// Array, lo que sería el jugador 1

					for (int i = 0; i < array2.length; i++) {
						num = Utils.obtenerNumeroAzar(0, 100);
						if (num <= probabilidadEntre30Y70(ronda, probabilidad)) {
							array2[i] = 0;
						}

					}
				}

				// Llamo al método comprueba putos para el j1
				puntosj1 += compruebaPuntos(array, ronda);

				// llamo al método comprueba puntos para el j2
				puntosj2 += compruebaPuntos(array2, ronda);

				// Muetro la disposición de los bolos del j1
				System.out.println("Posiciones de los bolos del J1");
				System.out.println();
				muestraLosBolosEnPantalla(array);
				System.out.println();

				// Muestro la disposición de los bolos del j2
				System.out.println("Posiciones de los bolos del J2");
				System.out.println();
				muestraLosBolosEnPantalla(array2);
				System.out.println();

				// Muestro los puntos en pantalla y la ronda de la jugada
				System.out.println("El J1 ha conseguido: " + puntosj1 + "puntos, en la ronda: " + ronda);
				System.out.println("El J2 ha conseguido: " + puntosj2 + "puntos, en la ronda: " + ronda);

				compruebaElJugadorGanador(array, array2);
			}
			// Condición de escape del bucle, que el usuario introduzca un 0, o que no
			// existen bolos
		} while ((escape != 0) && quedanBolos(array) && quedanBolos(array2));

	}

	/**
	 * Inicializa los bolos
	 * 
	 * @param array
	 * @return
	 */
	public static int[] inicializacionDeBolos(int array[]) {

		// Declaro el array y le doy la longitud del prier array
		int array2[] = new int[array.length];
		// Doy el valore de 1 a el array
		for (int i = 0; i < array2.length; i++) {
			array2[i] = 1;

		}
		// Devuelvo el array
		return array2;
	}

	/**
	 * Muestra los bolos en pantalla
	 * 
	 * @param array
	 */
	public static void muestraLosBolosEnPantalla(int array[]) {
		// Muestra la primera linea de bolos
		for (int i = 0; i < 4; i++) {
			System.out.print(array[i] + "\t" + "\t");
		}
		// Saltos de linea para la segunda linea de bolos
		System.out.println();
		System.out.println();
		// Muestro la segunda linea de bolos
		for (int i = 4; i < 7; i++) {
			System.out.print("\t" + array[i] + "\t");
		}
		// Saltos de linea para la tercera linea de bolos
		System.out.println();
		System.out.println();
		// Muestro la tercera linea de bolos
		for (int i = 7; i < 9; i++) {
			System.out.print("\t" + "\t" + array[i]);
		}
		// Saltos de linea para la cuarta linea de bolos
		System.out.println();
		System.out.println();
		for (int i = 9; i < array.length; i++) {
			System.out.print("\t" + "\t" + "\t" + array[i]);
		}
	}

	/**
	 * Pide probabilidad al usuario de que caiga un bolo
	 * 
	 * @return
	 */
	public static int probabilidad() {
		return Integer.parseInt(JOptionPane.showInputDialog("Introduce la probabilidad de que se caiga un bolo"));
	}

	/**
	 * Devuelve la probabilidad de que se caigan los bolos, a cada ronda, la
	 * probabilidad va bajando, si la probabilidad baja de 30, la probabilidad se
	 * resetea a 60
	 * 
	 * @param ronda
	 * @param probabilidad
	 * @return
	 */
	public static int probabilidadEntre30Y70(int ronda, int probabilidad) {

		if (ronda == 1) {
			probabilidad = 70;
		} else {
			probabilidad--;
		}
		if (probabilidad < 30) {
			probabilidad = 60;
		}
		return probabilidad;
	}

	/**
	 * Comprueba que en el arrayno existan 1, por lo que todos los bolos estrían
	 * derribados
	 * 
	 * @param array
	 * @return
	 */
	public static boolean quedanBolos(int array[]) {

		boolean existen = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				existen = true;
			}

		}
		return existen;
	}

	/**
	 * Comprueba la rinda en la que seencuentra la partida, y suma los puntos
	 * conseguidos en cada una de las rondas
	 * 
	 * @param array
	 * @param ronda
	 * @return
	 */
	public static int compruebaPuntos(int array[], int ronda) {
		int contadorBolosTirados = 0;
		int puntos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {

				contadorBolosTirados++;
			}
		}
		if (ronda == 1) {
			puntos += contadorBolosTirados * 10;
		}
		if (ronda == 2) {
			puntos += contadorBolosTirados * 5;
		}
		if (ronda == 3) {
			puntos += contadorBolosTirados * 2;
		}
		if (ronda == 4) {
			puntos += contadorBolosTirados * 1;
		}

		return puntos;

	}

	public static void compruebaElJugadorGanador(int array[], int array2[]) {

		if (!quedanBolos(array)) {
			System.out.println("El jugador ganador es: El J1");
		}
		if (!quedanBolos(array2)) {
			System.out.println("El jugador ganador es: El J2");
		}
		if (!quedanBolos(array) && !quedanBolos(array2)) {
			System.out.println("Claro empate de los jugadores");
		}
	}

}
