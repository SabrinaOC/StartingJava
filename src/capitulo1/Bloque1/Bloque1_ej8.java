package capitulo1.Bloque1;

import javax.swing.JOptionPane;

public class Bloque1_ej8 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int num3;

		String str = JOptionPane.showInputDialog("Introduzca un número: ");
		num1 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca otro número:");
		num2 = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Introduzca un número:");
		num3 = Integer.parseInt(str);

		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El número más grande es: " + num1);
			} else {
				System.out.println("El número más grande es: " + num3);
			}
		} else if (num2 > num3) {
			System.out.println("El número más grande es: " + num2);
		} else {
			System.out.println("El número más grande es: " + num3);
		}

//ahora el menor

		if (num1 < num2) {
			if (num1 < num3) {
				System.out.println("El número más pequeño es: " + num1);
			} else {
				System.out.println("El número más pequeño es: " + num3);
			}
		} else if (num2 < num3) {
			System.out.println("El número más pequeño es: " + num2);
		} else
			System.out.println("El número más pequeño es: " + num3);
	}
	
	
	
	
		
	}


