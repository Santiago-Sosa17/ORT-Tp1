package ejercicio30;

import java.util.Scanner;

public class ej30 {
	private static final char DIV = '/';
	private static final char SUMA = '+';
	private static final char RESTA = '-';
	private static final char MULT = '*';
	private static final char SALIDA = 'F';

	public static void main(String[] args) {
		int num1, num2;
		char operacion;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("ingresar una operacion ('/','+','-','*','F'): ");
			operacion = sc.nextLine().charAt(0);
			if (Character.toLowerCase(operacion) != Character.toLowerCase(SALIDA)) {
				System.out.println("ingresar un número: ");
				num1 = sc.nextInt();
				System.out.println("ingresar un segundo número: ");
				num2 = sc.nextInt();
				sc.nextLine();

				switch (operacion) {
				case DIV:
					if (num2 == 0) {
						System.out.println("ERROR, segundo numero invalido");
					} else {
						System.out.println("El resultado de la division es: " + (num1 / num2));
					}
					break;
				case SUMA:
					System.out.println("El resultado de la suma es: " + (num1 + num2));
					break;
				case RESTA:
					System.out.println("El resultado de la resta es: " + (num1 - num2));
					break;
				case MULT:
					System.out.println("El resultado de la suma es: " + (num1 * num2));
					break;
				}
			}

		} while (Character.toLowerCase(operacion) != Character.toLowerCase(SALIDA));
		System.out.println("La operacion ingresada fue F, hasta luego! ");
		sc.close();
	}

}
