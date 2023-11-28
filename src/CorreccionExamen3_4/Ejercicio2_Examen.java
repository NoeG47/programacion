package CorreccionExamen3_4;

import java.util.Scanner;

/*
 * Metodos estaticos
 * 
 * 
 * */
public class Ejercicio2_Examen {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero");
		int num = entrada.nextInt();
		while (esValido(num) == false) {
			System.out.println("Error");
			System.out.println("Introduce un numero válido");
			num = entrada.nextInt();
		}
		multiplicar(num);
		
	}
	public static boolean esValido(int num) {
		if (num >= 0 && num <= 10) {
			return true;
		}
		return false;
	}
	public static void multiplicar(int num) {
		int mult = 0;
		for (int i = 0; i <= 10; i++) {
			mult = num * i;
			System.out.println(num + "*" + i + "=" + mult);
		}
		
		
	}
}
