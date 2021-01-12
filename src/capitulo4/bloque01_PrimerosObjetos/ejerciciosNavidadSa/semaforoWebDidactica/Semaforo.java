package capitulo4.bloque01_PrimerosObjetos.ejerciciosNavidadSa.semaforoWebDidactica;

public class Semaforo {

	private String colorVehiculos = "rojo";
	private String colorPeatones = "verde";

	/**
	 * 
	 */
	public Semaforo() {
		super();
	}

	/**
	 * @param color
	 */
	public Semaforo(String color) {
		super();
		this.colorVehiculos = color;
	}

	@Override
	public String toString() {
		return "\nEl semáforo de vehículos está en " + colorVehiculos + "."
				+ "\nEl semáforo de peatones está en " + colorPeatones + ".";
	}
	
	public void cambiarEstadoSemaforo () {
		
		if (this.colorVehiculos == "verde") { //Si actualmente está en verde, cambiamos a rojo
			this.setColorVehiculos("rojo");
			this.setColorPeatones("verde"); //También cambiamos el de peatones
		} else {
			this.setColorVehiculos("verde");
			this.setColorPeatones("rojo");
		}
		
		
		
	}
	
	//GETTERS and SETTERS
	

	/**
	 * @return the color
	 */
	public String getColorVehiculos() {
		return colorVehiculos;
	}

	/**
	 * @param color the color to set
	 */
	public void setColorVehiculos(String color) {
		this.colorVehiculos = color;
	}

	/**
	 * @return the colorPeatones
	 */
	public String getColorPeatones() {
		return colorPeatones;
	}

	/**
	 * @param colorPeatones the colorPeatones to set
	 */
	public void setColorPeatones(String colorPeatones) {
		this.colorPeatones = colorPeatones;
	}
	
	
}
