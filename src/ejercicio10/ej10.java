package ejercicio10;
import java.util.Scanner;
public class ej10 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Por favor ingresar el nombre del primer socio: ");
	String nombre1 = scanner.nextLine();
	System.out.println("Por favor ingresa el capital aportado por " + nombre1 + ": ");
	double capital1 = scanner.nextDouble();
	scanner.nextLine();
	
	
	System.out.println("Por favor ingresar el nombre del segundo socio: ");
	String nombre2 = scanner.nextLine();
	System.out.println("Por favor ingresa el capital aportado por " + nombre2 + ": ");
	double capital2 = scanner.nextDouble();	
	scanner.nextLine();
	
	System.out.println("Por favor ingresar el nombre del tercer socio: ");
	String nombre3 = scanner.nextLine();
	System.out.println("Por favor ingresar el capital aportado por " + nombre3 + ": ");
	double capital3 = scanner.nextDouble();
	scanner.nextLine();
	
	Double TotalAportado = capital1 + capital2 + capital3;
	
	System.out.println("Valor total aportado por los tres socios: $" + TotalAportado);
	Double porcentaje1 = (capital1 / TotalAportado) * 100;
	Double porcentaje2 = (capital2 / TotalAportado) * 100;
	Double porcentaje3 = (capital3 / TotalAportado) * 100;
	
	System.out.println(nombre1 + ":" + porcentaje1 + "%");
	System.out.println(nombre2 + ":" + porcentaje2 + "%");
	System.out.println(nombre3 + ":" + porcentaje3 + "%");
	
	scanner.close();
}
}
