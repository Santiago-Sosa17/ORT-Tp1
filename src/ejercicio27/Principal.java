package ejercicio27;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {
	private static final int CANT_EDADES = 5;
	private static final int MAYOR = 18;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sumaEdades = 0;
		int cantImparMayoresDe18 = 0;
		int edad;
		for (int i = 1; i <= CANT_EDADES; i++) {
			System.out.println("Ingrese la edad " + i + ": ");
			edad = sc.nextInt();
			sumaEdades += edad;

			if (edad % 2 != 0 && edad > MAYOR) {

				cantImparMayoresDe18++;
			}

		}

		double promedioEdades = (double) sumaEdades / 5;

		System.out.println("El promedio de las edades ingresadas es: " + promedioEdades);
		System.out.println("La cantidad de edades impares y mayores a 18 son: " + cantImparMayoresDe18);

		sc.close();
	}

}
