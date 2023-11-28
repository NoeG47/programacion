package ud3;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6	;
		int i = 0;
		int mult = 0;
		i = num - 1;
		mult = num * i;
		while (i > 1) {
			i = i - 1;
			mult = mult * i;
				
		}
		System.out.println("el factorial de " + num + " es " + mult);
	}

}
