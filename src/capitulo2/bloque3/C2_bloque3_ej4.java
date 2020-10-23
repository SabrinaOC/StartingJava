package capitulo2.bloque3;

import javax.swing.JOptionPane;

public class C2_bloque3_ej4 {

	public static void main(String[] args) {


		
		int cantidad;
		int art;
		
		
		String str = JOptionPane.showInputDialog("Introduce el importe del artículo: ");
		art = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("Introduce la cantidad recibida para obtener el cambio: ");
		cantidad = Integer.parseInt(str);
		
		cantidad = cantidad - art;
		
		if (cantidad > 0) {
			System.out.println((cantidad/100) +" monedas de 100 u");	
		} if (cantidad %100 >= 0) {
			System.out.println(((cantidad%100) /50)+" monedas de 50 u");
			cantidad = cantidad %50;
		} if (cantidad %50 >= 0) {
			System.out.println(((cantidad%50) /25)+" monedas de 25 u");
			cantidad = cantidad %25;
		} if (cantidad % 25 >= 0) {
			System.out.println(((cantidad%25) /5)+" monedas de 5 u");
			cantidad = cantidad %5;
		} if (cantidad % 5 >= 0) {
			System.out.println(((cantidad%5) /1)+" monedas de 1 u");
			
		}
			
		
		
		

	}

}
