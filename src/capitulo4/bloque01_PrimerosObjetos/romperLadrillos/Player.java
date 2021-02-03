package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class Player extends Actor{

	//static int ancho = 71, alto = 13;
	private static int VELOCIDAD = 7;
	private boolean derecha = false, izquierda = false;
	private static int ALTURA = 520; //Estará siempre a la misma altura
							
	
	
	/**
	 * 
	 */
	public Player() {
		super();
		this.y = ALTURA;
		this.x = 180;//Definimos que se cree en mitad de la pantalla
		this.ancho = 71;
		this.alto = 13;
		
	}

	/**
	 * @param x
	 * @param y
	 */
	public Player(int x, int y, int ancho, int alto) {
		super(x, y, ancho, alto);
		this.y = ALTURA;
		ancho = 71;
		alto = 13;
		
	}
	

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		
		g.fillRoundRect(this.x, this.y, ancho, alto, 10, 10);
		
	}


	@Override
	public void actua() {
		//Comprobamos booleans de movimiento
		if (derecha == true) this.x += VELOCIDAD;
		if (izquierda == true) this.x -= VELOCIDAD;
		
		mover(this.x); //Movemos jugador
	}

	public void mover (int x) {
		this.x = x;
		
		ArkanoidCanvas canvas = Arkanoid.getInstance().getCanvas();

		// Comprobamos si el ratón sale por la derecha
		if (this.x > (canvas.getWidth() - ancho)) {
			this.x = canvas.getWidth() - ancho;
		}
		
		if (this.x < 0) { //o si se sale por la izquierda
			this.x = 0;
		}
	}
	
	/**
	 * Método para detectar tecla presionada y mover jugador
	 * @param e
	 */
	public void keyPressed(KeyEvent e) {
		//Guardamos ancho de canvas para tener un código más limpio
		ArkanoidCanvas canvas = Arkanoid.getInstance().getCanvas();
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			//Para evitar disparidad de movimiento inicial, usamos boolean
			//el actor se moverá hasta que derecha=falso
			derecha = true; break;
		case KeyEvent.VK_LEFT:
			
			izquierda = true; break;
		}
	}
	
	/**
	 * Método para detectar liberación de tecla y dejar de mover jugador	
	 * @param e
	 */
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			derecha = false;
			break;
		case KeyEvent.VK_LEFT:
			izquierda = false;
		}
	}
	
	@Override
	public void colisionaCon(Actor a) {
		super.colisionaCon(a);
		
	}
}
