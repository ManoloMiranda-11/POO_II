package colecciones;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intento;
        
        System.out.println("¡Bienvenido al juego Adivina el Número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. Intenta adivinarlo.");

        do {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (intento != numeroSecreto);

        scanner.close();
    }
}
