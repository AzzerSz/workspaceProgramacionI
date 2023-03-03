package dam.ej2.pojo;

public class Helipuerto {
	// ATRIBUTOS
	private String nombre;
	private double radio;
	public static final double PI = 3.1416;
	// CONSTRUCTORES
	
	// MÉTODOS DE ACCESO
	/* Creamos los métodos get para las variables globales nombre y radio
	 * para luego poder acceder a ellas
	 */
	public String getNombre () {
		return nombre;
	}
	public double getRadio () {
		return radio;
	}
	/* Creamos los métodos set para las variables globales nombre y radio
	 * para luego poder modificarlas desde la clase con el método main
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	// MÉTODOS
	/* Creamos un método que calcula el área según los radios que sean introducidos
	 * mediante un return que realiza el calculo de dichas áreas
	 */
	public double calcularArea () {
	return PI * radio * radio;
	}
	
}
