package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import dam.model.Encuesta;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class PAddEncuesta extends JPanel {
	
	public static final String BTN_GUARDAR = "Guardar Encuesta";
	
	private JComboBox<String> cmbSexo;
	private JSpinner spnEdad;
	private final ButtonGroup btngPartidos = new ButtonGroup();
	private JRadioButton rbtnMasMadrid;
	private JRadioButton rdbtnPP;
	private JRadioButton rdbtnPSOE;
	private JRadioButton rdbtnUnidasPodemos;
	private JRadioButton rdbtnVOX;
	private JRadioButton rdbtnCiudadanos;
	
	public PAddEncuesta() {
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("A\u00F1adir Encuesta");
		lblTitulo.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD | Font.ITALIC, 24));
		lblTitulo.setBounds(10, 10, 206, 23);
		add(lblTitulo);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSexo.setBounds(46, 60, 63, 17);
		add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(46, 92, 63, 20);
		add(lblEdad);
		
		JLabel lblPartido = new JLabel("Partido:");
		lblPartido.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPartido.setBounds(46, 121, 63, 20);
		add(lblPartido);
		
		cmbSexo = new JComboBox<String>();
		cmbSexo.setModel(new DefaultComboBoxModel<String>(Encuesta.SEXOS));
		cmbSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbSexo.setBounds(121, 60, 123, 17);
		add(cmbSexo);
		
		spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(18, 18, 115, 1));
		spnEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spnEdad.setBounds(119, 92, 97, 20);
		add(spnEdad);
		
		rdbtnCiudadanos = new JRadioButton("Ciudadanos");
		btngPartidos.add(rdbtnCiudadanos);
		rdbtnCiudadanos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCiudadanos.setBounds(46, 164, 123, 21);
		add(rdbtnCiudadanos);
		
		rbtnMasMadrid = new JRadioButton("M\u00E1s madrid");
		btngPartidos.add(rbtnMasMadrid);
		rbtnMasMadrid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbtnMasMadrid.setBounds(171, 164, 123, 21);
		add(rbtnMasMadrid);
		
		rdbtnPP = new JRadioButton("Partido Popular");
		btngPartidos.add(rdbtnPP);
		rdbtnPP.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnPP.setBounds(296, 164, 154, 21);
		add(rdbtnPP);
		
		rdbtnPSOE = new JRadioButton("Partido Socialista Obrero Espa\u00F1ol");
		btngPartidos.add(rdbtnPSOE);
		rdbtnPSOE.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnPSOE.setBounds(46, 202, 310, 21);
		add(rdbtnPSOE);
		
		rdbtnUnidasPodemos = new JRadioButton("Unidas Podemos");
		btngPartidos.add(rdbtnUnidasPodemos);
		rdbtnUnidasPodemos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnUnidasPodemos.setBounds(46, 239, 198, 21);
		add(rdbtnUnidasPodemos);
		
		rdbtnVOX = new JRadioButton("VOX");
		btngPartidos.add(rdbtnVOX);
		rdbtnVOX.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnVOX.setBounds(231, 239, 123, 21);
		add(rdbtnVOX);
		
		JButton btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(126, 266, 197, 24);
		add(btnGuardar);
	}
}
