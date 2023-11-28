package ud4;

import java.util.Scanner;
//Que rellene un array con 100 numeros enteros
//y los muestre de forma ascendente
public class Hoja4_Ej2Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Definimos el array de notas
		int [] numeros;
		//2. Construimos el array de 10 posiciones
		numeros = new int [100];
		int num = 100;
		//3. Metemos 10 notas en caliente dentro del array
		for (int i = 99; i >= 0;i--) {
			numeros[i]=num;
			num --;
		}
		for (int i = 99; i >= 0;i--) {
			System.out.println(numeros[i]+ " ");
		}
		
		}
		
	

}