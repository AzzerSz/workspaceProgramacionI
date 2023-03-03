package dam.ej9.pojo;

public class Persona {
	
	private int sexo;
	private int trabaja;
	private int sueldo;
	
	public Persona(int sexo, int trabaja, int sueldo) {
		this.sexo = sexo;
		this.trabaja = trabaja;
		this.sueldo = sueldo;
	}

	public int getSexo() {
		return sexo;
	}

	public int getTrabaja() {
		return trabaja;
	}
	
	public int getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Persona [sexo=" + traducirSexo() + ", trabaja=" + traducirTrabaja() + ", sueldo=" + sueldo + "]";
	}

	private String traducirSexo() {
	
		return sexo == 1? "Hombre":"Mujer";
	}
	private String traducirTrabaja() {
		
		return sexo == 1? "SI":"NO";
	}
	
	
}
