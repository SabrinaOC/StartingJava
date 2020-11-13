package capitulo5.bloque05_metodos_y_arrays;

/**
 * Ejercicio 5. - Realiza un m�todo llamado "removeInteger", que reciba: 
 * - Un  * array de n�meros enteros. 
 * - Un valor entero. Si el valor entero recibido como segundo par�metro existe dentro del array recibido como primer par�metro,
 * debes conseguir que ese valor desaparezca del array. Puedes seguir la siguiente gu�a: 
 * 		- Utiliza el m�todo del ejercicio 4 para saber cu�ntas veces aparece el valor entero 
 * 		(segundo par�metro) dentro del array (primer par�metro). 
 * 		- Crea un nuevo array, que tenga la dimensi�n del array recibido como primer par�metro 
 * 		menos la cantidad de veces que el valor entero del segundo par�metro aparezca en dicho array. 
 * 		- Copia todos los elementos del array recibido como primer par�metro, dentro del nuevo array
 * 		creado por ti en el m�todo. L�gicamente no debes copiar en el array los valores del primer
 * 		array que coincidan con el valor introducido como segundo par�metro. 
 * 		- "Sustituye" el puntero del array recibido como primer par�metro, para que
 * 		apunte al nuevo array creado por ti en el interior del m�todo. El m�todo debe
 *		devolver "void", pero el array (puntero) recibido como primer par�metro debe
 * 		haber cambiado para reflejar que ahora no existan los valores recibidos como
 * 		segundo par�metro.
 * 
 * @author F541U
 *
 */

public class Ejercicio5_removeInteger {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int array[] = new int[] { 12, 3, 7, 9, 3, 10, 8, 100, 3, 200 }; // Creamos y damos valores al array que
																		// pasaremos al m�todo removeInteger
		
		int numBuscado = 3; // Creamos variable para el n�mero que buscaremos en el array

		int arrayMod[] = removeInteger(array, numBuscado); // Recogemos el array devuelto por el m�todo en un nuevo
															// array
		for (int i = 0; i < arrayMod.length; i++) { // Recorremos arrayMod y mostramos valores en pantalla
			System.out.print(arrayMod[i] + " ");
		}

	}

	/**
	 * M�todo para devolver un array eliminando un valor determinado que aparece en
	 * este
	 * 
	 * @param arrayOriginal
	 * @param numBuscado
	 * @return
	 */

	public static int[] removeInteger(int arrayOriginal[], int numBuscado) {
		int contador = 0; // Creamos variable para contar la cantidad de veces que aparece el n�mero dado
							// en el array

		for (int i = 0; i < arrayOriginal.length; i++) { // Recorremos array para ver cantidad de ocurrencias
			if (arrayOriginal[i] == numBuscado) {
				contador++;
			}
		}
		int arrayMod[] = new int[arrayOriginal.length - contador]; // Creamos nuevo array
		int j = 0; // Creamos j para recorrer el arrayMod con un �ndice distinto que nos permita
					// evitar el numBuscado
		for (int i = 0; i < arrayOriginal.length; i++) { // Recorremos arrayOriginal para ir otorgando valores a
															// arrayMod
			if (arrayOriginal[i] == numBuscado) { // Si el valor de ese �ndice coincide con el numBuscado, j mantiene su
													// valor pero i suma 1

			} else {
				arrayMod[j] = arrayOriginal[i]; // Si el valor de i no coincide con numBuscado, otorgamos valor a
												// arrayMod en posici�n j y sumamos 1 a j.
				j++;
			}

		}

		return arrayMod; // Devolvemos array modificado

	}

}
