package capitulo5.bloque1;

import javax.swing.JOptionPane;

public class C5_bloque1_ej1 {

	public static void main(String[] args) {


		int tamanio = 15;
		int array[] = new int [tamanio];
		int inf;
		int sup;
		
		
		String str = JOptionPane.showInputDialog("�Desde qu� n�mero empezamos?");
		inf = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("�Hasta qu� n�mero?");
		sup = Integer.parseInt(str);

		
		for (int i = 0; i<tamanio; i++) {
			array[i] = (int) Math.floor(Math.random()* (sup-inf+1)+inf);
			
			System.out.println("El valor de i en la posici�n " + i +" es " + array[i]);
		}
		
	}

}
