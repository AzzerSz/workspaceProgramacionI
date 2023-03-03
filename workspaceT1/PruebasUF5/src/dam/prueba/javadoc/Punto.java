package dam.prueba.javadoc;

/**
* Esta clase define un punto en un espacio de dos dimensiones a trav�s de sus coordenadas.
* @author Alberto Sol�s Zapata
* @version 1.0, 27 de Octubre de 2004
*/

public class Punto {

	private float x;
	private float y;
	
	/**
	 *Constructor por defecto, sin par�metros, inicializa los atributos a 0 
	 */
	public Punto() {}
	
	/**
	* Constructor con argumentos.
	* @param x La coordenada 'x' del punto.
	* @param y La coordenada 'y' del punto.
	*/
	public Punto(float x, float y) {
		this.x = x;
		this.y = y;
	}

	/**
	* Esta funci�n devuelve el valor de la coordenada 'x'
	* @return El valor de la coordenada 'x'
	*/
	public float getX() {
		return x;
	}

	/**
	* Esta funci�n cambia el valor de la coordenada 'x'
	* @param x El nuevo valor float de la coordenada 'x'
	*/
	public void setX(float x) {
		this.x = x;
	}

	/**
	* Esta funci�n devuelve el valor de la coordenada 'y
	* @return El valor de la coordenada 'y'
	*/
	public float getY() {
		return y;
	}

	/**
	* Esta funci�n cambia el valor de la coordenada 'y'
	* @param y El nuevo valor float de la coordenada 'y'
	*/
	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * Este m�todo sobreescribe el m�todo toString de la clase Object retornando
	 * las coordenadas del punto 
	 * @return una cadena de caracteres formada por las coordenadas del punto 
	 * entre par�ntesis
	 */
	@Override
	public String toString() {
		return "Punto: (" + x + ", " + y + ")";
	}
}
