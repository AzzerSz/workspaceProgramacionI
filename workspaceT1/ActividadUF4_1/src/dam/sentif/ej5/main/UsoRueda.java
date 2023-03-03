package dam.sentif.ej5.main;

import java.util.Scanner;

import dam.sentif.ej5.pojo.Rueda;

public class UsoRueda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la marca de la rueda");
		String marca = teclado.nextLine();
		
		System.out.println("Introduce el diametro de la rueda");
		double diametro = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Introduce el grosor de la rueda");
		double grosor = Double.parseDouble(teclado.nextLine());
		
		teclado.close();
				
		Rueda rueda = new Rueda(marca, grosor, diametro);
		
		System.out.println("Datos de la rueda: \n" + rueda );
		
		String diametroRueda = rueda.comprobarDiametro();
		System.out.println(diametroRueda);
		
		String grosorRueda = rueda.comprobarGrosor();
		System.out.println(grosorRueda);

	}

}
