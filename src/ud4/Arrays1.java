package ud4;

import java.util.Scanner;
//Que pida 10 notas y muestre la media
//además deberá mostrar las notas pedidas
public class Arrays1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		//1. Definimos el array de notas
		int [] notas;
		int suma = 0;
		//2. Construimos el array de 10 posiciones
		notas = new int [10];
		//3. Metemos 10 notas en el array
		for (int i = 0; i < 10;i++) {
			System.out.println("Introduce un número: "); 
			notas[i] = entrada.nextInt();
			suma = suma + notas [i];
		}
		System.out.println("Tus numeros introducidos son: " );
		for (int i = 0; i <10; i++) {
			System.out.print(notas[i] + ",");
		}
		System.out.println("\n");
		System.out.println("La media es: " + (suma/10));
		
	}

}
