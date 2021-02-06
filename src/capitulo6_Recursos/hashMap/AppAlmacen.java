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

	//Creamos hashmap
	static  HashMap<Integer, Articulo> artAlmacen = new HashMap<Integer, Articulo>();
	
	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {

		
		int opcion;
		
		do {
			//Mostramos menú en pantalla
			menu();
			opcion = utils.Utils.obtenerEnteroPorScanner();
			almacen(opcion);//Llamamos al método almacén
			
			
		} while (opcion != 5); //Saldremos del bucle con la opción 5
		
		
	}
	
	/**
	 * Método para mostrar menú en pantalla
	 */
	public static void menu() {
		
		System.out.println("Control de almacén. Seleccione una opción:"
				+ "\n1. Añadir artículos."
				+ "\n2. Eliminar artículos."
				+ "\n3. Actualizar estante."
				+ "\n4. Consultar localización."
				+ "\n5. Salir.");
		
	}
	
	/**
	 * Método para realizar las diferentes funciones de la app con switch
	 * @param opcion
	 */
	public static void almacen(int opcion) {
		
		switch(opcion) {
		case 1: //Añadir artículo
			Articulo art = new Articulo(); //Creamos artículo
			System.out.println("Introduzca el nombre del artículo:");//Pedimos datos al usuario
			String nom = obtenerStringPorScanner();
			art.setNombre(nom);//Asignamos nombre. Haremos lo mismo con el resto de propiedades
			
			System.out.println("Introduzca el número de estante:");//Pedimos datos al usuario
			int estante = utils.Utils.obtenerEnteroPorScanner();
			art.setEstante(estante);//Asignamos estante
			
			//Stock
			int stock = comprobarStock();//Llamamos al método para el stock
			art.setStock(stock);
			
			//Código de barras
			System.out.println("Introduzca el código de barras:");//Pedimos datos al usuario
			int cod = utils.Utils.obtenerEnteroPorScanner();
			art.setCodBarras(cod);//Asignamos estante
			
			artAlmacen.put(cod, art);
			break;
		case 2:
			//Pedimos artículo que queremos eliminar
			System.out.println("Introduzca el código de barras del artículo que quiere eliminar:");
			int eliminar = utils.Utils.obtenerEnteroPorScanner(); //Localizamos el artículo para eliminar
			
			/*Iterator it = artAlmacen.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		        it.remove(); // avoids a ConcurrentModificationException
		    }*/
			
			
			
			artAlmacen.remove(artAlmacen.get(eliminar));//eliminamos artículo		
			
			break;
		case 3:
			//Pedimos artículo que queremos relocalizar
			System.out.println("Introduzca el código de barras del artículo que quiere relocalizar:");
			int loc = utils.Utils.obtenerEnteroPorScanner();
			System.out.println("Introduzca la nueva localización:");
			int newEst = utils.Utils.obtenerEnteroPorScanner();
			
			//Cambiamos la localización
			artAlmacen.get(loc).setEstante(newEst);;//le cambiamos la localización			
			break;
		case 4:
			//Pedimos artículo que queremos localizar
			System.out.println("Introduzca el código de barras del artículo que quiere localizar:");
			int find = utils.Utils.obtenerEnteroPorScanner();
			
			artAlmacen.get(find).toString();//Mostramos en pantalla
			break;
		case 5:
			System.out.println("Cerrando sesión");
			break;
		}
	}
	
	/**
	 * Método para pedir información al usuario String
	 * @return
	 */
	public static String obtenerStringPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	
	public static int comprobarStock() {
		int stock;
		//Creamos bucle hasta que se introduzca un valor adecuado
		do {
			System.out.println("Introduzca el número de stock (no superior a 10):");
			stock = utils.Utils.obtenerEnteroPorScanner();
			
		} while (stock > 10);
		return stock;
	}

}
