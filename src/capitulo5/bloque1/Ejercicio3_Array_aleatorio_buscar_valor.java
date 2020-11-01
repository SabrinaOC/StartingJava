package capitulo5.bloque1;

import javax.swing.JOptionPane;

import Utils.UtilsArrays;

/**
 * Cap�tulo 5, Bloque 1, Ejercicio 3 Realiza un ejercicio que inicialice un
 * array de 150 elementos enteros al azar entre 0 y 100. A continuaci�n pedir�s
 * al usuario un valor y buscar�s dicho valor en el array. Si lo encuentras,
 * debes indicar al usuario la posici�n del array en que se encuenta. En caso de
 * que no encuentres el valor buscado, debes indic�rselo tambi�n al usuario.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_Array_aleatorio_buscar_valor {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num;
		boolean encontrado = false;

		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100); // Creamos e iniciamos el array
																						// que se ha pedido

		String str = JOptionPane.showInputDialog("Elige un n�mero entre 0 y 100"); // Pedimos al usuario el n�mero que
																					// vamos a buscar
		num = Integer.parseInt(str);

		for (int i = 0; i < array.length; i++) { // Recorremos el array para buscar el n�mero

			if (num == array[i]) { // Si se encunetra, se mostrar� en pantalla su posici�n y "encontrado" pasar� a
									// ser true.
				System.out.println("El n�mero " + num + " se encuentra en la posici�n " + i +".");
				encontrado = true;

			}
		}
		if (encontrado == false) { // Si se encuentra el n�mero "encontrado" ser�a true y esta parte no se
									// mostrar�a en pantalla
			System.out.println("No se ha encontrado el n�mero en ninguna posici�n.");
		}

	}

}
