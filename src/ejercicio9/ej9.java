package ejercicio9;
import java.util.Scanner;
public class ej9 {
public static void main(String[] args) {
	
 Scanner scanner = new Scanner(System.in);
 
  System.out.print("Ingresar el primer angulo interno del triangulo: ");
  double angulo1 = scanner.nextDouble();
  
  System.out.print("Ingresar el primer angulo interno del triangulo: ");
  double angulo2 = scanner.nextDouble();
  
  double SumaAngulos = angulo1 + angulo2;
  
  double angulo3 = 180 - SumaAngulos;
  
  System.out.print("El valor del tercer angulo es: " + angulo3 + " grados. " );
  
 scanner.close();
 
}
}
