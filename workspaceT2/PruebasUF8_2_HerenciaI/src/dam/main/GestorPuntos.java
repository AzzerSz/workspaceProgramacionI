package dam.main;

import dam.model.Punto2D;
import dam.model.Punto3D;

public class GestorPuntos {

	public static void main(String[] args) {
		Punto2D p2d = new Punto2D(1, 1);
		Punto2D p3d = new Punto3D(3, 4, 5);

		if (p3d instanceof Punto2D) {
			System.out.println("p3d es un Punto2D");
		}
		
		if (p3d instanceof Punto3D) {
			System.out.println("p3d es un Punto3D");
		}
		
		if (p2d instanceof Punto3D) {
			System.out.println("p2d es un Punto3D");
		} else {
			System.out.println("p2d no es un Punto3D");
		}
	}

}
