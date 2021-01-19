package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class JLadrillosCanvas extends Canvas{

	//Creamos lista de actores que pintaremos
	List<Actor> actores = null;

	
	/**Constructor
	 * @param actores
	 */
	public JLadrillosCanvas(List<Actor> actores) {
		super();
		this.actores = actores;
	}
	
	@Override
	public void paint (Graphics g) {
		this.setBackground(Color.black);
		
		/*g.setColor(Color.CYAN);
		this.actores.get(0).paint(g);//pintamos primer bloque
		int j = 1;//variable para recorrer toda la lista
		for (int i = 1; i < 8; i++) { //Con la i controlamos las filas para ir cambiando colores
			//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
			//para que no se muestren como un solo bloque
			this.actores.get(i).setX(this.actores.get(j-1).getX() + 53);
			
			g.setColor(Color.CYAN);
			actores.get(j).paint(g);
			j++;
		}
		
		g.setColor(Color.PINK);
		this.actores.get(j).paint(g);//pintamos sgundo bloque
		this.actores.get(j).setY(this.actores.get(j-1).getY() + 32);//cambiamos y
		j ++;//variable para recorrer toda la lista
		for (int i = 1; i < 8; i++) { //Con la i controlamos las filas para ir cambiando colores
			//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
			//para que no se muestren como un solo bloque
			this.actores.get(i).setX(this.actores.get(j-1).getX() + 53);
			this.actores.get(i).setY(this.actores.get(j-1).getY() + 32);
			
			g.setColor(Color.PINK);
			actores.get(j).paint(g);
			j++;
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Primer bloque de ladrillos color cyan
		g.setColor(Color.BLUE);
		this.actores.get(0).paint(g);//pintamos primer bloque
		for (int i = 1; i < 8; i++) {//recorremos array para pintar ladrillos
			//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
			//para que no se muestren como un solo bloque
			this.actores.get(i).setX(this.actores.get(i-1).getX() + 53);
			g.setColor(Color.BLUE);
			this.actores.get(i).paint(g);
			
			
		
		}

//		//Segundo bloque bloque de ladrillos color rosa
		//Damos valores correctos a x e y
		this.actores.get(8).setX(0);
		this.actores.get(8).setY(this.actores.get(7).getY()+22);
		
		g.setColor(Color.YELLOW);
		this.actores.get(8).paint(g);//pintamos primer bloque
		
		for (int i = 9; i < 16; i++) {//recorremos array para pintar ladrillos
		//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
		//para que no se muestren como un solo bloque
			this.actores.get(i).setX(this.actores.get(i-1).getX() + 53);
			this.actores.get(i).setY(this.actores.get(i-1).getY());
			g.setColor(Color.YELLOW);
			this.actores.get(i).paint(g);
		}
		
		
		//Tercer bloque bloque de ladrillos color rosa
		//Damos valores correctos a x e y
		this.actores.get(16).setX(0);
		this.actores.get(16).setY(this.actores.get(15).getY()+22);
				
		g.setColor(Color.RED);
		this.actores.get(16).paint(g);//pintamos primer bloque
				
		for (int i = 17; i < 24; i++) {//recorremos array para pintar ladrillos
		//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
		//para que no se muestren como un solo bloque
			this.actores.get(i).setX(this.actores.get(i-1).getX() + 53);
			this.actores.get(i).setY(this.actores.get(i-1).getY());
			g.setColor(Color.RED);
			this.actores.get(i).paint(g);
		}
		
		//Cuarto bloque bloque de ladrillos color rosa
				//Damos valores correctos a x e y
		this.actores.get(24).setX(0);
		this.actores.get(24).setY(this.actores.get(23).getY()+22);
						
		g.setColor(Color.GREEN);
		this.actores.get(24).paint(g);//pintamos primer bloque
						
		for (int i = 25; i < 32; i++) {//recorremos array para pintar ladrillos
		//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
		//para que no se muestren como un solo bloque
			this.actores.get(i).setX(this.actores.get(i-1).getX() + 53);
			this.actores.get(i).setY(this.actores.get(i-1).getY());
			g.setColor(Color.GREEN);
			this.actores.get(i).paint(g);
		}
		
		//Quinto bloque bloque de ladrillos color rosa
		//Damos valores correctos a x e y
		this.actores.get(32).setX(0);
		this.actores.get(32).setY(this.actores.get(31).getY()+22);
				
		g.setColor(Color.ORANGE);
		this.actores.get(32).paint(g);//pintamos primer bloque
				
		for (int i = 33; i < 40; i++) {//recorremos array para pintar ladrillos
		//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
		//para que no se muestren como un solo bloque
			this.actores.get(i).setX(this.actores.get(i-1).getX() + 53);
			this.actores.get(i).setY(this.actores.get(i-1).getY());
			g.setColor(Color.ORANGE);
			this.actores.get(i).paint(g);
		}
		
		//Sexto bloque bloque de ladrillos color rosa
		//Damos valores correctos a x e y
		this.actores.get(40).setX(0);
		this.actores.get(40).setY(this.actores.get(39).getY()+22);
						
		g.setColor(Color.MAGENTA);
		this.actores.get(40).paint(g);//pintamos primer bloque
						
		for (int i = 41; i < 48; i++) {//recorremos array para pintar ladrillos
		//Primero calculamos posición basándonos en el ladrillo anterior dejando un espacio
		//para que no se muestren como un solo bloque
		this.actores.get(i).setX(this.actores.get(i-1).getX() + 53);
		this.actores.get(i).setY(this.actores.get(i-1).getY());
		g.setColor(Color.MAGENTA);
		this.actores.get(i).paint(g);
		}
		
		//Pintamos barra jugador y bola
		this.actores.get(this.actores.size()-2).paint(g);//el player siempre sera penúltimo de la lista
		this.actores.get(this.actores.size()-1).paint(g);//la bola siempre será el último actor de la lista
	}
	
	
}
