package ejercicio4;

import java.util.Scanner;

public class ej4 {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Ingresar el valor monetario de una hora de trabajo: ");
double ValorHora = scanner.nextDouble();

System.out.print("Ingresar las horas de trabajo: ");
int HorasPorDia = scanner.nextInt();

double SalarioDiario = ValorHora * HorasPorDia;

double SalarioSemanal = SalarioDiario * 5.5;

System.out.println("El salario semanal es: $" + SalarioSemanal);

scanner.close();
	}
}
