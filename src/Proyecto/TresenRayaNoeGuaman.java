package Proyecto;

import java.util.Scanner;

public class TresenRayaNoeGuaman {
	// declaracion de variables globales
	static Scanner entrada = new Scanner(System.in);
	static char[] tablero = new char[9];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcionMenu = 0;
		int[] estadisticas = { 0, 0, 0 }; // estos son los contadores de victoriasJ1, victoriasJ2, empates
		do {
			mostrarMenu();
			opcionMenu = entrada.nextInt();
			switch (opcionMenu) {
				case 1:
					jugarPartida('X', 'O', estadisticas);
					break;
				case 2:
					mostrarEstadisticas(estadisticas);
					break;
				case 3:
					reiniciarEstadisticas(estadisticas);
					break;
				case 4:
					System.out.println("Byee");
					break;
				default:
					System.out.println("Opción no válida");
			}
		} while (opcionMenu != 4);
	}

	// funcion que muestra el menu con las diferentes opciones
	public static void mostrarMenu() {
		System.out.println("---- Tres en raya de Noé Guamán -----");
		System.out.println("Opciones de menu");
		System.out.println("1. Jugar partida");
		System.out.println("2. Mostrar estadísticas");
		System.out.println("3. Reiniciar estadísticas");
		System.out.println("4. Salir");
		System.out.println("Selecciona una opción: ");
	}

	// funcion que dibuja el tablero
	public static void dibujaTablero() {
		System.out.println("-------------");
		System.out.println("| " + tablero[0] + " | " + tablero[1] + " | " + tablero[2] + " | ");
		System.out.println("-------------");
		System.out.println("| " + tablero[3] + " | " + tablero[4] + " | " + tablero[5] + " | ");
		System.out.println("-------------");
		System.out.println("| " + tablero[6] + " | " + tablero[7] + " | " + tablero[8] + " | ");
		System.out.println("-------------");
	}

	// funcion que pone a 0 todo el tablero
	public static void iniciar() {
		for (int i = 0; i < tablero.length; i++) {
			tablero[i] = ' '; // Llena cada posición del tablero con un espacio en blanco
		}
	}

	// funcion que define la posicion del jugador 1
	public static void mueveJugador1(int pos) {
		if (movimientoValido(pos) == true) {
			tablero[pos - 1] = 'X';
		}
	}

	// funcion que define la posicion del jugador 2
	public static void mueveJugador2(int pos) {
		if (movimientoValido(pos) == true) {
			tablero[pos - 1] = 'O';
		}
	}

	// funcion que comprueba si el movimiento es valido
	public static boolean movimientoValido(int pos) {
		if (pos < 1 || pos > 9 || tablero[pos - 1] != ' ') {
			System.out.println("Movimiento no válido");
			return false;
		}
		return true;
	}

	// funcion que comprueba si quedan casillas libres
	public static boolean quedanCasillas() {
		for (int i = 0; i < tablero.length; i++) {
			if (tablero[i] == ' ') {
				return true;
			}
		}
		return false;
	}

	// funcion para empezar a jugar y segun el desarrollo del juego:
	// verificar si la posicion es valida y dibujarlo en el tablero,
	// ver quien juega y cambiar turnos,
	// comprueba si hay algun ganador o han empatado
	public static void jugarPartida(char fichaJugador1, char fichaJugador2, int[] estadisticas) { // FJ1 = "X", FJ2 =
																									// "O",
																									// []estadisticas
																									// (array)
		iniciar();
		dibujaTablero();
		System.out.println("Jugador 1: " + fichaJugador1 + " y Jugador 2: " + fichaJugador2);
		boolean continuarJuego = true; //
		char turnoActual = fichaJugador1; // devolvemos "X" para Jugador1

		while (continuarJuego) { // se ejecutara hasta que la condicion cambie a false
			int pos = -1; // Inicializamos posicion fuera del array tablero

			do {
				System.out.println("Jugador con ficha " + turnoActual + " diga la posicion");
				pos = entrada.nextInt();
			} while (pos == -1 || movimientoValido(pos) == false);

			if (turnoActual == fichaJugador1) {
				mueveJugador1(pos);
			} else {
				mueveJugador2(pos);
			}

			dibujaTablero();
			// aqui se comprueba si:
			// si uno de los dos ha ganado
			// o si la partida ha quedado empate
			if (!quedanCasillas() && !ganaJugador1() && !ganaJugador2()) {
				System.out.println("¡Empate! No quedan casillas libres.");
				estadisticas[2]++;
				continuarJuego = false;// salimos del bucle principal del juego
			} else if (ganaJugador1()) {
				System.out.println("¡Jugador 1 ha ganado!");
				estadisticas[0]++;
				continuarJuego = false;// salimos del bucle principal del juego
			} else if (ganaJugador2()) {
				System.out.println("¡Jugador 2 ha ganado!");
				estadisticas[1]++;
				continuarJuego = false;// salimos del bucle principal del juego
			}
			// cambio de turno de jugadores
			if (turnoActual == fichaJugador1) {
				turnoActual = fichaJugador2; // cambio de J1 a J2
			} else {
				turnoActual = fichaJugador1;
			}
		}
	}

	// funcion que comprueba si gana jugador1
	public static boolean ganaJugador1() {
		// Verifica las filas
		for (int i = 0; i < 3; i++) {
			if (tablero[i] == 'X' && tablero[i + 1] == 'X' && tablero[i + 2] == 'X') {
				return true;
			}
		}

		// Verifica las columnas
		for (int i = 0; i < 3; i++) {
			if (tablero[i] == 'X' && tablero[i + 3] == 'X' && tablero[i + 6] == 'X') {
				return true;
			}
		}

		// Verifica las diagonales
		if (tablero[0] == 'X' && tablero[4] == 'X' && tablero[8] == 'X') {
			return true;
		}

		if (tablero[2] == 'X' && tablero[4] == 'X' && tablero[6] == 'X') {
			return true;
		}

		// Si no se cumple ninguna condición
		return false;
	}

	// funcion que comprueba si gana jugador2
	public static boolean ganaJugador2() {
		// aquí se verifica las filas
		for (int i = 0; i < 3; i++) {
			if (tablero[i] == 'O' && tablero[i + 1] == 'O' && tablero[i + 2] == 'O') {
				return true;
			}
		}
		// aquí se verifica las columnas
		for (int i = 0; i < 3; i++) {
			if (tablero[i] == 'O' && tablero[i + 3] == 'O' && tablero[i + 6] == 'O') {
				return true;
			}
		}
		// Verifica las diagonales
		if (tablero[0] == 'O' && tablero[4] == 'O' && tablero[8] == 'O') {
			return true;
		}
		if (tablero[2] == 'O' && tablero[4] == 'O' && tablero[6] == 'O') {
			return true;
		}
		// Si no se cumple ninguna condición
		return false;
	}

	public static void mostrarEstadisticas(int[] estadisticas) {
		System.out.println("Las victorias del Jugador 1 son: " + estadisticas[0] + " veces");
		System.out.println("Las victorias del Jugador 2 son: " + estadisticas[1] + " veces");
		System.out.println("El número de partidas empatadas son: " + estadisticas[2]);
	}

	public static void reiniciarEstadisticas(int[] estadisticas) {
		if (estadisticas[0] == 0 && estadisticas[1] == 0 && estadisticas[2] == 0) {
			System.out.println("Debes jugar al menos una vez para tener estadísticas antes de reiniciar.");

		} else {
			System.out.println("¿Estás seguro de que deseas reiniciar las estadísticas? (1: Sí, 2: No)");
			int opcion = entrada.nextInt();
			if (opcion == 1) {
				estadisticas[0] = 0;
				estadisticas[1] = 0;
				estadisticas[2] = 0;

			} else {
				System.out.println("No se ha reiniciado.");
			}
		}
	}
}
