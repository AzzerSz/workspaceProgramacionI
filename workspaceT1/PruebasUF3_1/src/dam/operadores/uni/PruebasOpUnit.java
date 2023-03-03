package dam.operadores.uni;
// Clase para probar operadores unitarios
public class PruebasOpUnit {

	public static void main(String[] args) {
		/*
		 * Definimos dos variables primitivas de tipo entero 
		 */
		int m = 2;
		int n = 5;
		
		// mostrar el valor de la variable m antes de incrementarlo
		System.out.println("m = " + m);
		
		m++; // Es lo mismo que poner m = m + 1
		// mostrar el valor de la variable m después de incrementarlo
		System.out.println("m = " + m);
		
		// Imprime una linea de separación
		System.out.println();
		
		// mostrar el valor de la variable n antes de disminuirlo
		System.out.println("n = " + n);
		n--; // Es lo mismo que poner n = n - 1
		// mostrar el valor de la variable n después de disminuirlo
		System.out.println("n = " + n);
		
		m-=1; // Es lo mismo que m = m - 1
		System.out.println("\nm = " + m);
		// a n le sumamos m
		n += m; // Es lo mismo que n = n + m
		System.out.println("\nDespués de sumarle m, n = " + n);
		
		n %= (float)m; // Es lo mismo que n = n % m
		System.out.println("\nDespués de asignarle el resto de dividir n entre m, n = " + n);
		
		n += 15;
		System.out.println("n = " + n);
		
		// Prueba del operador condicional ternario
		int mayor;
		mayor = (n > m)? n : m;
		System.out.println("El número mayor es " + mayor);
		
	}

}
