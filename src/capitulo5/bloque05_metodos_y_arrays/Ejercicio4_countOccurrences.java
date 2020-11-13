package capitulo5.bloque05_metodos_y_arrays;

/**
 * Ejercicio 4. - Realiza un m�todo llamado "countOccurrences", que reciba: 
 * - Un array de n�meros enteros. 
 * - Un valor entero. 
 * El m�todo debe devolver un valor entero, que corresponda con el n�mero 
 * de veces que el valor entero recibido como segundo par�metro exista 
 * dentro del array recibido como primer par�metro.
 * 
 * @author F541U
 *
 */

public class Ejercicio4_countOccurrences {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array[] = new int[] { 87, 36, 5, 87, 11, 13, 87 }; // Creamos array de n�meros enteros
		int numBuscado = 87; // Creamos variable del n�mero que buscamos y que pasaremos al m�todo

		System.out.print("El n�mero " + numBuscado + " se ha encontrado " + countOccurrences(array, numBuscado) 
				+ " veces en el array."); //Mostramos el resultado del �todo en pantalla

	}

	/**
	 * M�todo para contar ocurrencias de un n�mero en un array dado
	 * 
	 * @param array
	 * @param numBuscado
	 * @return
	 */

	public static int countOccurrences(int array[], int numBuscado) {
		int contador = 0; // Creamos variable para contar las veces que aparece el n�mero en el array

		for (int i = 0; i < array.length; i++) { // Recorremos el array para buscar el n�mero
			if (array[i] == numBuscado) { // Si el n�mero se encuentra en la posici�n de i, sumamos uno a nuestro
											// contador
				contador++;
			}
		}
		return contador; // Devolvemos el n�mero de ocurrencias
	}
}
