package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.circuitoElectronico;

public class Interruptor extends Componente{

	private String tipo;

	/**
	 * 
	 */
	public Interruptor() {
		super();
		
	}

	/**
	 * @param nombre
	 * @param componenteAnterior
	 * @param componenteSiguiente
	 */
	public Interruptor(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Componente = " + nombre + ", tipo" + tipo + ", componente anterior=" + componenteAnterior.getNombre().toString()
				+ ", componente siguiente=" + componenteSiguiente.getNombre().toString();
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
