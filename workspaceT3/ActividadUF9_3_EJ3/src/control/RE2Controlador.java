package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import model.Ecuacion;
import view.VResolverEc;

public class RE2Controlador implements ActionListener {

	VResolverEc v;
	
	
	
	public RE2Controlador(VResolverEc v) {
		this.v = v;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Ecuacion ec = v.getInformacion();
		double[] res;
		
		if (ec != null) {
			res = ec.resolver();
			if (res != null) {
				v.setResultado("Resultado 1: " + res[0] + " Resultado 2: " + res[1]);
			}
			
		}
	
	}

}
