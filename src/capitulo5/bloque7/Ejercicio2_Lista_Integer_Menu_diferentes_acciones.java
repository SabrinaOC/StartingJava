package capitulo5.bloque7;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;

import utils.Utils;


/**
 * 2.- Realiza un programa que trabaje con una Lista de elementos Integer. Debes
 * mostrar un men� en pantalla y ofrecer al usuario las siguientes opciones a
 * realizar sobre la lista: 
 * a) "Abandonar el programa". 
 * b) "Crear aleatoriamente la lista de valores". Pedir�s al usuario los siguientes datos: longitud de la
 * lista, valor m�nimo y valor m�ximo. A continuaci�n limpiar�s la lista (por si
 * conten�a valores), y agregar�s tantos elementos enteros como se haya
 * indicado, con valores que deben oscilar entre el m�nimo y el m�ximo se�alado.
 * c) "Calcular suma, media, mayor y menor". Mostrar�s en pantalla esos cuatro
 * valores. 
 * d) "Agregar una cantidad de nuevos valores". Pedir�s al usuario los
 * siguientes datos: cu�ntos datos nuevos quiere agregar, posici�n a partir de
 * la que se deben introducir, valor m�nimo y valor m�ximo. Incluir�s tantos
 * valores como indique el usuario, en la posici�n indicada, con valores entre
 * m�nimo y m�ximo. 
 * e) "Eliminar elementos cuyo valor est� en un intervalo".
 * Pedir�s dos valores al usuario (m�nimo y m�ximo), que conforman un intervalo.
 * Eliminar�s los valores de la lista de elementos que se encuentren dentro de
 * ese intervalo (incluyendo los l�mites) e informar�s de cuantos elementos has
 * eliminado de la lista. 
 * f) "Imprimir la lista". Mostrar�s la lista en
 * pantalla.
 * 
 * @author F541U
 *
 */

public class Ejercicio2_Lista_Integer_Menu_diferentes_acciones {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// Declaro variables necesarias
		int opcion;
		List<Integer> fichero = new ArrayList<Integer>();
		;

		// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
		// programa est� finalizado
		fichero.add(8);
		fichero.add(7);
		fichero.add(6);

		// Bucle principal de la aplicaci�n
		do {
			// Llamo a mostrar el men� y pedir una opci�n al usuario.
			opcion = menu();

			// Cada caso en funci�n de la opci�n elegida por el usuario
			switch (opcion) {
			case 0: // Ha elegido abandonar la aplicaci�n
				System.out.println("�Adi�s!");
				break;
			case 1: // Agregar una lista de valores aleatorios
				System.out.println("�Qu� longitud tendr� la lista?");
				int longitudLista = pedirNumeronUsuario(); // Pedimos longitud

				fichero.removeAll(fichero); // Borramos todos los valores de la lista

				System.out.println("�Desde qu� n�mero empezamos?");
				int numMenor = pedirNumeronUsuario(); // Pedimos n�mero menor

				System.out.println("�Hasta qu� n�mero?");
				int numMayor = pedirNumeronUsuario(); // Pedimos n�mero mayor

				for (int i = 0; i < longitudLista; i++) { // Asignamos valores tantas veces c�mo longitud haya indicado
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

				mayorYMenorListaEnteros(fichero);// Usamos m�todo para ver mayor y menor

				break;
			case 3: // Agregar valores en una posici�n determinada
				System.out.println("�Cu�ntos n�meros a�adimos?");
				int cantidad = pedirNumeronUsuario(); // Pedimos longitud
				
				System.out.println("Indica posici�n entre 0 y " + (fichero.size()-1));
				int pos = pedirNumeronUsuario(); // Pedimos posici�n
				
				System.out.println("Indica el valor m�nimo");
				int min = pedirNumeronUsuario(); // Pedimos valor m�nimo
				
				System.out.println("Indica el valor m�ximo");
				int max = pedirNumeronUsuario(); // Pedimos valor m�ximo
				
				
				for (int i = 0; i< fichero.size(); i++) { //Recorro lista hasta llegar a posici�n indicada
					if (i == pos) {
						for (int j = 0; j <cantidad; j++) { //Ya en la posici�n damos tantos valores como haya indicado el usuario
							fichero.add(i, (Utils.obtenerNumeroAzar(min, max)));
						}
					}
				}
				break;
			case 4: // Eliminar intervalo
				System.out.println("Indica el valor m�nimo del intervalo");
				int minimo = pedirNumeronUsuario(); // Pedimos valor m�nimo
				
				System.out.println("Indica el valor m�ximo del intervalo");
				int maximo = pedirNumeronUsuario(); // Pedimos valor m�nimo
				
				int cont = 0; //creamos contador
				
				for (int i = 0; i < fichero.size();) { //Recorremos la lista
					if ((fichero.get(i) >= minimo && fichero.get(i) <= maximo)) {
						fichero.remove(i); //Eliminamos valor y aumentamos contador
						cont ++;		//si se cumple la condici�n
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
				System.out.println("Opci�n no v�lida");
			}

		} while (opcion != 0);

	}

	/**
	 * Muestra un men� en pantalla y pide una opci�n al usuario
	 * 
	 * @return
	 */
	public static int menu() {
		String strMenu = "\n\nMen�" 
				+ "\n0.- Salir" 
				+ "\n1.- Crear lista de valores aleatorios"
				+ "\n2.- Calcular suma, media, mayor y menor" 
				+ "\n3.- Agregar valores en posici�n" 
				+ "\n4.- Eliminar valores de intervalo"
				+ "\n5.- Visualizar lista" + "\n\nIntroduzca su opci�n: ";
		// Muestro el men�
		System.out.println(strMenu);
		// Pido una opci�n al usuario
		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opci�n"));
		// Devuelvo la opción seleccionada
		return opcionUsuario;
	}

	/**
	 * Recorre la lista que simboliza el fichero, exponiendo las l�neas en pantalla
	 * y cada una con su n�mero de l�nea
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
	 * M�todo para pedir n�mero al usuario
	 * @return
	 */

	public static int pedirNumeronUsuario() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Por favor, introduce un n�mero"));
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
