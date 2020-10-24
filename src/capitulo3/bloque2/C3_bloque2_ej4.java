package capitulo3.bloque2;

import javax.swing.JOptionPane;

public class C3_bloque2_ej4 {

	public static void main(String[] args) {


		int num;
		int multiplos;
		
		String str = JOptionPane.showInputDialog("Dame un número ");
		num = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("¿Hasta qué número quieres buscar múltiplos? ");
		multiplos = Integer.parseInt(str);
		
		System.out.println("Los primeros múltiplos de " + num +" hasta " +multiplos +" son: ");
		
		for ( int i = 0; i<(multiplos+1); i++) {
		
			if (num*i <=multiplos) 
			
			System.out.println( num*i);
			
		}
	}

}
