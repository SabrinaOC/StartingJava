package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class C3_bloque3_ej2 {

	public static void main(String[] args) {


		int num;
		int suma = 0;
		int cont = -1;
		
		
		do {
		
		String str = JOptionPane.showInputDialog("Dame un n�mero");
		num = Integer.parseInt(str);
		
		suma += num;
		cont ++;
		
		}
		
		while (num != 0);

		System.out.println("La suma de los n�meros introducidos es: " + (suma/cont));

	}

}
