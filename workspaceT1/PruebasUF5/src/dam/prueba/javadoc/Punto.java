package dam.prueba.javadoc;

/**
* Esta clase define un punto en un espacio de dos dimensiones a través de sus coordenadas.
* @author Alberto Solís Zapata
* @version 1.0, 27 de Octubre de 2004
*/

public class Punto {

	private float x;
	private float y;
	
	/**
	 *Constructor por defecto, sin parámetros, inicializa los atributos a 0 
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
	* Esta función devuelve el valor de la coordenada 'x'
	* @return El valor de la coordenada 'x'
	*/
	public float getX() {
		return x;
	}

	/**
	* Esta función cambia el valor de la coordenada 'x'
	* @param x El nuevo valor float de la coordenada 'x'
	*/
	public void setX(float x) {
		this.x = x;
	}

	/**
	* Esta función devuelve el valor de la coordenada 'y
	* @return El valor de la coordenada 'y'
	*/
	public float getY() {
		return y;
	}

	/**
	* Esta función cambia el valor de la coordenada 'y'
	* @param y El nuevo valor float de la coordenada 'y'
	*/
	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * Este método sobreescribe el método toString de la clase Object retornando
	 * las coordenadas del punto 
	 * @return una cadena de caracteres formada por las coordenadas del punto 
	 * entre paréntesis
	 */
	@Override
	public String toString() {
		return "Punto: (" + x + ", " + y + ")";
	}
}
