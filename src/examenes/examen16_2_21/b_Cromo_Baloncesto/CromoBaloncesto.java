package examenes.examen16_2_21.b_Cromo_Baloncesto;

import java.util.Enumeration;

/**
 * Debes crear tres cromos (objetos) e introducirlos en el interior de un objeto
de tipo HashMap parametrizado. Crea un menú que realice las siguientes acciones:
i. 0.- Abandonar el programa.
ii. 1.- Visualizar los valores de todos los cromos guardados.
iii. 2.- Introducir un nuevo cromo guardado.
iv. 3.- Eliminar un cromo, especificando su id numérico.
v. 4.- Imprimir en consola los datos del jugador o jugadora con más puntos obtenidos.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CromoBaloncesto {

	// Creamos hashmap
	static HashMap<Integer, Cromo> baloncesto = new HashMap<Integer, Cromo>();

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Creamos objetos tipo cromo
		Cromo jugador = new Cromo(1, 50, 17, "Ricky Rubio");
		baloncesto.put(1, jugador);

		Cromo jugador2 = new Cromo(2, 85, 13, "Rudy Fernández");
		baloncesto.put(2, jugador2);

		Cromo jugador3 = new Cromo(3, 100, 12, "Campazzo");
		baloncesto.put(3, jugador3);

		int opcion;

		do {
			// Mostramos menú en pantalla
			menu();
			opcion = utils.Utils.obtenerEnteroPorScanner();
			baloncesto(opcion);// Llamamos al método baloncesto

		} while (opcion != 0); // Saldremos del bucle con la opción 5

	}

	/**
	 * Método para mostrar menú en pantalla
	 */
	public static void menu() {

		System.out.println("\nSeleccione una opción:" + "\n0. Abandonar programa."
				+ "\n1. Visualizar los valores de todos los cromos guardados."
				+ "\n2. Introducir un nuevo cromo guardado." + "\n3. Eliminar un cromo, especificando su id numérico."
				+ "\n4. Imprimir en consola los datos del jugador o jugadora con más puntos obtenidos.");
	}

	/**
	 * Método para realizar las diferentes funciones de la app con switch
	 * 
	 * @param opcion
	 */
	public static void baloncesto(int opcion) {

		switch (opcion) {
		case 0: // Abandonar programa
			System.out.println("\nCerrando sesión.");
			break;
		case 1: // Visualizar valores de todos los cromos guardados

			// Recuperaci�n de todos los objetos en el HM
			System.out.println("\nRecorrido de los objetos del HashMap:");
			Iterator<Cromo> cromos = baloncesto.values().iterator();
			while (cromos.hasNext()) {
				System.out.println("Cromo: " + cromos.next());
			}
			break;
		case 2:// nuevo cromo
			Cromo jug = new Cromo(); // Creamos artículo
			System.out.println("\nIntroduzca el nombre del jugador:");// Pedimos datos al usuario
			String nom = obtenerStringPorScanner();
			jug.setNombre(nom);// Asignamos nombre. Haremos lo mismo con el resto de propiedades

			System.out.println("\nIntroduzca el id:");// Pedimos datos al usuario
			int id = utils.Utils.obtenerEnteroPorScanner();
			jug.setId(id);// Asignamos id

			// puntos anotados
			System.out.println("\nIntroduzca el número de puntos anotados:");// Pedimos datos al usuario
			int puntos = utils.Utils.obtenerEnteroPorScanner();
			jug.setPuntosAnotados(puntos);

			// Código de barras
			System.out.println("\nIntroduzca el número de rebotes:");// Pedimos datos al usuario
			int rebotes = utils.Utils.obtenerEnteroPorScanner();
			jug.setRebotes(rebotes);// Asignamos estante

			baloncesto.put(id, jug);

			break;
		case 3:// eliminar cromo
				// Pedimos artículo que queremos eliminar
			System.out.println("\nIntroduzca el id del cromo que quiere eliminar:");
			int eliminar = utils.Utils.obtenerEnteroPorScanner(); // Localizamos el artículo para eliminar

			if (existe(eliminar)) {
				System.out.println("Cromo " + baloncesto.get(eliminar).getNombre() + " con id "
						+ baloncesto.get(eliminar).getId() + " eliminado.");
				baloncesto.remove(eliminar);// eliminamos artículo
			} else {
				System.out.println("\nNo existe ningún artículo con ese código de barras.");
			}

			break;
		case 4:// jugador con más puntos

			Cromo aux = null;
			// System.out.println("\nVisualización de todos los cromos guardados:");
			Iterator<Cromo> cromos2 = baloncesto.values().iterator();

			while (cromos2.hasNext()) {

				if (aux == null) {// Si la variable auxiliar es nula, guardamos el valor del cromo en el que
									// estamos en ella
					aux = cromos2.next();
				} else {
					if (aux.getPuntosAnotados() < cromos2.next().getPuntosAnotados()) {
						aux = cromos2.next();
					}
				}

			}

			// mostramos el jugador con más puntos anotados
			System.out.println("\nEl jugador con más puntos anotados la pasada temporada es: " + aux);
			break;
		default:
			System.out.println("\nOpción no válida. Por favor, introduzca un valor de los arriba mostrados.");

		}
	}

	/**
	 * Método para pedir información al usuario String
	 * 
	 * @return
	 */
	public static String obtenerStringPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	/**
	 * Método para comprobar que el artículo existe
	 * 
	 * @param find
	 * @return
	 */
	public static boolean existe(int find) {
		Iterator<Map.Entry<Integer, Cromo>> iterator = baloncesto.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, Cromo> entry = iterator.next();
			// comprobamos si la entrada existe
			if (find == entry.getKey()) {
				return true;
			}
		}
		return false;
	}

}
