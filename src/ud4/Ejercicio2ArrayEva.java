package ud4;
//Ejercicio 2. Leer 10 números, almacenarlos en un array,
//luego tiene que salir el siguiente menú:
//a. el valor máximo y mínimo del array
//b. eliminar duplicados y sutituirlos por 0 (todos menos el primero)
//c. rotar array
//d. salir

import java.util.Scanner;

public class Ejercicio2ArrayEva {

	public static void main(String[] args) {
		//Declaracion de variables
		final int tamano=4;
		char opcion;
		//Habilitamos el escaner de lectura
		Scanner entrada=new Scanner(System.in);
		//declaramos el array de numeros
		int [] numeros;
		//asignamos el tamaño requerido
		numeros = new int [tamano];
		//Introducimos datos
		for (int i =0; i<tamano; i++) {
			System.out.println("Introduce un número: ");
			numeros[i]=entrada.nextInt();
		}
		entrada.nextLine();
		do {
			//mostrar el menu
			System.out.println('\n');
			System.out.println("opciones de menu");
			System.out.println("a. Devolver valor");
			System.out.println("b. Eliminar duplicados");
			System.out.println("c. Rotar array");
			System.out.println("d. Salir");	
			//leemos la opcion
			opcion=entrada.nextLine().charAt(0);
			switch (opcion) {
			//caso a - Devolver valores
			case 'a':
			case 'A':
			//leemos el array introducido
			System.out.println("Tu array principal es: ");
			for (int i =0; i<tamano; i++) {
				System.out.print(numeros[i]);
			}
			System.out.println('\n');
			//Inicializamos el max y el min del array desde la 1º posicion 	
			int max = numeros[0];  
			int min = numeros[0]; 
			//Buscamos dentro del array el max y el min
			for (int i = 1; i < tamano; i++) {
				// Actualizamos max si hay un numero mayor
				if (numeros[i] > max) {
			        max = numeros[i]; 
			    }
				// Actualizamos min si hay un numero menor
			    if (numeros[i] < min) {
			        min = numeros[i]; 
			    }
			}
			//devolvemos el resultado
			System.out.println("El número mayor es: " + max);
			System.out.println("El número menor es: " + min);
			break;	
			//caso b - Eliminar duplicados
			case 'b':
			case 'B':	
			//buscar numeros repetidos
			for (int i =0; i<tamano; i++) {
				for (int j=i + 1; j<tamano; j++) {
					if (numeros[i] == numeros[j]) {
						numeros[j] = 0; 
					} 
				}
			}
			//leemos el array 
			System.out.println("Array con números repetidos sustituidos por 0:");
			for (int i = 0; i < tamano; i++) {
				System.out.print(numeros[i]);
			}
			break;	
			//caso c - Rotar Array
			case 'c':
			case 'C':	
			//leemos el primer array introducido
			System.out.println("Tu array principal es: ");
			for (int i =0; i<tamano; i++) {
				System.out.print(numeros[i]);
			}
			System.out.println('\n');
			//declaramos el array de numeros inverso
			int [] Numsinverso;
			//asignamos el tamaño requerido
			Numsinverso = new int [tamano];
			//Introducimos datos
			for(int i = 0; i < tamano; i++) {
				Numsinverso[i] = numeros[(tamano - 1) - i];
			}
			//leemos el array inverso 
			System.out.println("Tu array inverso es: ");
			for (int i =0; i < tamano; i++) {
				System.out.print(Numsinverso[i]);
			}
			break;
				//caso d - Salir
			case 'd':
			case 'D':	
				System.out.println("Hasta otra");
			break;
			default:
				System.out.println("Opción no válida");
			}
		}
		while ((opcion != 'd' && opcion != 'D'));{
			System.out.println("Has salido");	
		}
		entrada.close();
	}
}
