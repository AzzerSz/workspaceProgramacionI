package dam.model;

public class TPAviso extends TareaPeriodica {

	private String aviso;

	public TPAviso(int periodo, String aviso) {
		super(periodo);
		this.aviso = aviso;
	}
	
	/*
	public TPAviso(String aviso, int periodo) {
		this.aviso = aviso;
		this.periodo = periodo;
		actualizarReloj();
		activa = true;
	}
	*/
	
	public String leerAviso() {
		return aviso;
	}
	
	@Override
	public void ejecutarTarea() {
		System.out.println(leerAviso());
	}
	
}
