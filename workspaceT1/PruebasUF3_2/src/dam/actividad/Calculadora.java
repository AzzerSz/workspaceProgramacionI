package dam.actividad;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		String solicitud1 ="Introduce un número";
		String solicitud2 ="Introduce otro número";
		String solicitud3 ="Introduce \n1- Para la suma"
				+ "\n2- Para la resta \n3- Para la multiplicación"
				+ "\n4- Para la división";
		System.out.println(solicitud1);
		Scanner teclado = new Scanner(System.in);
		String sNum1 = teclado.nextLine();
		double num1 = Double.parseDouble(sNum1);
		
		System.out.println(solicitud2);
		String sNum2 = teclado.nextLine();
		double num2 = Double.parseDouble(sNum2);
		
		System.out.println(solicitud3);
		String sNum3 = teclado.nextLine();
		int num3 = Integer.parseInt(sNum3);
		
		double resultado = (num3 == 1)? num1 + num2 : (num3 == 2)? num1 - num2 : (num3 == 3)? num1 * num2 : num1/num2;
		System.out.println((float)resultado);
		
		teclado.close();

	}

}
