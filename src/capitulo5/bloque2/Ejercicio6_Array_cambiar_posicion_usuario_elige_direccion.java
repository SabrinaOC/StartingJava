package capitulo5.bloque2;

import javax.swing.JOptionPane;

import utils.UtilsArrays;

/**
 * Cap�tulo 5, Bloque 2, Ejercicio 6 Realiza un ejercicio en que inicialice un
 * array de 5 elementos enteros al azar entre 0 y 100. Debes conseguir que se
 * desplacen los n�meros la cantidad de veces que el usuario quiera y en la
 * direcci�n que este indique
 * 
 * @author F541U
 *
 */

public class Ejercicio6_Array_cambiar_posicion_usuario_elige_direccion {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int desplazamiento;
		int ultimo;
		int direccion;

		// Creamos e iniciamos array n�meros azar
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(5, 0, 100);
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor de i en la posici�n " + i + " es " + array[i]);
		}

		String str = JOptionPane.showInputDialog("\n�Cu�ntas posiciones quieres desplazar?");
		desplazamiento = Integer.parseInt(str); // Guardamos el desplazamiento en una variable

		System.out.println("\n�En qu� direcci�n?" + "\n1 - Derecha" + "\n2 - Izquierda");
		str = JOptionPane.showInputDialog("Elige una opci�n");
		direccion = Integer.parseInt(str);

		switch (direccion) {

		case 1:

			// Recorremos el array tantas veces c�mo diga el usuario con un for
			for (int j = 0; j < desplazamiento; j++) {
				ultimo = array[4]; // Guardamos la �ltima posici�n para volver a colocarla despu�s
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
				ultimo = array[4]; // Guardamos la �ltima posici�n para volver a colocarla despu�s
				for (int i = 3; i >= 0; i--) { // Recorremos el array reasignando valores
					array[i + 1] = array[i];

				}
				array[0] = ultimo;
			}

		}
		System.out.println("");
		for (int i = 0; i < array.length; i++) { // Recorremos el array para imprimirlo con los nuevos valores
			System.out.println("El valor de i en la posici�n " + i + " es " + array[i]);
		}

	}

}
