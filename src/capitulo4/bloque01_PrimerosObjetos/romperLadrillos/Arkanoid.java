package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Arkanoid {
	

	private static int FPS = 60; //Variable fotogramas/seg
	private static List<Actor> actores = new ArrayList<Actor>(); //Creamos lista de actores que pasaremos a canvas
	private static ArkanoidCanvas canvas = null; //La creamos como variable estática para que todos los métodos tengan acceso
	private static JFrame ventana = null; //Hacemos lo mismo con la ventana
	private static Player jugador = null;
	
	//Propiedad estática necesaria para crear patrón singleton
	private static Arkanoid instance = null;
	
	/**
	 * Método que permite la creación de solo un objeto de la clase
	 * @return
	 */
	public static Arkanoid getInstance () {
		if (instance == null) { //Si no hay instancia se crea,
			instance = new Arkanoid();
			return instance;
		} else { //de lo contrario, se devuelve la existente
			return instance;
		}
	}
	
	/**
	 * Constructor Arkanoid
	 */
	public Arkanoid() {
		
		//Creamos ventana
		ventana = new JFrame("Rompeladrillos Sa");
		ventana.setBounds(0, 0, 440, 600);
		ventana.setResizable(false);//Bloqueamos la modificación del tamaño de ventana
		ventana.getContentPane().setLayout(new BorderLayout());//elegimos diseño ventana
		
		actores = crearActores();
		
		//Creamos canvas para colocar en ventana
		canvas = new ArkanoidCanvas(actores);
		
		//Enviamos eventos movimiento ratón
		
		canvas.addMouseMotionListener(new MouseAdapter () {

			@Override
			public void mouseMoved(MouseEvent e) { //Usamos adaptador
				super.mouseMoved(e);
				jugador.mover(e.getX());
			} 
			
		});
		
		//Detectamos movimiento por teclado
		
		canvas.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				jugador.keyPressed(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				super.keyReleased(e);
				jugador.keyReleased(e);
			}
			
		});
		
		//Colocamos canvas en ventana en posición central
		ventana.getContentPane().add(canvas, BorderLayout.CENTER); 
		
		//Para que la ventana no se redibuje por los eventos de windows
		ventana.setIgnoreRepaint(true);
		//hacemo ventana visible
		ventana.setVisible(true);
		
		// Tras mostrar la ventana, consigo que el foco de la ventana vaya al
		// Canvas, para que pueda escuchar los eventos del teclado
		canvas.requestFocus();
		
		// Control del evento de cierre de ventana
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		ventana.addWindowListener(new WindowAdapter() {//Clase anónima para establecer comportamiento de ventana al 
			@Override 									//detectarse acción cierre ventana
			public void windowClosing(WindowEvent e) {
				cierreJuego();
				}
		});
		
				
	}
	
	/**
	 * Método principal
	 * @param args
	 */
	public static void main(String[] args) {
	//Lanzamos juego, bucle infinito que terminará cuando el jugador cierre la ventana
		Arkanoid.getInstance().jugar();
	}
	
	/**
	 * Método para crear objetos de tipo actor en lista
	 * @return
	 */
	public List<Actor> crearActores() {
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
		
		jugador = new Player();
		actores.add(jugador);
		actores.add(new Bola());
		return actores;
	}
	

	/**
	 * Método para lanzar y correr juego
	 */
	public void jugar () {
		int millisPorFrame = 1000/FPS;
		//Comenzamos bucle infinito, empieza el juego
		do {
			//Volvemos a pintar tantas veces como frames por segundo tengamos
			//para lograrlo, tenemos que calcular cuantos milisegundos tarda canvas en repintarse
			long millisIniciales = new Date().getTime();
			canvas.repaint();
			
			//A continuación, hacemos que los diferentes actores realicen su movimiento
			for (Actor a: actores) {

					a.actua();

			}
			
			//Volvemos a calcular milis para luego hacer una resta y calcular tiempo de ejecución
			long millisFinales = new Date(). getTime();
			int millisEjecucion = (int) (millisFinales - millisIniciales);
			
			//Ahora calculamos tiempo de espera para obtener 60 fps
			int millisEspera = millisPorFrame - millisEjecucion;
			
			//Usamos operador ternario para establecer condición de espera
			millisEspera = (millisEspera < 0)? 0 : millisEspera;
			// "Duermo" el proceso principal durante los milllis calculados.
			try {
				Thread.sleep(millisEspera);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		} while (true);
	}
	
	public void cierreJuego() {
		String opciones [] = {"Aceptar", "Cancelar"};//Creamos opciones que aparecerán en ventana
		int choice = JOptionPane.showOptionDialog(ventana, "¿Quiere abandonar el juego?", "Abandonar aplicación", 
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
				if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
	}

	/**
	 * @return the canvas
	 */
	public ArkanoidCanvas getCanvas() {
		return canvas;
	}
	
	
}
