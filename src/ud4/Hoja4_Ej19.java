package ud4;

import java.util.Scanner;

public class Hoja4_Ej19 {
	static Scanner entrada = new Scanner(System.in);

//que rellene una matriz 3x3 y muestre su transpuesta
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = new int[3][3];
		int matrizT[][] = new int[3][3];
		// rellenamos el primer array
		matriz(matriz);
		// rellenamos el segundo arraymatrizT
		matrizT(matriz, matrizT);
		// mostramos el array uno matriz
		muestraArray(matriz);
		System.out.println("Solucion: ");
		// mostramos el array transpuesta
		muestraArray(matrizT);

	}

	public static int[][] matriz(int matriz[][]) {
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
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
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizT[j][i] = matriz[i][j];
			}
		}
		return matrizT;
	}

	public static void muestraArray(int matriz[][]) {
		for (int i = 0; i < 3; i++) {                              
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
