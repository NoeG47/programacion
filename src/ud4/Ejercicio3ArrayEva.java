package ud4;

import java.util.Scanner;

public class Ejercicio3ArrayEva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Habilitamos el escaner de lectura
		Scanner entrada=new Scanner(System.in);
		//Declaracion de variables
		int tamano;
		System.out.println("Introduce el tamaño del array");
		tamano = entrada.nextInt();
		//declaramos el array de numeros
		int [] numeros;
		//asignamos el tamaño requerido
		numeros = new int [tamano];
		//Introducimos datos
		for (int i =0; i<tamano; i++) {
			System.out.println("Introduce un número: ");
			numeros[i]=entrada.nextInt();
		}
		//leemos el array
		System.out.println("Tu array principal es: ");
		for (int i =0; i<tamano; i++) {
			System.out.print(numeros[i]);
		}
		//ordenamos el array 
		int aux = 0;
		for (int j =0; j<tamano; j++) {
			for (int i= 0; i<tamano-1; i++) {
				if (numeros[i]>numeros[i+1]) {
					aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i+1] = aux;
				}
			}
		}
		//leemos el array ordenado
		int i =0;
		System.out.println('\n');
		System.out.println("Los números ordenados son: ");
		while (i<tamano) {
			System.out.print(numeros[i]);
			i++;
		}
		entrada.close();
	}

}
