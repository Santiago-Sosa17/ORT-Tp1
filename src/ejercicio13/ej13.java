package ejercicio13;

import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese tres números enteros:");

		System.out.print("Número 1: ");
		int numero1 = sc.nextInt();

		System.out.print("Número 2: ");
		int numero2 = sc.nextInt();

		System.out.print("Número 3: ");
		int numero3 = sc.nextInt();

		int mayor = numero1;
		if (numero2 > mayor) {
			mayor = numero2;
		}

		if (numero3 > mayor) {
			mayor = numero3;
		}

		System.out.println("El mayor número es: " + mayor);

		sc.close();
	}

}
