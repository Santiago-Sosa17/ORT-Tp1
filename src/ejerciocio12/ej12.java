package ejerciocio12;

import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número entero: ");
		int numero1 = sc.nextInt();

		System.out.print("Ingrese un segundo numero entero: ");
		int numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println("El número ingresado: " + numero1 + " es el mayor ");

		} else {

			System.out.println("El número ingresado: " + numero2 + " es el mayor ");

			sc.close();

		}
	}

}
