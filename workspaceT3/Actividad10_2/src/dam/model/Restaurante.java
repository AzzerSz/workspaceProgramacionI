package dam.model;

public class Restaurante {

	private int id;
	private String nombre;
	private String region;
	private String ciudad;
	private int distincion;
	private String direccion;
	private double precioMin;
	private double precioMax;
	private String cocina;
	private String telefono;
	private String web;
	
	public Restaurante(String nombre, String region, String ciudad, int distincion, String direccion,
			double precioMin, double precioMax, String cocina, String telefono) {
		this.nombre = nombre;
		this.region = region;
		this.ciudad = ciudad;
		this.distincion = distincion;
		this.direccion = direccion;
		this.precioMin = precioMin;
		this.precioMax = precioMax;
		this.cocina = cocina;
		this.telefono = telefono;
	}

	public Restaurante(int id, String nombre, String ciudad, int distincion, double precioMin, double precioMax,
			String cocina) {
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.distincion = distincion;
		this.precioMin = precioMin;
		this.precioMax = precioMax;
		this.cocina = cocina;
	}
	
	



	public Restaurante(String nombre, String region, String ciudad, int distincion, String direccion, double precioMin,
			double precioMax, String cocina, String telefono, String web) {
		this.nombre = nombre;
		this.region = region;
		this.ciudad = ciudad;
		this.distincion = distincion;
		this.direccion = direccion;
		this.precioMin = precioMin;
		this.precioMax = precioMax;
		this.cocina = cocina;
		this.telefono = telefono;
		this.web = web;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getRegion() {
		return region;
	}

	public String getCiudad() {
		return ciudad;
	}

	public int getDistincion() {
		return distincion;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getPrecioMin() {
		return precioMin;
	}

	public double getPrecioMax() {
		return precioMax;
	}

	public String getCocina() {
		return cocina;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getWeb() {
		return web;
	}

	@Override
	public String toString() {
		return "Restaurante [id=" + id + ", nombre=" + nombre + ", region=" + region + ", ciudad=" + ciudad
				+ ", distincion=" + distincion + ", direccion=" + direccion + ", precioMin=" + precioMin
				+ ", precioMax=" + precioMax + ", cocina=" + cocina + ", telefono=" + telefono + ", web=" + web + "]";
	}
	
}
