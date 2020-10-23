package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class C2_bloque3_ej1 {

	public static void main(String[] args) {
		
		int nota;
		
		String str = JOptionPane.showInputDialog("Introduzca la nota ");
		nota = Integer.parseInt(str);
		
		switch (nota) {
			case 0:
			case 1:
			case 2:
				System.out.println("Muy deficiente ");
				break;
			case 3:
			case 4:
				System.out.println("Insuficiente ");
				break;
			case 5:
				System.out.println("Suficiente ");
				break;
			case 6:
				System.out.println("Bien ");
				break;
			case 7:
			case 8:
				System.out.println("Notable ");
				break;
			case 9:
			case 10:
				System.out.println("Sobresaliente ");
				break;
		
		}

	}

}
