package capitulo4.bloque01_PrimerosObjetos.examenMarcianos.examenMarcianosRafa;

import java.util.Arrays;

public class CampoDeBatalla {

	private Malvado arrayMalvados[] = new Malvado[20];
	private Humano arrayHumanos[] = new Humano[20];
	private String nombre;

	/**
	 * 
	 */
	public CampoDeBatalla() {
		super();
		iniciarYPonerVidaAUltimo();
	}

	/**
	 * @param arrayMalvados
	 * @param arrayHumanos
	 * @param nombre
	 */
	public CampoDeBatalla(String nombre) {
		super();
		iniciarYPonerVidaAUltimo();
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
	 * Método para iniciar personajes y dar pts de vida
	 */
	
	public void iniciarYPonerVidaAUltimo () {
		for (int i = 0; i < arrayHumanos.length; i++) { // Recorremos array humanos para crear humanos
			arrayHumanos[i] = new Humano("Humano" + i); // Creamos humano
			arrayMalvados[i] = new Malvado("Marciano" + i);
		}
		
		// Ahora ponemos el doble de vida al último personaje de cada array
		duplicaVidaUltimoPersonajeEnArray(this.arrayHumanos);
		duplicaVidaUltimoPersonajeEnArray(this.arrayMalvados);
	}
	
	/**
	 * 
	 * @param array
	 */
	private void duplicaVidaUltimoPersonajeEnArray (Personaje array[]) {
		Personaje ultimoPersonaje = array[array.length - 1];
		ultimoPersonaje.setPuntosVida(ultimoPersonaje.getPuntosVida() * 2); // Duplico los puntos del último personaje
	}

	/**
	 * 
	 */
	public void desordenarPersonajes () {
		desordenarArray(this.arrayHumanos);
		desordenarArray(this.arrayMalvados);
	}
	
	/**
	 * 
	 * @param array
	 */
	private static void desordenarArray (Personaje array[]) {
		for (int i = 0; i < array.length; i++) {
			int primerIndice = utils.Utils.obtenerNumeroAzar(0, array.length - 1); // Creamos números al azar para
																						// intercambiar
			int ultimoIndice = utils.Utils.obtenerNumeroAzar(0, array.length - 1);

			Personaje intercambio = array[primerIndice]; // Mismo proceso del método anterior
			array[primerIndice] = array[ultimoIndice];
			array[ultimoIndice] = intercambio;
		}
	}
	
	

	
	public void cambiarEstadosAMuerto() {
		cambiarAMuertoPersonajesEnArray(arrayHumanos);
		cambiarAMuertoPersonajesEnArray(arrayMalvados);
	}
	
	/**
	 * Método para cambiar estado vivo/muerto
	 */

	private static void cambiarAMuertoPersonajesEnArray(Personaje array[]) {
		for (int i = 0; i < array.length; i++) { // Recorremos array para reestablecer estado
			if (array[i].getPuntosVida() <= 0) { // Si sus puntos de vida equivalen a 0 o menos, cambiamos
																// su estado a false
				array[i].setVivo(false);
			}
		}
	}

	/**
	 * 
	 */
	public void ordenarPorDisparo() {
		System.out.println("Estudiamos los humanos");
		ordenarPorDisparoEnArray(arrayHumanos);
		System.out.println("Estudiamos los malvados");
		ordenarPorDisparoEnArray(arrayMalvados);
	}
	
	/**
	 * Método para ordenar por burbuja por disparos recibidos
	 */

	private static void ordenarPorDisparoEnArray (Personaje array[]) {
		Personaje auxiliar;
		boolean intercambio = false;

		do {
			intercambio = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].getDisparosRecibidos() > array[i + 1].getDisparosRecibidos()) { // Comparamos
																												// disparos
					auxiliar = array[i + 1]; // Guardamos valor en auxiliar
					array[i + 1] = array[i]; // Realizamos intercambio
					array[i] = auxiliar;
					intercambio = true;

				}
			}
		} while (intercambio); // Saldremos del bucle cuando no haya intercambios

		// Mostramos en pantalla la primera y última posición del array ordenado por
		// burbuja, de esta forma mostraremos quién ha recibido más y menos disparos
		
		for (int i = 0; i < array.length; i++) {
			if (array[i].isVivo()==false) {
				System.out.println("El más fácil de matar ha sido " + array[i].toString());
				break;
			}
		//Cabe la posibilidad de que el que menos disparos haya recibido esté aún vivo, por eso,
		//volvemos a recorrer el bucle hasta que vivo sea false. Entonces mostramos valores en pantalla
		}
		
		//Recorremos array al revés para comprobar si el último sigue vivo y saltarlo porque, realmente no ha muerto
		//y por tanto no puede ser el más difícil de matar
		for (int i = array.length-1; i > 0; i--) {
			if (array[i].isVivo()==false) {
				System.out.println("El más difícil de matar ha sido " + array[i].toString());
				break;
			}
		
		}

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

	public Humano[] getArrayHumanos() {
		return arrayHumanos;
	}

	public void setArrayHumanos(Humano[] arrayHumanos) {
		this.arrayHumanos = arrayHumanos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
