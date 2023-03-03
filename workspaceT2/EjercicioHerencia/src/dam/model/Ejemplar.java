package dam.model;

public abstract class Ejemplar {

	protected int nEjemplares;
	protected int ejemplaresPrest;
	
	public Ejemplar(int nEjemplares, int ejemplaresPrest) {
		this.nEjemplares = nEjemplares;
		this.ejemplaresPrest = ejemplaresPrest;
	}
	
	public boolean prestamo() {
		boolean existen = false;
		
		if (ejemplaresPrest < nEjemplares) {
			ejemplaresPrest++;
			
			existen = true;
		}
		return existen;
	}
	
	public boolean devolucion() {
		boolean existen = false;
		
		if (ejemplaresPrest > 0) {
			ejemplaresPrest--;
			
			existen = true;
		}
		
		return existen;
	}
	
	public void mostrarDatos() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return nEjemplares + " Ejemplares" + ", " + ejemplaresPrest + " Prestados";
	}
	
}
