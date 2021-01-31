package capitulo6_Recursos;

/**
 * Aproximar, con una precisión de 0.00001 décimas, el número PI. Para esto
 * debes utilizar el método "Calcular el valor de PI utilizando series
 * infinitas"
 * 
 * Toma cuatro, resta cuatro y divide entre tres. Luego suma 4 y divide entre 5.
 * Ahora resta 4 y divide entre 7. Continúa alternando entre suma y resta de
 * fracciones con un numerador de cuatro y un denominador equivalente a cada
 * número impar subsiguiente. Mientras más veces repitas la serie, más te
 * acercarás al valor de Pi.
 * 
 * @author F541U
 *
 */

public class R_03_Pi {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		double pi = 4; // creamos variable para el número pi
		double num = 4;
		double den = 3;


		do {
			//Realizamos operaciones
			pi = pi - (num/den);			

			num = num * -1; //Cambiamos signo para siguiente vuelta del bucle
			den += 2;//Aumentamos denominador para continuar con la serie


		} while (pi <= Math.PI - 0.00001 || pi >= Math.PI); // Salimos del bucle cuando tengamos un error menos al 0.00001
		

		System.out.println("El número pi es: " + pi);
	}

}
