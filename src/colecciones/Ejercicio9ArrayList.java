package colecciones;

import java.util.Scanner;

public class Ejercicio9ArrayList {

    public static void main(String[] args) {
        String palabraSecreta = "MURCIELAGO"; // Palabra a adivinar
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        boolean[] letrasAdivinadas = new boolean[palabraSecreta.length()];
        int intentosRestantes = 6; // Máximo de intentos
        char[] historial = new char[26]; // Historial de letras intentadas
        int historialIndex = 0;
        Scanner scanner = new Scanner(System.in);

        // Inicializar palabra oculta con "_"
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraAdivinada[i] = '_';
        }

        System.out.println("¡Bienvenido al juego del ahorcado!");
        
        while (intentosRestantes > 0) {
            // Mostrar estado actual de la palabra
            System.out.print("Palabra: ");
            for (char c : palabraAdivinada) {
                System.out.print(c + " ");
            }
            System.out.println("\nIntentos restantes: " + intentosRestantes);
            System.out.print("Introduce una letra: ");
            char letra = Character.toUpperCase(scanner.next().charAt(0));

            // Guardar en historial si no se ha usado antes
            boolean letraUsada = false;
            for (char c : historial) {
                if (c == letra) {
                    letraUsada = true;
                    break;
                }
            }
            if (!letraUsada) {
                historial[historialIndex++] = letra;
            } else {
                System.out.println("Ya has intentado esa letra.");
                continue;
            }

            // Comprobar si la letra está en la palabra
            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    letrasAdivinadas[i] = true;
                    acierto = true;
                }
            }

            // Si no acierta, reducir intentos
            if (!acierto) {
                intentosRestantes--;
                System.out.println("Letra incorrecta.");
            }

            // Verificar si el usuario ha ganado
            boolean haGanado = true;
            for (boolean estado : letrasAdivinadas) {
                if (!estado) {
                    haGanado = false;
                    break;
                }
            }

            if (haGanado) {
                System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
                break;
            }
        }

        if (intentosRestantes == 0) {
            System.out.println("¡Has perdido! La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }
}
