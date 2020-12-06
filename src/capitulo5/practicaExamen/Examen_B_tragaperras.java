package capitulo5.practicaExamen;

import utils.Utils;

public class Examen_B_tragaperras {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int exit; // variable switch
		int eleccionesUsuario[] = new int[] { 0, 0, 0 }; // Iniciamos con 0 a modo de bandera
		int puntosTirada;
		int puntosTotales = 0;
		
		System.out.println("    .-------.\r\n"
				+ "       oO{-JACKPOT-}Oo\r\n"
				+ "       .=============. __\r\n"
				+ "       | [a] [X] [o] |(  )\r\n"
				+ "       | [$] [$] [$] | ||\r\n"
				+ "       | [X] [o] [$] | ||\r\n"
				+ "       |             |_||\r\n"
				+ "       | xxx ::::::: |--'\r\n"
				+ "       | ooo ::::::: |\r\n"
				+ "       | $$$ ::::::: |\r\n"
				+ "       |             |\r\n"
				+ "       |      __ === |\r\n"
				+ "       |_____/__\\____|\r\n"
				+ "      /###############\\\r\n"
				+ "     /#################\\\r\n"
				+ "    |#JGS###############|");
		
		System.out.println("\n\tAntes de empezar..." + "\n" + "\nEn el menú principal verás dos opciones: 1 y 2"
				+ "\npara abandonar e iniciar el juego, respectivamente."
				+ "\nAdemás, junto a cada objeto de la máquina, verás números,"
				+ "\nsu único cometido es mostrar cómo se representa cada uno"
				+ "\nde ellos en el juego, p.ej. Dólar = 4");

