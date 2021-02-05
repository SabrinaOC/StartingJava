package capitulo4.bloque01_PrimerosObjetos.romperLadrillos;

import java.awt.BorderLayout;
import java.awt.Rectangle;
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
	private  List<Actor> actores = new ArrayList<Actor>(); //Creamos lista de actores que pasaremos a canvas
	private ArkanoidCanvas canvas = null; //La creamos como variable estática para que todos los métodos tengan acceso
	private JFrame ventana = null; //Hacemos lo mismo con la ventana
	private Player jugador = null;
	private static List<Actor> actoresParaIncorporar = new ArrayList<Actor>();
	private List<Actor> actoresEliminar = new ArrayList<Actor>();
	
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
		
	// Realizamos la carga de los recursos en memoria
		ResourcesCache.getInstance().cargarRecursosEnMemoria();
		
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
			actores.add(new Ladrillo(x, y, 51, 20));
			x += 53;//Cada vuelta del bucle cambia x para no superponer ladrillos
			}
			y += 22;//Cada vez que demos una vuelta al primer bucle
					//añadimos 22 al y (eje vertical) para que no se superpongan los ladrillos
			x = 0; //Volvemos x a 0 para comenzar segunda fila
		}
		
		jugador = new Player();
		actores.add(jugador);
		actores.add(new Bola(200, 500, 15, 15));
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
			canvas.pintaEscena();
			
			//A continuación, hacemos que los diferentes actores realicen su movimiento
			for (Actor a: actores) {

					a.actua();

			}
			//Tras pintar actores en pantalla, detectamos colisiones y actualizamos la lista de actores
			detectaColisiones();
			
			actualizaActores();
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
	
	private void detectaColisiones() {
		for (Actor actor1 : this.actores) {
			// Creamos un rectángulo para este actor tomando sus medidas y posición como base
			Rectangle rect1 = new Rectangle(actor1.getX(), actor1.getY(), actor1.getAncho(), actor1.getAlto());
			// Comprobamos posición de este con cualquier otro actor
			for (Actor actor2 : this.actores) {
				// Evitamos comparar un actor consigo mismo, ya que eso siempre provocaría una colisión y no tiene sentido
				if (!actor1.equals(actor2)) {
					// Creamos un rectángulo para el actor 2, igual que hicimos con el 1
					Rectangle rect2 = new Rectangle(actor2.getX(), actor2.getY(), actor2.getAncho(), actor2.getAlto());
					// Si los dos rectángulos tienen alguna intersección, notificamos una colisión en los dos actores
					if (rect1.intersects(rect2)) {
						actor1.colisionaCon(actor2); // El actor 1 colisiona con el actor 2
						actor2.colisionaCon(actor1); // El actor 2 colisiona con el actor 1
					}
				}
			}
		}
	}
	
	/**
	 * Método llamado para incorporar nuevos actores
	 * @param a
	 */
	public void incorporaNuevoActor (Actor a) {
		this.actoresParaIncorporar.add(a);
	}
	
	/**
	 * Método para actualizar listas de objetos que se muestran en pantalla
	 */
	private void actualizaActores() {
	// Incorporo los nuevos actores
		for (Actor a : this.actoresParaIncorporar) {
			this.actores.add(a);
		}
		this.actoresParaIncorporar.clear(); // Limpio la lista de actores a incorporar, ya están incorporados
		
	// Elimino los actores que se deben eliminar
		for (Actor a : this.actoresEliminar) {
			this.actores.remove(a);
		}
		this.actoresEliminar.clear(); // Limpio la lista de actores a eliminar, ya los he eliminado
	}
	
	/**
	 * Método llamado para eliminar actores del juego
	 * @param a
	 */
	public void eliminaActor (Actor a) {
		this.actoresEliminar.add(a);
	}

	/**
	 * @return the canvas
	 */
	public ArkanoidCanvas getCanvas() {
		return canvas;
	}

	/**
	 * @return the actores
	 */
	public List<Actor> getActores() {
		return actores;
	}

	/**
	 * @param actores the actores to set
	 */
	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}
	
	
	
	
}
