package capitulo8_SWING.fabricante.ventaCochesRafa.controladores;

import java.sql.Connection;
import java.sql.DriverManager;

public class ControladorConcesionario {
	
	private static ControladorConcesionario instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorConcesionario getInstance () {
		if (instance == null) {
			instance = new ControladorConcesionario();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorConcesionario() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	

}
