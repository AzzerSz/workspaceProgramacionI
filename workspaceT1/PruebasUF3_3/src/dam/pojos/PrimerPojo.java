package dam.pojos;

public class PrimerPojo {
	
	// ATRIBUTOS: Variables globales
	private String nombre;
	private int edad;
	private boolean casado;
	
	/* CONSTRUCTORES
	 constructor por defecto inicializa los valores por defecto
	 predeterminados por el sistema en función del tipo de dato:
	 null para variables de referencia
	 0 para valores numéricos
	 false para booleanos
	 " " para char
	 si no hay definido ningún constructor nos lo ofrece java por cortesía */
	public PrimerPojo() {
		
	}

	public PrimerPojo(String nombre, int edad, boolean casado) {
		this.nombre = nombre;
		this.edad = edad;
		this.casado = casado;
	}


	// MÉTODOS DE ACCESO: GET Y SET
	
	// métodos get me permiten acceder al valor de un atributo
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean getCasado() {
		return casado;
	}
	
	
	// metodos set me permiten asignar valor a un atributo void es el asignador de retorno
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	@Override
	public String toString() {
		return nombre + ", " + edad + "\n ¿Casado? " + casado;
	}
}
