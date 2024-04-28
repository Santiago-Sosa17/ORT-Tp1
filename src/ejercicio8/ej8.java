package ejercicio8;
import java.util.Scanner;
public class ej8 {
	
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Ingresar el primer número natural: ");
	
	int num1 = scanner.nextInt();
	
	System.out.print("Ingresar el segundo número natural: ");
	
	int num2 = scanner.nextInt();
	
	int suma = num1 + num2;
	
	int resta = num1 - num2;
	
	int multi = num1 * num2;
	
	int divi = num1 / num2;
	
	System.out.println("Resultado de las operaciones:");
	System.out.println("Resultado de la suma:" + suma);
	System.out.println("Resultado de la resta:" + resta);
	System.out.println("Resultado de la multiplicación:" + multi);
	System.out.println("Resultado de la división:" + divi);
	
	scanner.close();
}

}
