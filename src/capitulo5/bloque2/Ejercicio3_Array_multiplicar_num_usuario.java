package capitulo5.bloque2;

import javax.swing.JOptionPane;

import Utils.UtilsArrays;

/** Cap�tulo 5, Bloque 2, Ejercicio 3
 * Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100. 
 * Debes conseguir multiplicar cada uno de los elementos del array por un n�mero determinado, pedido al usuario.
 * 
 * @author F541U
 *
 */

public class Ejercicio3_Array_multiplicar_num_usuario {

	/** M�todo principal
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		int num;
		
		//Creamos e iniciamos el array con el m�todo
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(150, 0, 100);
		
		//Pedimos n�mero al usuario
		String str = JOptionPane.showInputDialog("Dame un n�mero");
		num = Integer.parseInt(str);
		
		//Recorremos el array para realizar las multiplicaciones y las mostramos en pantalla
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor de i " + array[i] + " x " + num + " = " + (array[i]*num)); 
			
		}

	}

}
