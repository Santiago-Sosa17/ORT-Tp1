package ejercicio11;

import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ingresar un número entero: ");
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("El número ingresado  es par");
		} else {
			System.out.println("El número ingresado es impar");

		}

	}

}
