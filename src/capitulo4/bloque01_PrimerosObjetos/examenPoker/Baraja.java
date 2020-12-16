package capitulo4.bloque01_PrimerosObjetos.examenPoker;

import java.util.Arrays;

import utils.Utils;

public class Baraja {

	Carta arrayBaraja[] = new Carta[52]; // Creamos array para la baraja de cartas
	int reparto = 0;

	/**
	 * Constructor vacío
	 */

	public Baraja() {
		super();
		iniciarBaraja();
	}

	/**
	 * * Constructor con propiedades
	 * 
	 * @param arrayBaraja
	 */

	public Baraja(Carta[] arrayBaraja) {
		super();
		this.arrayBaraja = arrayBaraja;
		iniciarBaraja();
	}

	/**
	 * 
	 */

	@Override
	public String toString() {
		return "Baraja [arrayBaraja=" + Arrays.toString(arrayBaraja) + "]";
	}

	/**
	 * Getters y setters
	 * 
	 * @return
	 */

	public Carta[] getArrayBaraja() {
		return arrayBaraja;
	}

	public void setArrayBaraja(Carta[] arrayBaraja) {
		this.arrayBaraja = arrayBaraja;
	}

	/**
	 * Método para iniciar baraja con valores 1-13 y palos
	 * 
	 * @param arrayBaraja
	 */

	public void iniciarBaraja() {
		int id = 0;

		for (int i = 1; i <= 13; i++) { // Asignamos valores a las cartas, 13 por palo + id
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

	public void mezclar() {
		int primerIndice, ultimoIndice; // Creamos variables para los índices de intercambio
		Carta aux;
		for (int i = 0; i < arrayBaraja.length; i++) { // Recorremos array = nº intercambios
			primerIndice = Utils.obtenerNumeroAzar(0, 51); // Generamos número al azar para índices de intercambio
			ultimoIndice = Utils.obtenerNumeroAzar(0, 51);
			aux = this.arrayBaraja[primerIndice]; // Guardamos índice en variable auxiliar
			this.arrayBaraja[primerIndice] = this.arrayBaraja[ultimoIndice]; // Realizamos intercambio
			this.arrayBaraja[ultimoIndice] = aux; //
		}
	}

	/**
	 * Método para desplazar primera carta a la izquierda
	 * 
	 * @param arrayBaraja
	 */
	public void primeraCartaAUltima() {
		// a izquierda
		// Salvaguardo la primera posición del array
		Carta aux = arrayBaraja[0];
		// Recorro las posiciones del array de primera a penúltima
		for (int j = 0; j < arrayBaraja.length - 1; j++) {
			arrayBaraja[j] = arrayBaraja[j + 1];
		}
		// La primera posición, guardada en aux, pasa a ser la última
		arrayBaraja[arrayBaraja.length - 1] = aux;
	}

	/**
	 * Método para pasar última carta a derecha, 1ª posición
	 * 
	 * @param arrayBaraja
	 */

	public void ultimaCartaAPrimera() {
		// a derecha
		// Comienzo el algoritmo de ciclo
		Carta aux = arrayBaraja[arrayBaraja.length - 1];
		for (int j = arrayBaraja.length - 1; j > 0; j--) {
			arrayBaraja[j] = arrayBaraja[j - 1];
		}
		arrayBaraja[0] = aux;
		// Finalizo el algotitmo del ciclo
	}

	/**
	 * Método burbuja para ordenar por ID
	 */

	public void ordenar() {
		Carta auxiliar;
		boolean intercambio = false;

		do {
			intercambio = false;
			for (int i = 0; i < arrayBaraja.length - 1; i++) {
				if (arrayBaraja[i].getId() > arrayBaraja[i + 1].getId()) { // Comparamos IDs
					auxiliar = arrayBaraja[i + 1]; // Guardamos valor en auxiliar
					arrayBaraja[i + 1] = arrayBaraja[i]; // Realizamos intercambio
					arrayBaraja[i] = auxiliar;
					intercambio = true;

				}
			}
		} while (intercambio); // Saldremos del bucle cuando no haya intercambios

	}

	/**
	 * Método para repartir cartas entre jugadores
	 * 
	 * @param player
	 */

	public void repartir(Jugador player) { // Recibe jugador
		for (int i = 0; i < player.getMano().length; i++) { // Recorremos array mano jugador
			player.getMano()[i] = arrayBaraja[reparto]; // Damos carta a esa posición de la mano del jugador
			reparto++;
		}
	}
}

