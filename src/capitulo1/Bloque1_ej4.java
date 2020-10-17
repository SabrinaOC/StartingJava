package capitulo1;

import javax.swing.JOptionPane;

public class Bloque1_ej4 {

	public static void main(String[] args) {
		
		
		int num;
		int suma = 0;
		
		String str = JOptionPane.showInputDialog("Introduzca un número entero: ");
		num = Integer.parseInt(str);
		suma = suma + num;
		
		str = JOptionPane.showInputDialog("Introduzca otro número entero: ");
		num = Integer.parseInt(str);
		suma = suma +num;
		
		str = JOptionPane.showInputDialog("Introduzca un último número entero: ");
		num = Integer.parseInt(str);
		suma = suma + num;
		
		System.out.println("La media de los números anteriormente introducidos es: " + suma/3);
		
	
			
		

	}

}
