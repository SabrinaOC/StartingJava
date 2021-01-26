package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;


import java.awt.Color;
import java.awt.Graphics;


public class Player extends Actor{

	static int ancho = 71, alto = 13;
	private int velocidadX = 5;
	
	
	/**
	 * 
	 */
	public Player() {
		super();
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
		
	}
	
	public void mover (int x, int y) {
		this.x = x;
		this.y = y;
		
		ArkanoidCanvas canvas = Arkanoid.getInstance().getCanvas();

		// Comprobamos si el ratón sale por la derecha
		if (this.x > (canvas.getWidth() - ancho)) {
			this.x = canvas.getWidth() - ancho;
		}
		// Compruebo si el ratón sale por abajo
		if (this.y > (canvas.getHeight() - alto)) {
			this.y = canvas.getHeight() - alto;
		}
	}
}
