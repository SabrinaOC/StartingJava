package capitulo8_SWING.fabricante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;





/*
 * Normalemente los controladores tienen singleton
 */
public class ControladorFabricante {

	private static ControladorFabricante instance = null;
	// Creamos la conexión que usaremos para todos las búsquedas de fabricante
	public Connection conn = null;

	/**
	 * Creamos Singleton
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
			//creamos la conexión que usaremos para todas nuestras consultas
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
		//creamos objeto de tipo fabricante para guardar resultados
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

		} catch (Exception ex) {
			ex.printStackTrace();
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

		} catch (Exception ex) {
			ex.printStackTrace();
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

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Devolvemos siguiente fabricante
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

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Devolvemos primer fabricante
		return f;
	}
	
	/**
	 * Método para modificar un registro de fabricante
	 * @param f
	 * @return
	 */
	public int modificar (Fabricante f) {
		//creamos variable para recoger registros afectadors tras update
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update fabricante set cif='" + f.getCif() + "', " +
					" nombre='" + f.getNombre() + "' where id=" + f.getId() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * Método para introducir nuevo registro en la BBDD
	 * @param f
	 * @return
	 */
	public int nuevo (Fabricante f) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into fabricante values(" + idNuevoRegistro + ", " +
			"'" + f.getCif() + "', '" + f.getNombre() + "');");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}
	
	/**
	 * Método para obtener siguiente id disponible en bbdd
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches.fabricante";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	/**
	 * Método para eliminar registro de la bbdd
	 * @param id
	 * @return
	 */
	public int eliminar (int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from fabricante where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}
	
}
