package ud4;

import java.util.Scanner;

// Que lea 10 números por teclado, los almacene en un array 
//y muestre la suma,resta, multiplicación y división de todos.
public class Hoja4_Ej4Array {
	public static void main(String[] args) {
		//habilitamos la lectura por teclado
		Scanner entrada=new Scanner(System.in);	
		//definimos el array
		double[] numero = new double[10];
		boolean esCero=false;
		double suma=0 , resta = 1, multiplicacion = 1, division = 1;
		
		//rellenamos el array
		for (int i =0; i<10; i++) {
			System.out.println("Introduce 10 valores: ");
			numero[i]=entrada.nextDouble();
			if (numero[i]==0) {
				esCero=true;
			}
		}
		//calculamos los resultados
		for (int i =0; i<10; i++) {
			suma = suma + numero[i];
			resta = resta - numero[i];
			multiplicacion = multiplicacion * numero[i];
			if (!esCero) {
				division = division / numero [i];
			}
		
		}
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + multiplicacion);
		if (!esCero) {
			System.out.println("La division es: " + division)
			;
		}else {
			System.out.println("La división no se puede realizar");
		}
		
	}

}
