package dam.db.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dam.db.AccesoDB;

public class UsuariosPersistencia {

	private AccesoDB acceso;

	public UsuariosPersistencia() {
		this.acceso = new AccesoDB();
	}

	public String consultarPasswordPorUsuario(String nomUser) {
		String pwd = null;
		
		String query = "SELECT " + UsuariosContract.COL_PWD 
				+ " FROM " + UsuariosContract.TAB_USUARIOS 
				+ " WHERE " + UsuariosContract.COL_USER + " = ? ";
		
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
				if (pstmt != null) rslt.close();
				if (con != null) con.close();;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return pwd;
	}

	
}
