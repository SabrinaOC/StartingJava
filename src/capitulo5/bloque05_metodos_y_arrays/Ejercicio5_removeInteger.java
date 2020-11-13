package capitulo5.bloque05_metodos_y_arrays;

/**
 * Ejercicio 5. - Realiza un método llamado "removeInteger", que reciba: 
 * - Un  * array de números enteros. 
 * - Un valor entero. Si el valor entero recibido como segundo parámetro existe dentro del array recibido como primer parámetro,
 * debes conseguir que ese valor desaparezca del array. Puedes seguir la siguiente guía: 
 * 		- Utiliza el método del ejercicio 4 para saber cuántas veces aparece el valor entero 
 * 		(segundo parámetro) dentro del array (primer parámetro). 
 * 		- Crea un nuevo array, que tenga la dimensión del array recibido como primer parámetro 
 * 		menos la cantidad de veces que el valor entero del segundo parámetro aparezca en dicho array. 
 * 		- Copia todos los elementos del array recibido como primer parámetro, dentro del nuevo array
 * 		creado por ti en el método. Lógicamente no debes copiar en el array los valores del primer
 * 		array que coincidan con el valor introducido como segundo parámetro. 
 * 		- "Sustituye" el puntero del array recibido como primer parámetro, para que
 * 		apunte al nuevo array creado por ti en el interior del método. El método debe
 *		devolver "void", pero el array (puntero) recibido como primer parámetro debe
 * 		haber cambiado para reflejar que ahora no existan los valores recibidos como
 * 		segundo parámetro.
 * 
 * @author F541U
 *
 */

public class Ejercicio5_removeInteger {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array[] = new int[] { 12, 3, 7, 9, 3, 10, 8, 100, 3, 200 }; // Creamos y damos valores al array que
																		// pasaremos al método removeInteger
		
		int numBuscado = 3; // Creamos variable para el número que buscaremos en el array

		int arrayMod[] = removeInteger(array, numBuscado); // Recogemos el array devuelto por el método en un nuevo
															// array
		for (int i = 0; i < arrayMod.length; i++) { // Recorremos arrayMod y mostramos valores en pantalla
			System.out.print(arrayMod[i] + " ");
		}

	}

	/**
	 * Método para devolver un array eliminando un valor determinado que aparece en
	 * este
	 * 
	 * @param arrayOriginal
	 * @param numBuscado
	 * @return
	 */

	public static int[] removeInteger(int arrayOriginal[], int numBuscado) {
		int contador = 0; // Creamos variable para contar la cantidad de veces que aparece el número dado
							// en el array

		for (int i = 0; i < arrayOriginal.length; i++) { // Recorremos array para ver cantidad de ocurrencias
			if (arrayOriginal[i] == numBuscado) {
				contador++;
			}
		}
		int arrayMod[] = new int[arrayOriginal.length - contador]; // Creamos nuevo array
		int j = 0; // Creamos j para recorrer el arrayMod con un índice distinto que nos permita
					// evitar el numBuscado
		for (int i = 0; i < arrayOriginal.length; i++) { // Recorremos arrayOriginal para ir otorgando valores a
															// arrayMod
			if (arrayOriginal[i] == numBuscado) { // Si el valor de ese índice coincide con el numBuscado, j mantiene su
													// valor pero i suma 1

			} else {
				arrayMod[j] = arrayOriginal[i]; // Si el valor de i no coincide con numBuscado, otorgamos valor a
												// arrayMod en posición j y sumamos 1 a j.
				j++;
			}

		}

		return arrayMod; // Devolvemos array modificado

	}

}
