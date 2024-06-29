	package ud4;

import java.util.Scanner;

public class Ejercicio1ArrayEva {
//Ejercicio 1. Leer una palabra de 4 letras (letra a letra)
//y mostrar en una línea la palabra formada y 
//su palíndroma.
	public static void main(String[] args) {
		//Declaracion de variables
		final int tamano=4;
		
		//Habilitamos el escaner de lectura
		Scanner entrada=new Scanner(System.in);
		//declaramos el array de caracteres
		char [] palabras;
		//asignamos el tamaño requerido
		palabras = new char [tamano];
		//Introducimos datos
		for (int i =0; i<tamano; i++) {
			System.out.println("Introduce una letra para guardar: ");
			palabras[i]=entrada.nextLine().charAt(0);
		}
		//despues de haber leido la palabra cerramos el 
		//escaner ya q no vamos a usarlo más
		entrada.close();
		//leemos el array
		for (int i =0; i<tamano; i++) {
			System.out.print(palabras[i]);
		}
		System.out.println('\n');
		//declaramos el array de caracteres inverso
		char [] inverso;
		//asignamos el tamaño requerido
		inverso = new char [tamano];
		//Introducimos datos
		for(int i = 0; i < tamano; i++) {
			inverso[i] = palabras[(tamano - 1) - i];
		}
		//leemos el array a la inversa para conseguir su palíndroma
		for (int i =0; i < tamano; i++) {
			System.out.print(inverso[i]);
		}
		
	}
}
