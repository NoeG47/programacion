package ud3;

import java.util.Scanner;

public class EjemploNumeroArmstrong_Solucion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int num=0;
		int numLeido=0;
		int c=0,d=0,u=0;
		System.out.println("Introduce un número: ");
		numLeido = entrada.nextInt();
		num = numLeido;
		//obtenemos las centenas
		while (num >=100) {
			num = num - 100;
			c = c +1;
		//obtenemos las decenas
		while (num >=10) {
			num = num - 10;
			d = d +1;
		}	
		u=num;
		System.out.println("centenas: " +c+" decenas: "+d+ " unidades: "+u);
		}
		if (((c*c*c)+(d*d*d)+(u*u*u))==numLeido) {
			System.out.println("Es un numero"
					+ " Armstrong");
		} else {
			System.out.println("No es un número"
					+" Armstrong");
		}
	}

}
