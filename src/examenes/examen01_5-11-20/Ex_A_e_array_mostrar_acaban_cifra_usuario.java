package examen01_5-11-20;

import javax.swing.JOptionPane;

import Utils.Utils;

/**
 * Examen A, ejercicio e. Crea una clase con un método “main” que cree un array
 * de 100 elementos enteros creados al azar. Debes mostrar el array. A
 * continuación debes detectar, y sacar en pantalla, todos los números que
 * acaben en un valor de una sola cifra que debes pedir al usuario.
 * 
 * @author F541U
 *
 */

public class Ex_A_e_array_mostrar_acaban_cifra_usuario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int num;

		String str = JOptionPane.showInputDialog("¿Qué número buscamos?"); //Pedimos número al usuario
		num = Integer.parseInt(str);

		// Creamos array de números aleatorios
		int array[] = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar();

			System.out.print(array[i] + " ");

			if (array[i] % 10 == num) {
				System.out.print("\n" + array[i] + " ");
			}
		}

	}

}
