package capitulo4.bloque01_PrimerosObjetos.examenMarcianos;

import java.util.Arrays;

public class CampoDeBatalla {

	private Malvado arrayMalvados[] = new Malvado[20];
	private Humanos arrayHumanos[] = new Humanos[20];
	private String nombre;

	/**
	 * 
	 */
	public CampoDeBatalla() {
		super();
	}

	/**
	 * @param arrayMalvados
	 * @param arrayHumanos
	 * @param nombre
	 */
	public CampoDeBatalla(Malvado[] arrayMalvados, Humanos[] arrayHumanos, String nombre) {
		super();
		this.arrayMalvados = arrayMalvados;
		this.arrayHumanos = arrayHumanos;
		this.nombre = nombre;
	}

	/**
	 * @Override
	 */

	public String toString() {
		return "CAMPO DE BATALLA" +"\nMarcianos = " + Arrays.toString(arrayMalvados) + "\nHumanos = "
				+ Arrays.toString(arrayHumanos) + nombre;
	}

	/**
	 * Método para multiplicar vida último humano
	 */

	public void vidaDobleUltimoHumano() {
		int auxVidaHum; // creamos variable para guardar vida último personaje

		auxVidaHum = arrayHumanos[arrayHumanos.length - 1].getPuntosVida(); // Guardamos puntos vida último personaje
		arrayHumanos[arrayHumanos.length - 1].setPuntosVida(auxVidaHum * 2); // Duplicamos su valor

	}

	/**
	 * Método para multiplicar vida último marciano
	 */

	public void vidaDobleUltimoMarciano() {
		int auxVidaMal; // creamos variable para guardar vida último personaje

		auxVidaMal = arrayMalvados[arrayMalvados.length - 1].getPuntosVida(); // Guardamos puntos vida último personaje
		arrayMalvados[arrayMalvados.length - 1].setPuntosVida(auxVidaMal * 2); // Duplicamos su valor

	}

	/**
	 * Método para desordenar array humanos
	 */

	public void desordenarHumanos() {
		int primerIndice; // Creamos índices para intercambios
		int ultimoIndice;
		Humanos intercambio;

		for (int i = 0; i < arrayHumanos.length; i++) {
			primerIndice = utils.Utils.obtenerNumeroAzar(0, arrayHumanos.length - 1); // Creamos números al azar para
																						// intercambiar
			ultimoIndice = utils.Utils.obtenerNumeroAzar(0, arrayHumanos.length - 1);

			intercambio = this.arrayHumanos[primerIndice]; // Guardamos uno de los valores en la variable auxiliar para
															// no perderlo
			this.arrayHumanos[primerIndice] = this.arrayHumanos[ultimoIndice]; // Reasignamos valores
			this.arrayHumanos[ultimoIndice] = intercambio;
		}
	}

	/**
	 * Método para desordenar array marcianos
	 */

	public void desordenarMarcianos() {
		int primerIndice; // Creamos índices para intercambios
		int ultimoIndice;
		Malvado intercambio;

		for (int i = 0; i < arrayHumanos.length; i++) {
			primerIndice = utils.Utils.obtenerNumeroAzar(0, arrayMalvados.length - 1); // Creamos números al azar para
																						// intercambiar
			ultimoIndice = utils.Utils.obtenerNumeroAzar(0, arrayMalvados.length - 1);

			intercambio = this.arrayMalvados[primerIndice]; // Mismo proceso del método anterior
			this.arrayMalvados[primerIndice] = this.arrayMalvados[ultimoIndice];
			this.arrayMalvados[ultimoIndice] = intercambio;
		}
	}

	/**
	 * Método para cambiar estado vivo/muerto
	 */

	public void cambiarAMuerto() {
		for (int i = 0; i < arrayHumanos.length; i++) { // Recorremos array para reestablecer estado
			if (this.arrayHumanos[i].getPuntosVida() <= 0) { // Si sus puntos de vida equivalen a 0 o menos, cambiamos
																// su estado a false
				this.arrayHumanos[i].setVivo(false);
			}
			if (this.arrayMalvados[i].getPuntosVida() <= 0) {// Hacemos lo mismo con los malvados
				this.arrayMalvados[i].setVivo(false);
			}
		}
	}

	public void humanAlive() {
		for (int i = 0; i < arrayHumanos.length; i++) {

		}
	}

	/**
	 * Método para ordenar por burbuja por disparos recibidos
	 */

	public void ordenarPorDisparoHum() {
		Personaje auxiliar;
		boolean intercambio = false;

		do {
			intercambio = false;
			for (int i = 0; i < arrayHumanos.length - 1; i++) {
				if (this.arrayHumanos[i].getDisparosRecibidos() > arrayHumanos[i + 1].getDisparosRecibidos()) { // Comparamos
																												// disparos
					auxiliar = arrayHumanos[i + 1]; // Guardamos valor en auxiliar
					this.arrayHumanos[i + 1] = this.arrayHumanos[i]; // Realizamos intercambio
					this.arrayHumanos[i] = (Humanos) auxiliar;
					intercambio = true;

				}
			}
		} while (intercambio); // Saldremos del bucle cuando no haya intercambios

		// Mostramos en pantalla la primera y última posición del array ordenado por
		// burbuja,
		// de esta forma mostraremos quién ha recibido más y menos disparos
		System.out.println("El humano más fácil de matar ha sido " + this.arrayHumanos[1].toString()
				+ "\nEl humano más difícil de matar ha sido " + this.arrayHumanos[arrayHumanos.length - 1].toString());

	}

	/**
	 * Método burbuja para ordenar malvados por disparos
	 */

	public void ordenarPorDisparoMal() {
		Personaje auxiliar;
		boolean intercambio = false;

		do {
			intercambio = false;
			for (int i = 0; i < arrayMalvados.length - 1; i++) {
				if (this.arrayMalvados[i].getDisparosRecibidos() > this.arrayMalvados[i + 1].getDisparosRecibidos()) { // Comparamos
																														// disparos
					auxiliar = this.arrayMalvados[i + 1]; // Guardamos valor en auxiliar
					this.arrayMalvados[i + 1] = this.arrayMalvados[i]; // Realizamos intercambio
					this.arrayMalvados[i] = (Malvado) auxiliar;
					intercambio = true;

				}
			}
		} while (intercambio); // Saldremos del bucle cuando no haya intercambios

		System.out.println("El marciano más fácil de matar ha sido " + this.arrayMalvados[1].toString()
				+ "\nEl marciano más difícil de matar ha sido "
				+ this.arrayMalvados[arrayMalvados.length - 1].toString());

	}

	/**
	 * Getters y setters
	 */

	public Malvado[] getArrayMalvados() {
		return arrayMalvados;
	}

	public void setArrayMalvados(Malvado[] arrayMalvados) {
		this.arrayMalvados = arrayMalvados;
	}

	public Humanos[] getArrayHumanos() {
		return arrayHumanos;
	}

	public void setArrayHumanos(Humanos[] arrayHumanos) {
		this.arrayHumanos = arrayHumanos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
