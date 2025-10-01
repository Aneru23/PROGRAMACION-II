package uno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nombre del empleado tiempo completo: ");
        String nombreCompleto = sc.nextLine();
        System.out.print("salario anual: ");
        double salarioAnual = sc.nextDouble();

        Empleado e1 = new EmpleadoTiempoCompleto(nombreCompleto, salarioAnual);
        
        sc.nextLine();

        System.out.print("nombre del empleado por horas: ");
        String nombreHoras = sc.nextLine();
        System.out.print("horas trabajadas: ");
        double horas = sc.nextDouble();
        System.out.print("tarifa por hora: ");
        double tarifa = sc.nextDouble();

        Empleado e2 = new EmpleadoTiempoHorario(nombreHoras, horas, tarifa);

        System.out.println("---Información de Empleados---");
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}