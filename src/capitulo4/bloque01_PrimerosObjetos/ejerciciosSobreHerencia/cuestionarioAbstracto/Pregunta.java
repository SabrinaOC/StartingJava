package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.cuestionarioAbstracto;

/**
 * Creamos superclase pregunta
 * @author F541U
 *
 */
public abstract class Pregunta {
	protected String enunciado = "";
	protected String respuestaUsuario = "";

	/**
	 * 
	 */
	public Pregunta() {
		super();
	}

	/**
	 * @param enunciado
	 */
	public Pregunta(String enunciado) {
		super();
		this.enunciado = enunciado;
	}
	
	//Al tener varios tipos de preguntas, creamos método abstracto para mostrar en pantalla
	//dado que cada una se pintará de forma distinta
	public abstract void mostrarEnPantalla();
	
	//Como la comprobación será distinta dependiendo de la subclase de pregunta,
	//implementaremos el método en ellas
	public abstract boolean esCorrecta();

}
