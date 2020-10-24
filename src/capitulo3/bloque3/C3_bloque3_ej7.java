package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class C3_bloque3_ej7 {

	public static void main(String[] args) {


		int num;
		int contPositivo = 0;
		int contNegativo = 0;
		
		
		
		do {
		
		String str = JOptionPane.showInputDialog("Dame un número");
		num = Integer.parseInt(str);
		
		 if (num != 0) {
		    if (num>0) {
		    	contPositivo++;
		    } if (num<0) {
		    	contNegativo++;
		    }
		 }
		}
		
		while (num != 0);

		System.out.println("La cantidad de números positivos introducidos es " + contPositivo +".");
		System.out.println("La cantidad de números negativos introducidos es " + contNegativo +".");


	}

}
