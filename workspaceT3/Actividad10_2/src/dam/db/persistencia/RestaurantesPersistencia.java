package dam.db.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dam.db.AccesoDB;
import dam.model.Restaurante;

public class RestaurantesPersistencia {

	public static final String SELECT_ALL = "TODAS";
	
	private AccesoDB acceso;

	public RestaurantesPersistencia() {
		acceso = new AccesoDB();
	}
	
	public ArrayList<Restaurante> consultarDatos(int distincion, String region) {
		ArrayList<Restaurante> listaRestaurantes = new ArrayList<Restaurante>();
		
		String query = "";
		
		int estadoQuery = 0;
		
		if (region.equalsIgnoreCase(SELECT_ALL) && distincion == 0) {
			
			query = "SELECT " + RestaurantesContract.COL_ID + ", "+ RestaurantesContract.COL_NOMBRE + ", " + RestaurantesContract.COL_CIU 
					+ ", " + RestaurantesContract.COL_DISTINCION + ", " + RestaurantesContract.COL_COCINA
					+ ", " + RestaurantesContract.COL_PRE_MIN + ", " + RestaurantesContract.COL_PRE_MAX
					+ " FROM " + RestaurantesContract.TAB_RESTAURANTES;
			
			estadoQuery = 0;
			
		} else if (!region.equalsIgnoreCase(SELECT_ALL) && distincion == 0) {
			
			query = "SELECT " + RestaurantesContract.COL_ID + ", "+ RestaurantesContract.COL_NOMBRE + ", " + RestaurantesContract.COL_CIU 
					+ ", " + RestaurantesContract.COL_DISTINCION + ", " + RestaurantesContract.COL_COCINA
					+ ", " + RestaurantesContract.COL_PRE_MIN + ", " + RestaurantesContract.COL_PRE_MAX
					+ " FROM " + RestaurantesContract.TAB_RESTAURANTES
					+ " WHERE " + RestaurantesContract.COL_REGION + " = ? ";
			
			estadoQuery = 1;
			
		} else if (region.equalsIgnoreCase(SELECT_ALL) && !(distincion == 0)) {
			
			query = "SELECT " + RestaurantesContract.COL_ID + ", "+ RestaurantesContract.COL_NOMBRE + ", " + RestaurantesContract.COL_CIU 
					+ ", " + RestaurantesContract.COL_DISTINCION + ", " + RestaurantesContract.COL_COCINA
					+ ", " + RestaurantesContract.COL_PRE_MIN + ", " + RestaurantesContract.COL_PRE_MAX
					+ " FROM " + RestaurantesContract.TAB_RESTAURANTES
					+ " WHERE " + RestaurantesContract.COL_DISTINCION + " = ? ";
			
			estadoQuery = 2;
			
		} else if (!region.equalsIgnoreCase(SELECT_ALL) && !(distincion == 0)) {
			
			query = "SELECT " + RestaurantesContract.COL_ID + ", "+ RestaurantesContract.COL_NOMBRE + ", " + RestaurantesContract.COL_CIU 
					+ ", " + RestaurantesContract.COL_DISTINCION + ", " + RestaurantesContract.COL_COCINA
					+ ", " + RestaurantesContract.COL_PRE_MIN + ", " + RestaurantesContract.COL_PRE_MAX
					+ " FROM " + RestaurantesContract.TAB_RESTAURANTES
					+ " WHERE " + RestaurantesContract.COL_DISTINCION + " = ? AND " + RestaurantesContract.COL_REGION + " = ?";
			
			estadoQuery = 3;
			
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
				
			if (estadoQuery == 1) {
				
				pstmt.setString(1, region);
				
			} else if (estadoQuery == 2) {
				
				pstmt.setInt(1, distincion);
				
			} else if (estadoQuery == 3) {
				
				pstmt.setInt(1, distincion);
				pstmt.setString(2, region);
				
			}
			
			rslt = pstmt.executeQuery();
			
			String nombre;
			String ciu;
			int dist;
			String cocina;
			double precioMin;
			double precioMax;
			int id;
			
			while (rslt.next()) {
				
				nombre = rslt.getString(RestaurantesContract.COL_NOMBRE);
				ciu = rslt.getString(RestaurantesContract.COL_CIU);
				dist = rslt.getInt(RestaurantesContract.COL_DISTINCION);
				cocina = rslt.getString(RestaurantesContract.COL_COCINA);
				precioMin = rslt.getDouble(RestaurantesContract.COL_PRE_MIN);
				precioMax = rslt.getDouble(RestaurantesContract.COL_PRE_MAX);
				id = rslt.getInt(RestaurantesContract.COL_ID);
				
				listaRestaurantes.add(new Restaurante(id,nombre, ciu, dist, precioMin, precioMax, cocina));
				
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
		};
		
		return listaRestaurantes;
		
	}
	
	public ArrayList<String> consultarRegionesDistinciones() {
		
		ArrayList<String> regiones = new ArrayList<String>();
		regiones.add(SELECT_ALL);
		
		String query = "SELECT DISTINCT " + RestaurantesContract.COL_REGION 
					+ " FROM " + RestaurantesContract.TAB_RESTAURANTES;// TABLA
				
			Connection con = null;
			Statement stmt = null;
			ResultSet rslt = null;
				
			try {
					
				con = acceso.getConexion();
					
				stmt = con.createStatement();
					
				rslt = stmt.executeQuery(query);
				
				while (rslt.next()) {
					regiones.add(rslt.getString(RestaurantesContract.COL_REGION));
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
				
			return regiones;
	}
	
	public int eliminarRestauranteNombre(String nombre) {
		int resultado = 0;
		
		String query = "DELETE FROM " + RestaurantesContract.TAB_RESTAURANTES 
						+ " WHERE " + RestaurantesContract.COL_NOMBRE + " = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, nombre);
			
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
	
	//TODO Método que devuelva id max

	public void insertarRestaurante(Restaurante restaurante) {
		
		String query = "INSERT INTO " + RestaurantesContract.TAB_RESTAURANTES + 
				" (" + RestaurantesContract.COL_NOMBRE + ", " + RestaurantesContract.COL_REGION
				+ ", " + RestaurantesContract.COL_CIU + ", " + RestaurantesContract.COL_DISTINCION
				+ ", " + RestaurantesContract.COL_DIRECCION + ", " + RestaurantesContract.COL_PRE_MIN
				+ ", " + RestaurantesContract.COL_PRE_MAX + ", " + RestaurantesContract.COL_COCINA
				+ ", " + RestaurantesContract.COL_TELEFONO + ") "
				+ " VALUES " + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, restaurante.getNombre());
			pstmt.setString(2, restaurante.getRegion());
			pstmt.setString(3, restaurante.getCiudad());
			pstmt.setInt(4, restaurante.getDistincion());
			pstmt.setString(5, restaurante.getDireccion());
			pstmt.setDouble(6, restaurante.getPrecioMin());
			pstmt.setDouble(7, restaurante.getPrecioMax());
			pstmt.setString(8, restaurante.getCocina());
			pstmt.setString(9, restaurante.getTelefono());
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
	
	
	public ArrayList<String> consultarNombresRestaurante() {
		ArrayList<String> listaNombres = new ArrayList<String>();
		
		String query = "SELECT " + RestaurantesContract.COL_NOMBRE
				+ " FROM " + RestaurantesContract.TAB_RESTAURANTES;
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			
			con = acceso.getConexion();
			stmt = con.createStatement();
			rslt = stmt.executeQuery(query);
			
			while (rslt.next()) {
				listaNombres.add(rslt.getString(RestaurantesContract.COL_NOMBRE));
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
	
	public void ActualizarRestaurante(Restaurante restaurante) {
		
		String query = "UPDATE " + RestaurantesContract.TAB_RESTAURANTES 
					+ " SET " + RestaurantesContract.COL_REGION + " = ?, "
					+ RestaurantesContract.COL_CIU + " = ?, " + RestaurantesContract.COL_DISTINCION + " = ?, "
					+ RestaurantesContract.COL_DIRECCION + " = ?, " + RestaurantesContract.COL_PRE_MIN + " = ?, "
					+ RestaurantesContract.COL_PRE_MAX + " = ?, " + RestaurantesContract.COL_COCINA + " = ?, "
					+ RestaurantesContract.COL_TELEFONO + " = ?, " + RestaurantesContract.COL_WEB+ " = ? "
					+ " WHERE " + RestaurantesContract.COL_NOMBRE + " = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, restaurante.getRegion());
			pstmt.setString(2, restaurante.getCiudad());
			pstmt.setInt(3, restaurante.getDistincion());
			pstmt.setString(4, restaurante.getDireccion());
			pstmt.setDouble(5, restaurante.getPrecioMin());
			pstmt.setDouble(6, restaurante.getPrecioMax());
			pstmt.setString(7, restaurante.getCocina());
			pstmt.setString(8, restaurante.getTelefono());
			pstmt.setString(9, restaurante.getWeb());
			pstmt.setString(10, restaurante.getNombre());
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
	
}
