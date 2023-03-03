package dam.empresa.main;

import java.util.Scanner;

import dam.empresa.model.Asalariado;
import dam.empresa.model.Empresa;

public class GestorEmpresa {

	private static final String[] MENU_PRINC = {"Introduce:", "1 - Para añadir una estancia", 
			"2 - Para mostrar las estancias de la casa y los m2", "3 - Para salir del programa"};
	
	private static final String[] MENU_EST = {"Introduce:", "1 - Para agregar un empleado de producción", "2 - Para agregar un empleado de distribución"};

	
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int num = -1;
		System.out.println("Introduce el nombre de la empresa");
		Empresa empresa = new Empresa(sc.nextLine());
		
		
		while (num != 3) {
			
			for (int i = 0; i < MENU_PRINC.length; i++) {
				System.out.println(MENU_PRINC[i]);
			}
			
			num = solicitarNumeroRangoInt(1, 3, "");
			
			switch (num) {
			case 1:
				empresa.setListaEmpleados(solicitarTrabajador());
				break;

			case 2:
				System.out.println(empresa);
				break;
			}
			
		}
		sc.close();
		System.out.println("** FINALIZANDO EL PROGRAMA **");
		
		

	}
	
	private static Asalariado solicitarTrabajador() {
		String tipo = solicitarTipoEmpleado();
		return null;
	}

	private static String solicitarTipoEmpleado() {
		char tipo = ' ';
		
		while (tipo != 'P' && tipo != 'D') {
			System.out.println("Introduce el tipo de empleado (P - Producción | D - Distribución)");
			
			tipo = sc.nextLine().toUpperCase().charAt(0);
		}
		return null;
	}

	private static int solicitarNumeroRangoInt(int min, int max, String msg) {
		int num = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				if (!msg.isEmpty()) {
					System.out.println(msg);
				}
				num = Integer.parseInt(sc.nextLine());
				
				if (num < min || num > max) {
					throw new NumberFormatException();
				} else {
					valNoVal = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduce un número decimal o entero comprendido entre {" + min + ", " + max + "}");
			}
		}
		
		return num;
	}

}
