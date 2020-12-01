package capitulo5.bloque7;

import java.util.ArrayList;

import java.util.List;

import javax.swing.JOptionPane;



public class Ejercicio1_editor_de_textos {

	

	

	

		/**
		 * Escribe un programa editor de textos. Debes utilizar la consola de Java. El objetivo es que se pueda editar 
		 * el contenido de un archivo ficticio. Para hacer esto utilizarás una lista de elementos de tipo String. Cada 
		 * línea del texto será representada como un String. Debes mostrar un menú en pantalla, que contenga todas las 
		 * opciones siguientes, y que funcionen adecuadamente:
	      a) "Agregar una línea al texto". Pediras al usuario un String y lo agregarás al final de la lista que representa 
	      	tu fichero ficticio.
	      b) "Insertar una línea en cualquier posiciónn del texto". Pedirás al usuario un String y un número. Insertarás el 
	      	String en la línea pedida.
	      c) "Editar una línea (reescribir su contenido)". Pedirás al usuario un número de línea para sobrescribir, 
	      	mostrarás al usuario la línea actual que desea sobrescribir. PedirÃ¡s un nuevo String. Eliminarás el String 
	      	actual y lo cambiarás por el nuevo
	      d) "Borrar una línea". Pedirás un número de línea y la eliminarás de la lista.
	      e) "Cortar un conjunto de líneas", (marcadas por su posición inicial y final). Pedirás un número de línea inicial 
	      	y uno final. "Transportarás todas las líneas del intervalo a una nueva lista y las borrarás de la lista original.
	      f) "Pegar un conjunto de líneas cortadas en una determinada posición". Pedirás un número de línea en la que insertar 
	      	lo que tienes cortado con la opción anterior.
	      g) "Imprimir el fichero". Mostrarás cada línea del fichero ficticio, aparecerá numerada en la consola.
		 * @param args
		 */
		public static void main(String[] args) {
			// Declaro variables necesarias
			int opcion;
			List<String> fichero = new ArrayList<String>();
			List<String> portapapeles = new ArrayList<String>();

			// Inicializo algo de contenido en la lista. Esto debe eliminarse cuando el
			// programa está finalizado
			fichero.add("Primera línea");
			fichero.add("Segunda línea");
			fichero.add("Tercera línea");

			// Bucle principal de la aplicación
			do {
				// Llamo a mostrar el menú y pedir una opción al usuario.
				opcion = menu();

				// Cada caso en función de la opción elegida por el usuario
				switch (opcion) {
				case 0: // Ha elegido abandonar la aplicación
					System.out.println("¡Adiós!");
					break;
				case 1: // Agregar una línea
					String texto = pedirTextoUsuario(); // Usamos método para pedir texto al usuario
					fichero.add(texto); // Añadimos texto a la lista fichero
					break;
				case 2: // Instertar una línea en cualquier posición
					String addLine = pedirTextoUsuario(); // Método para pedir texto al usuario
					
					int numLine = pedirPosicionUsuario(fichero); //Método para pedir posición de línea

					fichero.add(numLine, addLine); //Añadimos a la lista

					break;
				case 3: // Editar una línea
					int LineEdit = pedirPosicionUsuario(fichero); //Pedimos línea al usuario para editar
					System.out.print("La línea que desea editar es:");
					imprimeListElement(fichero, LineEdit); //Mostramos línea en pantalla					
					
					String textoEdit = pedirTextoUsuario(); //Pedimos nuevo texto para reemplazar
					fichero.remove(LineEdit); //Eliminamos línea anterior
					fichero.add(LineEdit, textoEdit); //Añadimos nueva línea en misma posición
					
					break;
				case 4: // Borrar una línea
					System.out.println("¿Qué línea eliminamos?");
					int RemoveLinePos = pedirPosicionUsuario(fichero); //Pedimos posición de línea para eliminar
					fichero.remove(RemoveLinePos); //Eliminamos línea
					break;
				case 5: // Cortar un conjunto de líneas
					System.out.println("¿A partir de qué línea cortamos?");
					int inicioBorrado = pedirPosicionUsuario(fichero); //Pedimos línea de inicio
					System.out.println("¿Hasta qué línea?");
					int finBorrado = pedirPosicionUsuario(fichero); //Pedimos línea de fin
					
					portapapeles = cortarListaEnPortapapeles(inicioBorrado, finBorrado, fichero);
					fichero = cortarLista(inicioBorrado, finBorrado, fichero);
							
					break;
				case 6: // Pegar un conjunto de líneas
					System.out.println("¿A partir de qué línea pegamos el contenido cortado?");
					int pos = pedirPosicionUsuario(fichero); //Pedimos posición para pegar al usuario
					fichero.addAll(pos, portapapeles); //Ponemos el contenido de portapapeles a partir de la posición indicada
					break;
				case 7: // Ha elegido visualizar el fichero
					visualizaLista(fichero);
					break;
				default:
					System.out.println("OpciÃ³n no vÃ¡lida");
				}
				
				
			} while (opcion != 0);

		}

		/**
		 * Muestra un menÃº en pantalla y pide una opciÃ³n al usuario
		 * @return
		 */
		public static int menu () {
			String strMenu = "\n\nMenú"
					+ "\n0.- Salir"
					+ "\n1.- Agregar una línea"
					+ "\n2.- Insertar una línea en una posición"
					+ "\n3.- Editar una línea"
					+ "\n4.- Eliminar una línea"
					+ "\n5.- Cortar un conjunto de líneas"
					+ "\n6.- Pegar un conjunto de líneas"
					+ "\n7.- Visualizar el fichero"
					+ "\n\nIntroduzca su opción: ";
			// Muestro el menÃº
			System.out.println(strMenu);
			// Pido una opciÃ³n al usuario
			int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog("Elige una opción"));
			// Devuelvo la opciÃ³n seleccionada
			return opcionUsuario;
		}
		
		/**
		 * Recorre la lista que simboliza el fichero, exponiendo las lÃ­neas en pantalla y cada una con su nÃºmero de lÃ­nea
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
			String addLine = JOptionPane.showInputDialog("Escribe lo que quieras añadir");
			return addLine;
		}
		
		/**
		 * Pedimos número al usuario
		 * @param lista
		 * @return
		 */
		
		public static int pedirPosicionUsuario (List<String> lista) {
			int numLine = Integer.parseInt(JOptionPane.showInputDialog( //Pedimos posición
					"Elige el número de línea entre 0 y " + (lista.size() - 1)));
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
				System.out.println("Elemento en posición: " + i + ": " + lista.get(i));
				}
			}
		}
		
		/**
		 * Corta elementos de una lista desde una posición de inicio hasta una de fin
		 * @param inicioBorrado
		 * @param finBorrado
		 * @param fichero
		 * @return
		 */
		
		public static List<String> cortarLista (int inicioBorrado, int finBorrado, List<String> fichero) {
			
			
			for (int i = 0; i <= fichero.size(); i++) { //recorremos desde inicio a fin
				
					if (i ==  inicioBorrado) { //Si el inicio de borrado coincide con i, borramos
						
						fichero.remove(i);
						i--; //Como el inicio siempre será en la misma posición restamos uno a i
						
						finBorrado --; //Sin embargo, el fin si que variará, por cada borrado la posición final
										// será una menos
						
						}
					if (inicioBorrado > finBorrado) { //hacemos este proceso hasta que la posición final sobrepase
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
					if (inicioCortado > finCortado) { //hacemos este proceso hasta que la posición inicial sobrepase
						break;						//a la final y rompemos bucle
					}
				}
			return portapapeles;
		}
	}
