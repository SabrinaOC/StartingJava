package capitulo6_Recursos.hashMap;

public class Articulo {
	
	//Creamos propiedades de la clase
	protected int codBarras, estante, stock;
	protected String nombre;
	
	
	/**
	 *  Contructor por defecto
	 */
	public Articulo() {
		super();
	}


	/**
	 * @param codBarras
	 * @param estante
	 * @param stock
	 * @param nombre
	 */
	public Articulo(int codBarras, int estante, int stock, String nombre) {
		super();
		this.codBarras = codBarras;
		this.estante = estante;
		this.stock = stock;
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Artículo" + nombre + ", estante = " + estante + ", stock = " + stock + " código de barras = " + codBarras;
	}

	/* GETTERS Y SETTERS */

	/**
	 * @return the codBarras
	 */
	public int getCodBarras() {
		return codBarras;
	}


	/**
	 * @param codBarras the codBarras to set
	 */
	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}


	/**
	 * @return the estante
	 */
	public int getEstante() {
		return estante;
	}


	/**
	 * @param estante the estante to set
	 */
	public void setEstante(int estante) {
		this.estante = estante;
	}


	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}


	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
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
