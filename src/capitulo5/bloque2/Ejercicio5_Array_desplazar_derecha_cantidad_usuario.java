package capitulo5.bloque2;

import javax.swing.JOptionPane;

import utils.UtilsArrays;

/**
 * Capítulo 5, Bloque 2, Ejercicio 5
 * 
 * Realiza un ejercicio en que inicialice un array de 5 elementos enteros al
 * azar entre 0 y 100. Debes conseguir que se desplacen los números hacia la
 * derecha la cantidad de veces que el usuario quiera
 * 
 * @author F541U
 *
 */

public class Ejercicio5_Array_desplazar_derecha_cantidad_usuario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int desplazamiento;
		int ultimo;

		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(5, 0, 100); // Creamos e iniciamos array números
																					// azar
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor de i en la posición " + i + " es " + array[i]);
		}

		String str = JOptionPane.showInputDialog("\n¿Cuántas posiciones a la derecha quieres desplazar?");
		desplazamiento = Integer.parseInt(str); // Guardamos el desplazamiento en una variable

		// Recorremos el array tantas veces cómo diga el usuario con un for
		for (int j = 0; j < desplazamiento; j++) {
			ultimo = array[4]; // Guardamos la última posición para volver a colocarla después
			for (int i = 3; i >= 0; i--) { // Recorremos el array reasignando valores
				array[i + 1] = array[i];

			}
			array[0] = ultimo;
		}

		System.out.println("");
		for (int i = 0; i < array.length; i++) { // Recorremos el array para imprimirlo con los nuevos valores
			System.out.println("El valor de i en la posición " + i + " es " + array[i]);
		}
	}

}
