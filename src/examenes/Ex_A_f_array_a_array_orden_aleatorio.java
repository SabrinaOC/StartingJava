package examenes;

import Utils.Utils;
import Utils.UtilsArrays;

/**
 * Examen A, ejercicio f Crea una clase con un método “main” que cree un array
 * de 5 posiciones con números generados al azar entre 0 y 100. Muestra el
 * array. Crea un nuevo array de 5 posiciones en el que copies los números del
 * primer array en posiciones aleatorias del segundo array.
 * 
 * @author F541U
 *
 */

public class Ex_A_f_array_a_array_orden_aleatorio {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num; // Creo variable para guardar el número de posición
		// Creo e inicio array 1
		int array1[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(5, 0, 10);

		// Recorro array para mostrarlo en pantalla
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}

		// Creo y recorro el array 2 otorgando valor 0 para luego cambiarlos por los
		// valores del array1
		int array2[] = new int[5];

		for (int i = 0; i < array2.length; i++) {
			array2[i] = -1;
		}
		// Recorro el array 1 para elegir la posición que ocupará en el array 2
		for (int i = 0; i < array1.length; i++) {
			
			
			do {
			num = Utils.obtenerNumeroAzar(0, 4); // Creo números al azar entre para las posiciones del array
			
			array2[num] = array1[i];
			
			
			} while (array2[num] != -1);

		}		

		for (int i = 0; i < array2.length; i++) { // Recorremos el array 2 para mostrar valores en pantalla
			System.out.print("\n" + array2[i] + " ");
		}

	  
	}
}
