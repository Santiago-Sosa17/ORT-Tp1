package ejercicio7;

import java.util.Scanner;

public class ej7 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Ingresar el ancho del terreno: ");
	double ancho = scanner.nextDouble();
	
	System.out.print("Ingresar el largo del terreno: ");
	double largo = scanner.nextDouble();
	
	System.out.print("Ingresar el valor del metro cuadrado de tierra: ");
	double ValorMetroCuadrado = scanner.nextDouble();
	
	double AreaDelTerreno = ancho * largo;
	double ValorTerreno = AreaDelTerreno * ValorMetroCuadrado;
	
	double perimetro = 2 * (ancho + largo); 
	double MetrosAlambreAltura1 = perimetro * 1;
	double MetrosAlambreAltura2 = perimetro * 2;
	double MetrosAlambreAltura3 = perimetro * 3;

	
	System.out.println("El valor total del terreno es: $" + ValorTerreno);
	System.out.println("La cantidad de metros de alambre para cercarlo a una altura es: " + MetrosAlambreAltura1 + " metros. ");
	System.out.println("La cantidad de metros de alambre para cercarlo a dos alturas es: " + MetrosAlambreAltura2 + " metros. ");
	System.out.println("La cantidad de metros de alambre para cercarlo a tres alturas es: " + MetrosAlambreAltura3 + " metros. ");
}
}
