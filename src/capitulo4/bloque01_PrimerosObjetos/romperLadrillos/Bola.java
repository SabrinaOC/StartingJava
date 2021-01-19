package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Color;
import java.awt.Graphics;

public class Bola extends Actor{

	static int ancho = 15, alto = 15;
	
	

	/**
	 * 
	 */
	public Bola() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param x
	 * @param y
	 */
	public Bola(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(150, 400, ancho, alto);
		
	}
	
	
}
