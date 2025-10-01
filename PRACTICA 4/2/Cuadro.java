package dos;

class Cuadro extends Figura implements Coloreado {
    private double lado;

    public Cuadro(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados.";
    }

    @Override
    public String toString() {
        return "Cuadro | " + super.toString() + 
               " | Lado: " + lado + 
               " | Área: " + area() + 
               " | Perímetro: " + perimetro();
    }
}

