package uno;

public class TestAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(1, 0, 0);
        AlgebraVectorial b = new AlgebraVectorial(0, 1, 0);
        AlgebraVectorial c = new AlgebraVectorial(2, 0, 0);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("a) ¿a ⟂ b (|a+b|=|a-b|)? " + AlgebraVectorial.perpendicular1(a, b));
        System.out.println("b) ¿a ⟂ b (|a-b|=|b-a|)? " + AlgebraVectorial.perpendicular2(a, b));
        System.out.println("c) ¿a·b=0? " + AlgebraVectorial.perpendicular3(a, b));
        System.out.println("d) ¿|a+b|²=|a|²+|b|²? " + AlgebraVectorial.perpendicular4(a, b));

        System.out.println("e) ¿a = r*b? " + AlgebraVectorial.paralelo1(a, c));
        System.out.println("f) ¿a×c=0? " + AlgebraVectorial.paralelo2(a, c));

        System.out.println("g) Proyección de a sobre b: " + AlgebraVectorial.proyeccion(a, b));

        System.out.println("h) Componente de a en dirección de b: " + AlgebraVectorial.componente(a, b));
    }
}

