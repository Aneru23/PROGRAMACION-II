package uno;

import java.util.Scanner;

public class Mainn {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Ingrese a: ");
		double a = sc.nextDouble();
		System.out.println("Ingrese b: ");
		double b = sc.nextDouble();
		System.out.println("Ingrese c: ");
		double c = sc.nextDouble();
		System.out.println("Ingrese d: ");
		double d = sc.nextDouble();
		System.out.println("Ingrese e: ");
		double e = sc.nextDouble();
		System.out.println("Ingrese f: ");
		double f = sc.nextDouble();
		
        EcuacionLineal eq = new EcuacionLineal(a, b, c, d, e, f);

        if (eq.tieneSolucion()) {
            System.out.println("x = " + eq.getX() + ", y = " + eq.getY());
        } else {
            System.out.println("La ecuación no tiene solución");
        }
	}
}
