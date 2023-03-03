package dam.operadores.rel;

public class PruebasOpRel {

	public static void main(String[] args) {
		
		/* Definición de dos variables primitivas de tipo entero, inicializando
		 * m a 2 y n a 5
		 */
		int m=2;
		int n=5;
		System.out.println("m = " + m + " y n = " + n);
		
		// Declaración de una variable primitiva de tipo booleana
		boolean res;
		
		/* Realizamos algunas operaciones de comparación y para ello usamos los
		 * operadores relacionales 
		 */
		
		// OP1: Le asignamos a res el resultado de comparar si m es mayor que n
		res = m > n;//res=false
		System.out.println("OP1: ¿Es m mayor que n? " + res);
		
		// OP2: Le asignamos a res el resultado de comparar si m es menor que n
		res = m < n;//res=true
		System.out.println("OP2: ¿Es m menor que n? " + res);
		
		// OP3: Le asignamos a res el resultado de comparar si m es mayor o igual que n
		res = m >= n;//res=false
		System.out.println("OP3: ¿Es m mayor o igual que n? " + res);
		
		// OP4: Le asignamos a res el resultado de comparar si m es menor o igual que n
		res = m <= n;//res=true
		System.out.println("OP4: ¿Es m menor o igual que n? " + res);
		
		// OP5 Le asignamos a res el resultado de comparar si m es igual a n
		res = m == n;//res=false
		System.out.println("OP5: ¿Es m igual a n? " + res);
		
		// OP6: Le asignamos a res el resultado de comparar si m es distinto a n
		res = m != n;//res=true
		System.out.println("OP6: ¿Es m distinto a n? " + res);
		
		// Añadimos dos asignaciones en las que utilizamos los operadores lógicos
		
		res = m > n && m >= n; //res=false
		System.out.println("OP7: ¿Es m mayor que n y m mayor o igual que n? " + res);
		System.out.println("OP8: ¿Resultado de negar si, m es menor que n o m es distinto que n? " + res);
		res = !(m < n || m != n); //res=false
		
	}

}
