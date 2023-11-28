package ud3;

import java.util.Scanner;

//11. Que pida dos números y muestre todos los números que van desde
//el primero al segundo. 
//Se debe controlar que los valores son correctos
public class Hoja2_Ej11 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			int a,b,i;
			System.out.println("Introduce el primer número: ");
			a=entrada.nextInt();
			System.out.println("Introduce el segundo número: ");
			b=entrada.nextInt();
			if (a > b || a ==b) {
				System.out.println("Error, valores no válidos");
			}
			else {
				for (i = a; i<=b; i++){
					System.out.println(i);
				}
			}
		}
		
	}

}
