package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.util.List;

public class ArkanoidCanvas extends Canvas {

	// Creamos lista de actores que pintaremos
	List<Actor> actores = null;

	private BufferStrategy strategy = null;
	
	
	/**
	 * Constructor
	 * 
	 * @param actores
	 */
	public ArkanoidCanvas(List<Actor> actores) {
		super();
		this.actores = actores;
	}

	
	public void pintaEscena() {
		//Hay que usar strategy solo una vez
		if (this.strategy == null) { //Si es null, lo creo
			this.createBufferStrategy(2); //Buffer doble estrategia
			strategy = getBufferStrategy(); //Acceso a estrategia
			Toolkit.getDefaultToolkit().sync();//REsuelve problema Linux
		}
		//Ahora necesitamos un objeto gráfico que nos permita pintar en canvas
		
		Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
		
			
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		for (Actor a :this.actores ) {
			a.paint(g);
		}
		//this.setBackground(Color.black);

		/*
		// Pintamos los ocho primeros ladrillos
		for (int i = 0; i < 8; i++) {
			g.setColor(Color.BLUE);
			this.actores.get(i).paint(g);
		}

		// Pintamos los siguientes 8 ladrillos
		for (int i = 8; i < 16; i++) {
			g.setColor(Color.YELLOW);
			this.actores.get(i).paint(g);
		}

		// Pintamos tercer bloque de ladrillos
		for (int i = 16; i < 24; i++) {
			g.setColor(Color.RED);
			this.actores.get(i).paint(g);
		}

		// Pintamos cuarto bloque de ladrillos
		for (int i = 24; i < 32; i++) {
			g.setColor(Color.GREEN);
			this.actores.get(i).paint(g);
		}

		// Pintamos quinto bloque de ladrillos
		for (int i = 32; i < 40; i++) {
			g.setColor(Color.ORANGE);
			this.actores.get(i).paint(g);
		}

		// Pintamos sexto bloque de ladrillos
		for (int i = 40; i < 48; i++) {
			g.setColor(Color.MAGENTA);
			this.actores.get(i).paint(g);
		}

		// Pintamos barra jugador y bola
		this.actores.get(this.actores.size() - 2).paint(g);// el player siempre sera penúltimo de la lista
		this.actores.get(this.actores.size() - 1).paint(g);// la bola siempre será el último actor de la lista
		*/
		
		
		strategy.show();//Mostramos estrategia en pantalla
	}
	
	

}
