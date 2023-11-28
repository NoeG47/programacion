package ud3;
//9. Que imprima la suma de todos los n pares
//que van del 1 al 100 y diga cuantos hay
public class hoja2_Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//declarar variables
		int num = 0;
		int acum = 0;
		int iNumPares = 0;
		//hacer bucle
		while (num < 100) {
			num = num + 2;
			acum = acum + num;
			iNumPares = iNumPares+1;
			System.out.println("num:"+ num);
			
		}
		
		System.out.println("hay:" + iNumPares+ ","+acum);
	}

}