		do {
			System.out.println("");
			exit = mostrarMenu(eleccionesUsuario); // Mostramos menú en pantalla y pedimos opciones a usuario

			switch (exit) {
		case 0: 
			System.out.print(" _____   ___  ___  ___ _____   _____  _   _ ___________ \r\n"
					+ "|  __ \\ / _ \\ |  \\/  ||  ___| |  _  || | | |  ___| ___ \\\r\n"
					+ "| |  \\// /_\\ \\| .  . || |__   | | | || | | | |__ | |_/ /\r\n"
					+ "| | __ |  _  || |\\/| ||  __|  | | | || | | |  __||    / \r\n"
					+ "| |_\\ \\| | | || |  | || |___  \\ \\_/ /\\ \\_/ / |___| |\\ \\ \r\n"
					+ " \\____/\\_| |_/\\_|  |_/\\____/   \\___/  \\___/\\____/\\_| \\_|\r\n"
					+ "                                                        ");
			break;
		case 1:

			colocarOpcionEnArray(eleccionesUsuario);

			break;
		// Como hemos cambiado el hecho de que el usuario pueda elegir opción a hacerlo
		// aleatoriamente
		// los "cases" usados anteriormente ya no son útiles, solo necesitamos uno para
		// crear números al
		// azar y el 0 para que el usuario pueda abandonar el juego cuando quiera

//		case 2: 
//			colocarOpcionEnArray(eleccionesUsuario);
//			break;
//		case 3:
//			colocarOpcionEnArray(eleccionesUsuario);
//			
//			break;
//		case 4:
//			colocarOpcionEnArray(eleccionesUsuario);
//			
//			break;
		default:
			System.out.println("Opción no válida");

		}

//		if (comprobarPosicionLibre(eleccionesUsuario)) { //Si quedan espacios libres volvemos a pedir opción al usuario
//			colocarOpcionEnArray(eleccionesUsuario);
//		} else { //Si no quedan posiciones libres
//		puntosTirada = puntosJugada(eleccionesUsuario);	
//		puntosTotales += puntosTirada;
//		System.out.println("Total puntos acumulados " + puntosTotales);
//		}

		// Volvemos a contar
		if (exit == 1) { // Usamos if para que se realice solo si el usuario elige la opción adecuada, es
							// decir, 1 "jugar"
			puntosTirada = puntosJugada(eleccionesUsuario);
			puntosTotales += puntosTirada;
			System.out.println("Total puntos acumulados " + puntosTotales);

			limpiarArray(eleccionesUsuario);// Despues de contar puntos tirada, limpiamos array

		}

	} while (exit != 0);
}
	
	/**
	 * Método para mostrar menú
	 * 
	 * @return
	 */

	public static int mostrarMenu(int eleccionesUsuario []) {
		
		String strMenu = "0.- Abandonar juego"
				+ "\n1.- Jugar" 
				+ "\n      - Mora (=1)" 
				+ "\n      - Naranja (=2)"
				+ "\n      - Campana (=3)"
				+ "\n      - Dólar (=4)";
		// Muestro el men�
	
		System.out.println(strMenu + "\n");
		// Pedimos opción al usuario
		System.out.println("Elige una opción");
		int opcionUsuario = Utils.obtenerEnteroPorScanner();
		// Devuelvo la opción seleccionada
		return opcionUsuario;

	}

	/**
	 * 
	 * @param eleccionesUsuario
	 * @return
	 */

	public static int opcionUsuario(int eleccionesUsuario[]) {

		// System.out.println("Elige una opción"); //Pido opcion a usuario
		// int opcionUsuario = Utils.obtenerEnteroPorScanner();
		
		//Dado que el punto e invalida lo anterior, ahora la opción la generaremos al azar
		int opcionUsuario = Utils.obtenerNumeroAzar(1, 4);
		// Devuelvo la opción seleccionada
		System.out.println("Número obtenido al azar " + opcionUsuario);
		return opcionUsuario;
	}

	/**
	 * 
	 * @param eleccionesUsuario
	 * @return
	 */

	public static boolean comprobarPosicionLibre(int eleccionesUsuario[]) {
		for (int i = 0; i < eleccionesUsuario.length; i++) {
			if (eleccionesUsuario[i] == 0) { // Si encontramos un 0, significa que aún hay posiciones libres
				return true;
			}
		}
		return false; // De lo contrario, devolvemos false
	}

	/**
	 * 
	 * @param eleccionesUsuario
	 * @return
	 */

	public static boolean comprobarIgualdad(int eleccionesUsuario[]) {

		// Comprobamos que los valores son iguales en todas las posiciones
		if (eleccionesUsuario[0] == eleccionesUsuario[1] && eleccionesUsuario[0] == eleccionesUsuario[2]) {
			return true; // Si lo son, devolvemos true
		} else {
			return false; // Si no, false
		}

	}

	/**
	 * 
	 * @param eleccionesUsuario
	 * @return
	 */

	public static boolean comprobarDolares(int eleccionesUsuario[]) {
		if (eleccionesUsuario[0] == 4) { // Si en la posición 0 hay un 4, significa que hay dólares
			return true; // devolvemos true
		} else {
			return false; // Si no, devolvemos false
		}
	}

	/**
	 * 
	 * @param eleccionesUsuario
	 * @param exit
	 */

	public static void colocarOpcionEnArray(int eleccionesUsuario[]) { // int exit

		for (int i = 0; i < eleccionesUsuario.length;) { // Recorremos el array para colocar valor

			if (eleccionesUsuario[i] == 0) { // Si en la posición hay un 0, significa que está libre
				int eleccion = opcionUsuario(eleccionesUsuario);
				eleccionesUsuario[i] = eleccion; // Por lo tanto, colocamos valor

			} else {
				i++;// Si no hay 0, aumentamos i hasta encontrar posición vacía
			}

		}
	}

	/**
	 * 
	 * @param eleccionesUsuario
	 * @param puntos
	 */

	public static int puntosJugada(int eleccionesUsuario[]) {
		int puntosTirada = 0;
		boolean dolares;


		boolean iguales = comprobarIgualdad(eleccionesUsuario); // Comprobamos los valores
		if (iguales) { // Si son iguales pasaremos a comprobar si se trata de dólares o no
			dolares = comprobarDolares(eleccionesUsuario);
			if (dolares) {
				puntosTirada += 3000; // Si son dólares, aumentamos 3000 pts.

			} else {
				puntosTirada += 1000; // Si los valores coinciden, sumamos 1000 puntos
			}
		} else {
			puntosTirada -= 100; //Si no hay igualdad, restamos 100 pts.
		}

		System.out.println("");
		System.out.println("Puntos tirada " + puntosTirada);
		return puntosTirada;
	}

	// }

	/**
	 * 
	 * @param eleccionesUsuario
	 */

	public static void limpiarArray(int eleccionesUsuario[]) {
		for (int i = 0; i < eleccionesUsuario.length; i++) {
			eleccionesUsuario[i] = 0;
		}
	}

}
