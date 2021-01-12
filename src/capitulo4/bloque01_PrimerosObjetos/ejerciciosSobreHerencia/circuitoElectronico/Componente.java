package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.circuitoElectronico;

public class Componente {

	protected String nombre;
	protected Componente componenteAnterior, componenteSiguiente;
	
	
	/**
	 * 
	 */
	public Componente() {
		super();
	}


	/**
	 * @param nombre
	 * @param componenteAnterior
	 * @param componenteSiguiente
	 */
	public Componente(String nombre) {
		super();
		this.nombre = nombre;
		
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
	 * @return the componenteAnterior
	 */
	public Componente getComponenteAnterior() {
		return componenteAnterior;
	}


	/**
	 * @param componenteAnterior the componenteAnterior to set
	 */
	public void setComponenteAnterior(Componente componenteAnterior) {
		this.componenteAnterior = componenteAnterior;
	}


	/**
	 * @return the componenteSiguiente
	 */
	public Componente getComponenteSiguiente() {
		return componenteSiguiente;
	}


	/**
	 * @param componenteSiguiente the componenteSiguiente to set
	 */
	public void setComponenteSiguiente(Componente componenteSiguiente) {
		this.componenteSiguiente = componenteSiguiente;
	}
	
	
	
}
