package capitulo1.Bloque1;

import javax.swing.JOptionPane;

public class Bloque1_ej2 {

	public static void main(String[] args) {
		
		
	int numEntero;
	float numFlotante;
	double numDob;
	
	String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
	numEntero = Integer.parseInt(str);
	
	System.out.println("El n�mero entero es: " + numEntero);
	
	
	
	str = JOptionPane.showInputDialog("Escriba un n�mero flotante: ");
	numFlotante = Float.parseFloat(str);
	
	System.out.println("El n�mero flotante es: " + numFlotante);	
	
	
	str = JOptionPane.showInputDialog("Ahora escriba el n�mero m�s largo que se le ocurra: ");
	numDob = Double.parseDouble(str);
	System.out.println("El n�mero m�s largo es: " + numDob);
			
	
	}
}
