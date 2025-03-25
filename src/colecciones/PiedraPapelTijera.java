package colecciones;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] opciones = {"piedra", "papel", "tijera"};
        
        System.out.println("¡Bienvenido al juego Piedra, Papel o Tijera!");
        System.out.println("Escribe tu elección (piedra, papel o tijera): ");
        
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        // Validar la entrada del usuario
        if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
            System.out.println("Entrada no válida. Debes escribir piedra, papel o tijera.");
        } else {
            // Generar la elección de la computadora
            int indiceComputadora = random.nextInt(3);
            String eleccionComputadora = opciones[indiceComputadora];

            System.out.println("La computadora eligió: " + eleccionComputadora);

            // Determinar el ganador
            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("¡Empate!");
            } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                       (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                       (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }
        }

        scanner.close();
    }
}
