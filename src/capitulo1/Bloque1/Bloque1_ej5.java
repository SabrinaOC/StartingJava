package capitulo1.Bloque1;

import javax.swing.JOptionPane;

public class Bloque1_ej5 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		String str = JOptionPane.showInputDialog("Escriba un n�mero");
		num1 = Integer.parseInt(str);
		
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero ");
		num2 = Integer.parseInt(str);
		System.out.println("El valor inicial del primer n�mero era "  +num1 +" y el del segundo " +num2 +".");
		
		System.out.println("Los valores actuales para el primer y el segundo n�mero son " +num2 +" y " +num1 +", respectivamente.");
		
		
		
	}

}
