package examenes.examen02_3_12_20;

import utils.Utils;

public class TresEnRayaConArrays {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// Creo tres arrays para filas
		int filaSup[] = new int[3];
		int filaMed[] = new int[3];
		int filaInf[] = new int[3];
		int opcion;
		int jugador1 = 1;
		int jugador2 = 2;

		for (int i = 0; i < filaSup.length; i++) {// Relleno arrays con 0
			filaSup[i] = 0;
			filaMed[i] = 0;
			filaInf[i] = 0;
		}

		mostrarTableroEnPantalla(filaSup, filaMed, filaInf);// Muestro juego en pantalla

		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 0:
				System.out.print("¡Hasta la próxima!");
				break;
			case 1:
				mostrarTableroEnPantalla(filaSup, filaMed, filaInf);
				pedirCoordenadasJugador(filaSup, filaMed, filaInf, jugador1);
				mostrarTableroEnPantalla(filaSup, filaMed, filaInf);
				break;
			case 2:
				mostrarTableroEnPantalla(filaSup, filaMed, filaInf);
				pedirCoordenadasJugador(filaSup, filaMed, filaInf, jugador2);
				break;
			}
		} while (opcion != 0);
	}

	/**
	 * Método para mostrar tablero en pantalla
	 * 
	 * @param filaSup
	 * @param filaMed
	 * @param filaInf
	 */

	public static void mostrarTableroEnPantalla(int filaSup[], int filaMed[], int filaInf[]) {
		for (int i = 0; i < filaSup.length; i++) {
			System.out.print(filaSup[i] + " ");

		}
		System.out.println("");
		for (int i = 0; i < filaSup.length; i++) {

			System.out.print(filaMed[i] + " ");

		}
		System.out.println(" ");
		for (int i = 0; i < filaSup.length; i++) {

			System.out.print(filaInf[i] + " ");
		}
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
	 * Método para pedir coordenadas jugador
	 * @param filaSup
	 * @param filaMed
	 * @param filaInf
	 * @param jugador
	 */
	
	public static void pedirCoordenadasJugador (int filaSup [], int filaMed [], int filaInf [], int jugador) {
	
		boolean ocupado = false;
		
			
		do { // Usamos bucle por si la ubicación no está disponible, así vovleremos a pedir
				// datos al jugador
			ocupado = false;
			System.out.println("");
			System.out.println("¿En qué fila colocamos ficha?" // Pedimos fila al jugador
					+ "\nFila superior = 0" + "\nFila medio = 1" + "\nFila inferior = 2");
			int fila = Utils.obtenerEnteroPorScanner();

			System.out.println("¿En qué columna colocamos ficha?" // Pedimos columna al jugador
					+ "\nColumna izquierda = 0" + "\nColumna central = 1" + "\nColumna derecha = 2");
			int columna = Utils.obtenerEnteroPorScanner();

			if (fila == 0) { // Recorro el array para ver si esa posición está disponible en la fila superior
				for (int i = 0; i < filaSup.length; i++) {
					if (columna == i) { // si columna es igual a i y si en i hay 0
						if (filaSup[i] == 0) {
							if (jugador == 1) { // pongo ficha
								filaSup[i] = 1;
							}
							if (jugador == 2) {
								filaSup[i] = 2;
							}
						} else {
							ocupado = true;
							System.out.println("Ya hay ficha en esa ubicación, por favor, indique otra");
							System.out.println("");
							mostrarTableroEnPantalla(filaSup, filaMed, filaInf);
							break;
						}

					}
				}
			}

			if (fila == 1) { // Recorro el array para ver si esa posición está disponible en la fila superior
				for (int i = 0; i < filaMed.length; i++) {
					if (columna == i) { // si columna es igual a i y si en i hay 0
						if (filaMed[i] == 0) {
							if (jugador == 1) { // pongo ficha
								filaMed[i] = 1;
							}
							if (jugador == 2) {
								filaMed[i] = 2;
							}
						} else {
							ocupado = true;
							System.out.println("Ya hay ficha en esa ubicación, por favor, indique otra");
							System.out.println("");
							mostrarTableroEnPantalla(filaSup, filaMed, filaInf);
							break;
						}

					}
				}
			}

			if (fila == 2) { // Recorro el array para ver si esa posición está disponible en la fila superior
				for (int i = 0; i < filaInf.length; i++) {
					if (columna == i) { // si columna es igual a i y si en i hay 0
						if (filaInf[i] == 0) {
							if (jugador == 1) { // pongo ficha
								filaInf[columna] = 1;
							}
							if (jugador == 2) {
								filaInf[columna] = 2;
							}
						} else {
							ocupado = true;
							System.out.println("Ya hay ficha en esa ubicación, por favor, indique otra");
							System.out.println("");
							mostrarTableroEnPantalla(filaSup, filaMed, filaInf);
							break;
						}

					}
				}
			}

		} while (ocupado);
		

	}
	
	
}
