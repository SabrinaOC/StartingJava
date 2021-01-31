package capitulo6_Recursos;

/**
 * Averiguar, con una precisión inferior a 0.001, en qué punto (x, y) se cortan las gráficas de las siguientes funciones:
         y = sqrt(x)
         y = - ln(x)
 * @author F541U
 *
 */

public class R_02_Interseccion {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		float x = (float) 0.001; //
		float y1, y2;
		
		do {
		y1 = (float) Math.sqrt(x);
		y2 = (float) - Math.log(x);
		
		x+=0.001; //En cada vuelta del bucle sumamos el error
		} while (Math.abs(y1-y2) > 0.001);
		
		System.out.println("La intersección se produce en x = " + x + " e y " + y1);

	}

}
