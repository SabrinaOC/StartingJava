package capitulo5.bloque05_metodos_y_arrays;

/**
 * Ejercicio 3. - Realiza un m�todo llamado "addInteger", que reciba: 
 * - Un array de n�meros enteros. 
 * - Un valor entero. 
 * Dentro del m�todo debes: 
 * 		- Crear un nuevo array, cuya longitud sea la del array recibido como primer par�metro + 1.
 * 		- Copiar el array del primer par�metro en el array creado dentro del m�todo, elemento tras elemento. 
 * 		- Agregar el nuevo elemento al final del nuevo array. 
 * 		- Asignar, al array recibido mediante el primer par�metro, el puntero al nuevo array creado en el interior del m�todo.
 * 		- El m�todo debe devolver un array de tipo entero. Main debe recoger el array devuelto e imprimirlo en consola.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_addInteger {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int array [] = new int [] {8, 5, 3, 10}; //Creamos array que enviaremos al m�todo addInteger
		int nuevoNum = 100; //Creamos variable para el nuevo valor que a�adiremos
		int arrayValorAdded [] = addInteger(array, nuevoNum); //creamos nuevo array y llamamos al m�todo addInteger
		
		for (int i = 0; i < arrayValorAdded.length; i++) { //Recorremos el nuevo array para mostrarlo en pantalla
			System.out.print(arrayValorAdded [i] + " ");
		}

	}

	/**
	 * M�todo para a�adir un valor determinado a un array dado
	 * @param array
	 * @param nuevoValor
	 * @return
	 */
	
	public static int [] addInteger (int array[], int nuevoValor) {
		int arrayLargo [] = new int [array.length+1]; //Creamos un nuevo array para a�adir el nuevo valor
		
		
		for (int i = 0; i < arrayLargo.length; i++) { //Recorremos el nuevo array asign�ndole los valores del array recibido
			if (i== arrayLargo.length-1) { //Si la posici�n de i es la �ltima del array, le asignamos el nuevo valor
			 arrayLargo[i] = nuevoValor;
			} else
			arrayLargo [i] = array[i];
			
		}
		return arrayLargo;	//Devolvemos nuevo array	
	}
}
