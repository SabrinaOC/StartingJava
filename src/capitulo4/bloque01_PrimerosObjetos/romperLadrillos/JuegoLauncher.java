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
		for (int i = 0; i < 48; i++) {
		actores.add(new Ladrillo());
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
