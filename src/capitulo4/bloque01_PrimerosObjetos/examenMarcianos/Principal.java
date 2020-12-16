package capitulo4.bloque01_PrimerosObjetos.examenMarcianos;

public class Principal {

	public static void main(String[] args) {
		
		
		
		CampoDeBatalla campo = new CampoDeBatalla(); // Creamos campoBatalla

		iniciarYPonerVidaAUltimo(campo); //Método para iniciar personajes y poner vida doble

		// Mezclamos array humanos y malvados
		campo.desordenarHumanos();
		campo.desordenarMarcianos();

		//System.out.println(campo.toString());

		diparos(campo);

		// Mostramos ganador
		if (humanoVivo(campo.getArrayHumanos())) {
			System.out.println("¡HAN GANADO LOS HUMANOS!" /*+ campo.toString()*/);

		}
		if (marcianoVivo(campo.getArrayMalvados())) {
			System.out.println("¡HAN GANADO LOS MARCIANOS!" /*+ campo.toString()*/);

		}
		
		//Mostramos en pantalla información con personajes con más disparos y menos
		System.out.println(" ");
		campo.ordenarPorDisparoHum();
		System.out.println("");
		campo.ordenarPorDisparoMal();

	}

	public static void iniciarYPonerVidaAUltimo (CampoDeBatalla campo) {
		for (int i = 0; i < campo.getArrayHumanos().length; i++) { // Recorremos array humanos para crear humanos
			campo.getArrayHumanos()[i] = new Humanos("Humano" + i); // Creamos humano

			if (campo.getArrayHumanos()[i] == campo.getArrayHumanos()[campo.getArrayHumanos().length-1]) { // Duplicamos vida en última posición
				campo.vidaDobleUltimoHumano();
			}

			campo.getArrayMalvados()[i] = new Malvado("Marciano" + i);
			if (campo.getArrayMalvados()[i] == campo.getArrayMalvados()[campo.getArrayMalvados().length-1]) { // Duplicamos vida en última posición
				campo.vidaDobleUltimoMarciano();
			}
		}
	}
	
	/**
	 * Método para establecer primer personaje vivo
	 * 
	 * @param arrayPersonajes
	 * @return
	 */

	public static int primerPersonajeVivo(Personaje arrayPersonajes[]) {
		int pos = 0; // variable posición
		for (int i = 0; i < arrayPersonajes.length; i++) { // Recorremos array hasta encontrar personaje vivo
			if (arrayPersonajes[i].isVivo()) {
				pos = i;
				break;
			}
		}
		return pos;
	}

	/**
	 * 
	 * @param arrayHumanos
	 * @return
	 */

	public static boolean humanoVivo(Humanos arrayHumanos[]) { // creamos método para ver si hay humanos vivos
		for (int i = 0; i < arrayHumanos.length; i++) { // Recorremos array
			if (arrayHumanos[i].isVivo()) { // Si encontramos uno vivo, devolvemos true
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param arrayHumanos
	 * @return
	 */

	public static boolean marcianoVivo(Malvado arrayMalvados[]) { // creamos método para ver si hay humanos vivos
		for (int i = 0; i < arrayMalvados.length; i++) { // Recorremos array
			if (arrayMalvados[i].isVivo()) { // Si encontramos uno vivo, devolvemos true
				return true;
			}
		}
		return false;
	}

	public static void diparos(CampoDeBatalla campo) {
		// Comenzamos bucle partida
		int posH;
		int posM;// Creamos variables para primeras posiciones
		int damage; // Variable daño

		do {

			posH = primerPersonajeVivo(campo.getArrayHumanos()); // Guardamos la posición del primer humano vivo
			posM = primerPersonajeVivo(campo.getArrayMalvados()); // Hacemos lo mismo con el marciano

			damage = utils.Utils.obtenerNumeroAzar(5, 25); // Establecemos daño causado al disparar

			//Restamos daño a vida
			campo.getArrayMalvados()[posM].setPuntosVida(campo.getArrayMalvados()[posM].getPuntosVida() - damage); 
			campo.getArrayMalvados()[posM].setDisparosRecibidos(campo.getArrayHumanos()[posM].getDisparosRecibidos() + 1);

			// campo.cambiarAMuerto();//Revisamos si hay algún personaje sin pts de vida

			// Ahora hacemos lo mismo, pero al contrario, el marciano dispara
			posH = primerPersonajeVivo(campo.getArrayHumanos()); // Guardamos la posición del primer humano vivo
			posM = primerPersonajeVivo(campo.getArrayMalvados()); // Hacemos lo mismo con el marciano

			damage = utils.Utils.obtenerNumeroAzar(5, 25);
			campo.getArrayHumanos()[posH].setPuntosVida(campo.getArrayHumanos()[posH].getPuntosVida() - damage);
			campo.getArrayHumanos()[posH].setDisparosRecibidos(campo.getArrayHumanos()[posH].getDisparosRecibidos() + 1);

			// Pasamos a cambiar estados tras disparar
			campo.cambiarAMuerto();

		} while ((humanoVivo(campo.getArrayHumanos())) && marcianoVivo(campo.getArrayMalvados()));
		// Repetimos bucle hasta que no haya marcianos o humanos vivos
	}

	
	public static void intro () {
		System.out.println("  ___\r\n"
				+ "           /]_/\r\n"
				+ "          |\\/|.--/'-.\r\n"
				+ "          \\|/:o /  /\\    ._,\r\n"
				+ "             \\_/_.'0/    _|_\r\n"
				+ "              \\____]] (>[___]=]]]===\r\n"
				+ "              /    \\___/P{]\r\n"
				+ "           __//    /----\\/\r\n"
				+ "          (_[-'\\__/_\r\n"
				+ "              / | | \\\r\n"
				+ "             '=='='=='\r\n"
				+ "            ____||||___\r\n"
				+ "          (_\"\"_/ \\_\"\"_)");
	}
}
