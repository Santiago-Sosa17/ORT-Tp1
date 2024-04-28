package ejercicio28;

import java.util.Scanner;

public class ej28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de números: ");
		int cant = sc.nextInt();

		int mayor = Integer.MIN_VALUE;
		int posicion = 0;

		for (int i = 0; i < cant; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ": ");
			int numero = sc.nextInt();

			if (numero > mayor) {
				mayor = numero;
				posicion = i + 1;
			}
		}

		System.out.println("El numero mayor fue: " + mayor);
		System.out.println("Aparecio en la posicion: " + posicion);
		
		sc.close();
	}

}
