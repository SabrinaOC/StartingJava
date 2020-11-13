package capitulo5.bloque05_metodos_y_arrays;

import javax.swing.JOptionPane;

/**
 * Ejercicio 2. Un método llamado "findAndReplace", que reciba: - Un array de
 * números enteros. - Un valor entero que debe buscarse en el array. - Un valor
 * entero que debe servir para reemplazar. El método buscará todas las ocasiones
 * en las que el segundo parámetro aparezca dentro del array y reemplazará ese
 * valor con el valor del tercer parámetro. El método main debe crear un array,
 * imprimirlo en consola, llamar al método "findAndReplace" y volver a imprimir
 * el array en consola.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_findAndReplace {
	
	/**
	 * Método principal
	 * @param args
	 */

	public static void main(String[] args) {

		int array [] = new int [] {10, 7, 9, 84, 7, 4, 7}; //Creamos array y le damos valores
		int numBuscado = 7; //Creamos variable para el valor que buscaremos en el array
		int numRemplazo = 5; 
		
		findAndReplace(array, numBuscado, numRemplazo); //Llamamos al método

	}

	/**
	 * Método remplazo valores en array
	 * @param array
	 * @param numBuscado
	 * @param numRemplazo
	 */
	
	public static void findAndReplace (int array[], int numBuscado, int numRemplazo) {
		
		String imprimir = ""; //Creamos string para finalmente mostrar valores
		
		for (int i = 0; i < array.length; i++) { //Recorremos array para buscar valor y remplazar
			if (array[i] == numBuscado) {
				array[i] = numRemplazo;
			}
			imprimir += array[i] + " "; //Vamos guardando valores en string
		}
		System.out.println(imprimir); //Imprimimos string
	}
	
}
