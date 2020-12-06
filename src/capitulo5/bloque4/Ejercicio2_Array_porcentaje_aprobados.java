package capitulo5.bloque4;

import utils.UtilsArrays;

/**
 * Capítulo 5, bloque 4, ejercicio 2 Crea un array de 20 números enteros
 * generados al azar entre 0 y 10. Analiza el array y calcula el porcentaje (con
 * decimales) de notas aprobadas ( >= 5 ) y de notas suspensas.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_Array_porcentaje_aprobados {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		int contadorAprobados = 0;
		float porcentajeAprobado;
		float porcentajeSuspenso;
		int array [] = UtilsArrays.creaArrayNumerosAzar(20, 0, 10); //Creamos array con párametros dados
		
		for (int i = 0; i < array.length; i ++) { //Recorro el array para separa suspensos de aprobados
			System.out.print(array[i] + " ");
			if (array[i]>=5) { //Si la nota es superior a 5 sumo 1 al contador de aprobados
				contadorAprobados ++;
			}		
		}
		System.out.println("");
		porcentajeAprobado = (float)((contadorAprobados*100)/20); //Calculo porcentajes
		porcentajeSuspenso = (float) (100 - porcentajeAprobado);
		System.out.print("El porcentaje de aprobados es " + porcentajeAprobado //Muestro porcentajes en pantalla
				      +"\nEl porcentajde de suspensos es " + porcentajeSuspenso);
	}

}
