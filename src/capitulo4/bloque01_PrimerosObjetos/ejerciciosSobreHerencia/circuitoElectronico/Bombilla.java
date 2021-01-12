package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.circuitoElectronico;

public class Bombilla extends Componente{

	private String color;

	/**
	 * 
	 */
	public Bombilla() {
		super();
		
	}

	/**
	 * @param nombre
	 * @param componenteAnterior
	 * @param componenteSiguiente
	 */
	public Bombilla(String nombre, String color) {
		super(nombre);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Componente = " + nombre + ", color=" + color + ", componente anterior=" + componenteAnterior.getNombre().toString()
				+ ", componente siguiente=" + componenteSiguiente.getNombre().toString();
	}
	
	
}
