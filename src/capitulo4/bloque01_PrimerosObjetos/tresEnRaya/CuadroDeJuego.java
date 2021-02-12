package capitulo4.bloque01_PrimerosObjetos.tresEnRaya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CuadroDeJuego {

	//Creamos propiedades de los cuadros del tablero
	private int posicionX, posicionY, coordXTop, coordYTop, ancho, alto;

	/**
	 * Método constructor sin propiedades
	 */
	public CuadroDeJuego() {
		super();
	}

	/**
	 * @param posicionX
	 * @param posicionY
	 * @param coordXTop
	 * @param coordYTop
	 * @param ancho
	 * @param alto
	 */
	public CuadroDeJuego(int posicionX, int posicionY, int coordXTop, int coordYTop, int ancho, int alto) {
		super();
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.coordXTop = coordXTop;
		this.coordYTop = coordYTop;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	/**
	 * Pintado del cuadro en pantalla
	 */
	public void paint(Graphics g){
		g.setColor(Color.BLACK);
		// Pinto el ladrillo como un rect�ngulo con v�rtices redondeados
		g.drawRect(this.coordXTop, this.coordYTop, this.ancho, this.alto);
	}
	
	/**
	 * Método para saber dónde se hace clic
	 * @param coordX
	 * @param coordY
	 */
	public void clic () {
		System.out.println("clic x " + this.posicionX + " y " + this.posicionY);
		
		TresEnRaya.getInstance().getMatriz()[this.posicionX][this.posicionY] = 1;
	}
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean clicSobreMi (int x, int y) {
		if (x > this.coordXTop && x < (this.coordXTop + ancho) &&
				y > this.coordYTop && y < (this.coordYTop + alto)) {
			return true;
		}
		return false;
	}
	
	
	public void identificarEnMatriz() {
		//recorremos matriz
		
	}
	
	//GETTERS Y SETTERS

	/**
	 * @return the posicionX
	 */
	public int getPosicionX() {
		return posicionX;
	}

	/**
	 * @param posicionX the posicionX to set
	 */
	public void setPosicionX(int posicionX) {
		this.posicionX = posicionX;
	}

	/**
	 * @return the posicionY
	 */
	public int getPosicionY() {
		return posicionY;
	}

	/**
	 * @param posicionY the posicionY to set
	 */
	public void setPosicionY(int posicionY) {
		this.posicionY = posicionY;
	}

	/**
	 * @return the coordXTop
	 */
	public int getCoordXTop() {
		return coordXTop;
	}

	/**
	 * @param coordXTop the coordXTop to set
	 */
	public void setCoordXTop(int coordXTop) {
		this.coordXTop = coordXTop;
	}

	/**
	 * @return the coordYTop
	 */
	public int getCoordYTop() {
		return coordYTop;
	}

	/**
	 * @param coordYTop the coordYTop to set
	 */
	public void setCoordYTop(int coordYTop) {
		this.coordYTop = coordYTop;
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
