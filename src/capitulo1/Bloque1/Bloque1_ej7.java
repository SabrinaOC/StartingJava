package capitulo1.Bloque1;

import javax.swing.JOptionPane;

public class Bloque1_ej7 {

	public static void main(String[] args) {

		int num;
		
		String str = JOptionPane.showInputDialog("Inserte un n�mero");
		num = Integer.parseInt(str);
		
		num = ~num+1;
		
		System.out.println("El complemento a dos del n�mero introducido es: " +num);
		
	}

}
