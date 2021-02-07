package capitulo6_Recursos.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 1º.- Crear una aplicación que gestione los artículos guardados en un almacén.
 * Cada artículo tiene un código de barras, y un número de estante. La
 * aplicación permitirá que el usuario añada artículos nuevos, los borre,
 * actualice el estante de un artículo, e imprima la lista de artículos. Además
 * el usuario podrá consultar la localización de un determinado artículo por su
 * código de barras. Sólo existirá como mucho una unidad de cada tipo de
 * artículo.
 * 
 * 2º.- Ampliar el ejercicio anterior para añadir un nombre a cada artículo, y
 * un número de unidades en stock, haciendo posible almacenar más de un artículo
 * de cada clase. La aplicación deberá limitar a un máximo de 10 el número de
 * artículos almacenados de cada tipo.
 * 
 * @author F541U
 *
 */

public class AppAlmacen {

	// Creamos hashmap
	static HashMap<Integer, Articulo> artAlmacen = new HashMap<Integer, Articulo>();

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int opcion;

		do {
			// Mostramos menú en pantalla
			menu();
			opcion = utils.Utils.obtenerEnteroPorScanner();
			almacen(opcion);// Llamamos al método almacén

		} while (opcion != 5); // Saldremos del bucle con la opción 5

	}

	/**
	 * Método para mostrar menú en pantalla
	 */
	public static void menu() {

		System.out.println(
				"\nControl de almacén. Seleccione una opción:" + "\n1. Añadir artículos." + "\n2. Eliminar artículos."
						+ "\n3. Actualizar estante." + "\n4. Consultar localización." + "\n5. Salir.");

	}

	/**
	 * Método para realizar las diferentes funciones de la app con switch
	 * 
	 * @param opcion
	 */
	public static void almacen(int opcion) {

		switch (opcion) {
		case 1: // Añadir artículo
			Articulo art = new Articulo(); // Creamos artículo
			System.out.println("\nIntroduzca el nombre del artículo:");// Pedimos datos al usuario
			String nom = obtenerStringPorScanner();
			art.setNombre(nom);// Asignamos nombre. Haremos lo mismo con el resto de propiedades

			System.out.println("\nIntroduzca el número de estante:");// Pedimos datos al usuario
			int estante = utils.Utils.obtenerEnteroPorScanner();
			art.setEstante(estante);// Asignamos estante

			// Stock
			int stock = comprobarStock();// Llamamos al método para el stock
			art.setStock(stock);

			// Código de barras
			System.out.println("\nIntroduzca el código de barras:");// Pedimos datos al usuario
			int cod = utils.Utils.obtenerEnteroPorScanner();
			art.setCodBarras(cod);// Asignamos estante

			artAlmacen.put(cod, art);
			break;
		case 2:
			// Pedimos artículo que queremos eliminar
			System.out.println("\nIntroduzca el código de barras del artículo que quiere eliminar:");
			int eliminar = utils.Utils.obtenerEnteroPorScanner(); // Localizamos el artículo para eliminar

			artAlmacen.remove(eliminar);// eliminamos artículo

			break;
		case 3:
			// Pedimos artículo que queremos relocalizar
			System.out.println("\nIntroduzca el código de barras del artículo que quiere relocalizar:");
			int loc = utils.Utils.obtenerEnteroPorScanner();
			// Lamamos a método para comprobar que el artículo existe para poder cambiar su
			// localización
			if (existe(loc)) {
				// Si existe continuamos pidiendo datos para relocalizarlo
				System.out.println("\nIntroduzca la nueva localización:");
				int newEst = utils.Utils.obtenerEnteroPorScanner();

				// Cambiamos la localización
				artAlmacen.get(loc).setEstante(newEst);
				;// le cambiamos la localización
					// Mostramos datos en pantalla
				System.out.println("\nLa nueva localización del artículo " + artAlmacen.get(loc).getNombre()
						+ " es estante " + artAlmacen.get(loc).getEstante());
			} else {
				System.out.println("\nNo existe ningún artículo con ese código de barras.");
			}

			break;
		case 4:
			// Primero comprobamos si hay artículos en la hashmap
			if (vacio() == true) {// Si no hay mostramos mensaje y salimos de opción localizar artículo
				System.out.println("\nNo hay artículos en el almacén.");
				break;
			}
			// Pedimos artículo que queremos localizar
			System.out.println("\nIntroduzca el código de barras del artículo que quiere localizar:");
			int find = utils.Utils.obtenerEnteroPorScanner();

			if (existe(find)) {
				// Mostramos información en pantalla
				System.out.println("\nEl artículo" + artAlmacen.get(find).getNombre() + " se encuentra en el estante "
						+ artAlmacen.get(find).getEstante() + "\n");
			} else {
				System.out.println("\nNo se ha encontrado ningún artículo con ese código.");
			}

			break;
		case 5:
			System.out.println("\nCerrando sesión.");
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

	public static int comprobarStock() {
		int stock;
		// Creamos bucle hasta que se introduzca un valor adecuado
		do {
			System.out.println("\nIntroduzca el número de stock (no superior a 10):");
			stock = utils.Utils.obtenerEnteroPorScanner();

		} while (stock > 10);
		return stock;
	}

	/**
	 * Método para comprobar que la hashmap no está vacía
	 * 
	 * @return
	 */
	public static boolean vacio() {
		if (artAlmacen.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * Método para comprobar que el artículo existe
	 * 
	 * @param find
	 * @return
	 */
	public static boolean existe(int find) {
		Iterator<Map.Entry<Integer, Articulo>> iterator = artAlmacen.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<Integer, Articulo> entry = iterator.next();
			// comprobamos si la entrada existe
			if (find == entry.getKey()) {
				return true;
			}
		}
		return false;
	}

}
