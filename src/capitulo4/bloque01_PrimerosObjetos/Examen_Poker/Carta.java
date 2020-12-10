package capitulo4.bloque01_PrimerosObjetos.Examen_Poker;

public class Carta {
	private String palo;
	private int numero, id;
	
	
	/**
	 * Constructor vacío
	 */
	
	public Carta() {
		super();
	}

	/**
	 * Constructor con parámetros
	 * @param palo
	 * @param numero
	 * @param id
	 */
	
	public Carta(String palo, int numero, int id) {
		super();
		this.palo = palo;
		this.numero = numero;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Carta [palo = " + palo + ", número = " + numero + ", ID =" + id  + "]";
	}


	/**
	 * Getters y setters
	 * @return
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * 
	 * @param palo
	 */
	
	public void setPalo(String palo) {
		this.palo = palo;
	}

	/**
	 * 
	 * @return
	 */
	
	public int getNumero() {
		return numero;
	}

	/**
	 * 
	 * @param numero
	 */

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * 
	 * @return
	 */
	
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
