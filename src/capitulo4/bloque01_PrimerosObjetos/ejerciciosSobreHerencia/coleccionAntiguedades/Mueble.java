package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Mueble extends Antiguedad{

	private String tipo;

	/**
	 * 
	 */
	public Mueble() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param year
	 * @param origen
	 * @param precio
	 */
	public Mueble(int year, String origen, float precio, String tipo) {
		super(year, origen, precio);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Mueble tipo = " + tipo + ", año = " + year + ", origen = " + origen + ", precio = " + precio;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
