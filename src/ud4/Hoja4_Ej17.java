package ud4;

import java.util.Scanner;

public class Hoja4_Ej17 {
	static Scanner entrada = new Scanner(System.in);

//que rellene una matriz 10 x 11 y enseñe los n al 100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[10][11];
	
		//int sumaColumnas[] = new int[10];
		rellenamatriz(matriz);
		for (int i = 0; i<10; i++) {
			sumaMatrizT(matriz[i]);
		}
		muestraMatriz(matriz);
		
		
		
	}

	
	public static void rellenamatriz(int matriz[][]) {
		int num = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// System.out.println("Introduce numeros");
				// matriz[i][j] = entrada.nextInt();
				matriz[j][i] = num;
				num++;
			}
		}
	}



	
	public static void sumaMatrizT(int [] vector) {
			int suma = 0;
			for (int i = 0; i < 10; i++) {
				suma = suma + vector[i];
			}
			//sumaColumnas[i] = suma;
			vector[10] = suma; // Almacena la suma en la última fila de la columna i en la matriz
													// transpuesta
		
	}
	public static void muestraMatriz(int [][]  matriz) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(matriz[j][i] + " ");
			}
		System.out.println();	
		}
		for (int i= 0; i< 10; i++) {
			System.out.print(matriz[i][10] + " ");
		}
	}
	
	
	
}
