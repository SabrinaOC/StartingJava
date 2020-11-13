package capitulo5.bloque05_metodos_y_arrays;

/**
 * Ejercicio 1. Un m�todo llamado "stringFromArray", que reciba un array de
 * n�meros enteros y devuelva una cadena de caracteres. El m�todo debe recorrer
 * el array, de la misma forma en la que har�as para mostrarlo en consola, pero
 * en lugar de imprimir en consola debes construir un objeto String. Finalmente
 * debes devolver el String e imprimirlo en el m�todo "main".
 * 
 * @author F541U
 *
 */

public class Ejercicio1_StringFromArray {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int array[] = new int[] { 5, 8, 9, 7, 41, 77 }; // Creamos array y damos valores

		System.out.println(stringFromArray(array)); // Llamamos al m�todo y mostramos en pantalla

	}

	/**
	 * M�todo para mostrar array en pantalla guard�ndolo en string
	 * @param array
	 * @return
	 */
	
	public static String stringFromArray(int array[]) {

		String str = ""; // Creamos variable string

		for (int i = 0; i < array.length; i++) { // Recorremos array y guardamos valores en string
			str += array[i] + " ";
		}

		return str; // Devolvemos string
	}
}
