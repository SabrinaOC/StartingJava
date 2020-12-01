package capitulo5.optativo01;

import Utils.Utils;
import Utils.UtilsArrays;

/**
 * Realiza un programa que genere una apuesta aleatoria de la lotería primitiva.
 * Consiste en generar seis números y otro complementario entre 1 y 49 que no se
 * repitan. Ejemplo: Combinación: 2 14 20 37 39 41 complementario: 13. Utiliza
 * un array, en el ejemplo expuesto sería un array de 7 posiciones
 * correspondiendo la séptima posición al "complementario" de la loteria.
 * 
 * @author F541U
 *
 */

public class Ejercicio1_loteria_6num_1complementario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {


		int primitiva [] = new int [7]; //Creamos array para números
		boolean coincide = true;
		
		
		for (int i = 1; i < primitiva.length; i++) {
			primitiva[i] = Utils.obtenerNumeroAzar(0, 6);
			do {
			primitiva[i] = Utils.obtenerNumeroAzar(0, 6);
			if (i != 0) {
			for (int j = i-1; j >= 0; j--) {
				if (primitiva[j] == primitiva [i]) {
					primitiva [i] = Utils.obtenerNumeroAzar(0, 6);
				} else {
					coincide = false;
				}
			} 
			} 
		} while (coincide);
		} 
		
		UtilsArrays.mostrarArray(primitiva);

	}
  
}
