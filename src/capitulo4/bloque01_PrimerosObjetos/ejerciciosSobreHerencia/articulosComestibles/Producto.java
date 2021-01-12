package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.articulosComestibles;

public class Producto {

	protected int codigo;
	protected String nombre;
	protected float precio;
	
	
	/**
	 * 
	 */
	public Producto() {
		super();
	}


	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Producto(int codigo, String nombre, float precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}


	
	@Override
	public String toString() {
		return "Producto nombre = " + nombre + ", codigo = " + codigo + ", precio=" + precio;
	}


	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
