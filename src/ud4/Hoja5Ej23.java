package ud4;

import java.util.Scanner;

//Que realice los diferentes métodos de ordenación 
//de arrays utilizando las funciones:
/*Relleno de un array.
Copia un array a otro.
Mostrar en pantalla todos los valores.*/
public class Hoja5Ej23 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int tam = pedirTam();
		int numerosArray [] = new int [tam];
		int numerosArrayClon[] = new int[tam];
		System.out.println("direccion de memoria" + numerosArray);
		rellenarArray(numerosArray);
		muestraArray(numerosArray);
		rellenaArrayClon(numerosArray,numerosArrayClon);
		muestraArrayClon(numerosArrayClon);

	}
	public static int pedirTam() {
		System.out.println("Introduce el tamaño del array");
		int tam = entrada.nextInt();
		return tam;
	}
	public static int[] rellenarArray(int[] nums2) {
		for(int i=0; i<nums2.length; i++) {
			System.out.println("Introduce un valor: ");
			nums2[i]= entrada.nextInt();
		}
		return nums2;
	}
	public static void muestraArray(int[] nums) {
		for (int i =0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	public static void rellenaArrayClon(int[] numsOrigen, int[] numsDestino) {
	    for (int i = 0; i < numsOrigen.length; i++) {
	        numsDestino[i] = numsOrigen[i];
	    }
	}
	public static void muestraArrayClon(int[] nums) {
		for (int i =0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

}
