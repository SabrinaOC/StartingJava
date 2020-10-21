package capitulo2.capitulo2.bloque2;

import javax.swing.JOptionPane;

public class C2_bloque2_ej1 {

	public static void main(String[] args) {


		int num;
		int i = 0;

		int sumaNeg = 0;
		int sumaBajos = 0;
		int sumaMedios = 0;
		int sumaGrandes = 0;

		for (i = 0; i < 5; i++) {

			String str = JOptionPane.showInputDialog("Introduzca un número: ");
			num = Integer.parseInt(str);

			if (num < 0) {
				sumaNeg += num;
			} else {
				if (num >= 0 && num <= 25) {
					sumaBajos += num;
				} else {
					if (num >= 26 && num <= 250) {
						sumaMedios += num;
					} else {
						sumaGrandes += num;
					}
				}
			}

		}

		System.out.println("La suma de los números negativos es: " + sumaNeg 
				+ "\nLa suma de los números bajos es: " + sumaBajos 
				+ "\nLa suma de los números medios es: " + sumaMedios
				+ "\nLa suma de los números grandes es: " + sumaGrandes);
		
	}

}
