package ud4;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variables
		final int tamano=10;
		
		//Habilitamos el escaner de lectura
		Scanner entrada=new Scanner(System.in);
		//declaramos el array de caracteres
		int [] numeros;
		//asignamos el tamaño requerido
		numeros = new int [tamano];
		//Introducimos datos
		for (int i =0; i<tamano; i++) {
			System.out.println("Introduce un número: ");
			numeros[i]=entrada.nextInt();
		}
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
		

	}

}