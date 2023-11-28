package ud4;

import java.util.Scanner;

public class Hoja4_Ej17 {
	static Scanner entrada = new Scanner(System.in);

//que rellene una matriz 10 x 11 y enseñe los n al 100
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[10][11];
		int matrizT[][] = new int[11][10];
		//int sumaColumnas[] = new int[10];
		matriz(matriz);
		matrizT(matriz, matrizT);
		sumaMatrizT(matrizT);
		muestraMatriz(matriz);
		//muestraArray(sumaColumnas);
		
	}

	
	public static int[][] matriz(int matriz[][]) {
		int num = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// System.out.println("Introduce numeros");
				// matriz[i][j] = entrada.nextInt();
				matriz[i][j] = num;
				num++;
			}
		}
		return matriz;
	}

//calculamos la  transpuesta y lo almacenamos
	public static int[][] matrizT(int matriz[][], int matrizT[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizT[j][i] = matriz[i][j];
			}

		}
		return matrizT;
	}

	
	public static void sumaMatrizT(int matriz[][]) {
		for (int i = 0; i < 10; i++) {
			int suma = 0;
			for (int j = 0; j < 10; j++) {
				suma += matriz[j][i];
			}
			//sumaColumnas[i] = suma;
			matriz[i][10] = suma; // Almacena la suma en la última fila de la columna i en la matriz
													// transpuesta
		}
	}

	
	public static void muestraMatriz(int matriz[][]) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	/*public static void muestraArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}*/
	
	
}
