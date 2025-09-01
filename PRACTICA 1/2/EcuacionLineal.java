package dos;

public class EcuacionLineal {
	private int a;
	private int b;
	private int c;
	
	public EcuacionLineal(int a, int b, int c) {
	this.a = a;
	this.b = b;
	this.c = c;
	}
	
	public int getDiscriminante() {
        return (b * b) - 4 * a * c;
    }
	
    public double getRaiz1() {
        if (getDiscriminante() < 0) {
            return 0; 
        }
        
        return (-b + Math.sqrt(getDiscriminante())) / (2.0 * a);
    }

  
    public double getRaiz2() {
        if (getDiscriminante() < 0) {
            return 0;
        }
        return (-b - Math.sqrt(getDiscriminante())) / (2.0 * a);
    }
}