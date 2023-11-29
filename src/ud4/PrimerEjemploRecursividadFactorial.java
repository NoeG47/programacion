package ud4;

public class PrimerEjemploRecursividadFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=fact(5);
		System.out.println(num);
	}
	public static int fact(int num) {
	 //caso base
		if (num <= 1)
		 return 1;
	 //caso general
		int fact = num * fact (num-1);
		return fact;
	}

}
