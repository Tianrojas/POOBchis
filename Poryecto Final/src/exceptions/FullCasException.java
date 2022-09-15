package exceptions;

/**
 * Clase FullCasException. Error cuando una ficha intenta moverse a una casilla
 * que ya est� llena.
 * 
 * @author Rocha y Rojas
 *
 */
@SuppressWarnings("serial")
public class FullCasException extends POOBchisException {
	private static final String localMsg = "No puede mover a esta casilla, ya esta llena";

	/**
	 * Constructor de la Clase FullCasException. Arroja un error cuando una ficha
	 * intenta moverse a una casilla que ya est� llena.
	 * 
	 * @param msg Mensaje a arrojar cuando ocurra un error.
	 */
	public FullCasException(String msg) {
		super(localMsg);
	}

}
