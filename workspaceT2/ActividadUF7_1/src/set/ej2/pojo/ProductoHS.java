package set.ej2.pojo;

public class ProductoHS {

		private String nombre;
		private String cantidad;
		
		public ProductoHS(String nombre, String cantidad) {
			this.nombre = nombre;
			this.cantidad = cantidad;
		}

		@Override
		public String toString() {
			return "Producto [nombre " + nombre + ", cantidad - " + cantidad + "]";
		}
		
		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}
		
		@Override
		public boolean equals(Object obj) {
			boolean iguales = false;
			ProductoHS p = (ProductoHS) obj;
			
			if (nombre.equals(p.nombre) && cantidad.equals(p.cantidad)) {
				iguales = true;
			}
			return iguales;
		}

		@Override
		public int hashCode() {
		int hCode = nombre.hashCode() + cantidad.hashCode();
		return hCode;
		}
}
