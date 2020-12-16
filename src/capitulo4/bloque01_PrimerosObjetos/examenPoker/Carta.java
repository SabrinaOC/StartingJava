package capitulo4.bloque01_PrimerosObjetos.examenPoker;

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
	 * 
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
		return "\nCarta " + numero +" de " + palo + ", ID =" + id;
		
	}

	// Getters y setters
	 
	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
