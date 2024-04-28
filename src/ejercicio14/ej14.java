package ejercicio14;

import java.util.Scanner;

public class ej14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los datos del primer nene:");
		System.out.print("Nombre: ");
		String nombre1 = sc.nextLine();
		System.out.print("Edad: ");
		int edad1 = sc.nextInt();
		System.out.print("Altura: ");
		double altura1 = sc.nextDouble();
		sc.nextLine();

		System.out.println("Nombre: " + nombre1);
		System.out.println("Edad: " + edad1);
		System.out.println("Altura: " + altura1);

		if (edad1 >= 7 && altura1 >= 1.50) {
			System.out.println("Puede entrar a la montaña rusa.");
		} else {
			System.out.println("No puede entrar a la montaña rusa.");
		}
		System.out.println();
		System.out.println("Ingrese los datos del segundo nene:");
		System.out.print("Nombre: ");
		String nombre2 = sc.nextLine();
		System.out.print("Edad: ");
		int edad2 = sc.nextInt();
		System.out.print("Altura: ");
		double altura2 = sc.nextDouble();
		sc.nextLine();

		if (edad2 >= 7 && altura2 >= 1.50) {
			System.out.println("Puede entrar a la montaña rusa.");
		} else {
			System.out.println("No puede entrar a la montaña rusa.");
		}
		System.out.println();
		System.out.println("Ingrese los datos del tercer nene:");
		System.out.print("Nombre: ");
		String nombre3 = sc.nextLine();
		System.out.print("Edad: ");
		int edad3 = sc.nextInt();
		System.out.print("Altura: ");
		double altura3 = sc.nextDouble();
		sc.nextLine();
		if (edad3 >= 7 && altura3 >= 1.50) {
			System.out.println("Puede entrar a la montaña rusa.");
		} else {
			System.out.println("No puede entrar a la montaña rusa.");
		}
		System.out.println();
		System.out.println("Ingrese los datos del cuarto nene:");
		System.out.print("Nombre: ");
		String nombre4 = sc.nextLine();
		System.out.print("Edad: ");
		int edad4 = sc.nextInt();
		System.out.print("Altura: ");
		double altura4 = sc.nextDouble();
		sc.nextLine();
		if (edad4 >= 7 && altura4 >= 1.50) {
			System.out.println("Puede ingresar a la montaña rusa.");
		} else {
			System.out.println("No puede ingresar a la montaña rusa.");

			sc.close();
		}
	}

}
