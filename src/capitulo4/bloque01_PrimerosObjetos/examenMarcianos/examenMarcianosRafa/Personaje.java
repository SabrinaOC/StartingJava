package capitulo4.bloque01_PrimerosObjetos.examenMarcianos.examenMarcianosRafa;

public class Personaje {

	private int puntosVida, disparosRecibidos; // Útil para apartado g, mostrar más fácil/difícil de matar
	private String nombre;
	private boolean vivo = true;

	/**
	 * Constructor sin propiedades
	 */
	public Personaje() {
		super();
		establecerVida();

	}

	/**
	 * @param puntosVida
	 * @param nombre
	 * @param vivo
	 */
	public Personaje(String nombre) {
		super();
		establecerVida();
		this.nombre = nombre;
	}

	/**
	 * Método para establecer vida inicial
	 */
	public void establecerVida() {
		this.puntosVida = utils.Utils.obtenerNumeroAzar(50, 100);
	}
	
	
	@Override
	public String toString() {
		return "Personaje [puntosVida=" + puntosVida + ", disparosRecibidos=" + disparosRecibidos + ", nombre=" + nombre
				+ ", vivo=" + vivo + "]";
	}

	/**
	 * @return the puntosVida
	 */
	public int getPuntosVida() {
		return puntosVida;
	}

	/**
	 * @param puntosVida the puntosVida to set
	 */
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
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
	 * @return the vivo
	 */
	public boolean isVivo() {
		return vivo;
	}

	/**
	 * @param vivo the vivo to set
	 */
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}

	/**
	 * @return the disparosRecibidos
	 */
	public int getDisparosRecibidos() {
		return disparosRecibidos;
	}

	/**
	 * @param disparosRecibidos the disparosRecibidos to set
	 */
	public void setDisparosRecibidos(int disparosRecibidos) {
		this.disparosRecibidos = disparosRecibidos;
	}

}
