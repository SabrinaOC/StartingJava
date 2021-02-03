package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Graphics;

public abstract class Actor {
	
	//creamos variables ubicación
	protected int x, y;
	protected int ancho, alto;

	/**
	 * Constructor por defecto
	 */
	public Actor() {
		super();
	}
	
	/**
	 * @param x
	 * @param y
	 * @param ancho
	 * @param alto
	 */
	public Actor(int x, int y, int ancho, int alto) {
		super();
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}

	public abstract void paint(Graphics g);
	
	public abstract void actua();
	
	public void colisionaCon (Actor a) {
		
	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * @return the ancho
	 */
	public int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	
	
	

}
