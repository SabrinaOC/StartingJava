package capitulo8_SWING.fabricante.ventaCochesRafa.entidades;

public class Concesionario {

	private int id;
	private String cif, nombre, localidad;
	
	
	/**
	 * Constructor por defecto
	 */
	public Concesionario() {
		super();
	}

	//GETTERS Y SETTERS

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
}
