package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.ventanaConCanvas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 * Paquete "ventanaConCanvas". Crea un programa Java que muestre una ventana en
 * pantalla. La ventana tendrá un panel principal con un layout de tipo
 * BorderLayout. En el centro del panel incorpora un objeto Canvas, creado por
 * ti, que muestre en el interior de la ventana: un rectángulo relleno de color
 * rojo, un círculo relleno de color verde y un triángulo relleno de color azul.
 * Debes investigar como mostrar en el Canvas el rectángulo y el triángulo (que
 * en realidad es un polígono de tres lados).
 * 
 * @author F541U
 *
 */
public class PrimeraVentanaCanvas {

	public static void main(String[] args) {

		// Creamos ventana, ponemos sus dimensiones y la hacemos visible
		JFrame ventana = new JFrame("Primera ventana");
		ventana.setBounds(0, 0, 1200, 700);
		
		// Una vez creada la ventana, necesitamos crear un layout para colocar los
		// elementos
		ventana.getContentPane().setLayout(new BorderLayout());
		//ventana.getContentPane().add();
		
		//Creamos canvas para pintar sobre él
		MiCanvasSa canvas = new MiCanvasSa();
		//JColorChoser color = new JColorChoser();
		
		canvas.setBackground(Color.YELLOW);
		
		//Añadimos nuestro canvas a nuestra ventana en posición central
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);

		//Mostramos ventana en pantalla
		ventana.setVisible(true);

		//Definimos la acción por defecto al cerrar ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
