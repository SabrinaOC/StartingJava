package capitulo3.bloque1;

import javax.swing.JOptionPane;

public class C3_bloque1_ej1 {

	public static void main(String[] args) {
		
		
		int num;
		int suma = 0;
		
		
		String str = JOptionPane.showInputDialog("Dame un número ");
		num = Integer.parseInt(str);
		
		for ( int i = 1; i<4; i++) {
		
		str = JOptionPane.showInputDialog("Dame un número ");
		num = Integer.parseInt(str);
		 
			if (num>=10) {
				suma += num;
			}
		}
		
		System.out.println("La suma de los números mayores de 10 introducidos es: " + suma);
	}

}
