package capitulo5.bloque4;

import utils.Utils;

/**
 * Capítulo 5, bloque 4, ejercicio 3 Crea un array de 20 números decimales
 * creados al azar entre 0 y 100. Para crear el número decimal debes generar al
 * azar la parte entera y la parte decimal por separado para después unir las
 * dos partes. A continuación debes examinar la cantidad de números cuya parte
 * decimal está comprendida entre .00 y .49
 * 
 * @author F541U
 *
 */

public class Ejercicio3_Array_20_unidades_decimales_por_separado {

	public static void main(String[] args) {
		int enteros[] = new int[20]; // Creamos array de números enteros
		float decimales[] = new float[enteros.length]; // Creamos array de números decimales
		float arrayCompleto[] = new float[enteros.length]; // Creamos un tercer array float para poder sumar enteros y
															// decimales

		for (int i = 0; i < enteros.length; i++) { // Recorremos un array para ir asignando valores
			enteros[i] = Utils.obtenerNumeroAzar(0, 100); // Asignamos números aleatrios enteros en el array de enteros
			decimales[i] = (float) (Math.random() * 1.00); // Asignamos decimales en array float
			
			/*System.out.print("\nUnidades " + enteros[i] //Mostramos en pantalla los valores para comprobar si el tercer array es correcto
					+"\n Decimales " + decimales[i]); */
			arrayCompleto[i] = enteros[i] + decimales[i]; // Asignamos valores al tercer array
			System.out.print(arrayCompleto[i] + " "); // Mostramos array en pantalla
		}

	}

}
