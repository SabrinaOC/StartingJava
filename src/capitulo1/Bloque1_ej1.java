package capitulo1;

import javax.swing.JOptionPane;

public class Bloque1_ej1 {

	public static void main(String[] args) {
		
		int numEntero;
		float numFlotante;
		double numDob;
		
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		numEntero = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero flotante: ");
		numFlotante = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Introduzca un n�mero largo");
		numDob = Double.parseDouble(str);
		
		System.out.println("El n�mero entero es: " + numEntero);
		System.out.println("El n�mero flotante es:" + numFlotante);
		System.out.println("El n�mero largo es: " +numDob);
	}

}
