package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class C2_bloque1_ej1 {
	
	public static void main(String[] args) {

	int num1;
	int num2;
	
	
	String str = JOptionPane.showInputDialog("Inserte un n�mero");
	num1 = Integer.parseInt(str);
	
	str = JOptionPane.showInputDialog("Inserte un n�mero");
	num2 = Integer.parseInt(str);
	
	if (num1>num2) {
		System.out.println("De los n�meros introducidos el mayor es: " +num1);
	} else {
		System.out.println("De los n�meros introducidos el mayor es: " +num2);

		
		}
	
	}
}
