package dam.db.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dam.db.AccesoDB;
import dam.model.Usuario;

public class UsuariosPersistencia {
	
	private AccesoDB acceso;
	
	public UsuariosPersistencia() {
		acceso = new AccesoDB();
	}

	public String consultarPasswordPorUsuario(String nomUser) {
		String pwd = null;
		
		String query = "SELECT " + UsuariosContract.COL_PWD 
				+ " FROM " + UsuariosContract.TAB_USUARIOS
				+ " WHERE " + UsuariosContract.COL_USER + " = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, nomUser);
			
			rslt = pstmt.executeQuery();
			
			if (rslt.next()) {
				pwd = rslt.getString(1);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
		
		return pwd;
	}

	public int insertarUsuario(Usuario user) {
		int resultado = 0;
		
		String query = "INSERT INTO " + UsuariosContract.TAB_USUARIOS + " VALUES (?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getNomUser());
			pstmt.setString(2, user.getPwd());
			
			resultado = pstmt.executeUpdate();
			
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
		return resultado;
	}

}
