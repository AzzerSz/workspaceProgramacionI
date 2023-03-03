package dam.pruebas.sentenciascontrol;

public class PruebasSwitch {

	public static void main(String[] args) {
		char c = 'u';
		
		/*switch (c) {
		case 'a':
			System.out.println("Es una vocal");
			break;
		case 'e':
			System.out.println("Es una vocal");
			break;
		case 'i':
			System.out.println("Es una vocal");
			break;
		case 'o':
			System.out.println("Es una vocal");
			break;
		case 'u':
			System.out.println("Es una vocal");
			break;
		default:
			System.out.println("Es una consonante");
			break;
		} */
		
		switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Es una vocal");
				break;
		default:
			System.out.println("Es una consonante");
			break;
		}

	}

}
