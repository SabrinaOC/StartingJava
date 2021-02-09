package capitulo6_Recursos.dateYCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;


/**
 * Crea un programa en Java que pida al usuario la introducción de una fecha a
 * través de JOptionPane. El usuario te especificará un dato de tipo String y tú
 * debes convertirlo a un objeto de tipo java.util.Date utilizando
 * SimpleDateFormat. A continuación realiza las siguientes acciones
 * 
 * - Con el objeto java.util.Date, crea un objeto de tipo Calendar y que
 * represente la misma fecha que ha introducido el usuario.
 * 
 * - Obtén en pantalla los siguientes campos: año, mes, día, hora, minuto y
 * segundo. Cada campo debe aparecer en una línea de la consola. Debes obtener
 * cada campo desde el objeto java.util.Date y desde el objeto Calendar. Es
 * decir, cada campo debe ser obtenido dos veces en pantalla.
 * 
 * - Utiliza el objeto de tipo Calendar para obtener nuevas fechas e imprimirlas
 * en pantalla: suma 3 días, resta 2 semanas, suma 300 días, suma 4 años.
 * 
 * @author F541U
 *
 */

public class Ej01_Fecha_Usuario {

	public static void main(String[] args) {
		
		//Pedimos datos al usuario
		String fechaUs = JOptionPane.showInputDialog("Introduzca la fecha:");
		//Creamos formato
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fechaPars = null;
		try {
			fechaPars = formato.parse(fechaUs);//Le damos formato
		} catch (ParseException e) {
			System.out.println("Error en el parseo de la fecha");//Creamos mensaje de error por si no funcionase
			e.printStackTrace();
		}
		System.out.println("Fecha parseada: " + formato.format(fechaPars));//Mostramos en pantalla
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(fechaPars);
		
		System.out.println("Año con Calendar: " + calendario.get(Calendar.YEAR));
		System.out.println("Año con Date: " + new SimpleDateFormat("yyyy").format(fechaPars));
	}

}
