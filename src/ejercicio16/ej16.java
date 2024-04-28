package ejercicio16;

import java.util.Scanner;

public class ej16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de inscriptos a la conferencia: ");
		int inscriptos = sc.nextInt();

		System.out.print("Ingrese la cantidad de asientos disponible: ");
		int asientos = sc.nextInt();

		if (inscriptos <= asientos) {
			System.out.println("Todos los inscriptos pueden sentarse");
		} else {
			int faltantes = inscriptos - asientos;
			System.out.println("No hay asientos disponibles.");
			System.out.println("faltan " + faltantes + " para que todos los inscriptos puedan sentarse ");

			sc.close();
		}

	}

}
