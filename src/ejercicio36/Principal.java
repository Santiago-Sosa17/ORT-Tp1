package ejercicio36;

import java.util.Scanner;

public class Principal {
	private static final int PROMEDIO = 20;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		int acum = 0, cont = 0, valoresLeidos = 0;
		double promedioNumeros;

		do {
			do {
				System.out.println("Ingrese el número: ");
				num = Integer.parseInt(sc.nextLine());
			} while (num < 0);
			cont++;
			acum += num;
			promedioNumeros = acum / cont;
			if (promedioNumeros < PROMEDIO) {
				valoresLeidos++;
			}
		} while (promedioNumeros < PROMEDIO);
		System.out.println("La cantidad de valores leídos es: " + valoresLeidos);
		sc.close();
	}

}
