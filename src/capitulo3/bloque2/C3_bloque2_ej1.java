package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class C3_bloque2_ej1 {

	public static void main(String[] args) {


		int cantidad;
		int num;
		int suma = 0;
		
		
		String str = JOptionPane.showInputDialog("�Cu�ntos n�meros quiere introducir? ");
		cantidad = Integer.parseInt(str);
		
		for ( int i = 0; i<cantidad; i++) {
		
		str = JOptionPane.showInputDialog("Dame un n�mero ");
		num = Integer.parseInt(str);
		 
			suma += num;
		}
		
		System.out.println("La media de los n�meros introducidos es: " + (suma/cantidad) +".");

	}

}
