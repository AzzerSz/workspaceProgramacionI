package dam.grupo.ej3;

import java.util.Scanner;

public class Ejercico3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int contador,n,numero;
 
        System.out.print("Ingresa un numero: ");
        numero = sc.nextInt();
 
        contador = 0;
 
        for(n = 1; n <= numero; n++)
        {
            if((numero % n) == 0)
            {
                contador++;
            }
        }
 
        if(contador <= 2)
        {
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
        
        sc.close();
	}

}
