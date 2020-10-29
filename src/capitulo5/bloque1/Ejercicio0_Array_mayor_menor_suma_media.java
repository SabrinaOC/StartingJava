package capitulo5.bloque1;


import Utils.UtilsArrays;


/** Capítulo 5, Bloque 1, Ejercicio 0
 *  Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 *  Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos los números que aparecen en el array. 
 */

public class Ejercicio0_Array_mayor_menor_suma_media{

	/** Método principal
	 * 
	 * @param args
	 */
	 

	public static void main(String[] args) {

		int suma = 0;
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(10, 0, 100);
		
		//Recorro el array para mostrarlo y sumar
		for (int i = 0; i < array.length; i++) {
			suma += array[i];
			System.out.print(array[i] + " ");
		}
		
		//Muestro la suma y la media
		System.out.println("\nLa suma de los valores de i es " + suma
				+"\nLa media de los valores es " +(suma/(float)array.length));
		
		//Utilizo el método creado para mostrar mayores y menores de un array
		UtilsArrays.MayorYMenorArray(array);
		
		
	}

}
