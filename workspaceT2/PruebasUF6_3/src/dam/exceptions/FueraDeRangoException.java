package dam.exceptions;

public class FueraDeRangoException extends Exception {

	public FueraDeRangoException() {
		super("El valor est� fuera de rango");
	}
	
	public FueraDeRangoException(String msg) {
		super(msg);
	}
}
