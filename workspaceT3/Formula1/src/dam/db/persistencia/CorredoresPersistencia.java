package dam.db.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dam.db.AccesoDB;
import dam.model.Corredor;

public class CorredoresPersistencia {

	private AccesoDB acceso;
	
	public CorredoresPersistencia() {
		acceso = new AccesoDB();
	}
	
	public void insertarCorredor(Corredor corredor) {
		
		String query = "INSERT INTO " + CorredoresContract.TBL_PILOTOS + 
				" (" + CorredoresContract.COL_NUMERO + ", " + CorredoresContract.COL_NOMBRE
				+ ", " + CorredoresContract.COL_NACIONALIDAD + ", " + CorredoresContract.COL_EDAD
				+ ", " + CorredoresContract.COL_ESCUDERIA + ") "
				+ " VALUES " + "(?, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, corredor.getNumero());
			pstmt.setString(2, corredor.getNombre());
			pstmt.setString(3, corredor.getNacionalidad());
			pstmt.setInt(4, corredor.getEdad());
			pstmt.setString(5, corredor.getEscuderia());
			pstmt.executeUpdate();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {

				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public ArrayList<Corredor> consultarDatos() {
		ArrayList<Corredor> listaCorredores = new ArrayList<Corredor>();
		
		String query = "SELECT " + CorredoresContract.COL_NUMERO + ", "+ CorredoresContract.COL_NOMBRE + ", " + CorredoresContract.COL_NACIONALIDAD 
				+ ", " + CorredoresContract.COL_EDAD + ", " + CorredoresContract.COL_ESCUDERIA
				+ " FROM " + CorredoresContract.TBL_PILOTOS;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			
			stmt = con.createStatement();
			
			rslt = stmt.executeQuery(query);
			
			int numero;
			String nombre;
			String nacionalidad;
			int edad;
			String escuderia;
			
			while (rslt.next()) {
				
				numero = rslt.getInt(CorredoresContract.COL_NUMERO);
				nombre = rslt.getString(CorredoresContract.COL_NOMBRE);
				nacionalidad = rslt.getString(CorredoresContract.COL_NACIONALIDAD);
				edad = rslt.getInt(CorredoresContract.COL_EDAD);
				escuderia = rslt.getString(CorredoresContract.COL_ESCUDERIA);
				
				listaCorredores.add(new Corredor(numero, nombre, nacionalidad, edad, escuderia));
				
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
		};
		
		return listaCorredores;
		
	}
	
	public int eliminarCorredorNumero(int numero) {
		int resultado = 0;
		
		String query = "DELETE FROM " + CorredoresContract.TBL_PILOTOS 
						+ " WHERE " + CorredoresContract.COL_NUMERO + " = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, numero);
			
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
