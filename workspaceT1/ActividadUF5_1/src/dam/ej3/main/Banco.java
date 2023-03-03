package dam.ej3.main;

import dam.ej3.pojo.Cuenta;

public class Banco {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta(12345, 505.4);

		double totalCuenta = cuenta.getSaldo();
		System.out.println("Total actual en la cuenta: " + totalCuenta +" Euros");

	}

}
