package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Antiguedad {

	protected int year;
	protected String origen;
	protected float precio;
	
	
	/**
	 * 
	 */
	public Antiguedad() {
		super();
	}


	/**
	 * @param year
	 * @param origen
	 * @param precio
	 */
	public Antiguedad(int year, String origen, float precio) {
		super();
		this.year = year;
		this.origen = origen;
		this.precio = precio;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/**
	 * @return the origen
	 */
	public String getOrigen() {
		return origen;
	}


	/**
	 * @param origen the origen to set
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}


	/**
	 * @return the precio
	 */
	public float getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
}
