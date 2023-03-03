package dam.ej6.main;

import dam.ej6.pojo.Autor;
import dam.ej6.pojo.Libro;

public class Ejercicio6 {

	public static void main(String[] args) {
		Autor autor = new Autor("Paul","Auster", 58);

		Libro libro = new Libro("La trilogia de Nueva York", autor);

		System.out.println(libro.getTitulo() + " de " + libro.getAutor());

	}

}
