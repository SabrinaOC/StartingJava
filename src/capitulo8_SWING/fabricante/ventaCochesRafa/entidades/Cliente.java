package capitulo8_SWING.fabricante.ventaCochesRafa.entidades;


import java.util.Date;



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
	
	
	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	

}
