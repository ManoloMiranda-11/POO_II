package colecciones;

import java.util.ArrayList;

public class Ejercicio2ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> listaLibros = new ArrayList<>();
		
		listaLibros.add("Cien años de soledad");
		listaLibros.add("1984");
		listaLibros.add("El Alquimista");
		listaLibros.add("El Principito");
		listaLibros.add("El retrato de Dorian Grey");
		
		System.out.println(listaLibros);
		
		System.out.println("Usando bucle for");
		for(int i = 0; i < listaLibros.size(); i++) {
			System.out.println(listaLibros);
		}
		
		System.out.println("Usando foreach");
		for (String l1 : listaLibros) {
			System.out.println(l1);
		}
		
		
		
	}

}
