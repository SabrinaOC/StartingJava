package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Graphics;

public abstract class Actor {
	
	//creamos variables ubicación
	protected int x, y;

	/**
	 * Constructor por defecto
	 */
	public Actor() {
		super();
	}

	/** Constructor con parámetros
	 * @param x
	 * @param y
	 */
	public Actor(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public abstract void paint(Graphics g);

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
	
	
	
	

}
