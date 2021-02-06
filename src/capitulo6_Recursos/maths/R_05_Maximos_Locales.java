package capitulo6_Recursos.maths;

import java.util.ArrayList;
import java.util.List;

/**
 * Hallar los cinco primero máximos locales de la función y = x * sen(x) con una precisión de 0.01.
 * @author F541U
 *
 */

public class R_05_Maximos_Locales {
	
	private static List<Double> cinco = new ArrayList<Double>();//Creamos lista para guardar resultados de los máximos locales
	
	/**
	 * Método principal
	 * @param args
	 */

	public static void main(String[] args) {
		
		//Creamos variables
		double x = 0.01;
		//Usaremos las dos variables y para ir comparando y guardando resultados
		double y3;
		double y2 = 0.000000000000000000000; 
		double y1 = 0.000000000000000000000;// = x * Math.sin(x);
		
		
		do {
		y3 = x * Math.sin(x);
		
		
		
		//si la y del medio es mayo que su anterior y posterior, hemos encontrado un máximo
		//y lo añadimos a la lista
		if (y2 > y1 && y2 > y3) { 
			cinco.add(y2);
		}
		//Cada vuelta del bucle reasignamos valores
		y1 = y2;
		y2 = y3;
		
		
		//A cada vuelta del bucle sumamos 0.01 a la x para estar por debajo del fallo
		x += 0.01; 
		
		} while (completo() == false);//Saldremos del bucle cuando haya 5 elementos en la lista
		
		System.out.println("Los cinco primeros máximos locales de la función y = x * sen(x) son: \n");
		listaEnPantalla();
		
	}
	
	/**
	 * Método para comprobar que el array está completo,
	 * es decir, que se han encontrado los cinco primeros máximos locales
	 * @param cinco
	 */
	public static boolean completo() {
		
		//Dado que queremos solo los cinco primeros, cuando el tamaño de la lista sea 5 devolveremos true
		if (cinco.size() == 5) {
			return true;
		}
		return false;
	}
	
	public static void listaEnPantalla() {
		for (int i = 0; i < cinco.size(); i++) {
			System.out.println(cinco.get(i));
		}
	}

}
