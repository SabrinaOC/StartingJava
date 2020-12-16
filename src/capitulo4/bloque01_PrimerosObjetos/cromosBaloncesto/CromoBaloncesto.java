package capitulo4.bloque01_PrimerosObjetos.cromosBaloncesto;

/**
 * crea una clase llamada "CromoBaloncesto". 
 *	- Dentro de la clase, crea las siguientes propiedades: String nombreJugador, 
 *	int alturaCm, int pesoKg y float puntosMediosPorpartido.
 *	- Crea un constructor por defecto (sin argumentos de entrada) y un constructor 
 *	en el que recibas, por argumentos de entrada, todas las propiedades 
 *	de los objetos de esta clase
 *	- Crea un m�todo "toString()" que devuelva una cadena de caracteres 
 *	que contenga todos los valores de las propiedades de los objetos de esta clase.
 *	- Crea m�todos getter y setter de todas las propiedades de los objetos de esta clase.
 * @author F541U
 *
 */

public class CromoBaloncesto {
	
	private String nombreJugador; //creamos propiedades
	private int alturaCm, pesoKg;
	private float puntosMediosPorpartido;
	
	/**
	 * Constructor sin argumentos de entrada
	 */
	
	public CromoBaloncesto () {
		
	}
	
	/**
	 * Contructor con argumentos de entrada
	 * @param nombreJugador
	 * @param alturaCm
	 * @param pesoKg
	 * @param puntosMediosPorpartido
	 */
	
	public CromoBaloncesto (String nombreJugador, int alturaCm, int pesoKg, float puntosMediosPorpartido) {
		this.nombreJugador = nombreJugador;
		this.alturaCm = alturaCm;
		this.pesoKg = pesoKg;
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	
	/**
	 * M�todo to string
	 */
	
	public String toString () {
		return "El jugador " + nombreJugador +" tiene una altura de " + alturaCm + " y un peso de " + pesoKg 
				+". Su media de puntos por partido es " +puntosMediosPorpartido;
	}
	
	
	//  Getters y setters
	 
	/**
	 * Get Nombre
	 * @return
	 */
	
	public String getNombreJugador () {
		return nombreJugador;
		
	}
	
	/**
	 * Get altura
	 * @return
	 */
	
	public int getAltura () {
		return alturaCm;
	}

	/**
	 * Get peso
	 * @return
	 */
	
	public int getPesoKg () {
		return alturaCm;
		
	}
	
	/**
	 * Get media puntos
	 * @return
	 */
	
	public float getPuntosMediosPorpartido () {
		return puntosMediosPorpartido;
	}
	
	/**
	 * Set nombre jugador
	 */
	
	public void setNombreJugador (String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}
	
	/**
	 * Set puntos
	 */
	
	public void setAltura (int alturaCm) {
		this.alturaCm = alturaCm;
	}
	
	/**
	 * Set peso
	 */
	
	public void setPesoKg (int pesoKg) {
		this.pesoKg = pesoKg;
	}
	
	/**
	 * Set media puntos partido
	 */
	
	public void setPuntosMediosPorpartido (float puntosMediosPorpartido) {
		this.puntosMediosPorpartido = puntosMediosPorpartido;
	}
	
	
	
	
	
}
