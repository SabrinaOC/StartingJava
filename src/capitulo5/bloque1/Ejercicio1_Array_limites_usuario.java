package capitulo5.bloque1;

import javax.swing.JOptionPane;

import Utils.UtilsArrays;

/**
 * Capítulo 5, Bloque 1, Ejercicio 1 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre un límite inferior y uno
 * superior que debe especificar el usuario. Debes mostrar el array en pantalla
 * para comprobar el funcionamiento
 * 
 * @author F541U
 *
 */

public class Ejercicio1_Array_limites_usuario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Creamos las variables que usaremos para determinar los límites
		int inf;
		int sup;

		String str = JOptionPane.showInputDialog("¿Desde qué número empezamos?"); // Pedimos número inferior al usuario
																					// y lo guardamos en la variable inf
		inf = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("¿Hasta qué número?"); // Pedimos número superior al usuario y lo guardamos en
																	// la variable sup
		sup = Integer.parseInt(str);

		// Llamamos al método de crear array con límites

		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, inf, sup);
		for (int i = 0; i < array.length; i++) { // Mostramos array en pantalla
			System.out.print(array[i] + " ");
		}

	}

}

