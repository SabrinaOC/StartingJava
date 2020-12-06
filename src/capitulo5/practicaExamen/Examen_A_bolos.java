package capitulo5.practicaExamen;



import utils.Utils;

public class Examen_A_bolos {

	public static void main(String[] args) {

		int opcion; // creo variable opci�n
		boolean quedanBolosEnPie = true;
		int ronda = 1;
		int puntos = 0;
		int puntuacion = 10;
		int contador0=0;
		int probabilidad = 0;

		int bolos[] = new int[10]; // creamos array para bolos

		for (int i = 0; i < bolos.length; i++) { // Recorremos array para rellenar con 1 todas las posiciones e iniciar
													// el juego
			bolos[i] = 1;
		}

		do {
			opcion = mostrarMenu();
			switch (opcion) {
			case 0:
				System.out.print("�Adi�s!");
				break;
			case 1:
				mostrarBolosEnPantalla(bolos); // Mostramos bolos en pantalla para ver c�mo est�n antes de la tirada
				//probabilidad = probabilidadCaigaBolo(bolos, ronda); // Usamos m�todo para calcular probabilidad
				
				lanzarBola(bolos, ronda);
				System.out.println("");
				mostrarBolosEnPantalla(bolos); // Mostramos bolos tras tirada
				puntos = verPuntuacionPorTirada(bolos, ronda, puntos, puntuacion, contador0);
				ronda++;
				puntuacion = puntuacion / 2;
//				quedanBolosEnPie = comprobarQuedanBolosEnPie(bolos); // Comprobamos si es posible seguir jugando
//
//				if (quedanBolosEnPie == false) { // Si es false salimos del juego
//					opcion = 0;
//					System.out.println("");
//					System.out.println("Fin de partida");
//				}
//
				break;
			default:
				System.out.println("Opci�n no v�lida");
			}

		} while (opcion != 0 && comprobarQuedanBolosEnPie(bolos));// Establecemos condici�n para el bucle
		

		
	}
	
	/**
	 * M�todo para mostrar men�
	 * 
	 * @return
	 */

	public static int mostrarMenu() {

		String strMenu = "\n\nMen�" 
				+ "\n0.- Abandonar juego" 
				+ "\n1.- Tirar bola";
		// Muestro el men�
	
		System.out.println(strMenu +"\n");
		// Pido una opci�n al usuario
		//int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opci�n")); 
		System.out.println("Elige una opci�n");
		int opcionUsuario = Utils.obtenerEnteroPorScanner();
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * M�todo para mostrar bolos en pantalla
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
	 * M�todo tirar bola probabilidad 50
	 * 
	 * @param bolos
	 * @return
	 */

	public static int probabilidadCaigaBolo(int bolos[], int ronda) {
		//int cont = 0;
		int probabilidad = 0; // Creamos variable para probabilidad
		//int probdescendiente;

		//for (int i = 0; i < bolos.length; i++) { // Recorremos el array
			probabilidad = Utils.obtenerNumeroAzar(0, 100);// Creamos n�mero al azar para probabilidad
			//probdescendiente = Utils.obtenerNumeroAzar(30, 75);

//			if (probabilidad <= 50) { // Si el n�mero es 50 o menos, el bolo cae
//				bolos[i] = 0;
//				cont++;
//			}
//			if (ronda != 1) {
//				cont = cont-contador0;
//			} 
		//}

		return probabilidad;
	}
	
	public static int lanzarBola (int bolos[], int ronda) {
		int bolosTirados = 0;
		
		for (int i = 0; i < bolos.length; i++) {
			if (bolos[i] <= probabilidadCaigaBolo(bolos, ronda)) {
				bolos[i] = 0;
				bolosTirados++;
			}
		}
		return bolosTirados;
	}
	
	
	
	

	public static int verPuntuacionPorTirada(int bolos[], int ronda, int puntos, int puntuacion, int contador0) {
		int cont = 0;
		for (int i = 0; i < bolos.length; i++) {// Recorremos array para ver cu�ntos bolos han ca�do y sumarlo a
												// puntuaci�n
			if (bolos[i] == 0) { // Comprobamos si el bolo se ha ca�do
				if (ronda < 5) { // Dado que a partir de la 5� ronda no sumamos puntos, solo entraremos aqu� las
					if (ronda == 1)	{		// 4 primeras veces
					puntos += puntuacion; // Sumamos puntos
					} else {
						if (bolos[i] == 0) {
							cont++; //contamos bolos ca�dos
							
						}
					}
				}
			}
		}
		cont = cont - contador0; //restamos para ver cu�ntos han ca�do en la �ltima tirada, teniendo contador0 como referencia
		puntos = puntuacion * cont;
		System.out.println("");
		System.out.println(puntos + " puntos obtenido hasta la ronda " + ronda
				+"\nSe han ca�do " + cont +" bolos en la �ltima tirada"
				+ "\nEl valor de puntos por bolo en ronda " + ronda + " es " + puntuacion);
		return puntos;
	}

	/**
	 * M�todo para comprobar si es posible seguir jugando
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
