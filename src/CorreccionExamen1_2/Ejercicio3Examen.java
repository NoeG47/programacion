package CorreccionExamen1_2;

import java.util.Scanner;

public class Ejercicio3Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int i = 0;
		System.out.println("introduce un numero");
		int num1 = entrada.nextInt();
		System.out.println("introduce un numero");
		int num2 = entrada.nextInt();
		entrada.close();
		if ((num1 >= 0 && num1 <=100)&&(num2 >= 0 && num2 <=100)&&(num1 != num2)) {
			if (num1 < num2) {
				i = num1;
				while (i <= num2){
					System.out.println(i);
					i++;
				}
					
				}
			if (num1 > num2) {
				i = num1;
				while (i >= num2){
					System.out.println(i);
					i--;
				}
			}
		}
		else if (num1 == num2) {
			System.out.println("Error, valores iguales");
		}
		else {
			System.out.println("Error, valores no válidos");
		}
		
	}

}
