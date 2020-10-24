package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class C3_bloque3_ej4 {

	public static void main(String[] args) {


		int num;
		int menor;
				
		
		String str = JOptionPane.showInputDialog("Dame un número");
		num = Integer.parseInt(str);
		
		menor = num;
				
		do {
		
		str = JOptionPane.showInputDialog("Dame un número");
		num = Integer.parseInt(str);
		
		 if (num != 0) {
		    if (num<menor) {
		    	menor = num;
		    } 
		 }
		}
		
		while (num != 0);

		System.out.println("El menor de los números introducidos es " + menor +".");

	}

}
