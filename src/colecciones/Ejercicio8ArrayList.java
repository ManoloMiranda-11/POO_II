package colecciones;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8ArrayList {

	public static void main(String[] args) {
		Random random = new Random();
		int numeroSecreto = random.nextInt(100) + 1;
		int[] historial = new int[100];
		int intentosTotales = 0;
		Scanner scanner = new Scanner(System.in);
		int intento;

		System.out.println("Adivina el número entre 1 y 100.");

		for (int i = 0; i < 100; i++) {
			System.out.print("Introduce tu intento: ");
			intento = scanner.nextInt();
			historial[i] = intento;
			intentosTotales++;

			if (intento < numeroSecreto) {
				System.out.println("El número es mayor.");
			} else if (intento > numeroSecreto) {
				System.out.println("El número es menor.");
			} else {
				System.out.println("¡Correcto! Has adivinado el número.");
				break;
			}
		}

		System.out.println("Intentos totales: " + intentosTotales);
		System.out.print("Historial: ");
		for (int i = 0; i < intentosTotales; i++) {
			System.out.print(historial[i] + " ");
		}

		scanner.close();
	}
}
