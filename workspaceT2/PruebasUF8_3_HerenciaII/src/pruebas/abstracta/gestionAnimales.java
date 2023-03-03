package pruebas.abstracta;

public class gestionAnimales {

	public static void main(String[] args) {
		// no podemos instanciar una clse anstracta por que tiene m�todos sin implementaci�n
		// Y si quisieramos hacerlo tendiramos que a�adiir los iplemtacp�n ea dichos m�todos en la instanciaci�n
		
		AnimalVertebrado av = new AnimalVertebrado("Mam�fero", "Caballo") {
			
			@Override
			public void movimiento() {
				System.out.println("Se mueve trotando o galapando");
				
			}
			
			@Override
			public void alimentacion() {
				System.out.println("Es herb�voro");
				
			}
		};

	}

}
