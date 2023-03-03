package dam.ej2.pojo;

public class Helipuerto {
	// ATRIBUTOS
	private String nombre;
	private double radio;
	public static final double PI = 3.1416;
	// CONSTRUCTORES
	
	// M�TODOS DE ACCESO
	/* Creamos los m�todos get para las variables globales nombre y radio
	 * para luego poder acceder a ellas
	 */
	public String getNombre () {
		return nombre;
	}
	public double getRadio () {
		return radio;
	}
	/* Creamos los m�todos set para las variables globales nombre y radio
	 * para luego poder modificarlas desde la clase con el m�todo main
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	// M�TODOS
	/* Creamos un m�todo que calcula el �rea seg�n los radios que sean introducidos
	 * mediante un return que realiza el calculo de dichas �reas
	 */
	public double calcularArea () {
	return PI * radio * radio;
	}
	
}
