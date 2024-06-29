package ud3;

import java.util.Scanner;

//Pedir un numero y decir si es un numero armstrong
public class NumeroArmstrong_Noe {

	public static void main(String[] args) {
		// habilito entra por teclado
		Scanner entrada = new Scanner(System.in);
		// Declaro variables
		int num;
		String numCadena;
		int suma;

		System.out.println("Introduce un número de 3 cifras: ");
		num = entrada.nextInt();
		entrada.close();
		// convertir el numero en una cadena
		numCadena = Integer.toString(num);
		// System.out.println(numCadena.charAt(1));
		// seleccionar cada cifra para multiplicarlo
		char cifra1 = numCadena.charAt(0);
		char cifra2 = numCadena.charAt(1);
		char cifra3 = numCadena.charAt(2);
		// convertir el caracter seleccionado en int
		int numcifra1 = Integer.parseInt(String.valueOf(cifra1));
		;
		int numcifra2 = Integer.parseInt(String.valueOf(cifra2));
		;
		int numcifra3 = Integer.parseInt(String.valueOf(cifra3));
		;

		suma = (numcifra1 * numcifra1 * numcifra1) + (numcifra2 * numcifra2 * numcifra2)
				+ (numcifra3 * numcifra3 * numcifra3);
		// comprobar si es un numero armstrong
		if (suma != num) {
			System.out.println("No es un número armstrong");
		} else {
			System.out.println("Es un número armstrong");
		}
	}
}
