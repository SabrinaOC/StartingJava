package capitulo4.bloque01_PrimerosObjetos.Examen_Poker;

import java.util.Arrays;

public class Jugador {

	private Carta mano [] = new Carta [5];
	private String nombre;
	
	
	
	/**
	 * Constructor sin propiedades
	 */
	
	public Jugador() {
		super();
	}

	/**
	 * Constructor con propiedades
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
		return "Jugador [mano=" + Arrays.toString(mano) + ", nombre=" + nombre + "]";
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
	
	public void comprobarJugadas () { 
		int cont = 0; //contador para jugadas
		for (int i = 0; i < mano.length; i++) {
			
		}
	}
	
	
	
	
}

