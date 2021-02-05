package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;


import java.awt.Color;
import java.awt.Graphics;



public class Ladrillo extends Actor{

	//Dado que todos los ladrillos tendrán el mismo tamaño, serán propiedades estáticas
	//ancho y alto
	//static int ancho = 51, alto = 20;

	/**
	 * 
	 */
	public Ladrillo() {
		super();
		this.ancho = 51;
		this.alto = 20;
	}

	/**
	 * @param x
	 * @param y
	 */
	public Ladrillo(int x, int y, int ancho, int alto) {
		super(x, y, ancho, alto);
		//this.ancho = 51;
		//this.alto = 20;
		
	}
	
	/**
	 * @param x
	 * @param y
	 */
	public Ladrillo(int x, int y) {
		this.ancho = 51;
		this.alto = 20;
		
	}
		
	@Override
	public void paint(Graphics g) {
		//g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
		
		switch (this.y) {//Cambiaremos el color basandonos en el valor de y
		case 0:
			g.setColor(Color.BLUE);
			g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
			break;
		case 22:
			g.setColor(Color.YELLOW);
			g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
			break;
		case 44:
			g.setColor(Color.RED);
			g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
			break;
		case 66:
			g.setColor(Color.GREEN);
			g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
			break;
		case 88:
			g.setColor(Color.ORANGE);
			g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
			break;
		case 110:
			g.setColor(Color.MAGENTA);
			g.fillRoundRect(this.x, this.y, ancho, alto, 15, 15);
		}
		
	}	
		
	@Override
	public void actua() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void colisionaCon(Actor a) {
		super.colisionaCon(a);
		//si un ladrillo choca con una bola, desaparece
		if (a instanceof Bola) {
			Arkanoid.getInstance().eliminaActor(this);
			ResourcesCache.getInstance().playSonido("explosion.wav");
			Arkanoid.getInstance().incorporaNuevoActor(new Explosion(this.x, this.y));
		}
	}

//	/**
//	 * @return the ancho
//	 */
//	public static int getAncho() {
//		return ancho;
//	}
//
//	/**
//	 * @param ancho the ancho to set
//	 */
//	public static void setAncho(int ancho) {
//		Ladrillo.ancho = ancho;
//	}
//
//	/**
//	 * @return the alto
//	 */
//	public static int getAlto() {
//		return alto;
//	}
//
//	/**
//	 * @param alto the alto to set
//	 */
//	public static void setAlto(int alto) {
//		Ladrillo.alto = alto;
//	}
//	
	
}
