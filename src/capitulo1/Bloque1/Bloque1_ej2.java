package capitulo1.Bloque1;

import javax.swing.JOptionPane;

public class Bloque1_ej2 {

	public static void main(String[] args) {
		
		
	int numEntero;
	float numFlotante;
	double numDob;
	
	String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
	numEntero = Integer.parseInt(str);
	
	System.out.println("El número entero es: " + numEntero);
	
	
	
	str = JOptionPane.showInputDialog("Escriba un número flotante: ");
	numFlotante = Float.parseFloat(str);
	
	System.out.println("El número flotante es: " + numFlotante);	
	
	
	str = JOptionPane.showInputDialog("Ahora escriba el número más largo que se le ocurra: ");
	numDob = Double.parseDouble(str);
	System.out.println("El número más largo es: " + numDob);
			
	
	}
}
