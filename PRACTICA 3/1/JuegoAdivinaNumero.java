package uno;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        numeroAAdivinar = rand.nextInt(11);

        System.out.println("Bienvenido al juego de adivinar el número");
        System.out.println("Tienes " + getNumeroDeVidas() + " vidas.");
        
        boolean acertado = false;

        while (getNumeroDeVidas() > 0 && !acertado) {
            System.out.print("Ingresa un número 0 a 10: ");
            int intento = sc.nextInt();

            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste");
                actualizaRecord(getNumeroDeVidas());
                acertado = true;
            } else {
                System.out.println("Fallaste.");
                if (!quitaVida()) {
                    System.out.println("Te quedaste sin vidas. El número era: " + numeroAAdivinar);
                } else {
                    System.out.println("Te quedan " + getNumeroDeVidas() + " vidas.");
                }
            }
        }
    }
}
