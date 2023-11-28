package CorreccionExamen3_4;

import java.util.Scanner;

/*Pedir un nº de 5 cifras, se debe controlar, 
 * si no lo es pide de nuevo
 * mostrar por pantalla si es capicua o no
 *  */
public class Ejercicio1_Examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int a=0,b=0,c=0, d=0, e=0;
		System.out.println("Intro un n");
		int num = entrada.nextInt();
		//verificar si el numero es de 5 cifras
		while (num < 10000 || num > 99999) {
			System.out.println("Intro un n valido de 5 cifras");
			num = entrada.nextInt();
			
		}
		while (num>= 10000) {
			num = num - 10000;
			a = a +1;
		}
		while (num>= 1000) {
			num = num - 1000;
			b = b +1;
		}
		while (num>= 100) {
			num = num - 100;
			c = c +1;
		}
		while (num>= 10) {
			num = num - 10;
			d = d +1;
		}
		e = num;
		//comprobacion	
		System.out.println("numero descompuesto: " + a + b + c + d + e);
		if (a == e && b == d) {
			System.out.println("Es capicua");
		}
		else {
			System.out.println("No es capicua");
		}
		
		
	}

}
