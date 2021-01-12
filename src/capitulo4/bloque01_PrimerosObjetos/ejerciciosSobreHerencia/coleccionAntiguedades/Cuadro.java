package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Cuadro extends Antiguedad{

	private String autor;

	/**
	 * 
	 */
	public Cuadro() {
		super();
		
	}

	/**
	 * @param year
	 * @param origen
	 * @param precio
	 */
	public Cuadro(int year, String origen, float precio, String autor) {
		super(year, origen, precio);
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Cuadro autor = " + autor + ", año = " + year + ", origen = " + origen + ", precio = " + precio;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}
