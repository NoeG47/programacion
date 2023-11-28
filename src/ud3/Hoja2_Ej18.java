package ud3;
//18. Que escriba las tablas de multiplicar del 0 al 10
public class Hoja2_Ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont;
		int acum;
		for (cont = 1; cont <= 10; cont++) {
			for (acum = 1; acum <=10; acum++) {
				System.out.print(cont + " x " +acum+" = "+(cont*acum)+ "  ");
			}
			System.out.println("\n");
		}
	}

}
