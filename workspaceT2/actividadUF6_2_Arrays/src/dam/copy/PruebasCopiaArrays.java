package dam.copy;

public class PruebasCopiaArrays {

	public static void main(String[] args) {
		int [] a = {1,4,7,9,5};
		
		int [] b = a;
		
		a[0] = 3;
		
		mostrarArray(b);
		
		int[] c = new int[3];
		System.arraycopy(a, 1, c, 0, c.length);
		
		a[1] = 6;
		
		System.out.println("\nArray a");
		mostrarArray(a);
		
		System.out.println("\nArray c");
		mostrarArray(c);
		
		int[] d = c.clone();
		
		c[2] = 3;
		
		System.out.println("\nArray d");
		mostrarArray(d);
	}

	private static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
