package pruebas.abstracta;

public abstract class AnimalVertebrado {

		protected String subgrupo;
		protected String nombre;
		
		public AnimalVertebrado(String subgrupo, String nombre) {
			this.subgrupo = subgrupo;
			this.nombre = nombre;
		}
		
		public abstract void movimiento();
		
		public abstract void alimentacion();

		public void informacion() {
			System.out.println(this);
		}

		@Override
		public String toString() {
			return "Animal Vertebrado [subgrupo=" + subgrupo + ", nombre=" + nombre + "]";
		}

		
}
