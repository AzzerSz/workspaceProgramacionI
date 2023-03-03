package dam.empresa.model;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Asalariado> listaEmpleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		listaEmpleados = new ArrayList<Asalariado>();
	}
	
	public ArrayList<Asalariado> getListaEmpleados() {
		return listaEmpleados;
	}
	
	public void setListaEmpleados(Asalariado asalariado) {
		this.listaEmpleados.add(asalariado);
	}
	
	@Override
	public String toString() {
		String msg = "";
		
		for (int i = 0; i < listaEmpleados.size(); i++) {
			msg += listaEmpleados.get(i) + "\n";
		}
		return msg;
	}
}
