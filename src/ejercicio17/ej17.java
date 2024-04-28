package ejercicio17;

import java.util.Scanner;

public class ej17 {

	public static final String GENERO_1 = "f";
	public static final String GENERO_2 = "m";
	public static final int EDAD_MINIMA = 1;
	public static final int EDAD_MAXIMA = 120;
	public static final int JUBILACION_F = 60;
	public static final int JUBILACION_M = 65;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Por favor ingrese su edad: ");
		int edad = sc.nextInt();
		sc.nextLine();

		System.out.print("Por favor ingrese su nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Por favor ingrese su genero ('f' para mujeres y 'm' para hombres): ");
		String genero = sc.nextLine();

		if (edad < EDAD_MINIMA || edad >= EDAD_MAXIMA || (!genero.equals("f") && !genero.equals("m"))) {

			System.out.println("Datos incorrectos, por favor vuelva a intentarlo");

		} else {

			if ((genero.equals("f") && edad >= 60) || (genero.equals("m") && edad >= 65)) {

				System.out.println(nombre + " se puede jubilar ");

			} else {

				System.out.println(nombre + " no se puede jubilar");

				sc.close();
			}
		}
	}
}
