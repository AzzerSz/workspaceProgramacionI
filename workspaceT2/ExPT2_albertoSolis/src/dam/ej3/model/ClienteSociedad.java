package dam.ej3.model;

public class ClienteSociedad extends Cliente{
	
	public static final String SOCIEDAD1 = "Sanitas";
	public static final String SOCIEDAD2 = "Adeslas";
	public static final String SOCIEDAD3 = "Asisa";
	public static final String SOCIEDAD4 = "DKV";
	
	public static final int MIN_NUM_ASEG = 100000;
	
	private String sociedad;
	private int numAsegurado;
	
	public ClienteSociedad(String dni, String fechaNac, String sociedad, int numAsegurado) {
		super(dni, fechaNac);
		this.sociedad = sociedad;
		this.numAsegurado = numAsegurado;
	}
	
	@Override
	public String toString() {
		String socTrad = ""; 
		
		if (sociedad.equalsIgnoreCase(SOCIEDAD1.substring(0, 2))) {
			socTrad = SOCIEDAD1;
		} else if (sociedad.equalsIgnoreCase(SOCIEDAD2.substring(0, 2))) {
			socTrad = SOCIEDAD2;
		} else if (sociedad.equalsIgnoreCase(SOCIEDAD3.substring(0, 2))) {
			socTrad = SOCIEDAD3;
		} else if (sociedad.equalsIgnoreCase(SOCIEDAD4.substring(0, 2))) {
			socTrad = SOCIEDAD4;
		}
		
		return "Cliente de sociedad:\n" + super.toString() + "\nSociedad: " + socTrad 
				+ "\nNumero de asegurado: " + numAsegurado;
	}
	
}
