package capitulo7_Acceso_a_datos.ejercicio01_programa_modificar_BBDD_fabricantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.Utils;

public class Programa_fabricantes_BBDD {

	public static void main(String[] args) {
		int opcion;
		do {
			// Mostramos menú en pantalla
			menu();
			// Pedimos número por scanner
			opcion = Utils.obtenerEnteroPorScanner();
			appFabricante(opcion);

		} while (opcion != 0);

	}

	/**
	 * Método para mostrar menú
	 */
	public static void menu() {
		System.out.println("Elija una opción: \n0. Salir. " + "\n1. Mostrar todos los fabricantes."
				+ "\n2. Insertar un nuevo fabricante. " + "\n3. Eliminar un fabricante."
				+ "\n4. Modificar un fabricante.");
	}

	public static void appFabricante(int opcion) {
		switch (opcion) {
		case 0:// Salir
			break;
		case 1:// Mostrar todos los fabricantes
			listarFabricantes();
			break;
		case 2:// Insertar un nuevo fabricantes
			introducirNuevoFabricante();// llamamos al método para introducir un nuevo fabricante
			listarFabricantes();// Mostramos todos los fabricantes en pantalla para mostrar que se ha añadido
			break;
		case 3:// Eliminar un fabricante
			listarFabricantes();
			eliminarFabricante();
			listarFabricantes();
			break;
		case 4:// Modificar un fabricante
			//primero mostramos los fabricantes para que el usuario pueda elegir cuál modificar
			listarFabricantes();
			//llamamos al método para modificar
			modificarFabricantes();
			listarFabricantes();

			break;
		default:
			System.out.println("Opción no válida. Por favor, introduzca una opción entre 0 y 4");
		}
	}

	public static void listarFabricantes() {
		// crear conexión

		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();

			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			ResultSet rs = s.executeQuery("select * from fabricante");

			System.out.println("Lista de todos los fabricantes:\n");
			// Navegaci�n del objeto ResultSet
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}
			System.out.println("");
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

	}

	public static void introducirNuevoFabricante() {
		System.out.println("Inserte el cif del fabricante:\n");
		String cif = utils.Utils.obtenerStringPorScanner();

		System.out.println("Inserte el nombre del fabricante:\n");
		String nombre = utils.Utils.obtenerStringPorScanner();

		// Iniciamos conexión para realizar consulta
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();

			// Consultamos id máximo para poder hacer el insert
			String sql = "select max(id) from tutorialjavacoches.fabricante";
			ResultSet rs = s.executeQuery(sql);
			int max = 1;
			if (rs.next()) {
				max = rs.getInt(1);
			}

			max++;

			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			int regAfectados = s
					.executeUpdate("insert into fabricante values (" + max + ",'" + cif + "','" + nombre + "')");

//			// Navegaci�n del objeto ResultSet
//			while (rs.next()) { 
//				System.out.println (rs.getInt("id") + " " + rs.getString (2)+ 
//						" " + rs.getString(3) + " " + rs.getString(4) + 
//						" " + rs.getString(5)); 
//			}
			// Cierre de los elementos
			rs.close();
			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	public static void eliminarFabricante() {
		
		// Pedimos al usuario el id del fabricante que queremos eliminar
		System.out.println("Introduzca el id del fabricante que desea eliminar:");
		int id = utils.Utils.obtenerEnteroPorScanner();
		

		// Iniciamos conexión para realizar consulta
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
			// si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
			// tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = (Statement) conexion.createStatement();
			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
			// recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
			// obtenidos por la consulta
			int regAfectados = s.executeUpdate("delete from fabricante where id=" + id);

//					
//					}
			// Cierre de los elementos

			s.close();
			conexion.close();
		} catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}

	}
	
	public static void modificarFabricantes() {
		// Pedimos al usuario el id del fabricante que queremos modificar
			System.out.println("Introduzca el id del fabricante que desea modificar:");
			int id = utils.Utils.obtenerEnteroPorScanner();
			
			// Pedimos al usuario cif
			System.out.println("Introduzca el nuevo cif:");
			String cif = utils.Utils.obtenerStringPorScanner();
			
			// Pedimos al usuario nombre
			System.out.println("Introduzca el nuevo nombre:");
			String nombre = utils.Utils.obtenerStringPorScanner();
		
			// Iniciamos conexión para realizar consulta
			try {
				// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL,
				// si no fuera as�
				// no podemos trabajar con esa BBDD.
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de
				// tipo Connection, al cual
				// le tenemos que pasar los par�metros de conexi�n.
				Connection conexion = (Connection) DriverManager
						.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

				// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
				// Statement
				Statement s = (Statement) conexion.createStatement();
				// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se
				// recibe en forma de objeto
				// de tipo ResultSet, que puede ser navegado para descubrir todos los registros
				// obtenidos por la consulta
				int regAfectados = s.executeUpdate("update fabricante set cif='" + cif + "', nombre='" + nombre + "' where id=" + id);

//						
//						}
				// Cierre de los elementos

				s.close();
				conexion.close();
			} catch (ClassNotFoundException ex) {
				System.out.println("Imposible acceder al driver Mysql");
				ex.printStackTrace();
			} catch (SQLException ex) {
				System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
				ex.printStackTrace();
			}
			
	}
}
