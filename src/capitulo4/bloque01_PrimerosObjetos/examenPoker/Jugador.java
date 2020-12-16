package capitulo4.bloque01_PrimerosObjetos.examenPoker;

import java.util.Arrays;

public class Jugador {

	private Carta mano[] = new Carta[5];
	private String nombre;

	/**
	 * Constructor sin propiedades
	 */

	public Jugador() {
		super();
	}

	/**
	 * Constructor con propiedades
	 * 
	 * @param mano
	 * @param nombre
	 */

	public Jugador(Carta[] mano, String nombre) {
		super();
		this.mano = mano;
		this.nombre = nombre;
	}

	/**
	 * @param nombre
	 */
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @Override
	 */

	public String toString() {
		return nombre +" mano = " + Arrays.toString(mano);
		//return "Jugador [mano=" + Arrays.toString(mano) + ", nombre=" + nombre + "]";
	}

	/**
	 * @return the mano
	 */
	public Carta[] getMano() {
		return mano;
	}

	/**
	 * @param mano the mano to set
	 */
	public void setMano(Carta[] mano) {
		this.mano = mano;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para comprobar parejas, trios y póker
	 */

	public void comprobarJugadas() {
		int cont = 1; // contador para jugadas
		for (int i = 0; i < mano.length; i++) {// Recorremos mano para comparar cartas
			for (int j = i + 1; j < mano.length; j++) {
				if (this.mano[i].getNumero() == this.mano[j].getNumero()) {
					cont++;
				}
			}

		}

		switch (cont) { // Switch para clasificar jugadas
		case 1:
			System.out.println("No hay jugadas destacadas"
					+ "\n"); //Solo una carta igual, no hay jugada destacada
			break;
		case 2:
			System.out.println("Se ha encontrado una pareja"
					+ "\n"); //Dos cartas iguales, pareja
			break;
		case 3:
			System.out.println("Se ha encontrado un trío"
					+ "\n"); //Tres, trío
			break;
		case 4:
			System.out.println("¡Póker!"); //Cuatro, póker
			break;
		}
	}

}

