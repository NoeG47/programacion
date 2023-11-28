package ud3;

//2. que pida un número y diga si es par o impar
//Inicio
public class hoja1_Ej2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaración de variable
		// tipo_dato nombre_variable;
		int num;
		// num <- 0
		num = 0;
		// mostrar "introduce un número"
		System.out.println("introduce un número");
		// leer num
		num = 4;
		// Si (num MOD 2)=0 entonces
		if ((num % 2) == 0) {
			// Mostrar "es par"
			System.out.println("es par");
			// Sino
		} else {
			// Mostrar "es impar"
			System.out.println("es impar");
			// Fin_si
		}
//Fin		
	}

}
