package colecciones;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {
	private static char[][] tablero = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };

	private static char jugador = 'X';
	private static char computadora = 'O';
	private static Random random = new Random();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean juegoTerminado = false;

		System.out.println("¡Bienvenido al Tres en Raya contra la computadora!");
		imprimirTablero();

		while (!juegoTerminado) {
			// Turno del jugador
			if (!jugarTurnoJugador(scanner)) {
				continue;
			}

			imprimirTablero();

			if (hayGanador(jugador)) {
				System.out.println("¡Felicidades! Has ganado.");
				break;
			}

			if (tableroLleno()) {
				System.out.println("¡Es un empate!");
				break;
			}

			// Turno de la computadora
			jugarTurnoComputadora();
			imprimirTablero();

			if (hayGanador(computadora)) {
				System.out.println("¡La computadora ha ganado!");
				break;
			}

			if (tableroLleno()) {
				System.out.println("¡Es un empate!");
				break;
			}
		}

		scanner.close();
	}

	private static void imprimirTablero() {
		System.out.println("    0   1   2");
		System.out.println("  -------------");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " | ");
			for (int j = 0; j < 3; j++) {
				System.out.print(tablero[i][j] + " | ");
			}
			System.out.println("\n  -------------");
		}
	}

	private static boolean jugarTurnoJugador(Scanner scanner) {
		int fila, columna;

		System.out.println("Tu turno (X):");
		while (true) {
			System.out.print("Ingresa fila (0-2): ");
			fila = scanner.nextInt();
			System.out.print("Ingresa columna (0-2): ");
			columna = scanner.nextInt();

			if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ') {
				tablero[fila][columna] = jugador;
				return true;
			} else {
				System.out.println("Movimiento inválido, intenta de nuevo.");
			}
		}
	}

	private static void jugarTurnoComputadora() {
		System.out.println("Turno de la computadora (O):");
		int fila, columna;

		do {
			fila = random.nextInt(3);
			columna = random.nextInt(3);
		} while (tablero[fila][columna] != ' ');

		tablero[fila][columna] = computadora;
	}

	private static boolean hayGanador(char simbolo) {
		// Comprobar filas y columnas
		for (int i = 0; i < 3; i++) {
			if ((tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo)
					|| (tablero[0][i] == simbolo && tablero[1][i] == simbolo && tablero[2][i] == simbolo)) {
				return true;
			}
		}

		// Comprobar diagonales
		if ((tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo)
				|| (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo)) {
			return true;
		}

		return false;
	}

	private static boolean tableroLleno() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}
}
