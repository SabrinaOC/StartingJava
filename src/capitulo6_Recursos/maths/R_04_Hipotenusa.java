package capitulo6_Recursos.maths;

/**
 * Dado un triángulo rectángulo cuyos catetos miden 4 cm y 5 cm respectivamente, hallar cuanto mide la hipotenusa
 * @author F541U
 *
 */

public class R_04_Hipotenusa {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		//Creamos variable para guardar hipotenusa y usamos método math.hypot
		float hipo = (float)Math.hypot(4, 5);
		
		//Mostramos en pantalla
		System.out.println("La hipotenusa de un triángulo rectánculo de 4 cm x 5 cm es: " + hipo);

	}

}
