package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.coleccionAntiguedades;

public class Joya extends Antiguedad{

	private String material;

	
	/**
	 * 
	 */
	public Joya() {
		super();
		
	}

	/**
	 * @param year
	 * @param origen
	 * @param precio
	 */
	public Joya(int year, String origen, float precio, String material) {
		super(year, origen, precio);
		this.material = material;
	}

	@Override
	public String toString() {
		return "Joya material = " + material + ", año = " + year + ", origen = " + origen + ", precio = " + precio;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
