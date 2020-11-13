package capitulo5.bloque05_metodos_y_arrays;

/**
 * Ejercicio 4. - Realiza un método llamado "countOccurrences", que reciba: 
 * - Un array de números enteros. 
 * - Un valor entero. 
 * El método debe devolver un valor entero, que corresponda con el número 
 * de veces que el valor entero recibido como segundo parámetro exista 
 * dentro del array recibido como primer parámetro.
 * 
 * @author F541U
 *
 */

public class Ejercicio4_countOccurrences {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array[] = new int[] { 87, 36, 5, 87, 11, 13, 87 }; // Creamos array de números enteros
		int numBuscado = 87; // Creamos variable del número que buscamos y que pasaremos al método

		System.out.print("El número " + numBuscado + " se ha encontrado " + countOccurrences(array, numBuscado) 
				+ " veces en el array."); //Mostramos el resultado del étodo en pantalla

	}

	/**
	 * Método para contar ocurrencias de un número en un array dado
	 * 
	 * @param array
	 * @param numBuscado
	 * @return
	 */

	public static int countOccurrences(int array[], int numBuscado) {
		int contador = 0; // Creamos variable para contar las veces que aparece el número en el array

		for (int i = 0; i < array.length; i++) { // Recorremos el array para buscar el número
			if (array[i] == numBuscado) { // Si el número se encuentra en la posición de i, sumamos uno a nuestro
											// contador
				contador++;
			}
		}
		return contador; // Devolvemos el número de ocurrencias
	}
}
