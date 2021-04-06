package capitulo8_SWING.fabricante.ventaCochesRafa.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import capitulo8_SWING.fabricante.ventaCochesRafa.controladores.ControladorCliente;
import capitulo8_SWING.fabricante.ventaCochesRafa.controladores.ControladorVenta;
import capitulo8_SWING.fabricante.ventaCochesRafa.entidades.Venta;

import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelVenta extends JPanel {
	private JTextField jtfId;
	private JTextField jtfIdCliente;
	private JTextField jtfIdCon;
	private JTextField jtfIdCoche;
	private JTextField jtfFecha;
	private JTextField jtfPrecio;
	private Venta actual = null;

	public PanelVenta() {
		actual = ControladorVenta.getInstance().findPrimero();
		iniciar();
		cargarActualEnPantalla();
	}
	
	/**
	 * Create the panel.
	 */
	public void iniciar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		jtfId.setEnabled(false);
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Id cliente:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfIdCliente = new JTextField();
		GridBagConstraints gbc_jtfIdCliente = new GridBagConstraints();
		gbc_jtfIdCliente.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdCliente.gridx = 1;
		gbc_jtfIdCliente.gridy = 1;
		add(jtfIdCliente, gbc_jtfIdCliente);
		jtfIdCliente.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Id concesionario:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfIdCon = new JTextField();
		GridBagConstraints gbc_jtfIdCon = new GridBagConstraints();
		gbc_jtfIdCon.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdCon.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdCon.gridx = 1;
		gbc_jtfIdCon.gridy = 2;
		add(jtfIdCon, gbc_jtfIdCon);
		jtfIdCon.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Id coche:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfIdCoche = new JTextField();
		GridBagConstraints gbc_jtfIdCoche = new GridBagConstraints();
		gbc_jtfIdCoche.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdCoche.gridx = 1;
		gbc_jtfIdCoche.gridy = 3;
		add(jtfIdCoche, gbc_jtfIdCoche);
		jtfIdCoche.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Fecha:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfFecha = new JTextField();
		GridBagConstraints gbc_jtfFecha = new GridBagConstraints();
		gbc_jtfFecha.insets = new Insets(0, 0, 5, 0);
		gbc_jtfFecha.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFecha.gridx = 1;
		gbc_jtfFecha.gridy = 4;
		add(jtfFecha, gbc_jtfFecha);
		jtfFecha.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Precio venta:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfPrecio = new JTextField();
		GridBagConstraints gbc_jtfPrecio = new GridBagConstraints();
		gbc_jtfPrecio.insets = new Insets(0, 0, 5, 0);
		gbc_jtfPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfPrecio.gridx = 1;
		gbc_jtfPrecio.gridy = 5;
		add(jtfPrecio, gbc_jtfPrecio);
		jtfPrecio.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actual = ControladorVenta.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		panel.add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		panel.add(btnEliminar);

	}
	
	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfId.setText("" + this.actual.getId());
			this.jtfIdCliente.setText("" + this.actual.getIdCliente());
			this.jtfIdCon.setText("" + this.actual.getIdConcesionario());
			this.jtfIdCoche.setText("" + this.actual.getIdCoche());
			this.jtfFecha.setText("" + this.actual.getFecha());
			this.jtfPrecio.setText("" + this.actual.getPrecio());
		}
	}
	
	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfId.setText("0");
		this.jtfIdCliente.setText("");
		this.jtfIdCon.setText("");
		this.jtfIdCoche.setText("");
		this.jtfFecha.setText("");
		this.jtfPrecio.setText("");
	
	}
	
	/**
	 * 
	 */
	private void eliminar() {
		String posiblesRespuestas[] = {"Sí","No"};
		// En esta opci�n se utiliza un showOptionDialog en el que personalizo el icono mostrado
		int opcionElegida = JOptionPane.showOptionDialog(null, "¿Desea eliminar?", "Gestión venta de coches", 
		        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, posiblesRespuestas, posiblesRespuestas[1]);
	    if(opcionElegida == 0) {
	    	int regsAfectados = ControladorVenta.getInstance().eliminar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}

}
