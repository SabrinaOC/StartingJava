package examenes.examen18_03_21;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class VentanaApp {

	Cliente actual = null;
	
	private JFrame frame;
	private JTextField jtfId;
	private JTextField jtfNombre;
	private JTextField jtfApellido;
	private JTextField jtfLocalidad;
	private JTextField jtfDni;
	private JTextField jtfEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaApp window = new VentanaApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaApp() {
		initialize();
		this.actual = Controlador.getInstance().findPrimero();
		mostrarClienteEnPantalla();
		
		// Control del evento de cierre de ventana
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {// Clase anónima para establecer comportamiento de ventana al
			@Override // detectarse acción cierre ventana
			public void windowClosing(WindowEvent e) {
				String opciones[] = { "Aceptar", "Cancelar" };// Creamos opciones que aparecerán en ventana
				int choice = JOptionPane.showOptionDialog(frame, "¿Quiere abandonar la aplicación?", "Abandonar aplicación",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, "Aceptar");
				if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}
	
	/**
	 * Método para mostrar cliente actual en pantalla BBDD --> App
	 */
	public void mostrarClienteEnPantalla() {
		//si el Fabricante actual es distinto de nulo
		if (this.actual != null) {
			//vamos rellenando sus distintas propiedades
			this.jtfId.setText("" + this.actual.getId());
			this.jtfNombre.setText(this.actual.getNombre());
			this.jtfApellido.setText(this.actual.getApellido());
			this.jtfLocalidad.setText(this.actual.getLocalidad());
			this.jtfDni.setText(this.actual.getDni());
			this.jtfEmail.setText(this.actual.getEmail());
		}
	}
	
	/**
	 * Método para mostrar fabricante desde pantalla App -->BBDD
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setNombre(jtfNombre.getText());
		this.actual.setApellido(jtfApellido.getText());
		this.actual.setLocalidad(jtfLocalidad.getText());
		this.actual.setDni(jtfDni.getText());
		this.actual.setEmail(jtfEmail.getText());
	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		frame.getContentPane().add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		frame.getContentPane().add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfApellido = new JTextField();
		GridBagConstraints gbc_jtfApellido = new GridBagConstraints();
		gbc_jtfApellido.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido.gridx = 1;
		gbc_jtfApellido.gridy = 2;
		frame.getContentPane().add(jtfApellido, gbc_jtfApellido);
		jtfApellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Localidad:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfLocalidad = new JTextField();
		GridBagConstraints gbc_jtfLocalidad = new GridBagConstraints();
		gbc_jtfLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_jtfLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfLocalidad.gridx = 1;
		gbc_jtfLocalidad.gridy = 3;
		frame.getContentPane().add(jtfLocalidad, gbc_jtfLocalidad);
		jtfLocalidad.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DNI/NIE:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfDni = new JTextField();
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 4;
		frame.getContentPane().add(jtfDni, gbc_jtfDni);
		jtfDni.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfEmail = new JTextField();
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 5;
		frame.getContentPane().add(jtfEmail, gbc_jtfEmail);
		jtfEmail.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = Controlador.getInstance().findPrimero();
				mostrarClienteEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = Controlador.getInstance().findAnterior(actual.getId());
				mostrarClienteEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		JButton btnNeSiguiente = new JButton(">");
		btnNeSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = Controlador.getInstance().findSiguiente(actual.getId());
				mostrarClienteEnPantalla();
			}
		});
		panel.add(btnNeSiguiente);
		
		JButton btnNUltimo = new JButton(">>");
		btnNUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = Controlador.getInstance().findUltimo();
				mostrarClienteEnPantalla();
			}
		});
		panel.add(btnNUltimo);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//vaciamos campos
				vaciarCampos();
				
			}
		});
		panel.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//llamamos al método guardar que guardará o modificará dependiendo del id
				guardar();
				
			}
		});
		panel.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//llamamos al método eliminar
				eliminar();
				
			}
		});
		panel.add(btnEliminar);
	}
	
	/**
	 * Método para guardar
	 */
	private void guardar() {
		//primero cargamos en nuestra variable "actual" los valores del fabricante que se muestran en pantalla
		cargarActualDesdePantalla();
		
		//Antes de insertar en la bbdd comprobamos que se tenemos un email válido si lo es, pasamos a modificar
		
		if (isRight()) {
		
		
		//Para comprobar si se trata de un registro nuevo o uno existente que se va a modificar usamos un if
		
		if (this.actual.getId() != 0) {
		//a continuación llamamos al método modificar (controladorFabricante)
			int regAfect = Controlador.getInstance().modificar(this.actual);
			if (regAfect > 0) {
				//si el valor de la variable regAfect es mayor que 0, significa que se ha modificado correctamente
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		//si el id es 0, significa que se está guardando un nuevo fabricante, por tanto, el procedimiento es distinto
		else {
			//creamos variable para recoger id del nuevo fabricante y llamamos al método nuevo de ControladorFabricante
			int idNuevoReg = Controlador.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				//actualizamos el id del registro que insertamos
				this.jtfId.setText("" + idNuevoReg);
				JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
			}
		}
		
		} else {
			JOptionPane.showMessageDialog(null, "Correo inválido. Inserte uno correcto.");
		}
		
	}
	
	/**
	 * 
	 */
	public void vaciarCampos() {
		//lo ponemos a 0 para usarlo como bandera a la hora de guardar, sabremos si se trata de una modificación o una inserción
				
		jtfId.setText("0");
		jtfNombre.setText("");
		jtfApellido.setText("");
		jtfLocalidad.setText("");
		jtfDni.setText("");
		jtfEmail.setText("");
		
	}
	
	
	/**
	 * 
	 */
	public void eliminar() {
		//preguntamos al usuario si está seguro de seguir adelante
		String posiblesRespuestas[] = {"Sí","No"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Desea eliminar?", "Gestión de clientes", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
		
		if (opcionElegida == 0) {
			int regAfect = Controlador.getInstance().eliminar(this.actual.getId());
		
			if (regAfect > 0) {
				//llamamos al método vaciar vampos para que visualmente se observe que se ha realizado la acción deseada
				vaciarCampos();
				JOptionPane.showMessageDialog(null, "Registro eliminado");
		}
		}
	}

	/**
	 * 
	 * @return
	 */
	public boolean isRight() {
		// Convertimos el array de string a char para comprobar requisitos
		String check = this.jtfEmail.getText();
		boolean blank = false, arr = false, punto = false;//booleans para comprobación final partimos de que ninguna condición se cumple
		char wanted = '@', dot = '.';
		
		int posArr = 0, posPunt = 0;
		char letras[] = check.toCharArray();// Convertimos string a array de char para hacer comprobaciones
		for (int i = 0; i < letras.length; i++) {
						
				if (Character.isWhitespace(letras[i]) == true) {
					blank = true;
				}
				if (letras[i] == wanted) {
					arr = true;
					//si encontramos arroba guardamos su posición en variable auxiliar
					posArr = i;
				}
				if (letras[i] == dot) {
					//si el caracter que hay en esa posición es un punto, cambiamos boolean y guardamos su posición
					punto = true;
					posPunt = i;
				}

				
			}
			//si el punto está después de la arroba, comparamos los booleans
			if (posPunt > posArr) {
		
			if (arr && punto && blank==false) {
				return true;
			}
			return false;
			} else { //si no, devolvemos false
				return false;
			}
			
		}
	
}
