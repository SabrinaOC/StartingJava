package capitulo5.metodos;

import javax.swing.JOptionPane;


/**
 * Crea una �nica clase Java, con un m�todo "main" que utilice cada uno de los
 * siguientes m�todos (creados por ti):
 * 
 * @author F541U
 *
 */

public class Ejercicios_metodos_java {

	/**
	 * M�todo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Demostraci�n m�todo 1
		
		 System.out.println(media(4, 5, 10, 5.3f)); // Llamamos al m�todo y lo imprimimos en pantalla
		 
		 // Demostraci�n m�todo 2
		 System.out.println(obtenerNumeroDeUsuarioEntreMinimoYMaximo(95, 118));
		 
		 // Demostraci�n m�todo 3 
		 String str = JOptionPane.showInputDialog("Dame un n�mero"); // Pedimos un n�mero al usuario 
		 int menor = Integer.parseInt(str);
		 
		 str = JOptionPane.showInputDialog("Dame un n�mero"); // Pedimos otro n�mero
		 int mayor = Integer.parseInt(str);
		  
		 System.out.println(maximo(menor, mayor)); // Llamamos al m�todo y mostramos cu�l es el mayor  
		 
		 // Demostraci�n m�todo 4 
		 System.out.println(numeroImparEntreLimites(76, 100));
		 
		 // Demostraci�n m�todo 5 
		 String str2 = getStringFromEntero(2); 
		 System.out.println(str2);
		 
		 // Demostraci�n m�todo 6 
		 imprimeMinimoAMaximo(89, 2, -6);
		 
		 // Demostraci�n m�todo 7 
		 str = JOptionPane.showInputDialog("Dame un n�mero para mostrarte la serie de Fibonacci"); //Pedimos n�mero al usuario 
		 int num = Integer.parseInt(str);
		 
		 int array [] = fibonacci(num); //Recogemos el m�todo en una variable
		  
		 for (int i = 0; i < array.length; i++) { //Recorremos array para imprimir valores
		 System.out.println(array[i] + " "); }
		 
		 //Demostraci�n m�todo 8
		int array2 [] = new int [] {0, 15, 23, 7, 9, 11, 89, 5, 63, 100};
		 
		 imprimeArray(array);
		 
		//Demostracion m�todo 9
		int array3 [] = new int [] {15, 63, 98, 100, 23, 78, 102, 36}; //Creamos array y le damos valores
		int indiceInferior, indiceSuperior; // Creamos variables para establecer �ndices
		
		str = JOptionPane.showInputDialog("�En qu� �ndice empezamos?"); //Pedimos �ndice
		indiceInferior = Integer.parseInt(str);
		
		str = JOptionPane.showInputDialog("�En qu� �ndice terminamos?"); //Pedimos �ndice
		indiceSuperior = Integer.parseInt(str);
		
		int arrayCorto [] = recorteArray(array, indiceInferior, indiceSuperior); //Creamos array para guardar lo que devuelve el m�todo
		for (int i = 0; i < arrayCorto.length; i ++) { //Recorremos array y lo mostramos en pantalla
			System.out.print(arrayCorto[i] + " "); 
		} 
		
		//Demostraci�n m�todo 10
		recursividad1_100(1);
		
	}

	/**
	 * 1 - M�todo que reciba como par�metros de entrada tres valores enteros y uno
	 * flotante. El m�todo se llamar� "media" y debe devolver la media aritm�tica de
	 * los cuatro valores. El valor devuelto debe ser flotante. El m�todo "main"
	 * debe llamar a este otro m�todo, con valores inventados por ti, e imprimir el
	 * valor de la media en la consola de salida.
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 * @param n4
	 * @return
	 */
	public static float media(int n1, int n2, int n3, float n4) { // definimos los par�metros de entrada, 3 enteros y 1
																	// float
		float media = (n1 + n2 + n3 + n4) / 4; // creamos una variable flotante para guardar la media
		return media; // devolvemos el resultado
	}

	/**
	 * 2 - M�todo llamado "obtenerNumeroDeUsuarioEntreMinimoYMaximo" que reciba dos
	 * valores enteros: un valor m�nimo y un valor m�ximo. El m�todo debe pedir un
	 * numero al usuario. El m�todo examinar� el n�mero introducido por el usuario
	 * y, si dicho n�mero no est� entre el valor m�nimo y el m�ximo que se ha
	 * indicado, seguir� pidiendo n�meros al usuario hasta que se obtenga uno
	 * v�lido. Finalmente se debe devolver dicho valor del usuario al m�todo main,
	 * que lo imprimir� en la consola.
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */

