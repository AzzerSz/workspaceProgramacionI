package dam.ej3.pojo;

import java.util.StringTokenizer;

public class Estacion {
	
	private String nombre;
	private String provincia;
	private String estado;
	private String nremontes;
	private String npistas;
	private String nkm;
	
	public Estacion(String nombre, String provincia, String estado, String nremontes, String npistas, String nkm) {
		this.nombre = nombre;
		this.provincia = provincia;
		this.estado = estado;
		this.nremontes = nremontes;
		this.npistas = npistas;
		this.nkm = nkm;
		
	}
		
	public String toString() {
        String info = null;
        if (estado.equalsIgnoreCase("ABIERTA")) {
            info = nombre + " (" + provincia + ")" + "\nEstado: " + estado + "\nRemontes: " + nremontes + ", Pistas: "
                    + npistas + ", Km esquiables: " + nkm + "\nPorcentaje de Kilometros Esquiables: "
                    + calcularPorcentaje() + "%";
        } else if (estado.equalsIgnoreCase("CERRADA")) {
           info = nombre + " (" + provincia + ")" + "\nEstado: " + estado;
        }
        return info;
	}
        
        public String kmEsquiables() {
            StringTokenizer st = new StringTokenizer(nkm,"/");
            String[] nums = new String[2];

            for (int i = 0; i < 2; i++) {
                nums[i] = st.nextToken();
            }
            String nKmEsquiables = nums[0];

            return nKmEsquiables;

        }

        public double calcularPorcentaje() {
            StringTokenizer st = new StringTokenizer(nkm,"/");
            String[] nums = new String[2];

            for (int i = 0; i < 2; i++) {
                nums[i] = st.nextToken();
            }

            double nKmEsquiables = Double.parseDouble(nums[0]);
            double nTotalKm = Double.parseDouble(nums[1]);
            double porcentajeKmsEsq = (nKmEsquiables * 100) / nTotalKm;

            return porcentajeKmsEsq;
        }

}
