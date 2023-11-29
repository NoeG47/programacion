package ud4;

public class Ejercicio3Recursividad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		muestraNum(1);
		
	}
	public static void muestraNum(int num) {
		System.out.println(num);
		//caso general
		if (num < 100)
			muestraNum(num+1);
		//caso base cuando num es 100
		// no lo muestra, hace un return
	
		
	}

}
