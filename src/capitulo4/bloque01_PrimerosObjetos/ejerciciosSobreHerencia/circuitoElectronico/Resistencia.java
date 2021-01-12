package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.circuitoElectronico;

public class Resistencia extends Componente{

	private int valor;

	
	
	/**
	 * 
	 */
	public Resistencia() {
		super();
		
	}

	/**
	 * @param nombre
	 * @param componenteAnterior
	 * @param componenteSiguiente
	 */
	public Resistencia(String nombre,  int valor) {
		super(nombre);
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Componente = " + nombre + "valor = " + valor + ", componente anterior=" + componenteAnterior.getNombre().toString()
				+ ", componente siguiente=" + componenteSiguiente.getNombre().toString();
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
