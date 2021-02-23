package capitulo6_Recursos.excepciones.stringException;

/**
 * Realiza un programa Java parecido al anterior en el que pidas al usuario una
 * frase que contenga la palabra "bombilla". Las excepciones, creadas por ti,
 * deben realizarse en los siguientes casos: - La frase introducida no tiene
 * caracteres distintos al espacio en blanco. - La cantidad de palabras de la
 * frase introducida es inferior a 3. - En la frase no aparece la palabra
 * "bombilla". - En la frase aparece una palabra ofensiva de la siguiente
 * relación: "tonto", "tonta", "idiota". Cada uno de los supuestos anteriores
 * provocará un tipo diferente de excepción. Tú debes controlar todos los tipos
 * y responder al usuario con un mensaje adecuado.
 * 
 * @author F541U
 *
 */

public class Bombilla_String {

	/**
	 * Método principal
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String str; // Creamos variable
		// Mostramos mensaje en pantalla
		System.out.println("Introduzca una frase que contenga la palabra 'bombilla'");

		try {
			str = pideFraseUsuario();
		} catch (BombillaException | EspaciosEnBlancoException | InsultosException | NumeroPalabrasException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}


	}

	/**
	 * Método que devuelve string
	 * 
	 * @return
	 */
	public static String pideFraseUsuario()
			throws BombillaException, EspaciosEnBlancoException, InsultosException, NumeroPalabrasException {
		// Creamos variables necesarias
		String str = utils.Utils.obtenerStringPorScanner(), bomb = "bombilla", tonto = "tonto", tonta = "tonta",
				idio = "idiota";
		boolean bombilla = false, insulto = false;

		// Separamos frases por palabras
		String[] palabras = str.split(" ");
		int contPal = 0; // variable para contar palabras

		// Recorremos el array de palabras para: contar palabras, comprobar bombilla y
		// palabras malsonantes
		for (int i = 0; i < palabras.length; i++) {
			contPal++;
			// comprobamos bombilla
			if (palabras[i].equalsIgnoreCase(bomb)) {
				bombilla = true;
			}
			//si encontramos un insulto 
			if (palabras[i].equalsIgnoreCase(tonto) || palabras[i].equalsIgnoreCase(tonta)
					|| palabras[i].equalsIgnoreCase(idio)) {
				insulto = true;
			}
		}

		if (str.isBlank()) {
			throw new EspaciosEnBlancoException("Solo contiene espacios en blanco.");
		}

		// Excepcion por número de palabras inferior a 3
		if (contPal < 3) {
			throw new NumeroPalabrasException("Menos de tres palabras.");
		}

		// con el boolean comprobamos bombilla
		if (!bombilla) {
			throw new BombillaException("No contiene 'bombilla'.");
		}

		// comprobamos insultos con boolean
		if (insulto) {
			throw new InsultosException("Palabras malsonantes.");
		}

		return str;

	}

}
