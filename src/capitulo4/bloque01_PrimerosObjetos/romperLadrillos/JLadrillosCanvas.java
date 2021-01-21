package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class JLadrillosCanvas extends Canvas {

	// Creamos lista de actores que pintaremos
	List<Actor> actores = null;

	/**
	 * Constructor
	 * 
	 * @param actores
	 */
	public JLadrillosCanvas(List<Actor> actores) {
		super();
		this.actores = actores;
	}

	@Override
	public void paint(Graphics g) {
		this.setBackground(Color.black);

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
	}

}
