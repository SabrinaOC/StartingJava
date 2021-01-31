package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;


import java.awt.Graphics;

public class Ladrillo extends Actor{

	//Dado que todos los ladrillos tendrán el mismo tamaño, serán propiedades estáticas
	//ancho y alto
	static int ancho = 51, alto = 20;

	/**
	 * 
	 */
	public Ladrillo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param x
	 * @param y
	 */
	public Ladrillo(int x, int y) {
		super(x, y);
		
	}
		
	@Override
	public void paint(Graphics g) {
		g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
		
	}	
		
	@Override
	public void actua() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @return the ancho
	 */
	public static int getAncho() {
		return ancho;
	}

	/**
	 * @param ancho the ancho to set
	 */
	public static void setAncho(int ancho) {
		Ladrillo.ancho = ancho;
	}

	/**
	 * @return the alto
	 */
	public static int getAlto() {
		return alto;
	}

	/**
	 * @param alto the alto to set
	 */
	public static void setAlto(int alto) {
		Ladrillo.alto = alto;
	}
	
	
}
