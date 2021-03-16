package capitulo_8_SWING.fabricante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Normalemente los controladores tienen singleton
 */
public class ControladorFabricante {

	private static ControladorFabricante instance = null;
	// Creamos la conexión que usaremos para todos las búsquedas de fabricante
	public Connection conn = null;

	/**
	 * Singleton
	 * 
	 * @return
	 */
	public static ControladorFabricante getInstance() {
		if (instance == null) {
			instance = new ControladorFabricante();
		}
		return instance;
	}

	/**
	 * Constructor de Fabricante
	 */
	public ControladorFabricante() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager
					.getConnection("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC", "java", "1234");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Método para encontrar el primer fabricante
	 * @return
	 */
	public Fabricante findPrimero() {

		Fabricante f = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s.executeQuery("select * from tutorialjavacoches.fabricante order by id limit 1");

			// Navegaci�n del objeto ResultSet
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("Id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Devolvemos primer fabricante
		return f;
	}

	/**
	 * Método para encontrar el último fabricante
	 * @return
	 */
	public Fabricante findUltimo() {

		Fabricante f = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s.executeQuery("select * from tutorialjavacoches.fabricante order by id desc limit 1");

			// Navegaci�n del objeto ResultSet
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("Id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Devolvemos primer fabricante
		return f;
	}

	/**
	 * Método para ir al fabricante anterior
	 * @param idActual
	 * @return
	 */
	public Fabricante findSiguiente(int idActual) {

		Fabricante f = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s.executeQuery("select * from tutorialjavacoches.fabricante where id >" + idActual + " order by id limit 1");

			// Navegaci�n del objeto ResultSet
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("Id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Devolvemos primer fabricante
		return f;
	}
	
	/**
	 * Método para ir al siguiente fabricante
	 * @param idActual
	 * @return
	 */
	public Fabricante findAnterior (int idActual) {

		Fabricante f = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s.executeQuery("select * from tutorialjavacoches.fabricante where id <" + idActual + " order by id desc limit 1");
											
			// Navegaci�n del objeto ResultSet
			if (rs.next()) {
				f = new Fabricante();
				f.setId(rs.getInt("Id"));
				f.setCif(rs.getString("cif"));
				f.setNombre(rs.getString("nombre"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Devolvemos primer fabricante
		return f;
	}

}
