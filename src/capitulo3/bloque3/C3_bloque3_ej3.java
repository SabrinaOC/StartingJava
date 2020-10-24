package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class C3_bloque3_ej3 {

	public static void main(String[] args) {


		int num;
		int mayor;
				
		
		String str = JOptionPane.showInputDialog("Dame un número");
		num = Integer.parseInt(str);
		
		mayor = num;
				
		do {
		
		str = JOptionPane.showInputDialog("Dame un número");
		num = Integer.parseInt(str);
		
		 if (num != 0) {
		    if (num>mayor) {
		    	mayor = num;
		    } 
		 }
		}
		
		while (num != 0);

		System.out.println("El mayor de los números introducidos es " + mayor +".");
		
	}

}
