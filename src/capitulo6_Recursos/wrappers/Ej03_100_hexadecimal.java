package capitulo6_Recursos.wrappers;

/**
 * Realizar un programa que imprima los 100 primeros números enteros en código hexadecimal.
 * @author F541U
 *
 */

public class Ej03_100_hexadecimal {
	
	/**
	 * Método principal
	 * @param args
	 */

	public static void main(String[] args) {
		
		//Recorro el bucle 100 veces para tener los números del 0 al 100 en hexadecimal
		for (int i = 0; i < 101; i++) {
			//Mostramos en pantalla
			System.out.println("Decodificicación base decimal " + i +": " + Integer.toHexString(i));
		}
		
		
	
	}

}
