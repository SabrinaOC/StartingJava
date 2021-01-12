package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;

public class PrimeraVentanaCanvas {

	public static void main(String[] args) {
		
		//Creamos ventana, ponemos sus dimensiones y la hacemos visible
		JFrame ventana = new JFrame("Primera ventana");
		ventana.setBounds(0, 0, 800, 600);
		ventana.setVisible(true);
		
		//Una vez creada la ventana, necesitamos crear un layout para colocar los elementos
		ventana.getContentPane().setLayout(new BorderLayout());
		
		//Creamos canvas
		Canvas canvas = new Canvas ();
		
		canvas.setBackground(Color.LIGHT_GRAY);
		
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		System.out.println(ventana);


	}

}
