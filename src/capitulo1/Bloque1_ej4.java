package capitulo1;

import javax.swing.JOptionPane;

public class Bloque1_ej4 {

	public static void main(String[] args) {
		
		
		int num;
		int suma = 0;
		
		String str = JOptionPane.showInputDialog("Introduzca un n�mero entero: ");
		num = Integer.parseInt(str);
		suma = suma + num;
		
		str = JOptionPane.showInputDialog("Introduzca otro n�mero entero: ");
		num = Integer.parseInt(str);
		suma = suma +num;
		
		str = JOptionPane.showInputDialog("Introduzca un �ltimo n�mero entero: ");
		num = Integer.parseInt(str);
		suma = suma + num;
		
		System.out.println("La media de los n�meros anteriormente introducidos es: " + suma/3);
		
	
			
		

	}

}
