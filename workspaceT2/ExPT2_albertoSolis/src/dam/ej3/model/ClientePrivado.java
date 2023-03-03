package dam.ej3.model;

public class ClientePrivado extends Cliente {

	private String numCuenta;

	public ClientePrivado(String dni, String fechaNac, String numCuenta) {
		super(dni, fechaNac);
		this.numCuenta = numCuenta;
	}
	
	public void calcularFactura() {
		System.out.println("El cliente ha realizado " + numVisitas + " visitas\n" 
							+ "Tiene una factura de " + (numVisitas * 35) + "�" );
	}
	
	@Override
	public String toString() {
		return "Cliente privado:\n" + super.toString() + "\nN�mero de cuenta: " + numCuenta;
	}
	
}
