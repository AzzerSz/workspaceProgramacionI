package dam.main;

import dam.pojos.PrimerPojo;

public class ClaseEjec {

	public static void main(String[] args) {
		
		PrimerPojo PrimerPojo1 = new PrimerPojo();
		PrimerPojo1.setNombre("Fernando");
		PrimerPojo1.setCasado(false);
		PrimerPojo1.setEdad(25);
		
		PrimerPojo PrimerPojo2 = new PrimerPojo();
		PrimerPojo2.setNombre("Silvia");
		PrimerPojo2.setCasado(true);
		PrimerPojo2.setEdad(35);
		
		PrimerPojo PrimerPojo3 = new PrimerPojo("Juan", 28, false);
		
		// Saludo al primerPojo1
		System.out.println("Bienvenido " + PrimerPojo1.getNombre());
		
		// Saludo al primerPojo2
		System.out.println("Bienvenido " + PrimerPojo2);
		
		System.out.println(PrimerPojo3);
	}

}
