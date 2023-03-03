package pruebas.abstracta;

public abstract class Aguila extends AnimalVertebrado {

	private double envergadura;
	private String anida;
	
	public Aguila(String subgrupo, String nombre, double envgadura, String anida) {
		super("Ave", "´Águila");
		this.envergadura = envgadura;
		this.anida = anida;
	}
	
	@Override
	public void informacion() {
		super.informacion();
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Aguila [envgadura=" + envergadura + ", anida=" + anida + "]";
	}
	
	
	
	
	
}
