package capitulo2.bloque2;

import javax.swing.JOptionPane;

public class C2_bloque2_ej2 {

	public static void main(String[] args) {


		int num;
		
		int contBajos = 0;
		int contMedios = 0;
		int contGrandes = 0;
		
		do {
		
			String str = JOptionPane.showInputDialog("Introduzca un n�mero: ");
			num = Integer.parseInt(str);
			
			
				if (num >= 0 && num <= 25) {
					contBajos ++;
				} if (num >= 26 && num <= 250) {
						contMedios ++;
				} if (num>251) {
						contGrandes ++;
					}
				
			} 
			while (num >= 0);

			System.out.println("\nLa cantidad de n�meros bajos es: " + contBajos 
						+ "\nLa cantidad de n�meros medios es: " + contMedios
						+ "\nLa cantidad de n�meros grandes es: " + contGrandes);;
			}
		
		
	}


