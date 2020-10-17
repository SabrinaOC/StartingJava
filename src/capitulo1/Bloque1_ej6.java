package capitulo1;

import javax.swing.JOptionPane;

public class Bloque1_ej6 {

	public static void main(String[] args) {
		
		float euribor;
		float diferencial;
		float capital;
		int plazos;
		float intmes;
		float cuotames;
		
		String str = JOptionPane.showInputDialog("Por favor, introduzca el valor del Euribor");
		euribor = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Ahora introduzca el valor Diferencial");
		diferencial = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Indique el valor del capital (en euros)");
		capital = Float.parseFloat(str);
		
		str = JOptionPane.showInputDialog("Ahora indique el número de plazos (en meses)");
		plazos = Integer.parseInt(str);
		
		
		
		
		//primero vamos a calcular el interés mensual
		
		intmes = (euribor + diferencial) /12 / 100;
		
		//System.out.println("El interés mensual es: " +intmes);
		
		//ahora procederemos a calcular la cuota mensual
		
		cuotames = (float) (intmes * Math.pow(1+intmes, plazos));
		cuotames = (float) (cuotames / (Math.pow(1+intmes, plazos) -1));
		cuotames = capital * cuotames;
		
		System.out.println("La cuota mensual calculada a partir de los datos introducidos es: " + cuotames +" €/mes." 
		+"\n*Al tratarse de un programa extranjero se han utilizado puntos en lugar de comas (p. ej. 12.756 = 12,756). "
		+ "\nPor tanto el punto mostrado en la cifra arriba indicada hace referencia a decimales.");
		
		
		

	}

}
