package dam.ej2.pojo;

import java.util.StringTokenizer;

public class Estacion {
	
	private String nombre;
	private String provincia;
	private String estado;
	private String nRemontes;
	private String nPistas;
	private String nKmEsquiables;
	
	public Estacion(String nombre, String provincia, String estado, String nRemontes, String nPistas, String nKmEsquiables) {
		this.nombre = nombre;
		this.provincia = provincia;
		this.estado = estado;
		this.nRemontes = nRemontes;
		this.nPistas = nPistas;
		this.nKmEsquiables = nKmEsquiables;
	}
	
	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		String toS = "";
		double redondeo = Math.round(PorcentajeKmEsquiables() * 100) ;
		
		if(estado.equalsIgnoreCase("ABIERTA")) {
			toS = nombre + "(" + provincia + ")" + "\nEstado: " + estado.toUpperCase() 
			+ "\nRemontes: " + nRemontes + ", Pistas: " + nPistas + ", Km esquiables: " + nKmEsquiables 
			+ "\nPorcentaje de km esquiables: " + (redondeo/100) + "%";
			
		} else if (estado.equalsIgnoreCase("CERRADA")) {
			toS = nombre + "(" + provincia + ")" + "\nEstado: " + estado.toUpperCase();
		}
		
		return  toS;
	}

	public double PorcentajeKmEsquiables() {
		StringTokenizer st;
		
		int disponibles = 0;
		int totales = 0;
		
		double porcentaje = 0;
		
		if (estado.equalsIgnoreCase("abierta")) {
			
			st = new StringTokenizer(nKmEsquiables, "/");
			
			for (int i = 0; i < 2; i++) {
				if (i == 0) {
					disponibles = Integer.parseInt(st.nextToken());
				} else if (i == 1) {
					totales = Integer.parseInt(st.nextToken());
				}
			} 
		}
		porcentaje = (double)100 * disponibles / totales;
		
		return porcentaje;
	}
	
	public int kmEsquiables() {
		int disponibilidad = 0;
		StringTokenizer st2;
		
		if (estado.equalsIgnoreCase("abierta")) {
			st2 = new StringTokenizer(nKmEsquiables, "/");
			disponibilidad = Integer.parseInt(st2.nextToken());
		}
		return disponibilidad;
		
	}
	
	
}
