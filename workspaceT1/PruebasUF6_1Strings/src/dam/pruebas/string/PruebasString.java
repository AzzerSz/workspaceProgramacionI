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
		System.out.println("En la posición 25 del texto hay una " + letra);
		
		texto = texto.trim();
		cantChar = texto.length();
		System.out.println("La cadena texto de caracteres, texto contiene " + cantChar + " caracteres");
		
		System.out.println("Variable texto en mayúsculas: \n" + texto.toUpperCase());
		System.out.println("Variable texto en minúsculas: \n" + texto.toLowerCase());
		
		System.out.println("Introduce un número ");
		String sNum = sc.nextLine();
		System.out.println("El número " + sNum + " tiene " + sNum.length() + " dígitos");
		
		int posObjeto = texto.indexOf("objeto");
		String subTexto = texto.substring(posObjeto);
		
		System.out.println("\n" + subTexto);
		
		subTexto = texto.substring(posObjeto, posObjeto + "objeto".length());
		
		// Utilizamos el método indexOf para obtener la posición de una palabra desde el principio
		// Utilizamos el método lastIndexOF para obtener la última posición de una palabra, es decir,
		// desde el final
		
		int lastPosObjeto = texto.lastIndexOf("objeto");
		
		if (posObjeto == lastPosObjeto) {
			System.out.println("La palabra objeto aparece solo una vez en texto");
		}
		
		int posVariable = texto.indexOf("variable");
		int lastPosVariable = texto.lastIndexOf("variable");
		
		if (posVariable != lastPosVariable) {
			System.out.println("La palabra variable aparece más de una vez en texto");
			System.out.println(posVariable);
			System.out.println(lastPosVariable);
		}
		
		System.out.println(texto.replace('o', 'a'));
		
		System.out.println("Texto empieza por 'Había una vez'? " + texto.startsWith("Había una vez"));
		
		System.out.println("Texto acaba por 'primitivo'? " + texto.endsWith("primitivo"));
		
		 if (texto.equals("Otro texto")) {
			 System.out.println("'Otro texto' es igual a texto");
		 } else {
			 System.out.println("'Otro texto' no es igual a texto");
		 }
		
		sc.close();
	
	}

}
