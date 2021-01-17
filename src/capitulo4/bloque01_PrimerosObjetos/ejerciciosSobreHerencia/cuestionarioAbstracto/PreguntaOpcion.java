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
		System.out.println(this.enunciado);
		
		//Tras mostrar el enunciado recorremos el array de respuestas 
		//y las mostramos en pantalla
		for (int i = 0; i < posiblesRespuestas.length; i++) {
			System.out.println(i + ". " + this.posiblesRespuestas[i]);
		}
		
		System.out.println("Introdizca el número que corresponda con su respuesta:");
		 
		//recogemos la respuesta del usuario en la variable creada para ello
		Scanner sc = new Scanner(System.in);
		this.respuestaUsuario = sc.nextLine();
		
	}

	/**
	 * Método para comprobar si la respuesta es correcta
	 */
	@Override
	public boolean esCorrecta() {
		//Dado que la respuesta del usuario se recoge como string, 
		//haremos un parse int para compararlo y ver si es correcto
		
		int respuestaUs = Integer.parseInt(this.respuestaUsuario);
		
		//Pasamos a comprobar si la respuesta es correcta
		
		if (respuestaUs == this.respuestaCorrecta) {
			return true;
		}
		
		return false;
	}

}
