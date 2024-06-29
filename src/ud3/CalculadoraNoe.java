package ud3;

import java.util.Scanner;

//hacer calculadora
public class CalculadoraNoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		char opcion;
		double num1, num2;
		
		
		do {
			//mostrar el menú
			System.out.println("opciones de menú");
			System.out.println("s. Sumar");
			System.out.println("r. Restar");
			System.out.println("m. Multiplicar");
			System.out.println("d. Dividir");
			System.out.println("a. Salir");	
			//leemos opcion
			opcion=entrada.nextLine().charAt(0);
			switch (opcion) {
			//caso suma
			case 's':
			case 'S':	
				System.out.println("Introduce el primer numero: ");
				num1 = entrada.nextDouble();
				entrada.nextLine();
				System.out.println("Introduce el segundo numero: ");
				num2 = entrada.nextDouble();
				double suma = num1 + num2;
				System.out.println("la suma es: "+ suma);
				entrada.nextLine();
			break;	
			//caso resta
			case 'r':
			case 'R':
				System.out.println("Introduce el primer numero: ");
				num1 = entrada.nextDouble();
				
				System.out.println("Introduce el segundo numero: ");
				num2 = entrada.nextDouble();
				double resta = num1 - num2;
				System.out.println("La resta es: "+resta);
				entrada.nextLine();
			break;
			//caso multiplicar
			case 'm':
			case 'M':
				System.out.println("Introduce el primer numero: ");
				num1 = entrada.nextDouble();
				
				System.out.println("Introduce el segundo numero: ");
				num2 = entrada.nextDouble();
				double multiplicar = num1 * num2;
				System.out.println("La multiplicación es: "+multiplicar);
				entrada.nextLine();
			break;
			//caso dividir
			case 'd':
			case 'D':
				System.out.println("Introduce el primer numero: ");
				num1 = entrada.nextDouble();
				
				System.out.println("Introduce el segundo numero: ");
				num2 = entrada.nextDouble();
				while (num2 == 0) {
					System.out.println("no se puede dividir por 0");
					entrada.nextLine();
					System.out.println("Introduce un numero diferente a 0: ");
					num2 = entrada.nextDouble();
				}
				
				double dividir = num1 / num2;
				System.out.println("La multiplicación es: "+dividir);
				entrada.nextLine();
				
			break;
			//caso salir
			case 'a':
			case 'A':
				System.out.println("hasta otra");
			break;
			//caso por defecto
			default:
				System.out.println("opción no válida");
		}
		} while ((opcion != 'a' && opcion != 'A'));{
		System.out.println("has salido");	
		}
		entrada.close();
	}

}
