package capitulo5.bloque7;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;



public class Ejercicio1_editor_de_textos {

	

	

	

		/**
		 * Escribe un programa editor de textos. Debes utilizar la consola de Java. El objetivo es que se pueda editar 
		 * el contenido de un archivo ficticio. Para hacer esto utilizar�s una lista de elementos de tipo String. Cada 
		 * l�nea del texto ser� representada como un String. Debes mostrar un men� en pantalla, que contenga todas las 
		 * opciones siguientes, y que funcionen adecuadamente:
	      a) "Agregar una l�nea al texto". Pediras al usuario un String y lo agregar�s al final de la lista que representa 
	      	tu fichero ficticio.
	      b) "Insertar una l�nea en cualquier posici�nn del texto". Pedir�s al usuario un String y un n�mero. Insertar�s el 
	      	String en la l�nea pedida.
	      c) "Editar una l�nea (reescribir su contenido)". Pedir�s al usuario un n�mero de l�nea para sobrescribir, 
	      	mostrar�s al usuario la l�nea actual que desea sobrescribir. Pedirás un nuevo String. Eliminar�s el String 
	      	actual y lo cambiar�s por el nuevo
	      d) "Borrar una l�nea". Pedir�s un n�mero de l�nea y la eliminar�s de la lista.
	      e) "Cortar un conjunto de l�neas", (marcadas por su posici�n inicial y final). Pedir�s un n�mero de l�nea inicial 
	      	y uno final. "Transportar�s todas las l�neas del intervalo a una nueva lista y las borrar�s de la lista original.
	      f) "Pegar un conjunto de l�neas cortadas en una determinada posici�n". Pedir�s un n�mero de l�nea en la que insertar 
	      	lo que tienes cortado con la opci�n anterior.
	      g) "Imprimir el fichero". Mostrar�s cada l�nea del fichero ficticio, aparecer� numerada en la consola.
		 * @param args
		 */
		public static void main(String[] args) {
			// Declaro variables necesarias
			int opcion;
			List<String> fichero = new ArrayList<String>();
			List<String> portapapeles = new ArrayList<String>();

			// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
			// programa est� finalizado
			fichero.add("Primera l�nea");
			fichero.add("Segunda l�nea");
			fichero.add("Tercera l�nea");

			// Bucle principal de la aplicaci�n
			do {
				// Llamo a mostrar el men� y pedir una opci�n al usuario.
				opcion = menu();

				// Cada caso en funci�n de la opci�n elegida por el usuario
				switch (opcion) {
				case 0: // Ha elegido abandonar la aplicaci�n
					System.out.println("�Adi�s!");
					break;
				case 1: // Agregar una l�nea
					String texto = pedirTextoUsuario(); // Usamos m�todo para pedir texto al usuario
					fichero.add(texto); // A�adimos texto a la lista fichero
					break;
				case 2: // Instertar una l�nea en cualquier posici�n
					String addLine = pedirTextoUsuario(); // M�todo para pedir texto al usuario
					
					int numLine = pedirPosicionUsuario(fichero); //M�todo para pedir posici�n de l�nea

					fichero.add(numLine, addLine); //A�adimos a la lista

					break;
				case 3: // Editar una l�nea
					int LineEdit = pedirPosicionUsuario(fichero); //Pedimos l�nea al usuario para editar
					System.out.print("La l�nea que desea editar es:");
					imprimeListElement(fichero, LineEdit); //Mostramos l�nea en pantalla					
					
					String textoEdit = pedirTextoUsuario(); //Pedimos nuevo texto para reemplazar
					fichero.remove(LineEdit); //Eliminamos l�nea anterior
					fichero.add(LineEdit, textoEdit); //A�adimos nueva l�nea en misma posici�n
					
					break;
				case 4: // Borrar una l�nea
					System.out.println("�Qu� l�nea eliminamos?");
					int RemoveLinePos = pedirPosicionUsuario(fichero); //Pedimos posici�n de l�nea para eliminar
					fichero.remove(RemoveLinePos); //Eliminamos l�nea
					break;
				case 5: // Cortar un conjunto de l�neas
					System.out.println("�A partir de qu� l�nea cortamos?");
					int inicioBorrado = pedirPosicionUsuario(fichero); //Pedimos l�nea de inicio
					System.out.println("�Hasta qu� l�nea?");
					int finBorrado = pedirPosicionUsuario(fichero); //Pedimos l�nea de fin
					
					portapapeles = cortarListaEnPortapapeles(inicioBorrado, finBorrado, fichero);
					fichero = cortarLista(inicioBorrado, finBorrado, fichero);
							
					break;
				case 6: // Pegar un conjunto de l�neas
					System.out.println("�A partir de qu� l�nea pegamos el contenido cortado?");
					int pos = pedirPosicionUsuario(fichero); //Pedimos posici�n para pegar al usuario
					fichero.addAll(pos, portapapeles); //Ponemos el contenido de portapapeles a partir de la posici�n indicada
					break;
				case 7: // Ha elegido visualizar el fichero
					visualizaLista(fichero);
					break;
				default:
					System.out.println("Opción no válida");
				}
				
				
			} while (opcion != 0);

		}

