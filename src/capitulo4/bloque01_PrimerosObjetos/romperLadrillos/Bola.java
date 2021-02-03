package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Color;
import java.awt.Graphics;

public class Bola extends Actor{

	//static int ancho = 15, alto = 15;
	private int velocidadX = -3, velocidadY = -3;
	
	

	/**
	 * 
	 */
	public Bola() {
		super();
		ancho = 15;
		alto = 15;
	}



	/**
	 * @param x
	 * @param y
	 */
	public Bola(int x, int y, int ancho, int alto) {
		super(x, y, ancho, alto);
		//ancho = 15;
		//alto = 15;
	}
	
	/**
	 * @param x
	 * @param y
	 */
	public Bola(int x, int y) {
		ancho = 15;
		alto = 15;
	}



	@Override
	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(this.x, this.y, ancho, alto);
		
	}


	@Override
	public void actua() {
		//Queremos que la bola se mueva en el eje x en cada fotograma
		this.x += this.velocidadX;
		//Para que no se nos salga de la ventana, cambiaremos dirección si su valor excede
		//las dimensiones de la ventana
		if (this.x < 0 || this.x > (Arkanoid.getInstance().getCanvas().getWidth()-ancho)) {
			this.velocidadX = -this.velocidadX;
		}
		
		//Hacemos lo mismo para el eje y
		this.y += this.velocidadY;
		if (this.y < 0 || this.y > (Arkanoid.getInstance().getCanvas().getHeight()-alto)) {
			this.velocidadY = -this.velocidadY;
		}
		
	}
	
	@Override
	public void colisionaCon(Actor a) {
		super.colisionaCon(a);
		if (a instanceof Player) {
			this.y = -this.y;
			//this.x += velocidadX;
		}
	}
	
}
