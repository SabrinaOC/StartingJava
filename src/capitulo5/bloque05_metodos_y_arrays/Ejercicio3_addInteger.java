package capitulo5.bloque05_metodos_y_arrays;

/**
 * Ejercicio 3. - Realiza un método llamado "addInteger", que reciba: 
 * - Un array de números enteros. 
 * - Un valor entero. 
 * Dentro del método debes: 
 * 		- Crear un nuevo array, cuya longitud sea la del array recibido como primer parámetro + 1.
 * 		- Copiar el array del primer parámetro en el array creado dentro del método, elemento tras elemento. 
 * 		- Agregar el nuevo elemento al final del nuevo array. 
 * 		- Asignar, al array recibido mediante el primer parámetro, el puntero al nuevo array creado en el interior del método.
 * 		- El método debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_addInteger {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int array [] = new int [] {8, 5, 3, 10}; //Creamos array que enviaremos al método addInteger
		int nuevoNum = 100; //Creamos variable para el nuevo valor que añadiremos
		int arrayValorAdded [] = addInteger(array, nuevoNum); //creamos nuevo array y llamamos al método addInteger
		
		for (int i = 0; i < arrayValorAdded.length; i++) { //Recorremos el nuevo array para mostrarlo en pantalla
			System.out.print(arrayValorAdded [i] + " ");
		}

	}

	/**
	 * Método para añadir un valor determinado a un array dado
	 * @param array
	 * @param nuevoValor
	 * @return
	 */
	
	public static int [] addInteger (int array[], int nuevoValor) {
		int arrayLargo [] = new int [array.length+1]; //Creamos un nuevo array para añadir el nuevo valor
		
		
		for (int i = 0; i < arrayLargo.length; i++) { //Recorremos el nuevo array asignándole los valores del array recibido
			if (i== arrayLargo.length-1) { //Si la posición de i es la última del array, le asignamos el nuevo valor
			 arrayLargo[i] = nuevoValor;
			} else
			arrayLargo [i] = array[i];
			
		}
		return arrayLargo;	//Devolvemos nuevo array	
	}
}
