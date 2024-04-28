package ejercicio6;
import java.util.Scanner;
public class ej6 {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);

System.out.print("Ingresa el monto total de ventas en el mes: ");

double montoVentas = scanner.nextDouble();

double comision = montoVentas * 0.16;

double SueldoFijo = 44000;

double ImporteCobrar = comision + SueldoFijo;

System.out.println("El importe a cobrar por el vendedor es de: $" + ImporteCobrar);

scanner.close();
}
}
