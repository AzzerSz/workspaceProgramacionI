package dam.db.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

import dam.db.AccesoDB;
import dam.model.Participante;

public class ParticipantesPersistencia {

	private AccesoDB acceso;

	public ParticipantesPersistencia() {
		acceso = new AccesoDB();
	}
	
	public ArrayList<Participante> consultarDatos() {
		ArrayList<Participante> listaCorredores = new ArrayList<Participante>();
		
		String query = "SELECT " + ParticipantesContract.COL_CANCION + ", "+ ParticipantesContract.COL_INTERPRETE
				+ ", " + ParticipantesContract.COL_PAIS + ", " + ParticipantesContract.COL_PUNTOS_TOT 
				+ ", " + ParticipantesContract.COL_PUNTOS_JUR + ", " + ParticipantesContract.COL_PUNTOS_PUBL
				+ " FROM " + ParticipantesContract.TBL_PARTICIPANTES 
				+ " ORDER BY " + ParticipantesContract.COL_PUNTOS_TOT + " DESC ";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			
			stmt = con.createStatement();
			
			rslt = stmt.executeQuery(query);
			
			String interprete;
			String pais;
			String cancion;
			int ptsJur;
			int ptsPub;
			int ptsTot;
			
			while (rslt.next()) {
				
				interprete = rslt.getString(ParticipantesContract.COL_INTERPRETE);
				pais = rslt.getString(ParticipantesContract.COL_PAIS);
				cancion = rslt.getString(ParticipantesContract.COL_CANCION);
				ptsJur = rslt.getInt(ParticipantesContract.COL_PUNTOS_JUR);
				ptsPub = rslt.getInt(ParticipantesContract.COL_PUNTOS_PUBL);
				ptsTot = rslt.getInt(ParticipantesContract.COL_PUNTOS_TOT);
				
				listaCorredores.add(new Participante(pais, interprete, cancion, ptsJur, ptsPub, ptsTot));
				
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
	
	public ArrayList<String> consultarPaisesEurovision() {
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		String query = "SELECT " + ParticipantesContract.COL_PAIS
				+ " FROM " + ParticipantesContract.TBL_PARTICIPANTES 
				+ " ORDER BY " + ParticipantesContract.COL_PAIS;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			
			con = acceso.getConexion();
			stmt = con.createStatement();
			rslt = stmt.executeQuery(query);
			
			listaNombres.add("-");
			
			while (rslt.next()) {
				listaNombres.add(rslt.getString(ParticipantesContract.COL_PAIS));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
		
		return listaNombres;
		
	}
	
	public int ActualizarRestaurante(TreeMap<Integer, String> paisPuntos) {
		
		int exito = 0;
		
		String query = "UPDATE " + ParticipantesContract.TBL_PARTICIPANTES 
					+ " SET " + ParticipantesContract.COL_PUNTOS_JUR + " = (" + ParticipantesContract.COL_PUNTOS_JUR + " ?), "
					+ ParticipantesContract.COL_PUNTOS_TOT + " = (" + ParticipantesContract.COL_PUNTOS_TOT + "+ ?)"
					+ " WHERE " + ParticipantesContract.COL_PAIS + " = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			
			for (Entry<Integer, String> pais : paisPuntos.entrySet()) {
				
				pstmt.setInt(1, pais.getKey());
				pstmt.setInt(2, pais.getKey());
				pstmt.setString(3, pais.getValue());
				exito = pstmt.executeUpdate();
			}
			
			
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
		
		return exito;
	}
	
}
