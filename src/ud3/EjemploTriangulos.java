package ud3;

import java.util.Scanner;

public class EjemploTriangulos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//habilito entra por teclado
		Scanner entrada=new Scanner(System.in);
		//Declaro variables
		double lado1, lado2, lado3, perimetro;
		int opcion = 0;
		//menu
		do {
			//mostrar el menú
			System.out.println("opciones de menú");
			System.out.println("1. Equilatero");
			System.out.println("2. Isosceles");
			System.out.println("3. Escaleno");
			System.out.println("4. Salir");
			//leemos opcion
			opcion=entrada.nextInt();
			switch (opcion) {
				//caso equilatero
				case 1:
					System.out.println("Inytoduce el lado");
					lado1 = entrada.nextInt();
					perimetro = 3*lado1;
					System.out.println("El perímetro es: "+perimetro);
				break;	
				//caso isosceles
				case 2:
					System.out.println("Inytoduce dos lado");
					lado1 = entrada.nextInt();
					lado2 = entrada.nextInt();
					perimetro = (2*lado1)+lado2;
					System.out.println("El perímetro es: "+perimetro);
				break;
				//caso escaleno
				case 3:
					System.out.println("Inytoduce tres lado");
					lado1 = entrada.nextInt();
					lado2 = entrada.nextInt();
					lado3 = entrada.nextInt();
					perimetro = lado1+lado2+lado3;
					System.out.println("El perímetro es: "+perimetro);
				break;
				//caso salir
				case 4:
					System.out.println("hasta otra");
				break;
				//caso por defecto
				default:
					System.out.println("opción no válida");
			}
		}while(opcion !=4);
	}

}
