package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class C2_bloque3_ej2 {

	public static void main(String[] args) {
		
		System.out.println("Menu");
		System.out.println("1.- Ra�z");
		System.out.println("2.- Potencia");
		System.out.println("3.- M�dulo");
		
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("�Qu� opci�n quieres?"));
		
		switch (opcion) {
		case 1: 
			int radicando = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radicando"));
			int indice = Integer.parseInt(JOptionPane.showInputDialog("Introduce el �ndice"));
			float solucion;
			
			solucion = (float) Math.pow(radicando, 1/(float)indice);
			System.out.println("La ra�z " + indice  +" de " + radicando +" es " + solucion);
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
			int exponente = Integer.parseInt(JOptionPane.showInputDialog("Introduce el exponente"));
			float potencia;
			
			potencia = (float) Math.pow(base, exponente);
			System.out.println(base +" elevado a " + exponente +" = " + potencia);
			break;
		case 3:
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dividendo: "));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el divisor: "));
			int resto;
			
			resto = num1 % num2;
			System.out.println("El resto de la divisi�n " + num1 +" / " + num2 +" es " + resto);
			break;
			
		}

	}

}
