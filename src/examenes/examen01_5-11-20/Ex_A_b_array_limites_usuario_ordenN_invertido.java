package examen01_5-11-20;

import javax.swing.JOptionPane;

import Utils.UtilsArrays;

/**
 * Examen A, ejercicio b. Crea una clase con un método “main” que cree un array
 * con 100 elementos de longitud, los elementos deben ser números enteros al
 * azar comprendidos entre dos límites, que deben ser preguntados al usuario.
 * Muestra el array en orden normal y también en orden invertido.
 * 
 * 
 * @author F541U
 *
 */

public class Ex_A_b_array_limites_usuario_ordenN_invertido {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// creo variables para límites dados por el usuario
		int inf;
		int sup;

		// Pido límites
		String str = JOptionPane.showInputDialog("¿Cuál quieres que sea el límite inferior?");
		inf = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("¿Cuál quieres que sea el límite superior?");
		sup = Integer.parseInt(str);

		// Creo array con los datos dados por el usuario
		int array[] = UtilsArrays.creaInicializaArrayEnterosAzarLimites(100, inf, sup);

		// Recorro el array para imprimirlo en orden normal
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		// Recorro el array nuevamente para mostrarlo en orden inverso
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
