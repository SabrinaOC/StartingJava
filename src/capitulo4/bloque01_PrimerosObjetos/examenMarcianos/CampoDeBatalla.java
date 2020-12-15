package capitulo4.bloque01_PrimerosObjetos.examenMarcianos;

import java.util.Arrays;

public class CampoDeBatalla {

	private Malvado arrayMalvados [] = new Malvado [20];
	private Humanos arrayHumanos [] = new Humanos [20];
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
		return "CampoDeBatalla [arrayMalvados=" + Arrays.toString(arrayMalvados) + "\narrayHumanos="
				+ Arrays.toString(arrayHumanos) + ", nombre=" + nombre + "]";
	}
	
	
	/**
	 * Getters y setters
	 */

	
	/**
	 * @return the arrayMalvados
	 */
	public Malvado[] getArrayMalvados() {
		return arrayMalvados;
	}


	/**
	 * @param arrayMalvados the arrayMalvados to set
	 */
	public void setArrayMalvados(Malvado[] arrayMalvados) {
		this.arrayMalvados = arrayMalvados;
	}


	/**
	 * @return the arrayHumanos
	 */
	public Humanos[] getArrayHumanos() {
		return arrayHumanos;
	}


	/**
	 * @param arrayHumanos the arrayHumanos to set
	 */
	public void setArrayHumanos(Humanos[] arrayHumanos) {
		this.arrayHumanos = arrayHumanos;
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
	 * Método para multiplicar vida último personaje
	 */
	
	public void vidaDobleUltimoPersonaje () {
		int auxVidaHum; //creamos variable para guardar vida último personaje
		
		auxVidaHum = arrayHumanos[arrayHumanos.length-1].getPuntosVida(); //Guardamos puntos vida último personaje
		arrayHumanos[arrayHumanos.length-1].setPuntosVida(auxVidaHum*2); //Duplicamos su valor
		
	}
	
	/**
	 * Método para desordenar array humanos
	 */
	
	public void desordenarHumanos () {
		int primerIndice; //Creamos índices para intercambios
		int ultimoIndice;
		Humanos intercambio;
		
		for (int i = 0; i < arrayHumanos.length; i++) {
			primerIndice = utils.Utils.obtenerNumeroAzar(0, arrayHumanos.length-1); //Creamos números al azar para intercambiar
			ultimoIndice = utils.Utils.obtenerNumeroAzar(0, arrayHumanos.length-1);
			
			intercambio = this.arrayHumanos[primerIndice]; //Guardamos uno de los valores en la variable auxiliar para no perderlo
			this.arrayHumanos[primerIndice] = this.arrayHumanos [ultimoIndice]; //Reasignamos valores
			this.arrayHumanos[ultimoIndice] = intercambio;
		}
	}

	/**
	 * Método para desordenar array marcianos
	 */
	
	public void desordenarMarcianos () {
		int primerIndice; //Creamos índices para intercambios
		int ultimoIndice;
		Malvado intercambio;
		
		for (int i = 0; i < arrayHumanos.length; i++) {
			primerIndice = utils.Utils.obtenerNumeroAzar(0, arrayMalvados.length-1); //Creamos números al azar para intercambiar
			ultimoIndice = utils.Utils.obtenerNumeroAzar(0, arrayMalvados.length-1);
			
			intercambio = this.arrayMalvados[primerIndice]; //Mismo proceso del método anterior
			this.arrayMalvados[primerIndice] = this.arrayMalvados [ultimoIndice];
			this.arrayMalvados[ultimoIndice] = intercambio;
		}
	}

	/**
	 * Método para cambiar estado vivo/muerto
	 */
	
	public void cambiarAMuerto () {
		for (int i = 0; i < arrayHumanos.length; i++) { //Recorremos array para reestablecer estado
			if (this.arrayHumanos [i].getPuntosVida()<=0) { //Si sus puntos de vida equivalen a 0 o menos, cambiamos su estado a false
				this.arrayHumanos[i].setVivo(false);
			}
			if (this.arrayMalvados[i].getPuntosVida() <= 0) {//Hacemos lo mismo con los malvados
				this.arrayMalvados[i].setVivo(false);
			}
		}
	}
	
	public void humanAlive () {
		for (int i = 0; i < arrayHumanos.length; i++) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
