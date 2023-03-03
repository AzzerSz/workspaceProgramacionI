package dam.pruebas.sentenciascontrol;

public class PruebasIf {

	public static void main(String[] args) {
		int m = 2;
		int n = 5;
		System.out.println("m = " + m + " y n = " + n);
		
		/*boolean res = m > n;
		
		if (res) {
			
		}*/
		
		if (m > n) {
			System.out.println("m es mayor que n");
		} else if ( m == n) {
			System.out.println("m es igual a n");
		} else {
			System.out.println("n es mayor que m");
			
		}
	}

}
