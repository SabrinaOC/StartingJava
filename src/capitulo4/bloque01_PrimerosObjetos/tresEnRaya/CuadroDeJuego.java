package capitulo4.bloque01_PrimerosObjetos.tresEnRaya;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JOptionPane;

public class CuadroDeJuego {

	//Creamos propiedades de los cuadros del tablero
	private int posicionX, posicionY, coordXTop, coordYTop, ancho, alto;
	//Creamos boolean para controlar clic sobre cuadro
	boolean clicked = false;

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
		
		
		//Si se ha hecho clic sobre ese cuadro se llamará al método para pintar ficha
		if (this.clicked) {
			pintarFichaEnTablero(g);
		}
	}
	
	/**
	 * Método para saber dónde se hace clic
	 * @param coordX
	 * @param coordY
	 */
	public void clic () {
		//Comprobamos si es una casilla válida
		if (!comprobarCasilla()) {
			//cambiamos estado de clicked para marcar esa casilla como ocupada
			this.clicked = true;
			
			//y repintamos
			TresEnRaya.getInstance().repaint();
			TresEnRaya.getInstance().revalidate();
		}
		
		
		
		//System.out.println("se ha hecho clic en x " + this.posicionX + " y " + this.posicionY);

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
	
	/**
	 * Método para pintar ficha en tablero
	 * @param g
	 */
	public void pintarFichaEnTablero(Graphics g) {
		
		//Dependiendo del turno, pintaremos una cosa u otra
		//aprovecharemos también para cambiar el turno
		if (TresEnRaya.getInstance().getTurno() == 1) {
			g.setColor(Color.RED);
			g.drawOval(this.coordXTop + 20, this.coordYTop + 20 , this.ancho - 40, this.alto - 40);
			TresEnRaya.getInstance().setTurno(2);
		} else {
			g.setColor(Color.GREEN);
			g.drawRect(this.coordXTop + 20, this.coordYTop + 20, this.ancho - 40, this.alto - 40);
			//g.drawLine(coordXTop, coordYTop + this.alto, 10, this.alto);
			TresEnRaya.getInstance().setTurno(1);
			
		}
		
	}
	
	public boolean comprobarCasilla() {
		if (this.clicked) {
			System.out.println("Casilla ocupada");
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
