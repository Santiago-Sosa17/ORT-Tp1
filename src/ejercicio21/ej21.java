package ejercicio21;

import java.util.Scanner;

public class ej21 {

	public static void main(String[] args) {
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese un número entero del 1 al 7: ");
		num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Martes");
			break;
		case 4:
			System.out.println("Miercoles");
			break;
		case 5:
			System.out.println("Jueves");
			break;
		case 6:
			System.out.println("Viernes");
			break;
		case 7:
			System.out.println("Sabado");
			break;
          default:
        	  System.out.println("Error, el número ingresado no es valido");
		}
      sc.close();
	} 
   
} 
