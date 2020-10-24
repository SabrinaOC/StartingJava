package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class C3_bloque2_ej1 {

	public static void main(String[] args) {


		int cantidad;
		int num;
		int suma = 0;
		
		
		String str = JOptionPane.showInputDialog("¿Cuántos números quiere introducir? ");
		cantidad = Integer.parseInt(str);
		
		for ( int i = 0; i<cantidad; i++) {
		
		str = JOptionPane.showInputDialog("Dame un número ");
		num = Integer.parseInt(str);
		 
			suma += num;
		}
		
		System.out.println("La media de los números introducidos es: " + (suma/cantidad) +".");

	}

}
