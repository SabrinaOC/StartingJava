package capitulo5.bloque7;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import utils.Utils;


/**
 * 2.- Realiza un programa que trabaje con una Lista de elementos Integer. Debes
 * mostrar un menú en pantalla y ofrecer al usuario las siguientes opciones a
 * realizar sobre la lista: 
 * a) "Abandonar el programa". 
 * b) "Crear aleatoriamente la lista de valores". Pedirás al usuario los siguientes datos: longitud de la
 * lista, valor mínimo y valor máximo. A continuación limpiarás la lista (por si
 * contenía valores), y agregarás tantos elementos enteros como se haya
 * indicado, con valores que deben oscilar entre el mínimo y el máximo señalado.
 * c) "Calcular suma, media, mayor y menor". Mostrarás en pantalla esos cuatro
 * valores. 
 * d) "Agregar una cantidad de nuevos valores". Pedirás al usuario los
 * siguientes datos: cuántos datos nuevos quiere agregar, posición a partir de
 * la que se deben introducir, valor mínimo y valor máximo. Incluirás tantos
 * valores como indique el usuario, en la posición indicada, con valores entre
 * mínimo y máximo. 
 * e) "Eliminar elementos cuyo valor esté en un intervalo".
 * Pedirás dos valores al usuario (mínimo y máximo), que conforman un intervalo.
 * Eliminarás los valores de la lista de elementos que se encuentren dentro de
 * ese intervalo (incluyendo los límites) e informarás de cuantos elementos has
 * eliminado de la lista. 
 * f) "Imprimir la lista". Mostrarás la lista en
 * pantalla.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_Lista_Integer_Menu_diferentes_acciones {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Declaro variables necesarias
		int opcion;
		List<Integer> fichero = new ArrayList<Integer>();
		;

		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
		// programa está finalizado
		fichero.add(8);
		fichero.add(7);
		fichero.add(6);

		// Bucle principal de la aplicación
		do {
			// Llamo a mostrar el menú y pedir una opción al usuario.
			opcion = menu();

			// Cada caso en función de la opción elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicación
				System.out.println("¡Adiós!");
				break;
			case 1: // Agregar una lista de valores aleatorios
				System.out.println("¿Qué longitud tendrá la lista?");
				int longitudLista = pedirNumeronUsuario(); // Pedimos longitud

				fichero.removeAll(fichero); // Borramos todos los valores de la lista

				System.out.println("¿Desde qué número empezamos?");
				int numMenor = pedirNumeronUsuario(); // Pedimos número menor

				System.out.println("¿Hasta qué número?");
				int numMayor = pedirNumeronUsuario(); // Pedimos número mayor

				for (int i = 0; i < longitudLista; i++) { // Asignamos valores tantas veces cómo longitud haya indicado
															// el usuario
					fichero.add(Utils.obtenerNumeroAzar(numMenor, numMayor));
				}

				break;
			case 2: // Suma, media, mayor y menor
				int suma = 0; // creamos variable para suma
				for (int i = 0; i < fichero.size(); i++) { // Recorremos lista para sumar valores y hacer media
					suma += fichero.get(i);
				}

				System.out.println(
						"La suma de los valores de la lista es " + suma + "\nLa media es " + suma / fichero.size());

				mayorYMenorListaEnteros(fichero);// Usamos método para ver mayor y menor

				break;
			case 3: // Agregar valores en una posición determinada
				System.out.println("¿Cuántos números añadimos?");
				int cantidad = pedirNumeronUsuario(); // Pedimos longitud
				
				System.out.println("Indica posición entre 0 y " + (fichero.size()-1));
				int pos = pedirNumeronUsuario(); // Pedimos posición
				
				System.out.println("Indica el valor mínimo");
				int min = pedirNumeronUsuario(); // Pedimos valor mínimo
				
				System.out.println("Indica el valor máximo");
				int max = pedirNumeronUsuario(); // Pedimos valor máximo
				
				
				for (int i = 0; i< fichero.size(); i++) { //Recorro lista hasta llegar a posición indicada
					if (i == pos) {
						for (int j = 0; j <cantidad; j++) { //Ya en la posición damos tantos valores como haya indicado el usuario
							fichero.add(i, (Utils.obtenerNumeroAzar(min, max)));
						}
					}
				}
				break;
			case 4: // Eliminar intervalo
				System.out.println("Indica el valor mínimo del intervalo");
				int minimo = pedirNumeronUsuario(); // Pedimos valor mínimo
				
				System.out.println("Indica el valor máximo del intervalo");
				int maximo = pedirNumeronUsuario(); // Pedimos valor mínimo
				
				int cont = 0; //creamos contador
				
				for (int i = 0; i < fichero.size();) { //Recorremos la lista
					if ((fichero.get(i) >= minimo && fichero.get(i) <= maximo)) {
						fichero.remove(i); //Eliminamos valor y aumentamos contador
						cont ++;		//si se cumple la condición
					} else {
						i++;
					}
					
				}
				
				System.out.println("Se han eliminado " + cont +" elementos.");

				break;
			case 5: // Ha elegido visualizar lista
				visualizaListaEnteros(fichero);
				break;
			default:
				System.out.println("Opción no válida");
			}

		} while (opcion != 0);

	}

	/**
	 * Muestra un menú en pantalla y pide una opción al usuario
	 * 
	 * @return
	 */
	public static int menu() {
		String strMenu = "\n\nMenú" 
				+ "\n0.- Salir" 
				+ "\n1.- Crear lista de valores aleatorios"
				+ "\n2.- Calcular suma, media, mayor y menor" 
				+ "\n3.- Agregar valores en posición" 
				+ "\n4.- Eliminar valores de intervalo"
				+ "\n5.- Visualizar lista" + "\n\nIntroduzca su opción: ";
		// Muestro el menú
		System.out.println(strMenu);
		// Pido una opción al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción"));
		// Devuelvo la opciÃ³n seleccionada
		return opcionUsuario;
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla
	 * y cada una con su número de línea
	 * 
	 * @param lista
	 */
	public static void visualizaListaEnteros(List<Integer> lista) {
		System.out.println("\n\nContenido del fichero");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("\t" + i + " - " + lista.get(i));
		}
	}

	/**
	 * Método para pedir número al usuario
	 * @return
	 */

	public static int pedirNumeronUsuario() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce un número"));
		return num;
	}

	/**
	 * 
	 * @param lista
	 */

	public static void mayorYMenorListaEnteros(List<Integer> lista) {
		int mayor;
		int menor;

		mayor = lista.get(0); //Establecemos el primer elemento como mayor y menor
		menor = lista.get(0);

		for (int i = 0; i < lista.size(); i++) { //Recorremos lista para comparar
			if (lista.get(i) < menor) {
				menor = lista.get(i);
			}
			if (lista.get(i) > mayor) {
				mayor = lista.get(i);
			}
		}

		System.out.println("El mayor es " + mayor + "\nEl menor es " + menor); //Imprimimos valro mayor y menor
	}

}
