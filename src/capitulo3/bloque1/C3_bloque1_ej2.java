package capitulo3.bloque1;

import javax.swing.JOptionPane;

public class C3_bloque1_ej2 {

	public static void main(String[] args) {

		int cantidad;
		int num;
		int suma = 0;
		
		
		String str = JOptionPane.showInputDialog("�Cu�ntos n�meros quiere sumar? ");
		cantidad = Integer.parseInt(str);
		
		for ( int i = 0; i<cantidad; i++) {
		
		str = JOptionPane.showInputDialog("Dame un n�mero ");
		num = Integer.parseInt(str);
		 
			if (num>=10) {
				suma += num;
			}
		}
		
		System.out.println("La suma de los n�meros mayores de 10 introducidos es: " + suma);

	}

}
