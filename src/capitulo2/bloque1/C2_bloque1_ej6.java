package capitulo2.bloque1;

import javax.swing.JOptionPane;

public class C2_bloque1_ej6 {

	public static void main(String[] args) {

		int N;

		String str = JOptionPane.showInputDialog("Inserte un número para saber si es par o no:");
		N = Integer.parseInt(str);

		if (N % 2 == 0) {
			System.out.println("El número " + N + " es par.");
		} else {
			System.out.println("El número " + N + " es impar.");
		}

	}

}
