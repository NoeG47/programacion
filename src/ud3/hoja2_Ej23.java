package ud3;

import java.util.Scanner;

//Que solicite la media de X números, se dejarán de solicitar 
//números hasta que se introduzca el cero.
public class hoja2_Ej23 {

	public static void main(String[] args) {
		
			Scanner entrada = new Scanner(System.in); {
			double num = 0;
			int cont;
			double media = 0;
			double acum = 0;
			System.out.println("Introduce un número: ");
			num=entrada.nextInt();
			if (num == 0) {
				System.out.println("No se puede iniciar con 0");
			}
			else {
				acum = num;
				//
				for (cont = 1; num != 0; cont++) {
					System.out.println("Introduce un número: ");
					num=entrada.nextInt();
					acum = acum + num;
					
				}
				//aqui restamos 1 al contador ya que al introducir
				//el cero cuenta como un numero 
				cont = cont - 1;
				media = acum/cont;
				System.out.println("la media es " + media);
			}
		}
			entrada.close();
	}

}
