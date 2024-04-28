package ejercicio19;

import java.util.Scanner;

public class ej19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese un número entero: ");
		int numero = scanner.nextInt();

		boolean esDeUnSoloDigito = (numero >= 0 && numero <= 9);
		boolean esImpar = (numero % 2 != 0);
		boolean estaEnAmbosGrupos = (esDeUnSoloDigito && esImpar);
		boolean noEstaEnNingunGrupo = (!esDeUnSoloDigito && !esImpar);

		System.out.println("Número ingresado: " + numero);
		System.out.println("Es de un solo dígito: " + esDeUnSoloDigito);
		System.out.println("Es impar: " + esImpar);
		System.out.println("Está en ambos grupos: " + estaEnAmbosGrupos);
		System.out.println("No está en ningun grupo: " + noEstaEnNingunGrupo);

		scanner.close();
	}
}
