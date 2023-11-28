package ud3;

import java.text.DecimalFormat;
import java.util.Scanner;

//22.Que calcule la media de 10 numeros
public class hoja2_EJ22 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in)) {
			int num = 0;
			int i = 0;
			double suma = 0;
			double media = 0;
			for (i=1;i<=10;i++) {
				System.out.println("Introduce un número: ");
				num=entrada.nextInt();
				suma = suma+num;
			}
			media = suma/10;
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("la media es: "+ df.format(media));
		}		
		
		
		
	}

}
