package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.circuitoElectronico;

public class Bateria extends Componente{

	private int potencia;

	/**
	 * 
	 */
	public Bateria() {
		super();
		
	}

	/**
	 * @param nombre
	 * @param componenteAnterior
	 * @param componenteSiguiente
	 */
	public Bateria(String nombre, int potencia) {
		super(nombre);
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Componente = " + nombre + ", potencia = " + potencia +", componente anterior = " + componenteAnterior.getNombre().toString()
				+ ", componente siguiente = " + componenteSiguiente.getNombre().toString();
	}

	/**
	 * @return the potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	
	
	
}
