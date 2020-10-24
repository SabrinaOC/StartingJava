package capitulo3.bloque1;

import javax.swing.JOptionPane;

public class C3_bloque1_ej3 {

	public static void main(String[] args) {


		int cantidad;
		int num;
		int contPos = 0;
		int contNeg = 0;
		
		
		String str = JOptionPane.showInputDialog("¿Cuántos números quiere clasificar? ");
		cantidad = Integer.parseInt(str);
		
		for ( int i = 0; i<cantidad; i++) {
		
		str = JOptionPane.showInputDialog("Dame un número ");
		num = Integer.parseInt(str);
		 
			if (num>=0) {
				contPos++;
			} else {
				contNeg++;
			}
		}
		
		System.out.println("La cantidad de números positivos es: " + contPos + ".");
		System.out.println("La cantidad de números negativos es: " + contNeg +".");

	}

}
