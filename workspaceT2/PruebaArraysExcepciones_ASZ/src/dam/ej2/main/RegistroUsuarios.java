package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojos.Perfil;

public class RegistroUsuarios {

	static final int MIN_NCONTACT = 0;
	static final int MAX_NCONTACT = 100000;
	static final int MAX_CHAR = 45;
	static final int TAM = 10;
	static final String CIU1 = "Madrid";
	static final String CIU2 = "Valladolid";
	static final String CIU3 = "Málaga";
	static final String CIU4 = "Barcelona";
	
	static Perfil[] usuario;
	
	public static void main(String[] args) {
		
		usuario = new Perfil[TAM];
		
		rellenarUsuario();
		
		mostrarUsuario();
		
		analisisContactos();

	}

	private static void mostrarUsuario() {
		for (int i = 0; i < usuario.length; i++) {
			System.out.println("*** " + (i+1) + "º USUARIO ***");
			System.out.println(usuario[i]);
		}
		
	}

	private static void analisisContactos() {
		Perfil menContac = new Perfil("", "", "", MAX_CHAR + 1);
		
		for (int i = 0; i < usuario.length; i++) {
			if (usuario[i].getCiudad().equalsIgnoreCase(CIU1)) {
				if (menContac.getNContactos() > usuario[i].getNContactos()) {
						menContac = usuario[i];
				}
			}
		}
		
		if (menContac.getCiudad() == null) {
			System.out.println("No hay ningún perfil de " + CIU1);
		} else {
			System.out.println("El usuario / perfil con menos contactos de " + CIU1 + "es\n" + menContac);
		}
		
	}

	private static void rellenarUsuario() {
		
		String nombre = "";
		String puesto = "";
		String ciudad = "";
		int nContactos = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < usuario.length; i++) {
			System.out.println("*** " + (i+1) + "º USUARIO ***");
			System.out.println("Introduce el nombre del usuario");
			nombre = restriccionCarac(sc);
			System.out.println("Introduce el puesto del usuario");
			puesto = restriccionCarac(sc);
			System.out.println("Introduce la ciudad");
			ciudad = comprobarCiudad(sc);
			System.out.println("Introduce la cantidad de contactos");
			nContactos = comprobarContactos(sc);
			
			usuario[i] = new Perfil(nombre, puesto, ciudad, nContactos);
		}
		
		sc.close();
		
	}

	private static int comprobarContactos(Scanner sc) {
		int nContactos = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				nContactos = Integer.parseInt(sc.nextLine());
				
				if (nContactos < MIN_NCONTACT || nContactos > MAX_NCONTACT) {
					throw new Exception("Introduce un valor comprendido entre " + MIN_NCONTACT + " y " + MAX_NCONTACT);
				}
				
				valNoVal = false;
				
			} catch (NumberFormatException e) {
				System.out.println("Introduce un número entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return nContactos;
	}

	private static String comprobarCiudad(Scanner sc) {
		String ciudad = "";
		boolean valNoVal = true;
		
		while (valNoVal) {
				ciudad = sc.nextLine();

				if (ciudad.equalsIgnoreCase(CIU1) || ciudad.equalsIgnoreCase(CIU2)
						|| ciudad.equalsIgnoreCase(CIU3) || ciudad.equalsIgnoreCase(CIU4)) {
					valNoVal = false;
				} else {
					System.out.println("La ciudad tiene que ser " + CIU1 + ", " + CIU2 + ", " + CIU3 + " o " + CIU4);
				}
		}
		
		return ciudad;
	}

	// Se podría agregar un parámetro String para que repitiese el siso de Introduce (...) durante el bucle
	private static String restriccionCarac(Scanner sc) {
		String nombre = null;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				nombre = sc.nextLine();

				if (nombre.length() >= MAX_CHAR) {
					throw new Exception("Debes introducir menos de " + MAX_CHAR + " caracteres");
				}
				
				valNoVal = false;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return nombre;
		
	}

}
