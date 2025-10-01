package dos;

public class Juego {
    private int numeroDeVidas;
    private int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public int getNumeroDeVidas() {
        return numeroDeVidas;
    }

    public void setNumeroDeVidas(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    public void reiniciaPartida() {
        numeroDeVidas = 3;
    }

    public void actualizaRecord(int vidasRestantes) {
        if (vidasRestantes > record) {
            record = vidasRestantes;
            System.out.println("Nuevo record: " + record + " vidas restantes");
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}

