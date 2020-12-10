package capitulo4.bloque01_PrimerosObjetos.Examen_Poker;

public class Baraja {
	
	public static void main(String[] args) {
		
		
	

	Carta arrayBaraja [] = new Carta [52]; //Creamos array para la baraja de cartas
	
	iniciarBaraja(arrayBaraja);
	primeraCartaAUltima(arrayBaraja);
	ultimaCartaAPrimera(arrayBaraja);
	
	for (int i = 0; i < arrayBaraja.length; i++) {
		System.out.println(arrayBaraja[i].toString());
	}
	
	
	}
	/**
	 * Método para iniciar baraja con valores 1-13 y palos
	 * @param arrayBaraja
	 */
	
	public static void iniciarBaraja (Carta arrayBaraja []) {
		int id = 0;
		
		for (int i = 1; i <= 13; i++) {
			arrayBaraja[id] = new Carta("picas", i, id);
			id++;
		}
		
		for (int i = 1; i <= 13; i++) {
			arrayBaraja[id] = new Carta("diamantes", i, id);
			id++;
		}
		
		for (int i = 1; i <= 13; i++) {
			arrayBaraja[id] = new Carta("tréboles", i, id);
			id++;
		}
		
		for (int i = 1; i <= 13; i++) {
			arrayBaraja[id] = new Carta("corazones", i, id);
			id++;
		}
	}
	
	/**
	 * Método para desplazar primera carta a la izquierda
	 * @param arrayBaraja
	 */
	public static void primeraCartaAUltima (Carta arrayBaraja []) {
		// a izquierda
		// Salvaguardo la primera posición del array
		Carta aux = arrayBaraja[0];
		// Recorro las posiciones del array de primera a penúltima
		for (int j = 0; j < arrayBaraja.length - 1; j++) {
			arrayBaraja[j] = arrayBaraja[j+1];
		}
		// La primera posición, guardada en aux, pasa a ser la última
		arrayBaraja[arrayBaraja.length-1] = aux;
	}

	public static void ultimaCartaAPrimera (Carta arrayBaraja []) {
		// a derecha
		// Comienzo el algoritmo de ciclo
		Carta aux = arrayBaraja[arrayBaraja.length - 1];
		for (int j = arrayBaraja.length - 1; j > 0; j--) {
			arrayBaraja[j] = arrayBaraja[j-1];
		}
		arrayBaraja[0] = aux;
		// Finalizo el algotitmo del ciclo
	}
}




