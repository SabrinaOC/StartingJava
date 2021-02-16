package examenes.examen16_2_21;

/**
 * Aproximar, con una precisión de 0.0001 unidades, el número PI. Para esto
 * debes utilizar el método "Calcular el valor de PI utilizando series
 * infinitas", mediante la serie de Nilakantha del enlace
 * https://es.wikihow.com/calcular-Pi.
 * 
 * @author F541U
 *
 */

public class A_Numero_Pi_Nilakantha {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		double pi = 3; // creamos variable para el número pi
		// double pi2 = 4;
		double num = -4;
		int numero1 = 2, numero2 = 3, numero3 = 4;
		double den;

		do {
			// Realizamos operaciones
			// Primero averiguamos denominador
			den = numero1 * numero2 * numero3;

			pi = pi - (num / den);

			num = num * -1; // Cambiamos signo para siguiente vuelta del bucle
			// Para seguir cambianod el denominador guardaremos el valor 3 en el 1 y a
			// partir de ese iremos sumano 1
			numero1 = numero3;
			numero2 = numero1 + 1;
			numero3 = numero1 + 2;

		} while (pi <= Math.PI - 0.0001 || pi >= Math.PI); // Salimos del bucle cuando tengamos un error menos al
															// 0.00001

		System.out.println("El número pi es: " + pi);

	}

}
