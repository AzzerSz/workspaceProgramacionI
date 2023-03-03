import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int casos = Integer.parseInt(input.nextLine());
		int caso;
		int salto;
		int arriba = 0;
		int abajo = 0;
		
		for (int i = 0; i < casos; i++) {
			caso = Integer.parseInt(input.nextLine());
			if (caso > 0 && caso < 10) {
				for (int j = 0; j < caso; j++) {
					salto = input.nextInt();
					if (salto < caso) {
						arriba++;
					} else if (salto > caso) {
						abajo++;
					}
					
				}
				
				System.out.println(abajo + "," + arriba);
				
			}
		}
		
		input.close();
	}

}

