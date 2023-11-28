package ud3;

import java.util.Scanner;

public class hoja2_Ej20 {
//que solo se pueda introducir "S/N" y al pulsar "S" salga del programa
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        char letra;
		do {
	            System.out.print("Introduce 'S' para salir o 'N' para continuar: ");
	            letra = scanner.nextLine().charAt(0);
	            if (letra == 'S'){
	                System.out.println("Saliendo del programa...");
	            } else if (letra == 'N') {
	                System.out.println("Continuando...");
	            } else {
	                System.out.println("Entrada no válida. Debes ingresar 'S' o 'N'.");
	            }
	        } while (letra != 'S');

	}

}
