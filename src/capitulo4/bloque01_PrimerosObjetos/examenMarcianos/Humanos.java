package capitulo4.bloque01_PrimerosObjetos.examenMarcianos;

public class Humanos extends Personaje {

	/**
	 * 
	 */
	public Humanos() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 */
	public Humanos(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @Override
	 */

	public String toString() {
		return "\n" + getNombre() + " Vida =" + getPuntosVida() + ", Vivo =" + isVivo() + ", Disparos recibidos = "
				+ getDisparosRecibidos();
	}

}
