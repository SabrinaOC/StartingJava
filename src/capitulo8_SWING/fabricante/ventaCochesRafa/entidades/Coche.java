package capitulo8_SWING.fabricante.ventaCochesRafa.entidades;

public class Coche {
	
	private int id, idFab;
	private String bastidor, modelo, color;
	
	
	/**
	 * Constructor por defecto
	 */
	public Coche() {
		super();
	}
	
	// GETTERS Y SETTERS
	
	
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
	 * @return the idFab
	 */
	public int getIdFab() {
		return idFab;
	}
	/**
	 * @param idFab the idFab to set
	 */
	public void setIdFab(int idFab) {
		this.idFab = idFab;
	}
	/**
	 * @return the bastidor
	 */
	public String getBastidor() {
		return bastidor;
	}
	/**
	 * @param bastidor the bastidor to set
	 */
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return modelo;
	}
	
	
	

}
