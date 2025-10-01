package uno;

public class TestVectores {
	public static void main (String [] args) {
	       Vector3D u = new Vector3D(1, 2, 3);
	        Vector3D v = new Vector3D(4, 5, 6);

	        System.out.println("\n---- Vector3D ----");
	        System.out.println("u = " + u);
	        System.out.println("v = " + v);

	        System.out.println("Suma: " + Vector3D.suma(u, v));
	        System.out.println("Escalar 2*u: " + Vector3D.escalar(2, u));
	        System.out.println("Magnitud de u: " + Vector3D.magnitud(u));
	        System.out.println("Normal de u: " + Vector3D.normal(u));
	        System.out.println("Producto escalar u·v: " + Vector3D.productoEscalar(u, v));
	        System.out.println("Producto vectorial u×v: " + Vector3D.productoVectorial(u, v));
	 }
}
