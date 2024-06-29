package ud4;

//Que rellene un array con 100 numeros enteros
//y los muestre de forma ascendente
public class Hoja4_Ej1Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Definimos el array de notas
		int[] numeros;
		// 2. Asignamos el tamaño del array
		numeros = new int[100];
		// 3. Metemos las notas en el array
 		for (int i = 1; i <= 100; i++) {
 			numeros[i-1] = i;
		}
 		// 4. Imprimir el array
 		for (int num : numeros) {
 			System.out.println(num);
 		}
	}

}