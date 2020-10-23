package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class C2_bloque3_ej3 {

	public static void main(String[] args) {
		
		System.out.println("Menu");
		System.out.println("1.- C�lculo de la hipotenusa de un tri�ngulo");
		System.out.println("2.- C�lculo de la superficie de una circunferencia ");
		System.out.println("3.- C�lculo del per�metro de una circunferencia");
		System.out.println("4.- C�lculo del �rea de un rect�ngulo");
		System.out.println("5.- C�lculo del �rea de un tri�ngulo");
		System.out.println("0.- Salir");
		
		
		
		int opcion;
		boolean volver = true;
			
		
					
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("�Qu� opci�n quieres?"));
			
			System.out.println("Menu");
			System.out.println("1.- C�lculo de la hipotenusa de un tri�ngulo");
			System.out.println("2.- C�lculo de la superficie de una circunferencia ");
			System.out.println("3.- C�lculo del per�metro de una circunferencia");
			System.out.println("4.- C�lculo del �rea de un rect�ngulo");
			System.out.println("5.- C�lculo del �rea de un tri�ngulo");
			System.out.println("0.- Salir");
			
		switch (opcion) {
			case 0: 
				System.out.println("El programa ha finalizado. ");
				volver = false;
			break;
			case 1:
				
				int cateto1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el cateto 1 "));
				int cateto2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el cateto 2 "));
				
				float solucion;
				
				solucion = (float) (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
				solucion = (float) Math.pow(solucion, 1/(float)2);
				System.out.println("La hipotenusa es: " + solucion);
				volver = true;
				
				break;				

			case 2:
				int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de la circunferencia "));
				float area;
				
				area = (float) (3.1416 * Math.pow(radio, 2));
				System.out.println("El �rea de la circunferencia es: " + area);
				volver = true;
				
				break;
			case 3:
				int rad = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de la circunferencia "));
				float perimetro;
				
				perimetro = (float) ((2 * 3.1416) * rad);
				System.out.println("El per�metro de la circunferencia de radio " + rad +" es: " + perimetro);
				volver = true;
				
				break;				
			case 4:
				int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
				int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
				int rectangulo;
				
				rectangulo = base * altura;
				System.out.println("El �rea del rect�ngulo de base " + base +" y altura " + altura +" es " +rectangulo +" .");
				volver = true;
				
				break;
			case 5:
				int baseT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base "));
				int alturaT = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura "));
				int triangulo;
				
				triangulo = (baseT * alturaT) / 2;
				System.out.println("El �rea del tri�ngulo de base " + baseT +" y altura " + alturaT +" es: " +triangulo +" .");
				volver = true;
				
				break;
			default:
				System.out.println("El valor no corresponde a ninguna opci�n \nPor favor, introduzca otro valor."); 
				volver = true;
				
			}
		
		} 
		while (volver == true);

	}

}
