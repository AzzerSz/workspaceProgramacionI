package list.ej2.pojo;

public class Producto {

		private String nombre;
		private String cantidad;
		
		public Producto(String nombre, String cantidad) {
			this.nombre = nombre;
			this.cantidad = cantidad;
		}

		@Override
		public String toString() {
			return "Producto [nombre " + nombre + ", cantidad - " + cantidad + "]";
		}
		
		public String getNombre() {
			return nombre;
		}
		
		

}
