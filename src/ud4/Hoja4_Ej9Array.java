package ud4;

import java.util.Scanner;

//9. Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y
//muestre el segundo array
public class Hoja4_Ej9Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//habilitamos la lectura por pantalla
		Scanner entrada=new Scanner(System.in);
		//Declaramos el primer array
		double arrayNums1[];
		arrayNums1 = new double [5];
		//introducimos datos en el array1
		for (int i =0; i<5; i++) {
			System.out.println("Introduce un numero: ");
			arrayNums1[i]=entrada.nextDouble();
			
		}
		//declaramos el segundo array
		double arrayNums2[];
		arrayNums2 = new double [5];
		for (int i = 0; i <5; i++) {
			arrayNums2[i]=(arrayNums1[i]*2);
		}
		//leemos el segundo array
		for (int i = 0; i <5; i++) {
			System.out.print(arrayNums2[i] + ",");
		}
	}

}
