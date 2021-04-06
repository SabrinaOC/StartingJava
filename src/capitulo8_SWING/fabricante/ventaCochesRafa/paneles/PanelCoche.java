package capitulo8_SWING.fabricante.ventaCochesRafa.paneles;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

import capitulo8_SWING.fabricante.ventaCochesRafa.controladores.ControladorCoche;
import capitulo8_SWING.fabricante.ventaCochesRafa.controladores.ControladorFabricante;
import capitulo8_SWING.fabricante.ventaCochesRafa.controladores.ControladorVenta;
import capitulo8_SWING.fabricante.ventaCochesRafa.entidades.Coche;
import capitulo8_SWING.fabricante.ventaCochesRafa.entidades.Fabricante;

import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class PanelCoche extends JPanel {
	
	Coche actual = new Coche();
	
	private JTextField jtfIdCoche;
	private JTextField jtfBastidor;
	private JTextField jtfModelo;
	private JTextField jtfColor;
	private JComboBox <Fabricante> jcbFabricante;

	/**
	 * Create the panel.
	 */
	public PanelCoche() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtfIdCoche = new JTextField();
		jtfIdCoche.setEnabled(false);
		GridBagConstraints gbc_jtfIdCoche = new GridBagConstraints();
		gbc_jtfIdCoche.insets = new Insets(0, 0, 5, 0);
		gbc_jtfIdCoche.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfIdCoche.gridx = 1;
		gbc_jtfIdCoche.gridy = 0;
		add(jtfIdCoche, gbc_jtfIdCoche);
		jtfIdCoche.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Fabricante:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jcbFabricante = new JComboBox <Fabricante>();
		GridBagConstraints gbc_jcbFabricante = new GridBagConstraints();
		gbc_jcbFabricante.insets = new Insets(0, 0, 5, 0);
		gbc_jcbFabricante.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbFabricante.gridx = 1;
		gbc_jcbFabricante.gridy = 1;
		add(jcbFabricante, gbc_jcbFabricante);
		
		JLabel lblNewLabel_2 = new JLabel("Bastidor:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfBastidor = new JTextField();
		GridBagConstraints gbc_jtfBastidor = new GridBagConstraints();
		gbc_jtfBastidor.insets = new Insets(0, 0, 5, 0);
		gbc_jtfBastidor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfBastidor.gridx = 1;
		gbc_jtfBastidor.gridy = 2;
		add(jtfBastidor, gbc_jtfBastidor);
		jtfBastidor.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Modelo:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfModelo = new JTextField();
		GridBagConstraints gbc_jtfModelo = new GridBagConstraints();
		gbc_jtfModelo.insets = new Insets(0, 0, 5, 0);
		gbc_jtfModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfModelo.gridx = 1;
		gbc_jtfModelo.gridy = 3;
		add(jtfModelo, gbc_jtfModelo);
		jtfModelo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Color:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfColor = new JTextField();
		GridBagConstraints gbc_jtfColor = new GridBagConstraints();
		gbc_jtfColor.insets = new Insets(0, 0, 5, 0);
		gbc_jtfColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfColor.gridx = 1;
		gbc_jtfColor.gridy = 4;
		add(jtfColor, gbc_jtfColor);
		jtfColor.setColumns(10);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 5;
		add(panel, gbc_panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnPrimero = new JButton("<<");
		btnPrimero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorCoche.getInstance().findPrimero();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnPrimero);
		
		JButton btnAnterior = new JButton("<");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorCoche.getInstance().findAnterior(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnAnterior);
		
		JButton btnSiguiente = new JButton(">");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorCoche.getInstance().findSiguiente(actual.getId());
				cargarActualEnPantalla();
			}
		});
		panel.add(btnSiguiente);
		
		JButton btnUltimo = new JButton(">>");
		btnUltimo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actual = ControladorCoche.getInstance().findUltimo();
				cargarActualEnPantalla();
			}
		});
		panel.add(btnUltimo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		panel.add(btnGuardar);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vaciarCampos();
			}
		});
		panel.add(btnNuevo);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				eliminar();
			}
		});
		panel.add(btnEliminar);
		
		//cargamos todos los datos de los fabricantes
		cargarDatosFabricantes();
		//A continuación llamamos al método encontrar primero y lo mostramos en pantalla
		this.actual = ControladorCoche.getInstance().findPrimero();
		cargarActualEnPantalla();

	}
	
	/**
	 * 
	 */
	private void cargarDatosFabricantes() {
		List<Fabricante> fabricantes = ControladorFabricante.getInstance().findAll();
		
		for (Fabricante f : fabricantes) {
			this.jcbFabricante.addItem(f);
		}
	}
	

	/**
	 * 
	 */
	private void cargarActualEnPantalla() {
		if (this.actual != null) {
			this.jtfIdCoche.setText("" + this.actual.getId());
			this.jtfBastidor.setText(this.actual.getBastidor());
			this.jtfModelo.setText(this.actual.getModelo());
			this.jtfColor.setText(this.actual.getColor());
			
			// Carga del fabricante adecuado comparando el id de fabricante del coche actual con el id del fabricante del combobox
			for (int i = 0; i < this.jcbFabricante.getItemCount(); i++) {
				if (this.actual.getIdFab() == (this.jcbFabricante.getItemAt(i)).getId()) {
					this.jcbFabricante.setSelectedIndex(i);
				}
			}
		}
	}
	
	/**
	 * 
	 */
	private void cargarActualDesdePantalla() {
		this.actual.setId(Integer.parseInt(jtfIdCoche.getText()));
		this.actual.setBastidor(jtfBastidor.getText());
		this.actual.setModelo(jtfModelo.getText());
		this.actual.setColor(jtfColor.getText());
		this.actual.setIdFab(((Fabricante) jcbFabricante.getSelectedItem()).getId());
	}
	
		
	/**
	 * 
	 */
	private void guardar () {
		cargarActualDesdePantalla();
		// Decido si se trata de guardar un registro existente o nuevo
		if (this.actual.getId() != 0) { // Modificación
			int regsAfec = ControladorCoche.getInstance().modificar(this.actual);
			if (regsAfec > 0) {
				JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
			}
		}
		else { // Alta -  nuevo
			int idNuevoReg = ControladorCoche.getInstance().nuevo(this.actual);
			if (idNuevoReg > 0) {
				this.jtfIdCoche.setText("" + idNuevoReg);
				JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
			}
		}
	}
	

	/**
	 * 
	 */
	private void vaciarCampos() {
		this.jtfIdCoche.setText("0");
		this.jtfBastidor.setText("");
		this.jtfModelo.setText("");
		this.jtfColor.setText("");
	
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
	    	int regsAfectados = ControladorCoche.getInstance().eliminar(this.actual.getId());
	    	if (regsAfectados > 0) {
	    		vaciarCampos();
	    		JOptionPane.showMessageDialog(null, "Eliminado correctamente");
	    	}
	    }
	}

}
