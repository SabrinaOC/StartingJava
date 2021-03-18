package examenes.examen18_03_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Normalemente los controladores tienen singleton
 */
public class Controlador {

	private static Controlador instance = null;
	// Creamos la conexión que usaremos para todos las búsquedas de clientes
	public Connection conn = null;

	/**
	 * Creamos Singleton
	 * 
	 * @return
	 */
	public static Controlador getInstance() {
		if (instance == null) {
			instance = new Controlador();
		}
		return instance;
	}

	/**
	 * Constructor de cliente
	 */
	public Controlador() {

		try {
			// creamos la conexión que usaremos para todas nuestras consultas
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/examen?serverTimezone=UTC", "root",
					"1234");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Método para encontrar el primer cliente
	 * 
	 * @return
	 */
	public Cliente findPrimero() {
		// creamos objeto de tipo cliente para guardar resultados
		Cliente c = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s.executeQuery("select * from examen.cliente order by id limit 1");

			// Navegaciçon del objeto ResultSet
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("Id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDni(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Devolvemos primer cliente
		return c;
	}

	/**
	 * Método para encontrar el último cliente
	 * 
	 * @return
	 */
	public Cliente findUltimo() {

		Cliente c = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s.executeQuery("select * from examen.cliente order by id desc limit 1");

			// Navegaci�n del objeto ResultSet
			if (rs.next()) {

				c = new Cliente();
				c.setId(rs.getInt("Id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDni(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Devolvemos último cliente
		return c;
	}

	/**
	 * Método para ir al siguiente cliente
	 * 
	 * @param idActual
	 * @return
	 */
	public Cliente findSiguiente(int idActual) {

		Cliente c = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s
					.executeQuery("select * from examen.cliente where id >" + idActual + " order by id limit 1");

			// Navegaci�n del objeto ResultSet
			if (rs.next()) {

				c = new Cliente();
				c.setId(rs.getInt("Id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDni(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Devolvemos siguiente fabricante
		return c;
	}

	/**
	 * Método para ir al cliente anterior
	 * 
	 * @param idActual
	 * @return
	 */
	public Cliente findAnterior(int idActual) {

		Cliente c = null;
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo
			// Statement
			Statement s = this.conn.createStatement();

			ResultSet rs = s
					.executeQuery("select * from examen.cliente where id <" + idActual + " order by id desc limit 1");

			// Navegaci�n del objeto ResultSet
			if (rs.next()) {

				c = new Cliente();
				c.setId(rs.getInt("Id"));
				c.setNombre(rs.getString("nombre"));
				c.setApellido(rs.getString("apellidos"));
				c.setLocalidad(rs.getString("localidad"));
				c.setDni(rs.getString("dniNie"));
				c.setEmail(rs.getString("email"));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// Devolvemos cliente anterior
		return c;
	}

	/**
	 * Método para modificar un registro de cliente
	 * 
	 * @param c
	 * @return
	 */
	public int modificar(Cliente c) {
		// creamos variable para recoger registros afectadors tras update
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement();

			registrosAfectados = s.executeUpdate("update cliente set nombre='" + c.getNombre() + "', "
					+ " apellidos='" + c.getApellido() + "', localidad='" + c.getLocalidad() + "', dniNie='" + c.getDni()
					+ "', email='" + c.getEmail() + "' where id=" + c.getId() + ";");

			// Cierre de los elementos
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;

	}

	/**
	 * Método para introducir nuevo registro en la BBDD
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Cliente c) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into cliente values(" + idNuevoRegistro + ", " +
			"'" + c.getNombre() + "', '" + c.getApellido() + "', '" + c.getLocalidad() + "', '" + c.getDni() + "', '" + c.getEmail() + "');");
		   	
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
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId() throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from examen.cliente";
		ResultSet rs = s.executeQuery(sql);
		int max = 1;
		if (rs.next()) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}

	/**
	 * Método para eliminar registro de la bbdd
	 * 
	 * @param id
	 * @return
	 */
	public int eliminar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement();

			registrosAfectados = s.executeUpdate("delete from cliente where id=" + id + ";");

			// Cierre de los elementos
			s.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

}
