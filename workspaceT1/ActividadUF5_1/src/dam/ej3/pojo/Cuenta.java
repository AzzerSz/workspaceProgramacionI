package dam.ej3.pojo;

public class Cuenta {
	private int numeroCuenta;

	private double saldo;

	public Cuenta(int cuenta, double inicial) {
		numeroCuenta = cuenta;
		saldo = inicial;
	}

	public void depositar(double cantidad) {
		saldo = saldo + cantidad;
	}
	public double getSaldo() {
		return saldo;
	}

}
