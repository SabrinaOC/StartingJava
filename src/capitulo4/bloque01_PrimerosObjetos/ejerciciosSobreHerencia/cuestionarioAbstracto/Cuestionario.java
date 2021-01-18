package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;

/**
 * Paquete "cuestionarioAbstracto". Un cuestionario tipo test puede tener dos
 * tipos de preguntas: Verdadero o Falso y opción única (se ofrecen cuatro
 * opciones, y solo una es verdadera). Crear las clases necesarias para
 * representar un examen tipo test de un número fijo de 5 preguntas. El
 * cuestionario será planteado al usuario, quien responderá a las preguntas.
 * Posteriormente el programa mostrará el número de preguntas acertadas.
 * 
 * @author F541U
 *
 */

public class Cuestionario {
	
	//Creamos lista de tipo pregunta para recoger todas nuestras preguntas en un solo cuestionario

	static List <Pregunta> cuestionario = new ArrayList<Pregunta>();
		
	public static void main (String[] args) {
		
		//Creamos pregunta opción para añadir a nuestro cuestionario
		PreguntaOpcion futbol = new PreguntaOpcion("¿Cuándo se celebró el primer mundial de fúbol", 
				new String [] {"1930", "1942", "1936", "1956"}, 0);
		//Una vez creada, la añadimos a la lista
		cuestionario.add(futbol);
		
		//Creamos pregunta de tipo V/F y la añadimos a la lista
		PreguntaVF hollywood = new PreguntaVF ("Hay 10 ciudades con el nombre 'Hollywood' en EE.UU", "V");
		cuestionario.add(hollywood);
		
		//Creamos el resto del cuestionario
		PreguntaOpcion geografia = new PreguntaOpcion("¿Cuál es la capital de Kenia?",
				new String [] {"Luanda", "El Cairo", "Nairobi", "Jartum"}, 2);
		cuestionario.add(geografia);
		
		PreguntaVF nike = new PreguntaVF("El nombre de la marca 'Nike' tiene su origen en una deidad griega", "V");
		cuestionario.add(nike);
		
		PreguntaVF napoleon = new PreguntaVF("Napoleón Bonaparte murió envenenado", "F");
		cuestionario.add(napoleon);
			
	
		
		//recorremos la lista (el cuestionario) para mostrar las preguntas en pantalla
		int acierto = 0;//Creamos variable para llevar la cuenta de los aciertos del usuario
		for (int i = 0; i < cuestionario.size(); i++) {
			cuestionario.get(i).mostrarEnPantalla();
			
			//Pasamos a comprobar si la respuesta introducida es correcta
			if (cuestionario.get(i).esCorrecta()) {
				System.out.println("¡Correcto!");
				acierto ++;
			} else {
				//Mostramos la opción correcta en pantalla
				System.out.println(cuestionario.get(i).toString());				
			}
		}
		//Mostramos en pantalla el porcentaje de aciertos
		System.out.println("Ha acertado un " + ((float)acierto/cuestionario.size())*100 +"% (" + acierto + " aciertos).");
		
		
	}

}
