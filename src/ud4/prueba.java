package ud4;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaracion de variable estatico
		final int tamano=10;
		
		//Habilitamos el escaner de lectura
		Scanner entrada=new Scanner(System.in);
		//declaramos el array de enteros
		int [] numeros;
		//asignamos el tamaño requerido
		numeros = new int [tamano];
		//Introducimos datos
		for (int i =0; i<tamano; i++) {
			System.out.println("Introduce un número: ");
			numeros[i]=entrada.nextInt();
		}
		//cerramos el escaner
		entrada.close();
		
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