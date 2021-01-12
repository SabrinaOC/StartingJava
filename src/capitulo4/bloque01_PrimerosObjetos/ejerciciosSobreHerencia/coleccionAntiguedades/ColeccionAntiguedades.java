package capitulo4.bloque01_PrimerosObjetos.ejerciciosSobreHerencia.coleccionAntiguedades;


public class ColeccionAntiguedades {

	/**
	 * Método principal
	 * @param args
	 */
public static void main(String[] args) {
	
	//Creamos objetos
	Coche r5 = new Coche (1987, "Francia", 20000, "Renault");
	Cuadro jardin = new Cuadro (1872, "España", (float)65724.87, "Goya");
	Mueble mesa = new Mueble (1712, "Inglaterra", (float) 5964.71, "mesa");
	Joya collar = new Joya (1785, "Rusia", (float)50000000, "oro blanco");
	
	//Mostramos objetos creados en pantalla
	System.out.println(r5);
	System.out.println(jardin);
	System.out.println(mesa);
	System.out.println(collar);
	}
	
}
