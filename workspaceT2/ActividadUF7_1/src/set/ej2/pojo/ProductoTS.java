package set.ej2.pojo;

public class ProductoTS implements Comparable<ProductoTS> {

		private String nombre;
		private String cantidad;
		
		public ProductoTS(String nombre, String cantidad) {
			this.nombre = nombre;
			this.cantidad = cantidad;
		}

		@Override
		public String toString() {
			return "Producto [nombre " + nombre + ", cantidad - " + cantidad + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			boolean iguales = false;
			ProductoTS p = (ProductoTS) obj;
			
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

		@Override
		public int compareTo(ProductoTS o) {
			int comp = 0;
			
			comp = nombre.compareTo(o.nombre);
			
			if (comp == 0) {
				comp = cantidad.compareTo(o.cantidad);
			}
			
			return comp;
		}
}
