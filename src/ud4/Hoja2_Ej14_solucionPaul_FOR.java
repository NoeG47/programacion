package ud4;

import java.util.Scanner;
//Esta solucion no es viable con numeros tan altos WARNING
public class Hoja2_Ej14_solucionPaul_FOR {

	public static void main(String[] args) {
		//Definicion de constantes
		final int TAMANO=5;
		// TODO Auto-generated method stub
		//habilitamos la lectura por pantalla
			Scanner entrada=new Scanner(System.in);
			//Declaramos el primer array
			int Nums1[];
			//Asignamos tamaño del array
			Nums1 = new int [TAMANO];
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
			for (int i = 0; i < TAMANO; i++) {
	            if ((busqueda == Nums1[i])&&(esNumeroEncontrado ==false)) {
	                System.out.println(busqueda + " está en la posición: " + (i + 1));
	                esNumeroEncontrado = true; 
	            }
	            
	        }
	        System.out.println("El número no se encuentra en el array");
	        
	 
	    
	}

}
