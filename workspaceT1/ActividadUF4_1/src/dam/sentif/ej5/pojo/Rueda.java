package dam.sentif.ej5.pojo;

public class Rueda {
	
	private String marca;
	private double grosor;
	private double diametro;
	
	public Rueda() {
		
	}
	
	public Rueda(String marca, double grosor, double diametro) {
		this.marca = marca;
		this.grosor = grosor;
		this.diametro = diametro;
	}
	
	public String comprobarDiametro() {
		String mensaje = "";
		
		if (diametro > 1.4) {
			mensaje = "La rueda es para un vehiculo grande";
		} else if (diametro > 0.8) {
			mensaje = "La rueda es para un vehiculo mediano";
		} else {
			mensaje = "La rueda es para un vehiculo pequeño";
		}
		
		return mensaje;
	}
	
	public String comprobarGrosor() {
		String mensaje ="";
		
		if ((grosor > 1.4 && grosor < 0.4) 
				|| (diametro <= 1.4 && diametro > 0.8 && grosor < 0.25)) {
			mensaje = "El grosor para esta rueda es inferior al recomendado";
		} else {
			mensaje = "La rueda tiene un grosor adecuador";
		}
		
		return mensaje;
	}
	@Override
	public String toString() {
		return "Rueda [marca: " + marca + " grosor: " + grosor + " diametro: " + diametro + "]";
	}
 }
