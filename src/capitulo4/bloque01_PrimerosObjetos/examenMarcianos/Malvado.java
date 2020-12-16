package capitulo4.bloque01_PrimerosObjetos.examenMarcianos;

public class Malvado extends Personaje {

	/**
	 * 
	 */
	public Malvado() {
		super();
		
	}

	/**
	 * @param puntosVida
	 * @param nombre
	 * @param vivo
	 */
	public Malvado(String nombre) {
		super(nombre);
	}

	/**
	 * @Override
	 */

	public String toString() {
		return "\n" + getNombre() + " Vida = " + getPuntosVida() + ", Vivo = " + isVivo() + " Disparos Recibidos "
				+ getDisparosRecibidos();
	}

}
