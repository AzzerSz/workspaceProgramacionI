package dam.ej31.pojo;

public class Alumno {
	private String nombre;
	private double notaDeb;
	private double notaExa;
	private double notaAct;
	
	public Alumno(String nombre, double notaDeb, double notaExa, double notaAct) {
		this.nombre = nombre;
		this.notaDeb = notaDeb;
		this.notaExa = notaExa;
		this.notaAct = notaAct;
	}
	
	public double getNotaFinal() {
		
		double nota = 0;
		
		if (notaExa >= 4 && notaDeb >= 5) {
			nota = notaDeb * 0.6 + notaExa * 0.3 + notaAct * 0.1;
			
		} else {
			nota = notaExa * 0.9 + notaAct * 0.1; 
		}
		
		return nota;
	}

	@Override
	public String toString() {
		return "El nombre del alumno es " + nombre + ", La nota de sus tareas es " + notaDeb 
				+ ", La nota de su examen es " + notaExa + ", La nota de la actitud es " + notaAct;
	}
	
	
}
