package ud4;

// Que rellene un array con los números pares
//comprendidos entre 1 y 100 y los
//muestre en pantalla en orden ascendente
public class Hoja4_Ej3Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Definimos el array de numeros
		int [] numeros;
		//2. Construimos el array
		numeros = new int [50];
		int num = 2;
		for (int i = 0; i < 50;i++) {
			numeros[i]=num;
			num = num +2;
		}
		//3.Leer el array
		for (int i = 0; i < 50;i++) {
			System.out.println(numeros[i]);
		}
		}	
}