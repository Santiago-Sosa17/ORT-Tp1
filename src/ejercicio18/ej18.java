package ejercicio18;

import java.util.Scanner;

public class ej18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor ingrese un número entero: ");
		int numero1 = sc.nextInt();

		System.out.println("Por favor ingrese otro número entero: ");
		int numero2 = sc.nextInt();

		int mayor, menor;
		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}

		if (mayor % menor == 0) {
			System.out.println("el número mayor: " + mayor + " es divisible por el número menor: " + menor);
		} else {
			System.out.println("el número mayor: " + mayor + " no es divisible por el número menor: " + menor);
		}

		sc.close();
	}

}
