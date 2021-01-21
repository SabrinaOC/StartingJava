package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Actor{

	static int ancho = 71, alto = 13;
	
	
	/**
	 * 
	 */
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 */
	public Player(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		
		g.fillRoundRect(this.x, this.y, ancho, alto, 10, 10);
		
	}


	@Override
	public void actua() {
		// TODO Auto-generated method stub
		
	}
}
