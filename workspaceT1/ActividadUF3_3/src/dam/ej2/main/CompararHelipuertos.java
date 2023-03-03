package dam.ej2.main;

import java.util.Scanner;
import dam.ej2.pojo.Helipuerto;

public class CompararHelipuertos {

	public static void main(String[] args) {
		// Declaramos la variable de cadena de carácteres de tipo de referencia
		String radio;
		// Importando el paquete Scanner creamos el objeto Scanner
		Scanner teclado = new Scanner(System.in);
		// Importando el paquete helipuerto creamos el objeto helipuerto1
		Helipuerto helipuerto1 = new Helipuerto();
		
		// Sacamos por consola el texto entre comillas dobles
		System.out.println("Escribe el nombre del primer helipuerto");
		/* Solicitamos información por consola y la almacenamos como tipo string en el
		 * nombre de nuestro objeto helipuerto1
		 */
		helipuerto1.setNombre(teclado.nextLine());
		
		// Sacamos por consola el texto entre comillas dobles
		System.out.println("Escribe el radio del primer helipuerto");
		/* Solicitamos información por consola y la almacenamos como tipo string en la
		 * variable radio de tipo String
		 */
		radio = teclado.nextLine();
		/* Almacenamos en el radio de nuestro objeto el valor del String radio pero ahora como double
		 * mediante el método Double.parseDouble()
		 */
		helipuerto1.setRadio(Double.parseDouble(radio));
		
		// Sacamos por consola el area calculado mediante el método creado en el objeto helipuerto
		System.out.println(helipuerto1.calcularArea());
		// almacenamos el número dado tras el calculo del área
		double a1 = helipuerto1.calcularArea();
		
		// Declaramos la variable de cadena de carácteres de tipo de referencia 
		String radio2;
		// Importando el paquete helipuerto creamos el objeto helipuerto
		Helipuerto helipuerto2 = new Helipuerto();
		
		// Sacamos por consola el texto entre comillas dobles
		System.out.println("Escribe el nombre del segundo helipuerto");
		/* Solicitamos información por consola y la almacenamos como tipo string en el
		 * nombre de nuestro objeto helipuerto2
		 */
		helipuerto2.setNombre(teclado.nextLine());
		
		// Sacamos por consola el texto entre comillas dobles
		/* Solicitamos información por consola y la almacenamos como tipo string en la
		 * variable radio de tipo String
		 */
		System.out.println("Escribe el radio del segundo helipuerto");
		radio2 = teclado.nextLine();
		/* Almacenamos en el radio de nuestro objeto el valor del String radio pero ahora como double
		 * mediante el método Double.parseDouble()
		 */
		helipuerto2.setRadio(Double.parseDouble(radio2));
		
		// Sacamos por consola el area calculado mediante el método creado en el objeto helipuerto
		System.out.println(helipuerto2.calcularArea());
		// almacenamos el número dado tras el calculo del área
		double a2 = helipuerto2.calcularArea();
		
		// Mediante un operador ternario hacemos una condición que dice que área es mayor
		String mayor = (a1 > a2 )? helipuerto1.getNombre() 
				+ " Es mayor" : helipuerto2.getNombre() + " Es mayor";
		System.out.println(mayor);
		
		teclado.close();
		
	}
	
}
