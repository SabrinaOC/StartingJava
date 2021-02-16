package examenes.examen16_2_21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JOptionPane;

public class D_properties {

	/**
	 * Crea un fichero de propiedades y una clase Java que lo lea. Todas las
	 * propiedades deben aparecer en la consola, leídas del fichero. Debe existir al
	 * menos una propiedad de los siguientes tipos: i. Una propiedad de tipo String.
	 * ii. Una propiedad de tipo entero. iii. Una propiedad de tipo flotante. iv.
	 * Una propiedad de tipo boolean v. Una propiedad de tipo String que represente
	 * una fecha en formado dd/MM/yyyy HH:mm:ss. Debes leer la fecha en un objeto de
	 * tipo Date. A continuación, debes obtener un objeto de tipo Calendar, a partir
	 * del objeto de tipo Date. Por último, saca en consola seis mensajes diferentes
	 * sobre la fecha: año, mes, día, hora (formato de 24H), minutos y segundos.
	 */

	private static Properties propiedades = null;

	public D_properties() {
		super();
	}

	/**
	 * 
	 * @return
	 */
	private static Properties getPropiedades() {
		if (propiedades == null) {
			propiedades = new Properties();

			try {
				// Una forma de leer el fichero de propiedades
//				propiedades.load(propiedades.getClass().getResourceAsStream("/tutorialJava/capitulo6_Recursos/ejemplo.properties"));

				// Otra forma de leer el fichero de propiedades
				File file = new File("./src/examenes/examen16_2_21/ejemplo.properties");
				System.out.println("Fichero encontrado: " + file.exists());
				propiedades.load(new FileReader(file));

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return propiedades;
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static String getProperty(String nombrePropiedad) {
		return getPropiedades().getProperty(nombrePropiedad);
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static int getIntProperty(String nombrePropiedad) {
		return Integer.parseInt(getPropiedades().getProperty(nombrePropiedad));
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static Float getFloatProperty(String nombrePropiedad) {
		return Float.parseFloat(getPropiedades().getProperty(nombrePropiedad));
	}

	/**
	 * 
	 * @param nombrePropiedad
	 * @return
	 */
	public static boolean getBooleanProperty(String nombrePropiedad) {
		return Boolean.parseBoolean(getPropiedades().getProperty(nombrePropiedad));
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		String nombre = D_properties.getProperty("NOMBRE");
		String fecha = D_properties.getProperty("NACIMIENTO");
		int edad = D_properties.getIntProperty("EDAD");
		float alt = D_properties.getFloatProperty("ALTURA");
		boolean isStudent = D_properties.getBooleanProperty("ESTUDIANTE");

		System.out.println("Nombre leído del fichero de propiedades: " + nombre);
		System.out.println("Edad leída del fichero de propiedades: " + edad);
		System.out.println("Altura leída del fichero de propiedades: " + alt);
		System.out.println("Fecha leída del fichero de propiedades: " + fecha);
		System.out.println("Estudiante leída del fichero de propiedades: " + isStudent);

		// Fecha con date

		// Creamos formato
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date fechaPars = null;
		try {
			fechaPars = formato.parse(fecha);// Le damos formato
		} catch (ParseException e) {
			System.out.println("Error en el parseo de la fecha");// Creamos mensaje de error por si no funcionase
			e.printStackTrace();
		}
		System.out.println("Fecha parseada: " + formato.format(fechaPars));// Mostramos en pantalla

		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fechaPars);

		// Mostramos datos a partir de calendar
		// Sacamos año
		System.out.println("\nAño con Calendar: " + calendario.get(Calendar.YEAR));

		// Sacamos mes
		System.out.println("\nMes con Calendar: " + calendario.get(Calendar.MONTH));

		// Sacamos día
		System.out.println("\nDía con Calendar: " + calendario.get(Calendar.DAY_OF_MONTH));

		// Sacamos hora
		System.out.println("\nHora con Calendar: " + calendario.get(Calendar.HOUR_OF_DAY));

		// Sacamos minuto
		System.out.println("\nMinuto con Calendar: " + calendario.get(Calendar.MINUTE));

		// Sacamos segundo
		System.out.println("\nSagundo con Calendar: " + calendario.get(Calendar.SECOND));

	}

}
