package ud4;

import java.util.Scanner;

public class Ejercicio2_funciones {
//Que mediante una funcion calcule el cuadrado de un nº cualquiera
	public static void main(String[] args) {
		//Habilitamos el escaner de lectura
		Scanner entrada=new Scanner(System.in);
		//Ejercicio2
		System.out.println("Introduce un numero para saber su cuadrado: ");
		int num = entrada.nextInt();
		int resultado = cuadrado(num);
		System.out.println(resultado);
		//Ejercicio4
		System.out.println("Introduce un numero para saber su media: ");
		double num1 = entrada.nextInt();
		System.out.println("Introduce un numero para saber su media: ");
		double num2 = entrada.nextInt();
		double resultado1 = media(num1,num2);
		System.out.println("Tu media es: " + resultado1);
		entrada.close();
	}
	public static int cuadrado(int num) {
		int base = 2;
		return num * base;
	}
	public static double media(double num1, double num2) {
		double operacion = (num1 + num2)/2;
		return operacion;
	}
}
