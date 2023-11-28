package ud3;
// 0 1 1 2 3 5 ...
public class hoja2_Ej25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaracion e inicializacion de variables
		int a = 0;
		int b = 1;
		int c = 0;
		//mostramos los dos primeros terminos de la serie
		System.out.println(a);
		System.out.println(b);
		//contador
		int i = 1;
		while (i <= 25) {
			c = a + b ;
			System.out.println("contador: " + i + " num: " + c);
			a = b;
			b = c;
			i = i+1;
		}
	}

}
