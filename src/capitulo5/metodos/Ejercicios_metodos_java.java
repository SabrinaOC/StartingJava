package capitulo5.metodos;

import javax.swing.JOptionPane;


/**
 * Crea una única clase Java, con un método "main" que utilice cada uno de los
 * siguientes métodos (creados por ti):
 * 
 * @author F541U
 *
 */

public class Ejercicios_metodos_java {

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Demostración método 1
		
		 System.out.println(media(4, 5, 10, 5.3f)); // Llamamos al método y lo imprimimos en pantalla
		 
		 // Demostración método 2
		 System.out.println(obtenerNumeroDeUsuarioEntreMinimoYMaximo(95, 118));
		 
		 // Demostración método 3 
		 String str = JOptionPane.showInputDialog("Dame un número"); // Pedimos un número al usuario 
		 int menor = Integer.parseInt(str);
		 
		 str = JOptionPane.showInputDialog("Dame un número"); // Pedimos otro número
		 int mayor = Integer.parseInt(str);
		  
		 System.out.println(maximo(menor, mayor)); // Llamamos al método y mostramos cuál es el mayor  
		 
		 // Demostración método 4 
		 System.out.println(numeroImparEntreLimites(76, 100));
		 
		 // Demostración método 5 
		 String str2 = getStringFromEntero(2); 
		 System.out.println(str2);
		 
		 // Demostración método 6 
		 imprimeMinimoAMaximo(89, 2, -6);
		 
		 // Demostración método 7 
		 str = JOptionPane.showInputDialog("Dame un número para mostrarte la serie de Fibonacci"); //Pedimos número al usuario 
		 int num = Integer.parseInt(str);
		 
		 int array [] = fibonacci(num); //Recogemos el método en una variable
		  
		 for (int i = 0; i < array.length; i++) { //Recorremos array para imprimir valores
		 System.out.println(array[i] + " "); }
		 
		 //Demostración método 8
		int array2 [] = new int [] {0, 15, 23, 7, 9, 11, 89, 5, 63, 100};
		 
		 imprimeArray(array);
		 
		//Demostracion método 9
		int array3 [] = new int [] {15, 63, 98, 100, 23, 78, 102, 36}; //Creamos array y le damos valores
		int indiceInferior, indiceSuperior; // Creamos variables para establecer índices
		
		str = JOptionPane.showInputDialog("¿En qué índice empezamos?"); //Pedimos índice
		indiceInferior = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("¿En qué índice terminamos?"); //Pedimos índice
		indiceSuperior = Integer.parseInt(str);
		
		int arrayCorto [] = recorteArray(array, indiceInferior, indiceSuperior); //Creamos array para guardar lo que devuelve el método
		for (int i = 0; i < arrayCorto.length; i ++) { //Recorremos array y lo mostramos en pantalla
			System.out.print(arrayCorto[i] + " "); 
		} 
		
