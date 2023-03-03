package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import view.VComprobarCapicua;

public class CCEscuchador implements ActionListener {

	VComprobarCapicua vcc;	
	
	public CCEscuchador(VComprobarCapicua vcc) {
		this.vcc = vcc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer num = vcc.getInformacion();
		Integer digito;
		
		Integer mun = 0;
		
		if (num != null) {
			while (num != 0) {
				digito = num % 10;
				mun = mun * 10 + digito;

				num = num / 10;
			}
			
			boolean boolres;
			String res;
			
			if (mun.equals(vcc.getInformacion())) {
				res = "El número es capicúa";
				boolres = true;
			} else {
				res = "El número no es capicúa";
				boolres = false;
			}
			
			vcc.setResultado(res, boolres);
		}
		
	}
}
