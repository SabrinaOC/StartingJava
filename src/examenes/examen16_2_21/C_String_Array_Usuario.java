package examenes.examen16_2_21;

import java.util.Scanner;

/**
 * Pide un String al usuario (el String debe comenzar con un número determinado
 * de espacios en blanco y contener varias palabras), elimina todos los espacios
 * del principio del String, obtén un array de tipo String, que contenga todas
 * las palabras que existan dentro del mismo. Para cada palabra muestra en
 * pantalla: i. Cuántas letras tiene en su interior, indica cuántas son
 * mayúsculas y cuántas son minúsculas. ii. Cuántos dígitos tiene en su
 * interior.
 * 
 * @author F541U
 *
 */
public class C_String_Array_Usuario {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int letras = 0, mayus = 0, minus = 0, num = 0;

		System.out.println("Introduzca una frase:");
		String frase = obtenerStringPorScanner();
		//String frase = "          esTo es uNa prueba 122";
		//Eliminamos los espacios en blanco
		System.out.println("Eliminaci�n de los espacios en blanco iniciales: " + new String(frase).trim());
		


		// Eje.mplo de separaci�n de cadena en cadenas a trav�s de split()
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].isBlank() == false) {
				System.out.println("Palabra: " + palabras[i]);
				// mostramos numeros por palabra

				// Convertimos el array de string a char para contar mayus, minus...
				char letra[] = palabras[i].toCharArray();// Convertimos string a array de char para hacer comprobaciones
				for (int j = 0; j < letra.length; j++) {// Recorremos array para ver caso por caso
					if (Character.isUpperCase(letra[j])) {
						mayus++;
					}
					if (Character.isLowerCase(letra[j])) {
						minus++;
					}
					if (Character.isDigit(letra[j])) {
						num++;
					}
					if (Character.isLetter(letra[j])) {
						letras++;
					}

				}
				System.out.println("La palabra " + palabras[i] + " tiene " + letras + " letras, " + mayus
						+ " mayúsculas, " + minus + " minúsculas y " + num + " dígitos.");

				// volvemos las variables a cero para la siguiente palabra
				mayus = 0;
				minus = 0;
				num = 0;
				letras = 0;
			}

		}

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
