package dos;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Figura[] figuras = new Figura[5];

        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2) + 1; 
            String color = (rand.nextInt(2) == 0) ? "Rojo" : "Azul";

            if (tipo == 1) { 
                double lado = rand.nextInt(10) + 1;
                figuras[i] = new Cuadro(color, lado);
            } else { 
                double radio = rand.nextInt(10) + 1;
                figuras[i] = new Circulo(color, radio);
            }
        }
        for (Figura f : figuras) {
            System.out.println(f.toString());

            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println(" → " + c.comoColorear());
            }

            System.out.println();
        }
    }
}