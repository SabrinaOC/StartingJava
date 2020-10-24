package capitulo3.bloque3;

import javax.swing.JOptionPane;

public class C3_bloque3_ej6 {

	public static void main(String[] args) {
		
		int num;
					
		
						
		do {
		
		String str = JOptionPane.showInputDialog("Dame un número");
		num = Integer.parseInt(str);
		
		 if (num != 0) {
		    
			 for (int i=0; i<11; i++) {
				 System.out.println(num +" x " + i +" = " +(num*i));
			 }
			 
		    } 
		 }
		
		
		while (num != 0);

		

	}

}
