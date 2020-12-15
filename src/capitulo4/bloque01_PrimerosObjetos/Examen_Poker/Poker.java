package capitulo4.bloque01_PrimerosObjetos.Examen_Poker;

public class Poker {

	public static void main(String[] args) {

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

}
