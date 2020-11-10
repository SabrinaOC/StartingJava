package capitulo5.bloque4;

import Utils.Utils;

/**
 * Cap�tulo 5, bloque 4, ejercicio 3 Crea un array de 20 n�meros decimales
 * creados al azar entre 0 y 100. Para crear el n�mero decimal debes generar al
 * azar la parte entera y la parte decimal por separado para despu�s unir las
 * dos partes. A continuaci�n debes examinar la cantidad de n�meros cuya parte
 * decimal est� comprendida entre .00 y .49
 * 
 * @author F541U
 *
 */

public class Ejercicio3_Array_20_unidades_decimales_por_separado {

	public static void main(String[] args) {
		int unidades [] = new int [20];
		float decimales [] = new float [unidades.length];
		float arrayCompleto [] = new float [unidades.length];
		
		for (int i = 0; i < unidades.length; i++) {
			unidades[i] = Utils.obtenerNumeroAzar(0, 100);
			decimales [i] = (float) Math.round(Math.random()* (0.99 - 0.00) + 0.00);
			
			System.out.print(" Unidades " + unidades[i]
					+"\n Decimales " + decimales[i]);
		}
 
	}

}
