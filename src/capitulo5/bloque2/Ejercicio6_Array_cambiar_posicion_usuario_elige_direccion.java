package capitulo5.bloque2;

import javax.swing.JOptionPane;

import utils.UtilsArrays;

/**
 * Capítulo 5, Bloque 2, Ejercicio 6 Realiza un ejercicio en que inicialice un
 * array de 5 elementos enteros al azar entre 0 y 100. Debes conseguir que se
 * desplacen los números la cantidad de veces que el usuario quiera y en la
 * dirección que este indique
 * 
 * @author F541U
 *
 */

public class Ejercicio6_Array_cambiar_posicion_usuario_elige_direccion {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int desplazamiento;
		int ultimo;
		int direccion;

		// Creamos e iniciamos array números azar
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(5, 0, 100);
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor de i en la posición " + i + " es " + array[i]);
		}

		String str = JOptionPane.showInputDialog("\n¿Cuántas posiciones quieres desplazar?");
		desplazamiento = Integer.parseInt(str); // Guardamos el desplazamiento en una variable

		System.out.println("\n¿En qué dirección?" + "\n1 - Derecha" + "\n2 - Izquierda");
		str = JOptionPane.showInputDialog("Elige una opción");
		direccion = Integer.parseInt(str);

		switch (direccion) {

		case 1:

			// Recorremos el array tantas veces cómo diga el usuario con un for
			for (int j = 0; j < desplazamiento; j++) {
				ultimo = array[4]; // Guardamos la última posición para volver a colocarla después
				for (int i = 3; i >= 0; i--) { // Recorremos el array reasignando valores
					array[i + 1] = array[i];

				}
				array[0] = ultimo;
			}

			break;
		case 2:
			/*
			 * Como solo podemos hacer cambios hacia delante hacemos un for contando las
			 * posiciones que tiene que moverse hacia la derecha para que coincida con el
			 * movimiento a la izquierda pedido por el ususario
			 */
			for (int j = 0; j < array.length - desplazamiento; j++) {
				ultimo = array[4]; // Guardamos la última posición para volver a colocarla después
				for (int i = 3; i >= 0; i--) { // Recorremos el array reasignando valores
					array[i + 1] = array[i];

				}
				array[0] = ultimo;
			}

		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) { // Recorremos el array para imprimirlo con los nuevos valores
			System.out.println("El valor de i en la posición " + i + " es " + array[i]);
		}

	}

}
