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
	 * Método para duplicar vida último humano
	 */

	public void vidaDobleUltimoHumano() {
		// Duplicamos su valor
		arrayHumanos[arrayHumanos.length - 1].setPuntosVida(arrayHumanos[arrayHumanos.length - 1].getPuntosVida() * 2); 

	}

	/**
	 * Método para multiplicar vida último marciano
	 */

	public void vidaDobleUltimoMarciano() {
		// Duplicamos su valor
		arrayMalvados[arrayMalvados.length - 1].setPuntosVida(arrayMalvados[arrayMalvados.length - 1].getPuntosVida() * 2); 

	}
	
	/**
	 * Método para iniciar personajes y dar pts de vida
	 */
	
	public void iniciarYPonerVidaAUltimo () {
		for (int i = 0; i < arrayHumanos.length; i++) { // Recorremos array humanos para crear humanos
			arrayHumanos[i] = new Humanos("Humano" + i); // Creamos humano

			if (arrayHumanos[i] == arrayHumanos[arrayHumanos.length-1]) { // Duplicamos vida en última posición
				vidaDobleUltimoHumano();
			}

			arrayMalvados[i] = new Malvado("Marciano" + i);
			if (arrayMalvados[i] == arrayMalvados[arrayMalvados.length-1]) { // Duplicamos vida en última posición
				vidaDobleUltimoMarciano();
			}
		}
	}
	
	/**
	 * Método para desordenar array humanos
	 */

	public void desordenarHumanos() {
		int primerIndice; // Creamos índices para intercambios
		int ultimoIndice;
		Humanos intercambio; //Variable auxiliar de tipo humano

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
		// burbuja, de esta forma mostraremos quién ha recibido más y menos disparos
		
		for (int i = 0; i < arrayHumanos.length; i++) {
			if (this.arrayHumanos[i].isVivo()==false) {
				System.out.println("El humano más fácil de matar ha sido " + this.arrayHumanos[i].toString());
				break;
			}
		//Cabe la posibilidad de que el que menos disparos haya recibido esté aún vivo, por eso,
		//volvemos a recorrer el bucle hasta que vivo sea false. Entonces mostramos valores en pantalla
		}
		
		//Recorremos array al revés para comprobar si el último sigue vivo y saltarlo porque, realmente no ha muerto
		//y por tanto no puede ser el más difícil de matar
		for (int i = arrayHumanos.length-1; i > 0; i--) {
			if (this.arrayHumanos[i].isVivo()==false) {
				System.out.println("El humano más difícil de matar ha sido " + this.arrayHumanos[i].toString());
				break;
			}
		
		}

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
		
		for (int i = 0; i < arrayMalvados.length; i++) {
			if (this.arrayMalvados[i].isVivo()==false) {
				System.out.println("El marciano más fácil de matar ha sido " + this.arrayMalvados[i].toString());
				break;
			}
		//Cabe la posibilidad de que el que menos disparos haya recibido esté aún vivo, por eso,
		//volvemos a recorrer el bucle hasta que vivo sea false. Entonces mostramos valores en pantalla
		}
		
		//Recorremos array al revés para comprobar si el último sigue vivo y saltarlo porque, realmente no ha muerto
		//y por tanto no puede ser el más difícil de matar
		for (int i = arrayMalvados.length-1; i > 0; i--) {
			if (this.arrayMalvados[i].isVivo()==false) {
				System.out.println("El malvado más difícil de matar ha sido " + this.arrayMalvados[i].toString());
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
