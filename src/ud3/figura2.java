package ud3;

import java.util.Scanner;

public class figura2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numeroFilas = 0;
        numeroFilas = scanner.nextInt();
        int k;

        for (int i = 1; i <= numeroFilas; i++) {
            for (int j = 1; j <= numeroFilas - i; j++) {
                System.out.print(".");
            }
            //asteriscos
            for (k = 1; k <= (i*2)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
