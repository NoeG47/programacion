package ud3;
//11. que pida una letra y diga si es vocal
//inicio
public class hoja1_Ej11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaración de variable
		// tipo_dato nombre_variable;
		char caracter;
		// caracter <-- '0'
		caracter = '0';
		// mostrar "introduce un caracter"
		System.out.println("introduce un caracter");
		// leer caracter
		caracter = 'r';
		//comprobamos si es una vocal
		// Si (caracter == a) or (caracter == e) or
		// (caracter == i) or (caracter == o) or (caracter == u)	
		
		if ((caracter == 'a')||(caracter == 'e')||(caracter == 'i')||(caracter == 'o')||(caracter == 'u')){
		//  Mostrar "es vocal"
		System.out.println("Es vocal");	
		}
		//sino 
		else {
			// Mostrar "no es vocal"	
			System.out.println("Es una consonante");
		//fin_si	
		}
		
	}
//Fin
}
