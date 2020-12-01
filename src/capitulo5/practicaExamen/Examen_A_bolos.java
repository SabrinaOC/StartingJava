package capitulo5.practicaExamen;



import Utils.Utils;

public class Examen_A_bolos {

	public static void main(String[] args) {

		int opcion; // creo variable opción
		boolean quedanBolosEnPie = true;
		int ronda = 1;
		int puntos = 0;
		int puntuacion = 10;

		int bolos[] = new int[10]; // creamos array para bolos

		for (int i = 0; i < bolos.length; i++) { // Recorremos array para rellenar con 1 todas las posiciones e iniciar
													// el juego
			bolos[i] = 1;
		}

		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 0:
				System.out.print("¡Adiós!");
				break;
			case 1:
				mostrarBolosEnPantalla(bolos); // Mostramos bolos en pantalla para ver cómo están antes de la tirada
				probabilidadCaigaBolo(bolos, ronda); // Usamos método para calcular probabilidad

				System.out.println("");
				mostrarBolosEnPantalla(bolos); // Mostramos bolos tras tirada
				puntos = verPuntuacionPorTirada(bolos, ronda, puntos, puntuacion);
				ronda++;
				puntuacion = puntuacion / 2;
				quedanBolosEnPie = comprobarQuedanBolosEnPie(bolos); // Comprobamos si es posible seguir jugando

				if (quedanBolosEnPie == false) { // Si es false salimos del juego
					opcion = 0;
					System.out.println("");
					System.out.println("Fin de partida");
				}

				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);// Establecemos condición para el bucle
		

		
	}
	
	/**
	 * Método para mostrar menú
	 * 
	 * @return
	 */

	public static int mostrarMenu() {

		String strMenu = "\n\nMenú" 
				+ "\n0.- Abandonar juego" 
				+ "\n1.- Tirar bola";
		// Muestro el menú
	
		System.out.println(strMenu +"\n");
		// Pido una opción al usuario
		//int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción")); 
		System.out.println("Elige una opción");
		int opcionUsuario = Utils.obtenerEnteroPorScanner();
		// Devuelvo la opciÃ³n seleccionada
		return opcionUsuario;
	}

	/**
	 * Método para mostrar bolos en pantalla
	 * 
	 * @param bolos
	 */

	public static void mostrarBolosEnPantalla(int bolos[]) {
		System.out.println("");
		for (int i = 0; i <= 3; i++) { // Recorremos array para rellenar con 1 todas las posiciones e iniciar el juego

			System.out.print(bolos[i] + " ");
		}
		System.out.println(" ");
		for (int i = 4; i <= 6; i++) { // Recorremos array para rellenar con 1 todas las posiciones e iniciar el juego
			if (i == 4) {
				System.out.print(" " + bolos[i] + " ");

			} else {
				System.out.print(bolos[i] + " ");
			}
		}
		System.out.println("  ");
		for (int i = 7; i <= 8; i++) { // Recorremos array para rellenar con 1 todas las posiciones e iniciar el juego
			if (i == 7) {
				System.out.print("  " + bolos[i] + " ");
			} else {
				System.out.print(bolos[i] + " ");
			}
		}
		System.out.println("   ");
		for (int i = 9; i < bolos.length; i++) { // Recorremos array para rellenar con 1 todas las posiciones e iniciar
													// el juego

			System.out.print("   " + bolos[i]);
		}

	}

	/**
	 * Método tirar bola probabilidad 50
	 * 
	 * @param bolos
	 * @return
	 */

	public static int[] probabilidadCaigaBolo(int bolos[], int ronda) {

		int probabilidad = 0; // Creamos variable para probabilidad
		int probdescendiente;

		for (int i = 0; i < bolos.length; i++) { // Recorremos el array
			probabilidad = Utils.obtenerNumeroAzar(30, 75);// Creamos número al azar para probabilidad
			probdescendiente = Utils.obtenerNumeroAzar(30, 75);

			if (probabilidad <= (probdescendiente - ronda * 15)) { // Si el número es 50 o menos, el bolo cae
				bolos[i] = 0;
			}
			//System.out.println("probabilidad es " + probabilidad 
				//		+"probabilidad descendiente es " + probdescendiente);
		}

		return bolos;
	}

	public static int verPuntuacionPorTirada(int bolos[], int ronda, int puntos, int puntuacion) {
		for (int i = 0; i < bolos.length; i++) {// Recorremos array para ver cuántos bolos han caído y sumarlo a
												// puntuación
			if (bolos[i] == 0) { // Comprobamos si el bolo se ha caído
				if (ronda < 5) { // Dado que a partir de la 5ª ronda no sumamos puntos, solo entraremos aquí las
									// 4 primeras veces
					puntos += puntuacion; // Sumamos puntos
				}
			}
		}
		System.out.println("");
		System.out.println(puntos + " puntos obtenido hasta la ronda " + ronda
				+ "\nEl valor de puntos por bolo en esta ronda es " + puntuacion);
		return puntos;
	}

	/**
	 * Método para comprobar si es posible seguir jugando
	 * 
	 * @param bolos
	 * @return
	 */

	public static boolean comprobarQuedanBolosEnPie(int bolos[]) {

		for (int i = 0; i < bolos.length; i++) {
			if (bolos[i] == 1) {
				return true;
			}
		}
		return false;
	}

}
