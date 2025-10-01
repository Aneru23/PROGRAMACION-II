package uno;

public class Vector3D {
    private double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static Vector3D suma(Vector3D a, Vector3D b) {
        return new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static Vector3D escalar(double r, Vector3D a) {
        return new Vector3D(r*a.x, r*a.y, r*a.z);
    }

    public static double magnitud(Vector3D a) {
        return Math.sqrt(a.x*a.x + a.y*a.y + a.z*a.z);
    }

    public static Vector3D normal(Vector3D a) {
        double mag = magnitud(a);
        return new Vector3D(a.x/mag, a.y/mag, a.z/mag);
    }

    public static double productoEscalar(Vector3D a, Vector3D b) {
        return a.x*b.x + a.y*b.y + a.z*b.z;
    }

    public static Vector3D productoVectorial(Vector3D a, Vector3D b) {
        return new Vector3D(
            a.y*b.z - a.z*b.y,
            a.z*b.x - a.x*b.z,
            a.x*b.y - a.y*b.x
        );
    }

    public static void main(String[] args) {
        Vector3D u = new Vector3D(1, 2, 3);
        Vector3D v = new Vector3D(4, 5, 6);

        System.out.println("Suma: " + suma(u, v));
        System.out.println("Escalar 2*u: " + escalar(2, u));
        System.out.println("Magnitud de u: " + magnitud(u));
        System.out.println("Normal de u: " + normal(u));
        System.out.println("Producto escalar u·v: " + productoEscalar(u, v));
        System.out.println("Producto vectorial u×v: " + productoVectorial(u, v));
    }
}

