package capitulo6_Recursos.maths;

import utils.Utils;

/**
 * Crear un programa que resuelva ecuaciones de segundo grado con una incógnita.
 * El programa debe pedir los parámetros a, b y c de la ecuación, e imprimir, en
 * caso de que las haya, la solución o soluciones de la ecuación.
 * 
 * @author F541U
 *
 */

public class R_01_Ecuaciones_2_Grado {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int a, b, c; // Cramos variables

		// Pedimmos valores al usuario
		System.out.println("Introduce el valor de a:");
		a = Utils.obtenerEnteroPorScanner();

		System.out.println("Introduce el valor de b:");
		b = Utils.obtenerEnteroPorScanner();

		System.out.println("Introduce el valor de c:");
		c = Utils.obtenerEnteroPorScanner();

		int ProR = (b * b) - (4 * a * c);

		// Averdiguamos primera x
		int x1 = (int) ((-b + Math.sqrt(ProR)) / (2 * a));
		// Segunda x
		int x2 = (int) ((-b - Math.sqrt(ProR)) / (2 * a));

		// Mostramos resultados
		System.out.println("Resultado: x1 = " + x1 + " y x2 = " + x2);

	}

}
