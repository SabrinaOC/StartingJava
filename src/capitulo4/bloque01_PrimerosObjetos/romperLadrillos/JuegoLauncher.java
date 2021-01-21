package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class JuegoLauncher {
	

	public static void main(String[] args) {
		//Creamos lista de actores que pasaremos a canvas
		List<Actor> actores = new ArrayList<Actor>();
	
		//Creamos variables x e y para crear actores en posición adecuada
		int y = 0; 
		int x = 0;
		
		for (int j = 0; j < 6; j++) {
		for (int i = 0; i < 8; i++) {
			actores.add(new Ladrillo (x, y));
			x += 53;//Cada vuelta del bucle cambia x para no superponer ladrillos
			}
			y += 22;//Cada vez que demos una vuelta al primer bucle
					//añadimos 22 al y (eje vertical) para que no se superpongan los ladrillos
			x = 0; //Volvemos x a 0 para comenzar segunda fila
		}
		actores.add(new Player());
		actores.add(new Bola());
		
		
		//Creamos ventana
		JFrame ventana = new JFrame("Rompeladrillos Sa");
		ventana.setBounds(0, 0, 440, 600);
		ventana.setResizable(false);//Bloqueamos la modificación del tamaño de ventana
		ventana.getContentPane().setLayout(new BorderLayout());//elegimos diseño ventana
		
		//Creamos canvas para colocar en ventana
		JLadrillosCanvas canvas = new JLadrillosCanvas(actores);
		
		//Colocamos canvas en ventana en posición central
		ventana.getContentPane().add(canvas, BorderLayout.CENTER); 
		//hacemo ventana visible
		ventana.setVisible(true);
		
		

		//Programamos que deje de ejecutarse al cerrar ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
