package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Coche extends Antiguedad{

	private String marca;

	/**
	 * 
	 */
	public Coche() {
		super();
		
	}

	/**
	 * @param year
	 * @param origen
	 * @param precio
	 */
	public Coche(int year, String origen, float precio, String marca) {
		super(year, origen, precio);
		this.marca = marca;
		
	}

	@Override
	public String toString() {
		return "Coche marca = " + marca + ", año = " + year + ", origen = " + origen + ", precio = " + precio;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
