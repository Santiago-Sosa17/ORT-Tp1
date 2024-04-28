package ejercicio26;

import java.util.Scanner;

public class ej26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Ingrese un numero n: ");
		num = sc.nextInt();

		int contador = 0;
		int numero = 1;
		while (contador < num) {
			if (numero % 3 == 0 && numero % 5 != 0) {
				System.out.print(numero + " ");
				contador++;
			}
			numero++;
		}

		sc.close();
	}
}
