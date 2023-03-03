package dam.db;

import java.sql.Connection;
import java.sql.SQLException;

public class PruebaAccesoDB {

	public static void main(String[] args) {

		AccesoDB acceso = new AccesoDB();
		
		try {
			
			Connection con = acceso.getConexion();
			System.out.println("Conexión establecida");
		} catch (ClassNotFoundException e) {
			System.out.println("Problemas con el driver");
		} catch (SQLException e) {
			System.out.println("Problemas con la url");
		}
	}

}
