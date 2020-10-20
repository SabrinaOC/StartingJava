package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class C2_bloque1_ej4 {

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
		
//		num1 = 3;
//		num2 = 2;
//		num3 = 4;
//		num4 = 5;
//		num5 = 1;
		

		if (num1 < num2) {
			if (num1 < num3) {
				if (num1 < num4) {
					if (num1 < num5) {
						System.out.println("El menor de los números introducidos es: " + num1);
					} 
				}
			}

		} else {
			if (num2 < num3) {
				if (num2 < num4) {
					if (num2 < num5) {
						System.out.println("El menor de los números introducidos es: " + num2);
					} else {
						if (num5<num4 && num5<num3 && num5<num2) {
							System.out.println("El menor de los números introducidos es: " + num5);
						}
					}
				} else {
					if (num4<num1 && num4<num3 && num4<num5) {
						System.out.println("El menor de los números introducidoes es: " + num4);
					}
				}

			} else {
				if (num3 < num1) {
					if (num3 < num4) {
						if (num3 < num5) {
							System.out.println("El menor de los números introducidos es: " + num3);
						}

					}

				} 

			}

		}

	}

}
