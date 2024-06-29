package ud4;

import java.util.Scanner;

//Que rellene un array con 20 números 
//y luego busque un número concreto.
public class Hoja4_Ej14Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//habilitamos la lectura por pantalla
			Scanner entrada=new Scanner(System.in);
			//Declaramos el primer array
			int Nums1[];
			//Asignamos tamaño del array
			Nums1 = new int [5];
			//introducimos datos en el array1
			for (int i =0; i<5; i++) {
				System.out.println("Introduce un numero para guardar: ");
				Nums1[i]=entrada.nextInt();		
			}
			//pedimos la busqueda de un numero en el array
			System.out.println("Introduce el numero para buscar: ");
			int busqueda = entrada.nextInt();
			boolean esNumeroEncontrado = false;
			//buscamos si el numero se encuentra en el array
			for (int i = 0; i < 5; i++) {
	            if (busqueda == Nums1[i]) {
	                System.out.println(busqueda + " está en la posición: " + (i + 1));
	                esNumeroEncontrado = true; 
	                break; //  salimos  del bucle una vez que se ha encontrado el número
	            }
	        }

	        if (!esNumeroEncontrado) {
	            System.out.println("El número no se encuentra en el array");
	        }
	        entrada.close();
	}

}
