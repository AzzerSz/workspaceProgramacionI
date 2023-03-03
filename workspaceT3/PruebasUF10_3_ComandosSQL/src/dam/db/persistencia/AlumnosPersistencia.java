package dam.db.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dam.db.AccesoDB;
import dam.model.Alumno;

public class AlumnosPersistencia {

	private AccesoDB acceso;
	
	public AlumnosPersistencia() {
		acceso = new AccesoDB();
	}
	
	public ArrayList<Alumno> consultarAlumnos() {
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		
		//SELECT DNI, NOMBRE, EDAD FROM ALUMNOS
		String query = "SELECT " + AlumnosContract.COL_DNI + ", " + AlumnosContract.COL_NOMBRE + ", " 
		+ AlumnosContract.COL_EDAD // COLUMNAS
		+ " FROM " + AlumnosContract.TAB_ALUMNOS;// TABLA
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			
			stmt = con.createStatement();
			
			rslt = stmt.executeQuery(query);
			
			String dni;
			String nom;
			int edad;
			
			while (rslt.next()) {
				dni = rslt.getString(AlumnosContract.COL_DNI);
				nom = rslt.getString(2);
				edad = rslt.getInt(3);
				
				listaAlumnos.add(new Alumno(dni, nom, edad));
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Problemas con el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problemas con la base de datos");
			e.printStackTrace();
		} finally {
			try {
				
				if (rslt != null) rslt.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listaAlumnos;
		
	}
	
	public Alumno consultarAlumnoPorDni(String dni) {
		Alumno alumno = null;
		
		
		//SELECT DNI, NOMBRE, EDAD FROM ALUMNOS WHERE DNI = ?;
		String query = "SELECT " + AlumnosContract.COL_NOMBRE + ", "
		+ AlumnosContract.COL_EDAD // COLUMNAS
		+ " FROM " + AlumnosContract.TAB_ALUMNOS// TABLA
		+ " WHERE UPPER(" + AlumnosContract.COL_DNI + ") = ? ";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, dni);
			
			rslt = pstmt.executeQuery();
			
			String nom;
			int edad;
			
			if (rslt.next()) {
				nom = rslt.getString(1);
				edad = rslt.getInt(2);
				
				alumno = new Alumno(dni, nom, edad);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Problemas con el driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problemas con la base de datos");
			e.printStackTrace();
		} finally {
			try {
				
				if (rslt != null) rslt.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return alumno;
	}
	
	public int insertarAlumno(Alumno alumno) {
		int resultado = 0;
		
		String query = "INSERT INTO " + AlumnosContract.TAB_ALUMNOS + " VALUES (?,?,?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, alumno.getDni());
			pstmt.setString(2, alumno.getNombre());
			pstmt.setInt(3, alumno.getEdad());
			
			resultado = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			resultado = -1;
			e.printStackTrace();
		} finally {
			try {

				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return resultado;
	}
}
