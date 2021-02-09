package capitulo6_Recursos.wrappers;

import java.util.Scanner;

/**
 * Crear un programa que pida al usuario una contraseña con los siguientes
 * requisitos: - Al menos una mayúscula. - Al menos una minúscula. - Al menos un
 * dígito - Al menos un carácter no alfanumérico. El programa no terminará hasta
 * que el usuario no introduzca la contraseña con estos requisitos.
 * 
 * @author F541U
 *
 */

public class Ej02_passwordUsuario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		String str;
		//Repetimos bucle hasta que la contraseña sea válida
		do {
			System.out.println(
					"Introduzca su contraseña (debe contenter al menos: una mayúscula, una minúscula, un dígito, un carácter no alfanumérico");
			//Pedimos datos por consola
			str = obtenerStringPorScanner();
			
			
			
		} while (!correcto(str));
		
		System.out.println("Contraseña creada con éxito");

	}

	/**
	 * Método de comprobación de contraseña
	 * @param str
	 * @return
	 */
	public static boolean correcto(String str) {
		char pass [] = str.toCharArray();//Convertimos string a array de char para hacer comprobaciones
		boolean may = false, min = false, dig = false, noalfno = false;//booleans para comprobación final partimos de que ninguna condición se cumple
		
		for (int i = 0; i < pass.length; i++) {//Recorremos array para ver caso por caso
			if (Character.isUpperCase(pass[i]) == true) {
				may = true;
			}
			if (Character.isLowerCase(pass[i]) == true) {
				min = true;
			}
			if (Character.isDigit(pass[i]) == true) {
				dig = true;
			}
			if (Character.isLetterOrDigit(pass[i]) == false) {
				noalfno = true;
			}
			
		}
		/*
		System.out.println(may);
		System.out.println(min);
		System.out.println(dig);
		System.out.println(noalfno);*/
		
		if (may && min && dig && noalfno) {
			return true;
		}
		return false;
	}
	
	/**
	 * Método para pedir información al usuario String
	 * 
	 * @return
	 */
	public static String obtenerStringPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	

}