	public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo(int n1, int n2) {

		int num; // Declaramos la variable del n�mero que el usuario nos va a dar

		// Usamos bucle para repetir tantas veces como sea necesario el proceso para
		// obtener un n�mero entre los l�mites dados
		do {
			String str = JOptionPane.showInputDialog("Dame un n�mero"); // Pedimos n�mero
			num = Integer.parseInt(str);

		} while (num < n1 || num > n2); // Establecemos condici�n de repetici�n de bucle
		return num; // Devolvemos n�mero introducido por el usuario
	}

	/**
	 * 3 - M�todo llamado "maximo" que devuelva el valor m�ximo de dos n�meros
	 * enteros recibidos como argumentos de entrada. El m�todo main pedir� dos
	 * n�meros al usuario y los enviar� a este nuevo m�todo. Finalmente imprimir� en
	 * consola el valor devuelto por el m�todo.
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
	 * 4 - M�todo llamado "numeroImparEntreLimites" que devuelva un n�mero entero
	 * aleatorio, impar y comprendido entre dos l�mites recibidos como par�metros de
	 * entrada. "main" debe llamar a este m�todo e imprimir el valor devuelto.
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
	 * 5 - Realiza un m�todo que reciba un valor entero, del 1 al 10, como argumento
	 * de entrada y devuelva un String, con dicho n�mero escrito en palabras. Llama
	 * a este m�todo "getStringFromEntero".
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
	 * 6 - M�todo, llamado "imprimeMinimoAMaximo", que reciba tres valores enteros
	 * como argumentos de entrada. Debe imprimir dichos valores en orden de menor a
	 * mayor.
	 * 
	 * @param n1
	 * @param n2
	 * @param n3
	 */

	public static void imprimeMinimoAMaximo(int n1, int n2, int n3) {
		int array[] = new int[] { n1, n2, n3 }; // Creamos array para guardar los n�meros y ordenarlos
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
	 * 7 - La serie de Fibonacci es una serie num�rica que comienza en los n�meros
	 * 1, 1 y continua de forma infinita, calculando cada mienbro de la serie como
	 * la suma de los dos anteriores. De esta manera, la serie de Fibonacci comienza
	 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.......... Debes realizar un m�todo llamado
	 * "fibonacci". Recibir� un argumento de entrada, de tipo entero. El m�todo debe
	 * devolver un array con la serie de Fibonacci. El par�metro de entrada del
	 * m�todo determinar� la longitud del array a devolver. El m�todo main recibir�
	 * el array y lo imprimir� en la consola.
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
	 * 8 - M�todo que imprima en pantalla un array, recibir� un array como par�metro
	 * de entrada y lo mostrar� en consola. Main debe enviar el array al m�todo,
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
	 * 9 - M�todo que "recorte" un array. El m�todo recibir� un array, un
	 * "primerIndice" y un "ultimoIndice" y debe devolver un array, formado con los
	 * elementos del array recibido, cuyos �ndices est�n dentro del intervalo
	 * cerrado formado por los dos �ndices recibidos
	 * 
	 * @param array
	 * @param primerIndice
	 * @param ultimoIndice
	 * @return
	 */

	public static int[] recorteArray(int array[], int primerIndice, int ultimoIndice) {
		
		int arrayCorto [] = new int [(ultimoIndice-primerIndice)+1]; //Establezco la dimensi�n del segundo array, al que devolveremos
		
		int j= 0;
		for (int i = primerIndice; i <= ultimoIndice; i++, j++) { //Recorremos el array para asignar valores al segundo array
			 
				arrayCorto[j] = array[i];
				
			}
		return arrayCorto; //Devolvemos array
	}

	/**
	 * 10 - M�todo que muestre en pantalla los n�meros del 1 al 100. El �nico
	 * requisito para esto es que debe hacerse utilizando la recursividad
	 * 
	 * @param num
	 */

	public static void recursividad1_100(int num) {
		System.out.print(num + " "); // Primero mostramos en pantalla el n�mero
		num++; // Sumamos 1

		if (num <= 100) { // Repetimos hasta que num sea <= 100
			recursividad1_100(num);
		}

	}
}
