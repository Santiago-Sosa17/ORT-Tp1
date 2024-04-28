package ejercicio2; 

import java.util.Scanner;

public class ej2 {
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, ingresa la nota del primer trimestre: ");{	
		double nota1 = scanner.nextDouble();
		
		System.out.print("Por favor, ingresa la nota del segundo trimestre: ");
		double nota2 = scanner.nextDouble();
		
		System.out.print("Por favor, ingresa la nota del tercer trimestre: ");
		double nota3 = scanner.nextDouble();
		
		double promedio = (nota1 + nota2 + nota3) / 3;
			
		
		
		System.out.println("El promedio de nota es: " + promedio);
		
		scanner.close();
		}
			
		}
		}


	


