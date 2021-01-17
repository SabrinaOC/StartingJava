package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Clase que sobrescribe un objeto de tipo Canvas. Lo utilizaremos para poder pintar sobre él todo lo que queramos
 */

public class MiCanvasSa extends Canvas{
	
	/**
	 * Sobrescritura del méotod paint(), aquí tengo el control sobre aquello que se va a pintar en pantalla.
	 * Como queremos pintar distintos objetos la haremos abstracta, para que cada subclase se pinte a su forma.
	 */
	
	@Override
	public void paint(Graphics g) {
		
		/*g.setColor(getForeground());
		g.setFont(getFont().deriveFont(20f));
		g.drawString("Esto es una prueba", 70, 70);*/
		
		
		//Pintamos círculo
		g.setColor(Color.GREEN);
		g.fillOval(400, 400, 100, 100);
		
		//Pintamos rectángulo
		g.setColor(Color.RED);
		g.fillRect(100, 100, 200, 100);
		
		//Pintamos triángulo
		g.setColor(Color.BLUE);
		
		//Para pintar un polígono necesitamos marcar los puntos del eje x (primer array),
		//los puntos del eje y (segundo array) y la longitud de estos arrays (tercer elemento)
		g.fillPolygon(new int [] {800, 900, 1000 }, new int [] {600, 300, 600}, 3);
	}

}
