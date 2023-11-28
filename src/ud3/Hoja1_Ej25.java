package ud3;

/* *25.que calcule el sueldo correspondiente
40.000 euros anuales
si lleva mas de 10 años --> 10%
si lleva menos de 10 años pero mas de 5 --> 7%
si lleva menos de 5 años pero más de 3 --> 5%
si lleva menos de 3 --> 3%
Inicio* */
public class Hoja1_Ej25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarar variables
		double sueldo;
		int anos;

		// inicializar variables
		sueldo = 0;
		anos = 0;

		// mostrar "intro un nº"
		System.out.println("introduce un número: ");
		// mostrar "intro los años"
		System.out.println("introduce los años en la empresa: ");
		// leer sueldo y años
		sueldo = 40000;
		anos = 6;
		// aplicar las condiciones
		if (anos > 10) {
			sueldo = sueldo * 1.10;
		}
		if (anos <= 10 && anos > 5) {
			sueldo = sueldo * 1.07;
		}
		if (anos <= 5 && anos > 3) {
			sueldo = sueldo * 1.05;
		}
		if (anos <= 3) {
			sueldo = sueldo * 1.03;
		}
		System.out.println("el sueldo total es:" + sueldo);
	}

//Fin
}
