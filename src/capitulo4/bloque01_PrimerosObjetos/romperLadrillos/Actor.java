package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public abstract class Actor {
	
	//creamos variables ubicación
	protected int x, y;
	protected int ancho, alto;
	protected BufferedImage spriteActual;
	// Posibilidad de que el actor sea animado, a trav�s del siguiente array de sprites y las variables
	// velocidadDeCambioDeSprite y unidadDeTiempo
	protected List<BufferedImage> spritesDeAnimacion = new ArrayList<BufferedImage>();
	protected int velocidadDeCambioDeSprite = 0;
	private int unidadDeTiempo = 0;

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

	public void paint(Graphics g) {
		g.drawImage(this.spriteActual, this.x, this.y, null);
	}
	
	public void actua() {
		// En el caso de que exista un array de sprites el actor actual se tratar� de una animaci�n, para eso llevaremos a cabo los siguientes pasos
				if (this.spritesDeAnimacion != null && this.spritesDeAnimacion.size() > 0) {
					unidadDeTiempo++;
					if (unidadDeTiempo % velocidadDeCambioDeSprite == 0){
						unidadDeTiempo = 0;
						int indiceSpriteActual = spritesDeAnimacion.indexOf(this.spriteActual);
						int indiceSiguienteSprite = (indiceSpriteActual + 1) % spritesDeAnimacion.size();
						this.spriteActual = spritesDeAnimacion.get(indiceSiguienteSprite);
					}
				}
	}
	
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
	
	/**
	 * @return the img
	 */
	public BufferedImage getSpriteActual() {
		return this.spriteActual;
	}

	/**
	 * @param img the img to set
	 */
	public void setSpriteActual(BufferedImage spriteActual) {
		this.spriteActual = spriteActual;
		this.ancho = this.spriteActual.getWidth();
		this.alto = this.spriteActual.getHeight();
	}
	
	/**
	 * @return the spritesDeAnimacion
	 */
	public List<BufferedImage> getSpritesDeAnimacion() {
		return spritesDeAnimacion;
	}

	/**
	 * @param spritesDeAnimacion the spritesDeAnimacion to set
	 */
	public void setSpritesDeAnimacion(List<BufferedImage> spritesDeAnimacion) {
		this.spritesDeAnimacion = spritesDeAnimacion;
	}
	
	
	

}
