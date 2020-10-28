package capitulo5.bloque1;

public class C5_bloque1_ej2 {

	public static void main(String[] args) {
		
		int tamanio = 15;
		int array[] = new int[tamanio];
		
		for (int i = tamanio-1; i>=0; i--) {
			array[i] = (int) (Math.random()*101);
			
			System.out.println("El valor de i en la posición " + i +" es " + array[i]);
		}

	}

}
