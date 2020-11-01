package capitulo5.bloque1;

import javax.swing.JOptionPane;

import Utils.UtilsArrays;

/**
 * Cap�tulo 5, Bloque 1, Ejercicio 1 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre un l�mite inferior y uno
 * superior que debe especificar el usuario. Debes mostrar el array en pantalla
 * para comprobar el funcionamiento
 * 
 * @author F541U
 *
 */

public class Ejercicio1_Array_limites_usuario {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Creamos las variables que usaremos para determinar los l�mites
		int inf;
		int sup;

		String str = JOptionPane.showInputDialog("�Desde qu� n�mero empezamos?"); // Pedimos n�mero inferior al usuario
																					// y lo guardamos en la variable inf
		inf = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("�Hasta qu� n�mero?"); // Pedimos n�mero superior al usuario y lo guardamos en
																	// la variable sup
		sup = Integer.parseInt(str);

		// Llamamos al m�todo de crear array con l�mites

		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, inf, sup);
		for (int i = 0; i < array.length; i++) { // Mostramos array en pantalla
			System.out.print(array[i] + " ");
		}

	}

}

