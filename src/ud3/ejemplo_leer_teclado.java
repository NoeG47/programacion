package ud3;

import java.util.Scanner;

//leer dos numeros por teclado y mostar suma
public class ejemplo_leer_teclado {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				//habilitamos la lectura de datos por consola
				//control + espacio si no aparece la opcion de importar
		Scanner entrada = new Scanner(System.in)) {
			int num1,num2;
			System.out.println("introduce numero 1: ");
			//leer num1
			num1=entrada.nextInt();
			System.out.println("introduce numero 2: ");
			//leer num2
			num2=entrada.nextInt();
			
			System.out.println("la suma es: " + (num1+num2));
		}
	}

}
