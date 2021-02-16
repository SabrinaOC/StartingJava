package examenes.examen16_2_21.b_Cromo_Baloncesto;

/**
 * Crea un tipo de objeto nuevo en Java, llamado “CromoBaloncesto”. Cada cromo
 * debe tener: un identificador entero, un nombre de tipo String, un valor que
 * exprese los puntos del jugador o jugadora en la temporada pasada y un valor
 * numérico que indique los rebotes (también de la temporada pasada).
 * 
 * @author F541U
 *
 */
public class Cromo {

	private int id, puntosAnotados, rebotes;
	private String nombre;
	
	
	/**
	 * Constructor por defecto
	 */
	public Cromo() {
		super();
	}


	/**
	 * @param id
	 * @param puntosAnotados
	 * @param rebotes
	 * @param nombre
	 */
	public Cromo(int id, int puntosAnotados, int rebotes, String nombre) {
		super();
		this.id = id;
		this.puntosAnotados = puntosAnotados;
		this.rebotes = rebotes;
		this.nombre = nombre;
	}

	
	//GETTERS Y SETTERS

	@Override
	public String toString() {
		return "Cromo [id=" + id + ", puntosAnotados=" + puntosAnotados + ", rebotes=" + rebotes + ", nombre=" + nombre
				+ "]";
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the puntosAnotados
	 */
	public int getPuntosAnotados() {
		return puntosAnotados;
	}


	/**
	 * @param puntosAnotados the puntosAnotados to set
	 */
	public void setPuntosAnotados(int puntosAnotados) {
		this.puntosAnotados = puntosAnotados;
	}


	/**
	 * @return the rebotes
	 */
	public int getRebotes() {
		return rebotes;
	}


	/**
	 * @param rebotes the rebotes to set
	 */
	public void setRebotes(int rebotes) {
		this.rebotes = rebotes;
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
	
	
	
}
