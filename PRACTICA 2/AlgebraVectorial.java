package uno;

public class AlgebraVectorial {
    private double x, y, z;

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double dot(AlgebraVectorial o) {
        return this.x*o.x + this.y*o.y + this.z*o.z;
    }

    public AlgebraVectorial cross(AlgebraVectorial o) {
        return new AlgebraVectorial(
            this.y*o.z - this.z*o.y,
            this.z*o.x - this.x*o.z,
            this.x*o.y - this.y*o.x
        );
    }

    public AlgebraVectorial add(AlgebraVectorial o) {
        return new AlgebraVectorial(this.x+o.x, this.y+o.y, this.z+o.z);
    }

    public AlgebraVectorial subtract(AlgebraVectorial o) {
        return new AlgebraVectorial(this.x-o.x, this.y-o.y, this.z-o.z);
    }

    public AlgebraVectorial escalar(double r) {
        return new AlgebraVectorial(r*this.x, r*this.y, r*this.z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }


    public static boolean perpendicular1(AlgebraVectorial a, AlgebraVectorial b) {
        return a.add(b).magnitud() == a.subtract(b).magnitud();
    }

    public static boolean perpendicular2(AlgebraVectorial a, AlgebraVectorial b) {
        return a.subtract(b).magnitud() == b.subtract(a).magnitud();
    }

    public static boolean perpendicular3(AlgebraVectorial a, AlgebraVectorial b) {
        return a.dot(b) == 0;
    }

    public static boolean perpendicular4(AlgebraVectorial a, AlgebraVectorial b) {
        double izq = Math.pow(a.add(b).magnitud(), 2);
        double der = Math.pow(a.magnitud(), 2) + Math.pow(b.magnitud(), 2);
        return izq == der;
    }


    public static boolean paralelo1(AlgebraVectorial a, AlgebraVectorial b) {
        if (b.x == 0 || b.y == 0 || b.z == 0) 
        	return false;
        double r1 = a.x / b.x;
        double r2 = a.y / b.y;
        double r3 = a.z / b.z;
        return r1 == r2 && r2 == r3;
    }

    public static boolean paralelo2(AlgebraVectorial a, AlgebraVectorial b) {
        AlgebraVectorial c = a.cross(b);
        return c.x == 0 && c.y == 0 && c.z == 0;
    }

    public static AlgebraVectorial proyeccion(AlgebraVectorial a, AlgebraVectorial b) {
        double factor = a.dot(b) / (Math.pow(b.magnitud(), 2));
        return new AlgebraVectorial(b.x*factor, b.y*factor, b.z*factor);
    }

    public static double componente(AlgebraVectorial a, AlgebraVectorial b) {
        return a.dot(b) / b.magnitud();
    }
}
