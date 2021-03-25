package capitulo8_SWING.fabricante;
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
import java.awt.event.ActionEvent;

public class VentanaFabricantes {

	Fabricante actual = null;
	
	private JFrame frame;
	private JTextField jtfId;
	private JTextField jtfCid;
	private JTextField jtfNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFabricantes window = new VentanaFabricantes();
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
	public VentanaFabricantes() {
		initialize();
		this.actual = ControladorFabricante.getInstance().findPrimero();
		mostrarFabricanteEnPantalla();
	}

	/**
	 * Método para mostrar fabricante actual en pantalla BBDD --> App
	 */
	public void mostrarFabricanteEnPantalla() {
		//si el Fabricante actual es distinto de nulo
		if (this.actual != null) {
			//vamos rellenando sus distintas propiedades
			this.jtfId.setText(" " + this.actual.getId());
			this.jtfCid.setText(this.actual.getCif());
			this.jtfNombre.setText(this.actual.getNombre());
		}
	}
	
	/**
	 * Método para mostrar fabricante desde pantalla App -->BBDD
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfId.getText()));
		this.actual.setCif(jtfCid.getText());
		this.actual.setNombre(jtfNombre.getText());
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
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
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
		
		JLabel jlbCif = new JLabel("CIF:");
		GridBagConstraints gbc_jlbCif = new GridBagConstraints();
		gbc_jlbCif.anchor = GridBagConstraints.EAST;
		gbc_jlbCif.insets = new Insets(0, 0, 5, 5);
		gbc_jlbCif.gridx = 0;
		gbc_jlbCif.gridy = 1;
		frame.getContentPane().add(jlbCif, gbc_jlbCif);
		
		jtfCid = new JTextField();
		GridBagConstraints gbc_jtfCid = new GridBagConstraints();
		gbc_jtfCid.insets = new Insets(0, 0, 5, 0);
		gbc_jtfCid.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfCid.gridx = 1;
		gbc_jtfCid.gridy = 1;
		frame.getContentPane().add(jtfCid, gbc_jtfCid);
		jtfCid.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 2;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 2;
		frame.getContentPane().add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			//evento al pulsar botón primero
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorFabricante.getInstance().findPrimero();
				mostrarFabricanteEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorFabricante.getInstance().findAnterior(actual.getId());
				mostrarFabricanteEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorFabricante.getInstance().findSiguiente(actual.getId());
				mostrarFabricanteEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorFabricante.getInstance().findUltimo();
				mostrarFabricanteEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar();
			}
		});
		panel.add(btnGuardar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//llamamos primero al método vaciar campos para limpiar formulasio y luego lo guardamos
				vaciarCampos();
				
			}
		});
		panel.add(btnNuevo);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminar();
				
			}
		});
		panel.add(btnEliminar);
	}
	
	private void guardar() {
		//primero cargamos en nuestra variable "actual" los valores del fabricante que se muestran en pantalla
		cargarActualDesdePantalla();
		//Para comprobar si se trata de un registro nuevo o uno existente que se va a modificar usamos un if
		
		if (this.actual.getId() != 0) {
		//a continuación llamamos al método modificar (controladorFabricante)
			int regAfect = ControladorFabricante.getInstance().modificar(this.actual);
			if (regAfect > 0) {
				//si el valor de la variable regAfect es mayor que 0, significa que se ha modificado correctamente
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		//si el id es 0, significa que se está guardando un nuevo fabricante, por tanto, el procedimiento es distinto
		else {
			//creamos variable para recoger id del nuevo fabricante y llamamos al método nuevo de ControladorFabricante
			int idNuevoReg = ControladorFabricante.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				//actualizamos el id del registro que insertamos
				this.jtfId.setText("" + idNuevoReg);
				JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
			}
		}
		
	}
	
	public void vaciarCampos() {
		//lo ponemos a 0 para usarlo como bandera a la hora de guardar, sabremos si se trata de una modificación o una inserción
		jtfId.setText("0");
		jtfCid.setText("");
		jtfNombre.setText("");
		
	}
	
	public void eliminar() {
		//preguntamos al usuario si está seguro de seguir adelante
		String posiblesRespuestas[] = {"Sí","No"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Desea eliminar?", "Gestión venta de coches", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
		
		if (opcionElegida == 0) {
			int regAfect = ControladorFabricante.getInstance().eliminar(this.actual.getId());
		
			if (regAfect > 0) {
				//llamamos al método vaciar vampos para que visualmente se observe que se ha realizado la acción deseada
				vaciarCampos();
				JOptionPane.showMessageDialog(null, "Registro eliminado");
		}
		}
	}
	

}
