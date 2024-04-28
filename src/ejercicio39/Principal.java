package ejercicio39;

import java.util.Scanner;

public class Principal {
	private static final int DIST1 = 0;
	private static final int DIST2 = 10;
	private static final int DIST3 = 50;
	private static final int PUNTO1 = 500;
	private static final int PUNTO2 = 250;
	private static final int PUNTO3 = 100;

	public static void main(String[] args) {

		int jugadores, disparos;
		int distancia = Integer.MIN_VALUE;
		String jugadorGanador = "", nombres;
		int cont = 1, aux = 1;
		int acumCentro = 0, acumuladorPuntaje = 0, puntajeGanador = 0, tiroCentroGanador = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Ingrese cantidad de jugadores (mayor o igual a 2): ");
			jugadores = Integer.parseInt(sc.nextLine());
		} while (jugadores <= 1);

		do {
			System.out.println("Ingresar el nombre del jugador: ");
			nombres = sc.nextLine();

			do {

				do {
					System.out.println("Ingresar la distancia de cada tiro (de 0 a 50): ");
					distancia = Integer.parseInt(sc.nextLine());

				} while (distancia < 0);

				if (distancia == DIST1) {
					acumuladorPuntaje += PUNTO1;
					acumCentro++;
				} else {
					if (distancia <= DIST2) {
						acumuladorPuntaje += PUNTO2;
					} else {
						if (distancia > DIST2 && distancia <= DIST3) {
							acumuladorPuntaje += PUNTO3;
						}

					}
				}
				cont++;
			} while (cont <= 3);

			if (acumuladorPuntaje > puntajeGanador) {
				puntajeGanador = acumuladorPuntaje;
				jugadorGanador = nombres;
				tiroCentroGanador = acumCentro;
			}
			cont = 1;
			acumuladorPuntaje = 0;
			acumCentro = 0;
			aux++;
		} while (aux <= jugadores);
		System.out.println("El jugador ganador es: " + jugadorGanador);
		System.out.println("El puntaje del jugador ganador es: " + puntajeGanador);
		System.out.println("La cantidad de tiros al centro fueron: " + tiroCentroGanador);
		sc.close();
	}

}
