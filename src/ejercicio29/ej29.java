package ejercicio29;

import java.util.Scanner;

public class ej29 {

	public static void main(String[] args) {
		double nota;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Ingrese un número (entre 0 y 10): ");
			nota = sc.nextDouble();

			if (nota < 0 && nota > 10) {
				System.out.println("El número ingresado se encuentra fuera de rango: " + nota);

			}

		} while (nota < 0 || nota > 10);

		System.out.println("El número ingresado es " + nota);

		sc.close();

	}

}
