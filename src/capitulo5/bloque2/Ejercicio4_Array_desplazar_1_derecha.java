package capitulo5.bloque2;

import utils.UtilsArrays;

/**
 * Cap�tulo 5, Bloque 2, Ejercicio 4
 * 
 * Realiza un ejercicio en que inicialice un array de 5 elementos enteros al
 * azar entre 0 y 100. Debes conseguir que se desplacen los n�meros un lugar a
 * su derecha, de manera que el desplazamiento sea circular, si un n�mero sale
 * por la derecha volver� a entrar por la izquierda. Ejemplo: 1 2 3 4 5 pasa a
 * ser 5 1 2 3 4 que pasa a ser 4 5 1 2 3.
 * 
 * @author F541U
 *
 */

public class Ejercicio4_Array_desplazar_1_derecha {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Iniciamos el array de n�meros aleatorios
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(5, 0, 100);
		for (int i = 0; i < array.length; i++) { // Iniciamos array para ver posiciones iniciales
			System.out.println("Posici�n " + i + " " + array[i]);
		}

		System.out.println(" ");
		int ultimo = array[4]; // Guardamos el �ltimo elemento en una nueva variable para colocarlo depu�s como
								// primero y no perderlo

		for (int i = 3; i >= 0; i--) { // Recorremos el array reasignando valores
			array[i + 1] = array[i];

		}

		array[0] = ultimo;// Ponemos el �ltimo como primero

		System.out.println(" ");
		for (int i = 0; i < array.length; i++) { // Iniciamos array para ver posiciones finales

			System.out.println("Posici�n " + i + " " + array[i]);
		}

	}

}
