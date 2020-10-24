package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class C3_bloque2_ej3 {

	public static void main(String[] args) {
		
		
		int num;
		
		
		String str = JOptionPane.showInputDialog("Dame un número ");
		num = Integer.parseInt(str);
		
		System.out.println("Los primeros múltiplos de " + num +" hasta 100 son: ");
		
		for ( int i = 0; i<101; i++) {
		
			if (num*i <=100) 
			
			System.out.println( num*i);
		
	   }
	}
}
