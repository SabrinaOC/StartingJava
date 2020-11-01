package capitulo5.bloque1;

import javax.swing.JOptionPane;

import Utils.UtilsArrays;

/**
 * Capítulo 5, Bloque 1, Ejercicio 3 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre 0 y 100. A continuación pedirás
 * al usuario un valor y buscarás dicho valor en el array. Si lo encuentras,
 * debes indicar al usuario la posición del array en que se encuenta. En caso de
 * que no encuentres el valor buscado, debes indicárselo también al usuario.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_Array_aleatorio_buscar_valor {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num;
		boolean encontrado = false;

		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100); // Creamos e iniciamos el array
																						// que se ha pedido

		String str = JOptionPane.showInputDialog("Elige un número entre 0 y 100"); // Pedimos al usuario el número que
																					// vamos a buscar
		num = Integer.parseInt(str);

		for (int i = 0; i < array.length; i++) { // Recorremos el array para buscar el número

			if (num == array[i]) { // Si se encunetra, se mostrará en pantalla su posición y "encontrado" pasará a
									// ser true.
				System.out.println("El número " + num + " se encuentra en la posición " + i +".");
				encontrado = true;

			}
		}
		if (encontrado == false) { // Si se encuentra el número "encontrado" sería true y esta parte no se
									// mostraría en pantalla
			System.out.println("No se ha encontrado el número en ninguna posición.");
		}

	}

}
