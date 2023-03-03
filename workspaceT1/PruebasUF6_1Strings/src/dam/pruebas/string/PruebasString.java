package dam.pruebas.string;

import java.util.Scanner;

public class PruebasString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String texto = "       Una variable de referencia u objeto es una variable cuyo" 
				+ " tipo de dato no es primitivo";
		
		int cantChar = texto.length();
		System.out.println("La cadena texto de caracteres, texto contiene " + cantChar + " caracteres");
		
		char letra = texto.charAt(25);
		System.out.println("En la posici�n 25 del texto hay una " + letra);
		
		texto = texto.trim();
		cantChar = texto.length();
		System.out.println("La cadena texto de caracteres, texto contiene " + cantChar + " caracteres");
		
		System.out.println("Variable texto en may�sculas: \n" + texto.toUpperCase());
		System.out.println("Variable texto en min�sculas: \n" + texto.toLowerCase());
		
		System.out.println("Introduce un n�mero ");
		String sNum = sc.nextLine();
		System.out.println("El n�mero " + sNum + " tiene " + sNum.length() + " d�gitos");
		
		int posObjeto = texto.indexOf("objeto");
		String subTexto = texto.substring(posObjeto);
		
		System.out.println("\n" + subTexto);
		
		subTexto = texto.substring(posObjeto, posObjeto + "objeto".length());
		
		// Utilizamos el m�todo indexOf para obtener la posici�n de una palabra desde el principio
		// Utilizamos el m�todo lastIndexOF para obtener la �ltima posici�n de una palabra, es decir,
		// desde el final
		
		int lastPosObjeto = texto.lastIndexOf("objeto");
		
		if (posObjeto == lastPosObjeto) {
			System.out.println("La palabra objeto aparece solo una vez en texto");
		}
		
		int posVariable = texto.indexOf("variable");
		int lastPosVariable = texto.lastIndexOf("variable");
		
		if (posVariable != lastPosVariable) {
			System.out.println("La palabra variable aparece m�s de una vez en texto");
			System.out.println(posVariable);
			System.out.println(lastPosVariable);
		}
		
		System.out.println(texto.replace('o', 'a'));
		
		System.out.println("Texto empieza por 'Hab�a una vez'? " + texto.startsWith("Hab�a una vez"));
		
		System.out.println("Texto acaba por 'primitivo'? " + texto.endsWith("primitivo"));
		
		 if (texto.equals("Otro texto")) {
			 System.out.println("'Otro texto' es igual a texto");
		 } else {
			 System.out.println("'Otro texto' no es igual a texto");
		 }
		
		sc.close();
	
	}

}
