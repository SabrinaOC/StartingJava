package capitulo6_Recursos.wrappers;

/**
 * Realizar un programa que imprima una tabla con los límites máximo y mínimo
 * representables para los diferentes tipos primitivos en Java (byte, int,
 * short, long, float, double). En la tabla también deberá aparecer el número de
 * bytes que cada tipo usa para su representación.
 * 
 * @author F541U
 *
 */

public class Ej01_tiposPrimitivos_max_min {
	
	/**
	 * Método principal
	 * @param args
	 */

	public static void main(String[] args) {
		
		//Valores byte
		System.out.println("Valor máximo entero " + Integer.MAX_VALUE);
		System.out.println("Valor mínimo entero " + Integer.MIN_VALUE);
		System.out.println("Bytes entero " + Integer.BYTES);
		
		
		//Valores integer
		System.out.println("\nValor máximo byte " + Byte.MAX_VALUE);
		System.out.println("Valor mínimo byte " + Byte.MIN_VALUE);
		System.out.println("Bytes byte " + Byte.BYTES);
		
		//Valores short
		System.out.println("\nValor máximo short " + Short.MAX_VALUE);
		System.out.println("Valor mínimo short " + Short.MIN_VALUE);
		System.out.println("Bytes short " + Short.BYTES);
		
		//Valores long
		System.out.println("\nValor máximo long " + Long.MAX_VALUE);
		System.out.println("Valor mínimo long " + Long.MIN_VALUE);
		System.out.println("Bytes long " + Long.BYTES);
		
		//Valores float
		System.out.println("\nValor máximo float " + Float.MAX_VALUE);
		System.out.println("Valor mínimo float " + Float.MIN_VALUE);
		System.out.println("Bytes float " + Float.BYTES);
		
		//Valores double
		System.out.println("\nValor máximo double " + Double.MAX_VALUE);
		System.out.println("Valor mínimo double " + Double.MIN_VALUE);
		System.out.println("Bytes double " + Double.BYTES);


	}

}
