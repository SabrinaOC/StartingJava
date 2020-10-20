package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class C2_bloque1_ej3 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		
		String str = JOptionPane.showInputDialog("Inserte un número");
		num1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Inserte un número");
		num2 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte un número");
		num3 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte un número");
		num4 = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Inserte un número");
		num5 = Integer.parseInt(str);
		
		if (num1>num2) {
			if (num1>num3) {
				if (num1>num4) {
					if (num1>num5) {
						System.out.println("El mayor de los números introducidos es: " +num1);
					}
				}
			}
			
		} else {
			if (num2>num3) {
				if (num2>num4) {
					if (num2>num5) {
						System.out.println("El mayor de los números introducidos es: " +num2);
					}
				}
				
			} else {
				if (num3>num4) {
					if (num3>num5) {
						System.out.println("El mayor de los números introducidos es: " +num3);
					}
						
				} else {
					if (num4>num5) {
						System.out.println("El mayor de los números introducidos es: " +num4);
					} else {
						System.out.println("El mayor de los números introducidos es: " +num5);
					}
				}
					
				}
					
				}
			
		
		
		
		
		
		
		
	}

}
