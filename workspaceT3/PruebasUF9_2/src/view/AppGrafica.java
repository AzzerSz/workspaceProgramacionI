package view;

public class AppGrafica {

	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater (new Runnable() {
			public void run() {
			VentanaPrincipal ventanaPrincipal = new VentanaPrincipal("Primera App Gráfica");
			ventanaPrincipal.hacerVisible();

				}
			});

	}

}
