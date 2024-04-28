package ejercicio34;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double estatura, promedioAltura;
		int cont = 0;
		int acum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			do {
				System.out.println("Ingresa la estatura: ");
				estatura = Integer.parseInt(sc.nextLine());

			} while (estatura < 0);
			cont++;
			acum += estatura;
			promedioAltura = acum / cont;

		} while (estatura != 0);
		System.out.println("La estatura promedio del equipo es: " + promedioAltura);
		sc.close();
	}

}
