package dos;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Ingrese a, b, c: ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        EcuacionLineal eq = new EcuacionLineal(a, b, c);

	        int disc = eq.getDiscriminante();

	        if (disc > 0) {
	            System.out.println("La ecuación tiene dos raíces " 
	                               + eq.getRaiz1() + " y " + eq.getRaiz2());
	        } else if (disc == 0) {
	            System.out.println("La ecuación tiene una raíz " + eq.getRaiz1());
	        } else {
	            System.out.println("La ecuación no tiene raíces reales");
	        }


	 }
}