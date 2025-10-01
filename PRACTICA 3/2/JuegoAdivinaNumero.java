package dos;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);

        System.out.println("\n Bienvenido al juego de adivinar un número (0-10).");
        boolean acertado = false;

        while (getNumeroDeVidas() > 0 && !acertado) {
            System.out.print("Ingresa un número entre 0 y 10: ");
            int intento = sc.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }

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

