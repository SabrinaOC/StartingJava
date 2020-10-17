package capitulo1;

import javax.swing.JOptionPane;

public class Bloque1_ej3 {

	public static void main(String[] args) {
		
		
		int num;
		int suma = 0;
		
		String str = JOptionPane.showInputDialog("Introduzca el primer sumando: ");
		num = Integer.parseInt(str);
		
		suma = suma + num;
		
		str = JOptionPane.showInputDialog("Introduzca el segundo sumando: ");
		num = Integer.parseInt(str);
		
		suma = suma + num;
		
		str = JOptionPane.showInputDialog("Introduzca el último sumando: ");
		num = Integer.parseInt(str);
		
		suma = suma + num;
		
		System.out.println("La suma de los números introducidos es: " + suma);
				

	}

}
