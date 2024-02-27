package ud4;

import java.util.Scanner;

public class ArrayBidimensional {
	static int[][] matriz = new int[3][3];
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int j1 = 1;
		int j2 = 2;
		int pos;

		boolean esTurnoJugador1 = true;
		boolean esTurnoJugador2 = false;
		
		//cambiar esto 
		boolean seguirJugado = true;
		do {
			if (esTurnoJugador1) {
				System.out.println("Turno jugador 1");
				System.out.println("Introduce la posicion del 1 al 9");
				pos = in.nextInt();

				// rellenamos el array
				mueveJugador1(j1, pos);
				
				
				//cambiar turno
				esTurnoJugador1 = false;
				esTurnoJugador2 = true;
			}
			// imprimir resultado
			// mostramos array en formarto matriz
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
			if (esTurnoJugador2) {
				System.out.println("Turno jugador 2");
				System.out.println("Introduce la posicion del 1 al 9");
				pos = in.nextInt();

				// rellenamos el array
				mueveJugador1(j2, pos);
				
				esTurnoJugador2 = false;
				esTurnoJugador1 = true;
			}
			// imprimir resultado
			// mostramos array en formarto matriz
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
		} while (seguirJugado);
		// imprimir resultado
		// mostramos array en formarto matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void mueveJugador1(int j1, int pos) {
		realizarMovimiento(j1, pos);
	}
	public static void mueveJugador2(int j2, int pos) {
		realizarMovimiento(j2, pos);
	}

	private static void realizarMovimiento(int jugador, int pos) {
	    if (pos >= 1 && pos <= 9) {
	        int fila = (pos - 1) / 3;
	        int columna = (pos - 1) % 3;

	        if (movimientoValido(pos)) {
	            matriz[fila][columna] = jugador;
	        } else {
	            System.out.println("Movimiento no válido. La casilla está ocupada.");
	        }
	    } else {
	        System.out.println("Movimiento no válido. Fuera de rango");
	    }
	}


	public static boolean movimientoValido(int pos) {
		
			int fila = (pos - 1) / 3;
			int columna = (pos - 1) % 3;

			return matriz[fila][columna] == 0;
	}
}
