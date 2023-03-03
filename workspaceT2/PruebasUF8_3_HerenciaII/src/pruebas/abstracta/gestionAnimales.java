package pruebas.abstracta;

public class gestionAnimales {

	public static void main(String[] args) {
		// no podemos instanciar una clse anstracta por que tiene métodos sin implementación
		// Y si quisieramos hacerlo tendiramos que añadiir los iplemtacpón ea dichos métodos en la instanciación
		
		AnimalVertebrado av = new AnimalVertebrado("Mamífero", "Caballo") {
			
			@Override
			public void movimiento() {
				System.out.println("Se mueve trotando o galapando");
				
			}
			
			@Override
			public void alimentacion() {
				System.out.println("Es herbívoro");
				
			}
		};

	}

}
