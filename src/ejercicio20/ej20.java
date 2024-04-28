package ejercicio20;

import java.util.Scanner;

public class ej20 {
    private static final char SUMA = '+';
    private static final char RESTA = '-';
    private static final char MULTI = '*';
    private static final char DIVI = '/';
    private static final String ERROR = "ERROR";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        char operacion;
        System.out.print("Ingrese el primer número entero: ");
         num1 = sc.nextInt();
         sc.nextLine();
         System.out.print("Ingrese la operacion: ");
         operacion = sc.nextLine().charAt(0); 
        System.out.print("Ingrese el segundo número entero: ");
         num2 = sc.nextInt();
       
        
        switch (operacion) {
		case SUMA:
			System.out.println("El resultado de la operacion" + SUMA + " es = " + (num1 + num2) );
			break;
		case RESTA:
			System.out.println("El resultado de la operacion" + RESTA + " es = " + (num1 - num2) );
			break;
		case MULTI:
			System.out.println("El resultado de la operacion" + MULTI + " es = " + (num1 * num2) );
			break;
		case DIVI:
            if (num2 == 0) {
            	System.out.println(ERROR);
            }else {
            	System.out.println("El resultado de la operacion" + DIVI + " es = " + (num1 / num2));
            }
			break;
		}
        
        sc.close();
    }


	}


