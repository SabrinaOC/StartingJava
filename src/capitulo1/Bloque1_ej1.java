package capitulo1;

import javax.swing.JOptionPane;

public class Bloque1_ej1 {

	public static void main(String[] args) {
		
		int numEntero;
		float numFlotante;
		double numDob;
		
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		numEntero = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un número flotante: ");
		numFlotante = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca un número largo");
		numDob = Double.parseDouble(str);
		
		System.out.println("El número entero es: " + numEntero);
		System.out.println("El número flotante es:" + numFlotante);
		System.out.println("El número largo es: " +numDob);
	}

}
