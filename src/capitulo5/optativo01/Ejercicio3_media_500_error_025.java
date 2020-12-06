package capitulo5.optativo01;

import utils.Utils;

/**
 * Realizar un programa que genere n�meros aleatorios entre 1 y 1000 hasta que
 * el valor medio de los n�meros generados se aproxime a 500 con un margen de
 * error de 0,5. El programa deber� decir cuantos n�meros aleatorios han sido
 * generados cuando finalice.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_media_500_error_025 {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int cont = 0; // contador para llevar cuenta de n�meros creados
		int suma = 0; // variable para ir sumando valores
		float media = 0;

		do {
			int numAzar = Utils.obtenerNumeroAzar(1, 1000); // Creamos n�mero al azar

			cont++; // Sumamos 1 a contador
			suma += numAzar;

			media = suma / cont;

		} while (!(media >= 500 - 0.5 && media <= 500 + 0.5)); // Bucle hasta que suma est� entre los valores indicados
																// de 499.5 a 500.5

		System.out.println("Se han generado " + cont + " n�meros." + "\nLa suma de todos ellos es: " + suma + "."
				+ "\nY la media es " + media + ".");
	}

}
