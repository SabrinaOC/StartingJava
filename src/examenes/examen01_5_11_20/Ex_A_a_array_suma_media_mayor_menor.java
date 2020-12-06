package examenes.examen01_5_11_20;

import utils.UtilsArrays;

/**
 * Examen A, ejercicio a. Crea una clase con un m�todo �main� que cree un array
 * con 100 elementos de longitud, los elementos deben ser n�meros enteros al
 * azar comprendidos entre 0 y 1000. Muestra el array en pantalla. Calcula la
 * suma de todos los elementos, la media, el m�ximo y el m�nimo.
 * 
 * @author F541U
 *
 */
public class Ex_A_a_array_suma_media_mayor_menor {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int suma = 0; //Creo variable para guardar la suma de los valores
		// Creamos e iniciamos array de las caracter�sticas indicadas
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(100, 0, 1000);

		// Recorremos el array para mostrarlo en pantalla
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			System.out.print(array[i] + " ");
		}

		// Mostramos en pantalla la suma y la media

		System.out.println("\nLa suma de los valores del array es: " + suma
				+ "\nLa media de los valores del array es : " + suma / array.length);

		// Utilizamos m�todo para averiguar mayor y menor
		UtilsArrays.MayorYMenorArray(array);

	}

}
