package capitulo4.bloque01_PrimerosObjetos.ejerciciosNavidadSa.semaforoWebDidactica;

public class PruebaSemaforo {

	public static void main(String[] args) {
		Semaforo feurouge = new Semaforo(); //Creamos nuevo semáforo
		
		System.out.println(feurouge.toString()); //Mostramos estado semáforo
		
		//feurouge.setColorVehiculos("verde"); //Cambiamos su estado
		//System.out.println(feurouge.toString()); //Mostramos estado semáforo
		
		System.out.println("\nCambio estado semáforos");
		feurouge.cambiarEstadoSemaforo();
		System.out.println(feurouge.toString());
		
		System.out.println("\nCambio estado semáforos 2");
		feurouge.cambiarEstadoSemaforo();
		System.out.println(feurouge.toString());

	}

}

