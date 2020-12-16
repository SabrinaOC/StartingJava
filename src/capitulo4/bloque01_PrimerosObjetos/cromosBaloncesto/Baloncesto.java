package capitulo4.bloque01_PrimerosObjetos.cromosBaloncesto;

import java.util.ArrayList;

/**
 * Sigue los siguientes pasos para resolver este ejercicio:

- Crea un paquete, en el repositorio de tus ejercicios, cuyo nombre aproximadamente sea 
  "capitulo04.bloque01_PrimerosObjetos".
- Dentro del paquete crea una clase llamada "CromoBaloncesto". 
- Dentro de la clase, crea las siguientes propiedades: String nombreJugador, int alturaCm, int pesoKg
  y float puntosMediosPorpartido.
- Crea un constructor por defecto (sin argumentos de entrada) y un constructor en el que recibas, 
  por argumentos de entrada, todas las propiedades de los objetos de esta clase
- Crea un m�todo "toString()" que devuelva una cadena de caracteres que contenga todos los valores 
  de las propiedades de los objetos de esta clase.
- Crea m�todos getter y setter de todas las propiedades de los objetos de esta clase.
- Crea una clase nueva, en la que pongas un m�todo main() que lleve a cabo las siguientes acciones:
    - Crea 5 objetos de tipo CromoBaloncesto, con valores creados por ti.
    - Crea una lista cuyos elementos sean de tipo CromoBaloncesto y agrega los cinco objetos creados a esa lista.
    - Recorre la lista, llamando al m�todo toString() de los objetos que contiene y sacando en pantalla el resultado.
    - Crea un m�todo, en la clase que contiene el m�todo main(), que reciba la lista de cromos 
      y la ordene, con el algoritmo de la burbuja, en funci�n de los puntosMediosPorPartido de cada jugador, 
      en orden ascendente. En el m�todo main comprueba el funcionamiento de ese m�todo, 
      al que puedes llamar "ordenaJugadores(Lista<CromoBaloncesto> lista)"
 * @author F541U
 *
 */

public class Baloncesto {
	
	/**
	 * M�todo principal
	 * @param args
	 */

	public static void main(String[] args) {


		CromoBaloncesto jug01 = new CromoBaloncesto(); //Creamos un nuevo jugador llamando al m�todo constructor
		jug01.setNombreJugador("Facundo Campazzo"); //Damos valores usando los setters
		jug01.setAltura(180);
		jug01.setPesoKg(88);
		jug01.setPuntosMediosPorpartido((float)14.1);
				
		//System.out.println(jug01.toString());
		
		CromoBaloncesto jug02 = new CromoBaloncesto();//Realizamos el mismo proceso para los 5 jugadores
		jug02.setNombreJugador("Ricky Rubio");
		jug02.setAltura(193);
		jug02.setPesoKg(86);
		jug02.setPuntosMediosPorpartido((float)13.0);
		
		//System.out.println(jug02.toString());
		
		
		CromoBaloncesto jug03 = new CromoBaloncesto("Pau Gasol", 215, 113, (float)12.3); //Usamos el otro m�todo constructor
		//System.out.println(jug03.toString());
		
		CromoBaloncesto jug04 = new CromoBaloncesto("Kobe Bryant", 198, 96, (float)17.6);
		//System.out.println(jug04.toString());
		
		CromoBaloncesto jug05 = new CromoBaloncesto("Andr�s Nocioni", 203, 102, (float)11.4);
		//System.out.println(jug05.toString());
		
		
		ArrayList<CromoBaloncesto> listaCromos = new ArrayList<CromoBaloncesto>(); //Creamos lista de clase CromoBaloncesto
		listaCromos.add(jug01); //A�adimos jugadores creados a la lista
		listaCromos.add(jug02);
		listaCromos.add(jug03);
		listaCromos.add(jug04);
		listaCromos.add(jug05);
		
		for (int i = 0; i < listaCromos.size(); i++) { //Recorremos lista para mostrar en pantalla
			System.out.println(listaCromos.get(i).toString()); //Usamos m�todo toString para imprimir
		}
		
		System.out.println("");
		
		ordenarListaCromosPorPuntos(listaCromos); //Llamamos m�todo de ordenaci�n
		

		
	}
	
	/**
	 * M�todo para ordenar lista objetos por burbuja
	 * @param listaCromos
	 */
	
	public static void ordenarListaCromosPorPuntos (ArrayList<CromoBaloncesto> listaCromos) {

		
		CromoBaloncesto auxiliar;
		
		boolean intercambio = false;
		
		do {
			intercambio = false;
			for (int i = 0; i < listaCromos.size() - 1; i++) { // Recorremos lista para comparar puntos por partido
				// de los objetos de la lista comparamos solo los puntos
				if (listaCromos.get(i).getPuntosMediosPorpartido() > listaCromos.get(i + 1).getPuntosMediosPorpartido()) {
					auxiliar = listaCromos.get(i + 1); // guardamos todas la propiedades del objeto en la variable
														// auxiliar
					listaCromos.add(i + 1, listaCromos.get(i)); // A�adimos el valor comparado a la lista en la posici�n
																// correspondiente
					// esto nos crea un nuevo elemento que deberemos eliminar en la posici�n i +2 e
					// i ya que son las posiciones que se cambian
					listaCromos.remove(i + 2); // y as� evitamos que se creen m�ltiples elementos iguales
					listaCromos.remove(i);

					listaCromos.add(i, auxiliar);
					intercambio = true;

				}
			}
		} while (intercambio); // Repetimos bucle hasta que no haya intercambios

		for (int i = 0; i < listaCromos.size(); i++) {
			System.out.println(listaCromos.get(i).toString()); //Imprimimos en pantalla la lista ordenada
		}
	}

}