		/**
		 * Muestra un menú en pantalla y pide una opción al usuario
		 * @return
		 */
		public static int menu () {
			String strMenu = "\n\nMen�"
					+ "\n0.- Salir"
					+ "\n1.- Agregar una l�nea"
					+ "\n2.- Insertar una l�nea en una posici�n"
					+ "\n3.- Editar una l�nea"
					+ "\n4.- Eliminar una l�nea"
					+ "\n5.- Cortar un conjunto de l�neas"
					+ "\n6.- Pegar un conjunto de l�neas"
					+ "\n7.- Visualizar el fichero"
					+ "\n\nIntroduzca su opci�n: ";
			// Muestro el menú
			System.out.println(strMenu);
			// Pido una opción al usuario
			int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opci�n"));
			// Devuelvo la opción seleccionada
			return opcionUsuario;
		}
		
		/**
		 * Recorre la lista que simboliza el fichero, exponiendo las líneas en pantalla y cada una con su número de línea
		 * @param lista
		 */
		public static void visualizaLista (List<String> lista) {
			System.out.println("\n\nContenido del fichero");
			for (int i = 0; i < lista.size(); i++) {
				System.out.println("\t" + i + " - " + lista.get(i));
			}
		}
		 /**
		  * Pedimos texto al usuario
		  * @return
		  */
		
		public static String pedirTextoUsuario () {
			String addLine = JOptionPane.showInputDialog("Escribe lo que quieras a�adir");
			return addLine;
		}
		
		/**
		 * Pedimos n�mero al usuario
		 * @param lista
		 * @return
		 */
		
		public static int pedirPosicionUsuario (List<String> lista) {
			int numLine = Integer.parseInt(JOptionPane.showInputDialog( //Pedimos posici�n
					"Elige el n�mero de l�nea entre 0 y " + (lista.size() - 1)));
			return numLine;
		}
		
		
		/**
		 * Imprime elemento concreto de una lista
		 * @param lista
		 * @param posicion
		 */
		
		private static void imprimeListElement (List<String> lista, int posicion) {
			//System.out.println(titulo);
			for (int i = 0; i < lista.size(); i++) {
				if (i == posicion) {
				System.out.println("Elemento en posici�n: " + i + ": " + lista.get(i));
				}
			}
		}
		
		/**
		 * Corta elementos de una lista desde una posici�n de inicio hasta una de fin
		 * @param inicioBorrado
		 * @param finBorrado
		 * @param fichero
		 * @return
		 */
		
		public static List<String> cortarLista (int inicioBorrado, int finBorrado, List<String> fichero) {
			
			
			for (int i = 0; i <= fichero.size(); i++) { //recorremos desde inicio a fin
				
					if (i ==  inicioBorrado) { //Si el inicio de borrado coincide con i, borramos
						
						fichero.remove(i);
						i--; //Como el inicio siempre ser� en la misma posici�n restamos uno a i
						
						finBorrado --; //Sin embargo, el fin si que variar�, por cada borrado la posici�n final
										// ser� una menos
						
						}
					if (inicioBorrado > finBorrado) { //hacemos este proceso hasta que la posici�n final sobrepase
						break;						//a la inicial y rompemos bucle
					}
				}
			return fichero;
		}
		
		/**
		 * Copia elementos de una lista (con inicio y fin determinado) en una nueva lista, portapapeles
		 * @param inicioCortado
		 * @param finCortado
		 * @param fichero
		 * @return
		 */
		
		public static List<String> cortarListaEnPortapapeles (int inicioCortado, int finCortado, List<String> fichero) {
			List<String> portapapeles = new ArrayList<String>();
			
			portapapeles.clear(); //limpio el cortapapeles 
			
			for (int i = 0; i <= fichero.size(); i++) { //recorremos desde inicio a fin
				
					if (i ==  inicioCortado) { //Si el inicio de borrado coincide con i, ponemos valor en nueva lista
						portapapeles.add(fichero.get(i));
						inicioCortado++; //dado que queremos copiar el siguiente elemento, sumamos 1 a inicio
						
						}
					if (inicioCortado > finCortado) { //hacemos este proceso hasta que la posici�n inicial sobrepase
						break;						//a la final y rompemos bucle
					}
				}
			return portapapeles;
		}
	}
