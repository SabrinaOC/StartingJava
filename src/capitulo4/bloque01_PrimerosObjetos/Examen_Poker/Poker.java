package capitulo4.bloque01_PrimerosObjetos.Examen_Poker;

public class Poker {

	public static void main(String[] args) {

		imagen();
		Jugador jugadoresPartida[] = new Jugador[5]; // Creamos jugadores partida

		for (int i = 0; i < jugadoresPartida.length; i++) { // Creamos jugadores y ponemos nombre
			jugadoresPartida[i] = new Jugador("Jugador" + i);
		}
		Baraja barajaPoker = new Baraja();// Creamos baraja
		// System.out.println(barajaPoker.toString());

		barajaPoker.mezclar(); //Mezclamos cartas para repartir y empezar juego
		// System.out.println(barajaPoker.toString());

//		barajaPoker.primeraCartaAUltima();
//		System.out.println(barajaPoker.toString());

//		barajaPoker.ultimaCartaAPrimera();
//		System.out.println(barajaPoker.toString());

		// barajaPoker.ordenar();
		// System.out.println(barajaPoker.toString());
		

		for (int i = 0; i < jugadoresPartida.length; i++) { // Recorremos array jugadores para repartir cartas
//			jugadoresPartida.
			barajaPoker.repartir(jugadoresPartida[i]);

			System.out.println(jugadoresPartida[i].toString()); //Aprovechamos bucle para mostrar mano jugadores
			jugadoresPartida[i].comprobarJugadas();				//y comprobar jugadas
		}

		
	}

	public static void imagen () {

		System.out.println("\r\n"
				+ "‎_______________________¶¶¶¶___¶¶¶¶¶\r\n"
				+ "_____________________¶¶____¶¶¶____¶¶__¶¶¶\r\n"
				+ "___________________¶¶___¶¶¶____¶¶¶¶¶¶¶___¶¶\r\n"
				+ "_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "______________¶¶¶¶¶__¶__________________________¶¶\r\n"
				+ "___________¶¶¶¶__¶¶__¶___________________________¶\r\n"
				+ "_________¶¶¶_¶¶__¶__¶¶¶__________________________¶\r\n"
				+ "______¶¶¶_¶¶_¶¶¶_¶_¶¶_¶¶_________¶_______________¶\r\n"
				+ "_____¶_¶¶__¶_¶_¶¶¶¶_¶¶¶__________¶¶______________¶\r\n"
				+ "___¶¶¶_¶¶¶¶¶_¶¶¶¶¶¶_¶¶¶_________¶¶¶______________¶\r\n"
				+ "_¶¶__¶¶¶¶¶¶¶¶_¶¶_¶¶____________¶¶¶¶¶_____________¶\r\n"
				+ "¶_¶¶__¶__¶¶¶¶____¶¶___________¶¶¶¶¶¶¶____________¶\r\n"
				+ "¶__¶¶¶¶¶¶¶¶¶¶____¶¶__________¶¶¶¶¶¶¶¶¶¶__________¶\r\n"
				+ "_¶¶¶_¶_¶¶___¶¶___¶¶________¶¶¶¶¶¶¶¶¶¶¶¶¶_________¶\r\n"
				+ "__¶¶_¶¶_¶___¶¶___¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶\r\n"
				+ "___¶¶____¶___¶___¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____¶\r\n"
				+ "____¶¶___¶¶__¶¶__¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶\r\n"
				+ "_____¶¶___¶__¶¶__¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶\r\n"
				+ "______¶¶___¶__¶__¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶\r\n"
				+ "_______¶¶__¶¶_¶__¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶\r\n"
				+ "________¶¶__¶_¶¶_¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶\r\n"
				+ "_________¶¶__¶_¶_¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶\r\n"
				+ "__________¶¶_¶¶¶_¶¶___¶¶¶¶¶¶¶¶¶__¶¶__¶¶¶¶¶¶¶¶¶___¶\r\n"
				+ "____________¶_¶¶_¶¶_____¶¶¶¶¶____¶¶____¶¶¶¶¶_____¶\r\n"
				+ "_____________¶_¶¶¶¶___________¶¶¶¶¶¶¶¶___________¶\r\n"
				+ "______________¶¶¶¶¶__________¶¶¶¶¶¶¶¶¶¶______¶¶__¶\r\n"
				+ "_______________¶¶¶____________¶¶¶¶¶¶¶¶_______¶¶¶_¶\r\n"
				+ "________________¶¶__________________________¶¶_¶_¶\r\n"
				+ "_________________¶¶__________________________¶¶__¶\r\n"
				+ "_________________¶¶__________________________¶¶¶_¶\r\n"
				+ "__________________¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "__________________¶¶¶¶¶¶¶¶¶¶¶¶\r\n"
				+ "\r\n"
				+ "_____________________¶¶¶¶¶¶");
		
		System.out.println("A continuación verá una simulación de una jugada de póker."
				+ "\nEn la mesa hay 5 jugadores. Tras repartir las cartas de la baraja"
				+ "\nse mostrarán, en caso de que las hubiese, las mejores jugadas de cada jugador,"
				+ "\nesto es, pareja, trío o póker."
				+ "\n");
	}
}
