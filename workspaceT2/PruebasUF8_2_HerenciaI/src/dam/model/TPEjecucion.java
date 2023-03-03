package dam.model;

import java.io.IOException;

public class TPEjecucion extends TareaPeriodica {

	private String cmd;

	public TPEjecucion(int aPeriodoSegs, String cmd) {
		super(aPeriodoSegs);
		this.cmd = cmd;
	}

	public String leerCmd() {
		return cmd;
	}
	
	@Override
	public void ejecutarTarea() {
		try {
			Runtime.getRuntime().exec(cmd);
			} catch (IOException e) {
				System.out.println("Imposible ejecutar comando: " + cmd);
			}
	}
	
	
}
