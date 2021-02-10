package capitulo6_Recursos.dateYCalendar;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Obtén la hora actual en Roma (Italia), también la hora actual en Sidney
 * (Australia) y calcula la diferencia horaria entre las dos ciudades.
 * 
 * @author F541U
 *
 */

public class Ej02_Hora_Roma {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		//Creamos calendar para hora de Roma
		Calendar roma = Calendar.getInstance(TimeZone.getTimeZone("Europe/Rome"));
		//Mostramos en pantalla
		System.out.println("Hora actual en Roma " + roma.get(Calendar.HOUR_OF_DAY));
		
		//Creamos calendar para hora de Sydney
		Calendar syd = Calendar.getInstance(TimeZone.getTimeZone("Asutralia/Sydney"));
		//Mostramos en pantalla
		System.out.println("Hora actual en Sydney " + syd.get(Calendar.HOUR_OF_DAY));
		
		
		

	}

}
