package ejercicio3;

import java.util.Scanner;

public class ej3 {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Por favor ingrese el numero entero: ");{
			
	int num = scanner.nextInt();
	
	int resultado = num * 5;
	
	int resultado2 = num / 2;
	
	System.out.println("el resultado de la multiplicación es: " + resultado + " y el de la division es: " + resultado2);
	
	scanner.close();
	}
		
		
	}

}
