package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.circuitoElectronico;

public class Circuito {

	public static void main(String[] args) {
		
		//Creamos los componentes
		Componente bat = new Bateria ("pila", 5);
		Componente res = new Resistencia ("resistencia", 5);
		Componente led = new Bombilla ("led", "azul");
		Componente interruptor = new Interruptor ("pila", "tecla");
		
		//Establecemos componentes anteriores y siguientes
		bat.setComponenteAnterior(interruptor);
		bat.setComponenteSiguiente(res);
		
		res.setComponenteAnterior(bat);
		res.setComponenteSiguiente(led);
		
		led.setComponenteAnterior(res);
		led.setComponenteSiguiente(interruptor);
		
		interruptor.setComponenteAnterior(led);
		interruptor.setComponenteSiguiente(bat);
		
		
		//Mostramos en pantalla
		System.out.println(bat);
		System.out.println(res);
		System.out.println(led);
		System.out.println(interruptor);
		
		

	}

}
