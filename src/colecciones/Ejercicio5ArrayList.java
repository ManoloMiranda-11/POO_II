package colecciones;

import java.util.ArrayList;

public class Ejercicio5ArrayList {

    public static void main(String[] args) {
        int n = 10;

        ArrayList<Integer> listaPares = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            listaPares.add(i * 2);
        }

        System.out.println("Los primeros " + n + " números pares son: " + listaPares);
    }
}