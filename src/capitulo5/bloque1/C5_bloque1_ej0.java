package capitulo5.bloque1;

public class C5_bloque1_ej0 {

	public static void main(String[] args) {

		int tamanio = 150;
		int array[] = new int [tamanio] ;
		int suma = 0;
		float media;
		int mayor= (tamanio-(tamanio-1));
		int menor= (tamanio+1);
		
		
		
		for (int i=0; i<tamanio; i++)
		{
			array[i]= (int) (Math.random()*101);
			
			System.out.println("El valor de i en la posición " +i +" es " +array[i]);
			
			suma += array[i];
			
			if (array[i]>mayor) {
				mayor = array[i];
			} if (array[i]<menor) {
				menor = array[i];
			}
			
		}
			
		System.out.println("La suma de los valores de i es " + suma);
		
		media = (float)suma / tamanio;
		System.out.println("La media de los valores del array es " + media);
		
		System.out.println("El mayor de los valores de i es " + mayor);
		System.out.println("El menor de los valores de i es " + menor);
	}

}
