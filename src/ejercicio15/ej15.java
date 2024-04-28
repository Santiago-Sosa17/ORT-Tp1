package ejercicio15;

import java.util.Scanner;

public class ej15 {

	public static final int EDAD_MINIMA = 6;
	public static final double ALTURA_MINIMA = 1.50;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Ingrese su edad: ");
		int edad = sc.nextInt();

		System.out.print("Ingrese su altura: ");
		double altura = sc.nextDouble();

		if (edad >= EDAD_MINIMA && altura >= ALTURA_MINIMA) {
			System.out.println(nombre + " puede ingresar a la montaña rusa ");

		} else {
			System.out.println(nombre + " no puede ingresar a la montaña rusa");

			sc.close();
		}

	}

}
