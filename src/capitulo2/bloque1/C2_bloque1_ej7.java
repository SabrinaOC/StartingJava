package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class C2_bloque1_ej7 {

	public static void main(String[] args) {
		
		
		int num;
		
		
		String str = JOptionPane.showInputDialog("Inserte un n�mero: ");
		num = Integer.parseInt(str);
		
		if ((num & 1) == 1) {
			System.out.println("El n�mero introducido " + num +" es impar.");
		} else {
			System.out.println("El n�mero introducido " + num +" es par.");
		}
		
		
	}

}







