package ud4;

public class EjemploFuncion {
	//funcion principal. Es la UNICA funcion
	//que se ejecuta en un programa
	public static void main(String[] args) {
		int sum = suma(5,4);
		System.out.println(sum);
	}
	//definimos una funcion
	//1. Definimos la cabecera
	public static int suma(int a, int b) {
		return a+b; //2. Cuerpo de una funcion
	}

}
