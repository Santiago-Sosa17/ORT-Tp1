package ejercicio5;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("Ingrese el valor de num1: ");
	int num1 = scanner.nextInt();
	
	System.out.print("ingrese el valor de num2: ");
	int num2 = scanner.nextInt();
	
	System.out.println("Valores originales: ");
	System.out.println("num1 = " + num1);
	System.out.println("num2 = " + num2);
	
	int temp = num1;
	num1 = num2;
	num2 = temp;
	
	System.out.println("Valores cambiados: ");
	System.out.println("num1 = " + num1);
	System.out.println("num2 = " + num2);
	
	scanner.close();
	}
}
