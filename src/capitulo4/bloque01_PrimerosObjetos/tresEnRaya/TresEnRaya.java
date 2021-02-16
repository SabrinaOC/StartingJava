package capitulo4.bloque01_PrimerosObjetos.tresEnRaya;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TresEnRaya extends Canvas {

	private static JFrame ventana = null;
	// Creamos lista de actores que pasaremos a canvas
	private List<CuadroDeJuego> cuadros = new ArrayList<CuadroDeJuego>();
	// Creamos matriz que usaremos para seguir jugadas
	public int matriz[][] = new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };

	// pasarle a clic para saber qué pintar y colocar en la matriz
	public int turno = 1; // empieza el jugador 1
	public int ganador;

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
		// Creamos ventana
		JFrame ventana = new JFrame("Tres en Raya Sabrina");
		ventana.setBounds(0, 0, 600, 602);
		ventana.setResizable(false);// Bloqueamos la modificación del tamaño de ventana
		ventana.getContentPane().setLayout(new BorderLayout());// elegimos diseño ventana

		// Colocamos canvas en ventana en posición central
		ventana.getContentPane().add(this, BorderLayout.CENTER);

		// Para que la ventana no se redibuje por los eventos de windows
		ventana.setIgnoreRepaint(true);
		// hacemo ventana visible
		ventana.setVisible(true);

		// Llamamos al método para crear cuadros en la lista
		cuadros = crearCuadros();

		// Enviamos eventos movimiento ratón

		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);

				for (CuadroDeJuego c : cuadros) {
					if (c.clicSobreMi(e.getX(), e.getY())) {
						c.clic();
						//utils.UtilsMatrices.mostrarMatrizPantalla(matriz);
						//System.out.println("");
						
						ganador = comprobarGanador();
						
						if (ganador == 1 || ganador == 2) {
							JOptionPane.showMessageDialog(null, "Ha ganado el jugador " + ganador);
						} 
						
						if (ganador == -1) {
							JOptionPane.showMessageDialog(null, "¡Empate! No quedan casillas vacías");
						}
					}
					
				}
			}

		});
		
		
		
		
		//comprobarGanador();

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
		setBackground(Color.WHITE);

		// System.out.println("cuadros: " + this.cuadros.size());
		for (CuadroDeJuego c : this.cuadros) {
			c.paint(g);
		}
	}

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TresEnRaya.getInstance();

	}

	/**
	 * Método para crear cuadros
	 * 
	 * @return
	 */
	public List<CuadroDeJuego> crearCuadros() {
		List<CuadroDeJuego> cuadros = new ArrayList<CuadroDeJuego>();
		// Sacamos ancho y alto del canvas y lo dividimos entre 3 para tener tamaño de
		// cada cuadro
		int ancho = this.getWidth() / 3;
		int alto = this.getHeight() / 3;
		int coordX = 0;
		int coordY = 0;
		for (int i = 0; i < 3; i++) { // La i la usaremos como eje y en matriz
			for (int j = 0; j < 3; j++) { // La j será el eje x en la matriz
				// x. y, coordX, coordY, ancho, alto
				cuadros.add(new CuadroDeJuego(j, i, coordX, coordY, ancho, alto));
				coordX += ancho;
			}
			coordY += alto;
			coordX = 0;// volvemos la x a valor 0 para pintar segunda fila

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

	public int comprobarGanador() {
		// Busco si existe un ganador mirando las filas
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
				return matriz[i][0]; // Si todos los valores de una fila son iguales, devuelvo cualquiera de los
										// elementos de esa fila
			}
		}
		// Busco si existe un ganador en las columnas
		for (int i = 0; i < matriz[0].length; i++) {
			if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i]) {
				return matriz[0][i]; // Si todos los valores de una columna son iguales, devuelvo cualquiera de los
										// elementos de esa columna
			}
		}
		// Busco un ganador en la diagonal principal
		if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
			return matriz[0][0]; // Devuelvo cualquier elemento de la diagonal principal
		}
		// Busco un ganador en la diagonal secundaria
		if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
			return matriz[0][2]; // Devuelvo cualquier elemento de la diagonal secundaria
		}

		
		// Si llegó hasta aquí no hay ganador, pero aún quedan dos posibilidades: puede
		// que queden casillas vacías o puede que no
		// Voy a suponer que no hay casillas vacías y voy a recorrer el tablero buscando
		// alguna casilla vacía
		boolean hayCasillasVacias = false;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] == 0) {
					hayCasillasVacias = true;
				}
			}
		}

		// Devuelvo valores diferentes dependiendo de si existen casillas vacías o no
		if (hayCasillasVacias == true) {
			return 0; // Indica que el juego continúa.
		} else {
			return -1; // Indica que no quedan casillas vacías, hay empate
		}
		
	}
	
	/**
	 * 
	 */
	public void cambiaTurno () {
		if (this.turno == 1) turno = 2;
		else turno = 1;
	}
	

	/**
	 * @return the matriz
	 */
	public int[][] getMatriz() {
		return matriz;
	}

	/**
	 * @param matriz the matriz to set
	 */
	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	/**
	 * @return the turno
	 */
	public int getTurno() {
		return turno;
	}

	/**
	 * @param turno the turno to set
	 */
	public void setTurno(int turno) {
		this.turno = turno;
	}

}
