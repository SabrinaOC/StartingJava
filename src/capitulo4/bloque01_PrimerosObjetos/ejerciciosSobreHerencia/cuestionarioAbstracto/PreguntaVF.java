package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.cuestionarioAbstracto;

import java.util.Scanner;


public class PreguntaVF extends Pregunta{
	
	//Como este tipo de pregunta es de tipo V / F, creamos propiedades respuesta
	//para recoger la respuesta del usuario y respuestaCorrecta (V/F) para 
	//después comprobar aciertos

	private String respuestaCorrecta = "";
	
	

	/**
	 * 
	 */
	public PreguntaVF() {
		super();
		
	}

	/**Constructor con enunciado y respuesta correcta
	 * @param enunciado
	 */
	public PreguntaVF(String enunciado, String respuestaCorrecta) {
		super(enunciado);
		this.respuestaCorrecta = respuestaCorrecta;
	}

	@Override
	public void mostrarEnPantalla() {
		System.out.println("\n" + this.enunciado + "\nIntroduzca V o F:");
		
		//Recogemos respuesta usuario
		Scanner sc = new Scanner(System.in);
		this.respuestaUsuario = sc.nextLine();
		
	}

	/**
	 * Método para comprobar si la respuesta del usuario es correcta
	 */
	@Override
	public boolean esCorrecta() {
		if (this.respuestaUsuario.equalsIgnoreCase(respuestaCorrecta)) {
			return true;
		}
		return false;
	}

}
