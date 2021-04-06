package capitulo8_SWING.fabricante.ventaCochesRafa.entidades;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JOptionPane;

public class Cliente {
	
	private int id;
	private String nombre, apellidos, localidad, dni;
	private Date fechaNac;
	private boolean activo;
	
	
	/**
	 * Constructor por defecto
	 */
	public Cliente() {
		super();
	}

	//GETTERS Y SETTERS
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localiad) {
		this.localidad = localiad;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		
		this.fechaNac = fechaNac;
	}
	
	/*
	public void setFechaNac(String fechaNac) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaPars = null;
		
		try {
			fechaPars = (Date) formato.parse(fechaNac);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Error en el formato de la fecha (dd/MM/yyyy)");
		}
		 java.sql.Date this.fechaNac = java.sql.Date.valueOf(formato.format(getFechaNac()));
		
		//this.fechaNac = fechaNac;
		
	}*/
	


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	

}
