package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.Scanner;

public class PreguntaOpcion extends Pregunta{

	private String posiblesRespuestas [] = new String [4];
	private int respuestaCorrecta;
	
	
	
	/**
	 * 
	 */
	public PreguntaOpcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param enunciado, posiblesRespuestas, respuestaCorrecta
	 */
	public PreguntaOpcion(String enunciado, String [] posiblesRespuestas, int respuestaCorrecta) {
		super(enunciado);
		this.posiblesRespuestas = posiblesRespuestas;
		this.respuestaCorrecta = respuestaCorrecta;
	}

	/**
	 * Método para mostrar en pantalla
	 */
	@Override
	public void mostrarEnPantalla() {
		System.out.println("\n" + this.enunciado);
		
		//Tras mostrar el enunciado recorremos el array de respuestas 
		//y las mostramos en pantalla
		for (int i = 0; i < posiblesRespuestas.length; i++) {
			System.out.println(i + ". " + this.posiblesRespuestas[i]);
		}
		
	
		 
		//recogemos la respuesta del usuario en la variable creada para ello
		
		do {
		System.out.println("Introdizca el número que corresponda con su respuesta:");
		Scanner sc = new Scanner(System.in);
		this.respuestaUsuario = sc.nextLine();
		} while (Integer.parseInt(this.respuestaUsuario) != 0 && Integer.parseInt(this.respuestaUsuario) != 1
				&& Integer.parseInt(this.respuestaUsuario) != 2 && Integer.parseInt(this.respuestaUsuario) !=3);
		
	}

	/**
	 * Método para comprobar si la respuesta es correcta
	 */
	@Override
	public boolean esCorrecta() {
		//Dado que la respuesta del usuario se recoge como string, 
		//haremos un parse int para compararlo y ver si es correcto		
		//y pasamos a comprobar si la respuesta es correcta
		
		if (Integer.parseInt(this.respuestaUsuario) == this.respuestaCorrecta) {
			return true;
		}
		
		return false;
	}

	/**
	 * Método para mostar respuesta correcta en pantalla
	 */
	@Override
	public String toString() {
		return "¡Ohhhh! Respuesta incorrecta. \nLa respuesta correcta era: " + respuestaCorrecta + ". " + posiblesRespuestas[respuestaCorrecta] + ".";
	}

	
	
	

}
