package CorreccionExamen1_2;

import java.util.Scanner;

public class Ejercicio4Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		char letra = '0';
		int i = 2;
		do {
			System.out.println("Introduce p o i");
			letra = entrada.nextLine().charAt(0);
			if (letra == 'p') {
				while (i <= 500) {
					System.out.println(i);
					i = i + 2;
				}
			}
			if (letra == 'i') {
				i = 1;
				while (i <= 500) {
					System.out.println(i);
					i = i + 2;
				}
			}
			if ((letra != 'p')&&(letra != 'i')) {
				System.out.println("Error, letras no válidas");
			}
		} while ((letra != 'i')&&(letra != 'p')); {
			System.out.println("ha acabado");
		}
		entrada.close();
	}

}
