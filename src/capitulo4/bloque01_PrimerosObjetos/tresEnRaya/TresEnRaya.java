package capitulo4.bloque01_PrimerosObjetos.tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import capitulo4.bloque01_PrimerosObjetos.romperLadrillos.Actor;

public class TresEnRaya extends Canvas{
	
	private static JFrame ventana = null;
	private List<CuadroDeJuego> cuadros = new ArrayList<CuadroDeJuego>(); // Creamos lista de actores que pasaremos a canva
	
	// Propiedad estática necesaria para crear patrón singleton
	private static TresEnRaya instance = null;
	
	
	/**
	 * Método que permite la creación de solo un objeto de la clase
	 * 
	 * @return
	 */
	public static TresEnRaya getInstance() {
		if (instance == null) { // Si no hay instancia se crea,
			instance = new TresEnRaya();
			return instance;
		} else { // de lo contrario, se devuelve la existente
			return instance;
		}
	}
	
	public TresEnRaya() {
		//Creamos ventana
		JFrame ventana = new JFrame("Tres en Raya Sabrina");
		ventana.setBounds(0, 0, 600, 600);
		ventana.setResizable(false);// Bloqueamos la modificación del tamaño de ventana
		ventana.getContentPane().setLayout(new BorderLayout());// elegimos diseño ventana
		
		// Colocamos canvas en ventana en posición central
		ventana.getContentPane().add(this, BorderLayout.CENTER);

		// Para que la ventana no se redibuje por los eventos de windows
		ventana.setIgnoreRepaint(true);
		// hacemo ventana visible
		ventana.setVisible(true);

		
		cuadros = crearCuadros();


		// Tras mostrar la ventana, consigo que el foco de la ventana vaya al
		// Canvas, para que pueda escuchar los eventos del teclado
		this.requestFocus();

		// Control del evento de cierre de ventana
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener(new WindowAdapter() {// Clase anónima para establecer comportamiento de ventana al
			@Override // detectarse acción cierre ventana
			public void windowClosing(WindowEvent e) {
				cierreJuego();
			}
		});
	}
	
	
	
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		System.out.println("cuadros: " + this.cuadros.size());
		for (CuadroDeJuego c : this.cuadros) {
			c.paint(g);
		}
	}

	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
		TresEnRaya.getInstance();

	}
	
	/**
	 * Método para crear cuadros
	 * @return
	 */
	public List<CuadroDeJuego> crearCuadros() {
		List<CuadroDeJuego> cuadros = new ArrayList<CuadroDeJuego>();
		//Sacamos ancho y alto del canvas y lo dividimos entre 3 para tener tamaño de cada cuadro
		int ancho = this.getWidth()/3;
		int alto = this.getHeight()/3;
		int coordX = 0;
		int coordY = 0;
		for (int i = 0; i < 3; i++) { //La i la usaremos como eje x en matriz
			for (int j = 0; j < 3; j++) { //La j será el eje y en la matriz
				//x. y, coordX, coordY, ancho, alto
				cuadros.add(new CuadroDeJuego(i, j, coordX, coordY, ancho, alto));
				coordX += ancho;
			}
			coordY += alto;
			
		}
		return cuadros;
	}
	
	/**
	 * Método para cerrar juego
	 */
	public void cierreJuego() {
		String opciones[] = { "Aceptar", "Cancelar" };// Creamos opciones que aparecerán en ventana
		int choice = JOptionPane.showOptionDialog(ventana, "¿Quiere abandonar el juego?", "Abandonar aplicación",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
		if (choice == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

}