		//Demostración método 10
		recursividad1_100(1);
		
	}

	/**
	 * 1 - Método que reciba como parámetros de entrada tres valores enteros y uno
	 * flotante. El método se llamará "media" y debe devolver la media aritmética de
	 * los cuatro valores. El valor devuelto debe ser flotante. El método "main"
	 * debe llamar a este otro método, con valores inventados por ti, e imprimir el
	 * valor de la media en la consola de salida.
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 * @param n4
	 * @return
	 */
	public static float media(int n1, int n2, int n3, float n4) { // definimos los parámetros de entrada, 3 enteros y 1
																	// float
		float media = (n1 + n2 + n3 + n4) / 4; // creamos una variable flotante para guardar la media
		return media; // devolvemos el resultado
	}

	/**
	 * 2 - Método llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos
	 * valores enteros: un valor mínimo y un valor máximo. El método debe pedir un
	 * numero al usuario. El método examinará el número introducido por el usuario
	 * y, si dicho número no está entre el valor mínimo y el máximo que se ha
	 * indicado, seguirá pidiendo números al usuario hasta que se obtenga uno
	 * válido. Finalmente se debe devolver dicho valor del usuario al método main,
	 * que lo imprimirá en la consola.
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */

	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int n1, int n2) {

		int num; // Declaramos la variable del número que el usuario nos va a dar

		// Usamos bucle para repetir tantas veces como sea necesario el proceso para
		// obtener un número entre los límites dados
		do {
			String str = JOptionPane.showInputDialog("Dame un número"); // Pedimos número
			num = Integer.parseInt(str);

		} while (num < n1 || num > n2); // Establecemos condición de repetición de bucle
		return num; // Devolvemos número introducido por el usuario
	}

	/**
	 * 3 - Método llamado "maximo" que devuelva el valor máximo de dos números
	 * enteros recibidos como argumentos de entrada. El método main pedirá dos
	 * números al usuario y los enviará a este nuevo método. Finalmente imprimirá en
	 * consola el valor devuelto por el método.
	 * 
	 * @param menor
	 * @param mayor
	 * @return
	 */

	public static int maximo(int menor, int mayor) {
		if (mayor > menor) {
			return mayor;
		} else {
			return menor;
		}
	}

	/**
	 * 4 - Método llamado "numeroImparEntreLimites" que devuelva un número entero
	 * aleatorio, impar y comprendido entre dos límites recibidos como parámetros de
	 * entrada. "main" debe llamar a este método e imprimir el valor devuelto.
	 * 
	 * @param menor
	 * @param mayor
	 * @return
	 */

	public static int numeroImparEntreLimites(int menor, int mayor) {
		int num;

		do {
			num = (int) Math.round(Math.random() * (mayor - menor) + menor);

		} while (num % 2 == 0);
		return num;
	}

	/**
	 * 5 - Realiza un método que reciba un valor entero, del 1 al 10, como argumento
	 * de entrada y devuelva un String, con dicho número escrito en palabras. Llama
	 * a este método "getStringFromEntero".
	 * 
	 * @param num
	 * @return
	 * @return
	 */

	public static String getStringFromEntero(int num) {
		// Creo array para guardar los valores escritos y luego guardarlos en una
		// variable string que devolveremos
		String[] unidades = new String[] { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho",
				"nueve", "diez" };

		String str = unidades[num];

		return str;
	}

	/**
	 * 6 - Método, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros
	 * como argumentos de entrada. Debe imprimir dichos valores en orden de menor a
	 * mayor.
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 */

	public static void imprimeMinimoAMaximo(int n1, int n2, int n3) {
		int array[] = new int[] { n1, n2, n3 }; // Creamos array para guardar los números y ordenarlos
		int guardaNumTemporal; // Variable para no perder el valor de intercambiado

		for (int i = 0; i < array.length - 1; i++) { // Recorremos el array
			for (int j = 0; j < array.length - 1; j++) {// Lo volvemos a recorrer para comparar todos los valores de i
														// con el resto
				if (array[j + 1] < array[j]) { // Si encontramos un valor superior lo intercambiamos
					guardaNumTemporal = array[j + 1]; // Para no perder el valor, lo guardamos en una variable auxiliar
					array[j + 1] = array[j]; // Realizamos el intercambio
					array[j] = guardaNumTemporal; // Usamos la variable para volver a tener el valor y no perderlo tras
													// machacarlo
				}
			}
		}

		for (int i = 0; i < array.length; i++) { // Recorremos el array para mostrarlo en pantalla ordenado
			System.out.print(array[i] + " ");
		}

	}

	/**
	 * 7 - La serie de Fibonacci es una serie numérica que comienza en los números
	 * 1, 1 y continua de forma infinita, calculando cada mienbro de la serie como
	 * la suma de los dos anteriores. De esta manera, la serie de Fibonacci comienza
	 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.......... Debes realizar un método llamado
	 * "fibonacci". Recibirá un argumento de entrada, de tipo entero. El método debe
	 * devolver un array con la serie de Fibonacci. El parámetro de entrada del
	 * método determinará la longitud del array a devolver. El método main recibirá
	 * el array y lo imprimirá en la consola.
	 * 
	 * @param num
	 * @return
	 */

	public static int[] fibonacci(int num) {
		int array[] = new int[num];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = (array[i - 1] + array[i - 2]);

		}
		return array;
	}

	/**
	 * 8 - Método que imprima en pantalla un array, recibirá un array como parámetro
	 * de entrada y lo mostrará en consola. Main debe enviar el array al método,
	 * llamado "imprimeArray".
	 * 
	 * @param array
	 */

	public static void imprimeArray(int array[]) {
		
		for (int i = 0; i < array.length; i++) { //Recorremos el array recibido para mostrarlo en pantalla
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * 9 - Método que "recorte" un array. El método recibirá un array, un
	 * "primerIndice" y un "ultimoIndice" y debe devolver un array, formado con los
	 * elementos del array recibido, cuyos índices estén dentro del intervalo
	 * cerrado formado por los dos índices recibidos
	 * 
	 * @param array
	 * @param primerIndice
	 * @param ultimoIndice
	 * @return
	 */

	public static int[] recorteArray(int array[], int primerIndice, int ultimoIndice) {
		
		int arrayCorto [] = new int [(ultimoIndice-primerIndice)+1]; //Establezco la dimensión del segundo array, al que devolveremos
		
		int j= 0;
		for (int i = primerIndice; i <= ultimoIndice; i++, j++) { //Recorremos el array para asignar valores al segundo array
			 
				arrayCorto[j] = array[i];
				
			}
		return arrayCorto; //Devolvemos array
	}

	/**
	 * 10 - Método que muestre en pantalla los números del 1 al 100. El único
	 * requisito para esto es que debe hacerse utilizando la recursividad
	 * 
	 * @param num
	 */

	public static void recursividad1_100(int num) {
		System.out.print(num + " "); // Primero mostramos en pantalla el número
		num++; // Sumamos 1

		if (num <= 100) { // Repetimos hasta que num sea <= 100
			recursividad1_100(num);
		}

	}
}
