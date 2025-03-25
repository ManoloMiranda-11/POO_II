package colecciones;

import java.util.ArrayList;

public class Ejercicio6ArrayList {

	public static void main(String[] args) {

		int n = 8;
		int m = 7;
		int p = 4;

		ArrayList<Integer> listaMultiplos = new ArrayList<>();

		for(int i = p; listaMultiplos.size() < n; i++) {
			if(i % n == 0) {
				listaMultiplos.add(i);
			}
		}
		
		System.out.println("Los primeros " + n + " multiplos de " + m + " a partir de " + p + " son : " + listaMultiplos);
}
}