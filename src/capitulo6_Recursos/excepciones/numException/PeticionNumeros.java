package capitulo6_Recursos.excepciones.numException;



/**
 * Implementa un programa que contenga una clase llamada "PeticionNumeros", con
 * un método "pideNumeroPar()". Desde un método "main()" llama al método
 * anterior. Dentro del método "pideNumeroPar()" debes crear todo lo necesario
 * para disparar una Exception, creada por ti, cuando el número introducido no
 * sea un número par.
 * 
 * @author F541U
 *
 */

public class PeticionNumeros {
	
	/**
	 * Método principal
	 * @param args
	 */

	public static void main(String[] args) {
		try {
			int par = pideNumeroPar();
			System.out.println(par);
		} catch (NumeroNoParException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * Método que devuelve número aleatorio al azar
	 * @return
	 */
	public static int pideNumeroPar() throws NumeroNoParException {
		//Creamos variable que devolveremos
		int par = utils.Utils.obtenerNumeroAzar();
		
		if (par%2 != 0) {
			throw new NumeroNoParException("El número no es par");
		}
		
		return par;
		
		
		
	}

}
