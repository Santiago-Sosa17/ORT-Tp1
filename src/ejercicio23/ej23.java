package ejercicio23;

import java.util.Scanner;

public class ej23 {
	private static final int CANT_MULTI = 10;

	public static void main(String[] args) {
		int num, cont = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un número entero: ");
		num = sc.nextInt();

		while (cont <= CANT_MULTI) {
			System.out.println(num * cont);
			cont++;
		}
	}

}
