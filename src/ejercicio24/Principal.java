package ejercicio24;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;

		System.out.println("Ingrese el primer número entero: ");
		num1 = sc.nextInt();

		System.out.println("Ingrese el segundo número entero (mayor o igual que el primero): ");
		num2 = sc.nextInt();

		while (num1 > num2) {
			System.out.println("El segundo número debe ser mayor o igual al primero.");
			System.out.println("Ingrese el segundo número entero nuevamente: ");
			num2 = sc.nextInt();
		}

		System.out.println("Los números ingresados son: " + num1 + " y " + num2);

		System.out.println("Los números que estan entre " + num1 + " y " + num2 + " incluyendolos son: ");

		for (int i = num1; i <= num2; i++) {

			System.out.println(i);
		}

		System.out.println("Los números que estan entre " + num1 + " y " + num2 + " excluyendolos son: ");

		for (int i = num1 + 1; i < num2; i++) {

			System.out.println(i);

		}
		sc.close();
	}
}
