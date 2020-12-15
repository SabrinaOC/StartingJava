package capitulo4.bloque01_PrimerosObjetos.examenMarcianos;

public class Principal {

	public static void main(String[] args) {
		CampoDeBatalla campo = new CampoDeBatalla(); // Creamos campoBatalla

		for (int i = 0; i < campo.getArrayHumanos().length; i++) { // Recorremos array humanos para crear humanos
			campo.getArrayHumanos()[i] = new Humanos("Humano" + i); // Creamos humano

			if (campo.getArrayHumanos()[i] == campo.getArrayHumanos()[19]) { // Duplicamos vida en última posición
				campo.vidaDobleUltimoPersonaje();
			}

			campo.getArrayMalvados()[i] = new Malvado("Marciano" + i);
			if (campo.getArrayMalvados()[i] == campo.getArrayMalvados()[19]) { // Duplicamos vida en última posición
				campo.vidaDobleUltimoPersonaje();
			}
		}

		// Mezclamos array humanos y malvados
		campo.desordenarHumanos();
		campo.desordenarMarcianos();

		//System.out.println(campo.toString());

		// Comenzamos bucle partida
		int posH;
		int posM;// Creamos variables para primeras posiciones
		int damage;
		int vida;
		do {

			posH = primerPersonajeVivo(campo.getArrayHumanos()); // Guardamos la posición del primer humano vivo
			posM = primerPersonajeVivo(campo.getArrayMalvados()); // Hacemos lo mismo con el marciano

			damage = utils.Utils.obtenerNumeroAzar(5, 25); // Establecemos daño causado al disparar

			vida = campo.getArrayMalvados()[posM].getPuntosVida(); // Guardamos vida
			campo.getArrayMalvados()[posM].setPuntosVida(vida-damage); //Restamos daño a vida
			//campo.cambiarAMuerto();//Revisamos si hay algún personaje sin pts de vida
			
			//Ahora hacemos lo mismo, pero al contrario, el marciano dispara
			posH = primerPersonajeVivo(campo.getArrayHumanos()); // Guardamos la posición del primer humano vivo
			posM = primerPersonajeVivo(campo.getArrayMalvados()); // Hacemos lo mismo con el marciano
			
			damage = utils.Utils.obtenerNumeroAzar(5, 25);
			vida = campo.getArrayHumanos()[posH].getPuntosVida();
			campo.getArrayHumanos()[posH].setPuntosVida(vida-damage);
			
			//Pasamos a cambiar estados tras disparar
			campo.cambiarAMuerto();
			
			

		} while ((humanoVivo(campo.getArrayHumanos())) && marcianoVivo(campo.getArrayMalvados()));
		// Repetimos bucle hasta que no haya marcianos o humanos vivos
		
		
		
		if (humanoVivo(campo.getArrayHumanos())) {
			System.out.println("¡HAN GANADO LOS HUMANOS!");
			System.out.println("\n" + campo.toString());
		}
		if (marcianoVivo(campo.getArrayMalvados())) {
			System.out.println("HAN GANADO LOS MARCIANOS");
			System.out.println("\n" + campo.toString());
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
}
