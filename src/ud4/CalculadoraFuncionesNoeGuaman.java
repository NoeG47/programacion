package ud4;

import java.util.Scanner;

public class CalculadoraFuncionesNoeGuaman {
	static Scanner entrada=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		char opcion = '0';
		double op1, op2, result;
		do {
			mostrar_menu();	
			//leemos la opcion introducida por el usuario
			opcion=entrada.nextLine().toUpperCase().charAt(0);
			switch (opcion){
				case 'S':
					System.out.println("Introduce el primer numero: ");
					op1 = entrada.nextDouble();
					System.out.println("Introduce el segundo numero: ");
					op2 = entrada.nextDouble();
					result = suma(op1,op2);
					System.out.println(result);
					entrada.nextLine();
					break;
				case 'R':
					System.out.println("Introduce el primer numero: ");
					op1 = entrada.nextDouble();
					System.out.println("Introduce el segundo numero: ");
					op2 = entrada.nextDouble();
					result = resta(op1,op2);
					System.out.println(result);
					entrada.nextLine();
					break;
				case 'M':
					System.out.println("Introduce el primer numero: ");
					op1 = entrada.nextDouble();
					System.out.println("Introduce el segundo numero: ");
					op2 = entrada.nextDouble();
					result = multiplicacion(op1,op2);
					System.out.println(result);
					entrada.nextLine();
					break;
				case 'D':
					System.out.println("Introduce el primer numero: ");
					op1 = entrada.nextDouble();
					System.out.println("Introduce el segundo numero: ");
					op2 = entrada.nextDouble();
					while (op2 == 0) {
						System.out.println("no se puede dividir por 0");
						entrada.nextLine();
						System.out.println("Introduce un numero diferente a 0: ");
						op2 = entrada.nextDouble();
					}
					result = division(op1,op2);
					System.out.println(result);
					entrada.nextLine();
					break;
				case 'A':
					System.out.println("Hasta otra");
				break;	
				default:
					System.out.println("Opción no válida");
				}
			} while (opcion != 'A');{
				System.out.println("Has salido");	
			}
		
	}
	public static void mostrar_menu() {
		//mostramos el menu con las diferentes opciones
		System.out.println("*****Calculadora de Noé Moisés Guamán Álvarez*****");
		System.out.println("S. Sumar");
		System.out.println("R. Restar");
		System.out.println("M. Multiplicar");
		System.out.println("D. Dividir");
		System.out.println("A. Salir");	
		System.out.println("******************");
	}
	
	public static double suma(double op1, double op2) {
		return op1 + op2;
	}
	public static double resta(double op1, double op2) {
		return op1 - op2;
	}
	public static double multiplicacion(double op1, double op2) {
		return op1 * op2;
	}
	public static double division(double op1, double op2) {
		return op1 / op2;
	}
	

}
