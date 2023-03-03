package dam.operadores.arit;

public class PruebasOpArit {

	public static void main(String[] args) {
		// Variable primitiva de tipo entero inicializada en el valor 2 (long,int,short,byte)
		int n1=2;
		// Declaración de variable primitiva de tipo entero 
		int n2;
		// OP1: Le asignamos a n2 el resultado de multiplicar n1 * n1
		n2 = n1 * n1; // n2=4
		System.out.println("El valor de n2 en OP1 es " + n2);
		
		// OP2: Le asignamos a n2 el resultado de restar a n2, n1
		n2 = n2-n1; // n2=2
		System.out.println("El valor de n2 en OP2 es " + n2);
		
		/* OP3: Le asignamos a n2 un nuevo valor que es
		 * el resultado de sumar n2 más n1 + el valor de 15
		 */
		n2 = n2+n1+15; // n2=19
		System.out.println("El valor de n2 en OP3 es " + n2);
		
		// OP4: Le asignamos un nuevo valor a n2 con el resultado de dividir n2 / n1 
		n2 = n2/n1; // n2=9
		System.out.println("El valor de n2 en OP4 es " + n2);
		
		// OP5: Le asignamos a n2 el valor del resto de dividir n2 entre n1
		n2 = n2%n1; // n2=1
		System.out.println("El valor de n2 en OP5 es " + n2);
		

	}

}
