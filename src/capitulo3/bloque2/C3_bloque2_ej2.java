package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class C3_bloque2_ej2 {

	public static void main(String[] args) {


		int cantidad;
		int num;
		int mayor;
		int menor;
		
		
		String str = JOptionPane.showInputDialog("�Cu�ntos n�meros quiere comparar? ");
		cantidad = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Dame un n�mero ");
		num = Integer.parseInt(str);
		
		mayor = num;
		menor = num;
		
		for ( int i = 1; i<cantidad; i++) {
		
		str = JOptionPane.showInputDialog("Dame un n�mero ");
		num = Integer.parseInt(str);
			
				 
			if (num>mayor) {
				mayor = num;
			} 
			if (num<menor) {
				menor = num;
			}
		}
		
		System.out.println("El mayor de los n�meros introducidos es: " + mayor +".");
		System.out.println("El menor de los n�meros introducidos es: " + menor +".");
	}

}
