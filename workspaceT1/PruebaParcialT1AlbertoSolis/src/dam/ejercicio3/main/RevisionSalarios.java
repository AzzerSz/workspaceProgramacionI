package dam.ejercicio3.main;

import java.util.Scanner;

import dam.ejercicio3.pojo.Empleado;

public class RevisionSalarios {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el identificador del empleado");
		String id = entrada.nextLine();
		System.out.println("Introduce el salario del empleado");
		int salario = Integer.parseInt(entrada.nextLine());
		System.out.println("Introduce los años de antigüedad del empleado");
		int años = Integer.parseInt(entrada.nextLine());
		
		Empleado empleado = new Empleado(id, salario, años);
		empleado.revisarSalario();
		
		System.out.println(empleado);
		
		entrada.close();

	}

}
