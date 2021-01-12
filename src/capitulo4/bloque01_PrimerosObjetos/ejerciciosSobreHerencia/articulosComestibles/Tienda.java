package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.articulosComestibles;

public class Tienda {

	/**
	 * Método principal
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//Creamos artículos
		Perecedero manzana = new Perecedero(3, "Manzana", (float)0.60, 2021);
		Perecedero leche = new Perecedero(15, "Leche", (float)0.58, 2021);
		NoPerecedero miel = new NoPerecedero(74, "Miel", (float)8.55);
		NoPerecedero sal = new NoPerecedero(27, "Sal", (float)0.30);
		
		//Mostramos artículos creados en pantalla
		System.out.println(manzana);
		System.out.println(leche);
		System.out.println(miel);
		System.out.println(sal);

	}

}
