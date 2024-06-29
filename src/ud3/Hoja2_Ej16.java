package ud3;

import java.util.Scanner;

//16. Que pida un número 
//y muestre en pantalla el mismo número de asteriscos.
public class Hoja2_Ej16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;
		int i;
		char aste = '*';
		System.out.println("Introduce un número: ");
		num = entrada.nextInt();
		entrada.close();
		for (i = 0; i < num; i++) {
			System.out.print(aste);
		}
		
	}
	
}
