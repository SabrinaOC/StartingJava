package capitulo4.bloque01_PrimerosObjetos.examenMarcianos;

public class Malvado extends Personaje{

	/**
	 * 
	 */
	public Malvado() {
		super();
		// TODO Auto-generated constructor stub
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
		return "\nMalvado [getPuntosVida()=" + getPuntosVida() + ", getNombre()=" + getNombre() + ", isVivo()=" + isVivo()
				+ "]";
	}
	
	

	

}
