package dam.model;

public class Participante {

	private String pais;
	private String interprete;
	private String cancion;
	private int puntosJur;
	private int puntosPubl;
	private int puntosTot;
	
	public Participante(String pais, String interprete, String cancion, int puntosJur, int puntosPubl, int puntosTot) {
		this.pais = pais;
		this.interprete = interprete;
		this.cancion = cancion;
		this.puntosJur = puntosJur;
		this.puntosPubl = puntosPubl;
		this.puntosTot = puntosTot;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public String getCancion() {
		return cancion;
	}

	public void setCancion(String cancion) {
		this.cancion = cancion;
	}

	public int getPuntosTot() {
		return puntosTot;
	}

	public void setPuntosTot(int puntosTot) {
		this.puntosTot = puntosTot;
	}

}
