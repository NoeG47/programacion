package ud3;

import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		//caso potencia
		int i,num1,num2;
		int acum=0;
		int mult=0;
		System.out.println("Introduce la base: ");
		num1 = entrada.nextInt();
		
		System.out.println("Introduce el exponente: ");
		num2 = entrada.nextInt();
		
		acum = num1;
		for ( i = 1; i < num2; i++) {
			mult = acum * num1;
			acum = mult;
			
		} 
		System.out.println(mult);	
	}

}
