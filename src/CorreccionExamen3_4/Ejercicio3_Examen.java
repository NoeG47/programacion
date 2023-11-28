package CorreccionExamen3_4;

import java.util.Scanner;

public class Ejercicio3_Examen {
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] edades = new int[5];
		pedirEdades(edades);
		mostrarEd(edades);
		calculaEdadMedia(edades);
		double media = calculaEdadMedia(edades);
		int jubilados=PersonasenEdaddeJubulación(edades);
		int trabajadores=edades.length-jubilados;
		System.out.println("La media de edad es de: "+media);
		System.out.println("El total de jubilados son: "+jubilados);
		System.out.println("El total de trabajadores son: "+trabajadores);
	}

	public static void pedirEdades(int[] edades) {
		for (int i = 0; i < edades.length; i++) {
			System.out.println("introduce tu edad: ");
			edades[i] = entrada.nextInt();
			while (edades[i] < 18 || edades[i] > 99) {
				System.out.println("Edad no válida, introduce una edad entre 16 y 99");
				edades[i] = entrada.nextInt();
			}
			

		}

	}
	public static void mostrarEd(int[] edades) {
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]);
		}
	}
	public static double calculaEdadMedia(int [] edades) {
		int suma = 0;
		int media = 0;
		for (int i = 0; i < edades.length; i++) {
			suma = edades[i] + suma;
			media = suma/edades.length;
		}
		return media;
	}
	public static int PersonasenEdaddeJubulación(int[] edades) {
		int cont=0;
		for (int i=0;i<edades.length;i++) {
			if(edades[i]>=65)
				cont++;
		}
		return cont;
	}

}
