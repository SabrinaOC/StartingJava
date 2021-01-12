package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.articulosComestibles;

public class Perecedero extends Producto{
	
	private int yearCad;

	/**
	 * 
	 */
	public Perecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Perecedero(int codigo, String nombre, float precio, int yearCad) {
		super(codigo, nombre, precio);
		this.yearCad = yearCad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Perecedero nombre= " + nombre + ", caducidad= " + yearCad + ", codigo= " + codigo + ", precio= " + precio;
	}

	/**
	 * @return the yearCad
	 */
	public int getYearCad() {
		return yearCad;
	}

	/**
	 * @param yearCad the yearCad to set
	 */
	public void setYearCad(int yearCad) {
		this.yearCad = yearCad;
	}

	
	
	

}
