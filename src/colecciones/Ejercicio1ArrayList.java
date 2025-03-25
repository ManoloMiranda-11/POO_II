package colecciones;

import java.util.ArrayList;

public class Ejercicio1ArrayList {

	public static void main(String[] args) {

		// Crear un ArrayList de Strings

		ArrayList<String> lista = new ArrayList<>();

		// Añadir elementos

		lista.add("Miguel");
		lista.add("Paco");
		lista.add("Julia");
		System.out.println(lista);

		// Insertar en una posición específica

		lista.add(1, "Maria");

		// Reemplazar un elemento

		lista.set(0, "Eduardo");
		System.out.println("Lista después de reemplazar 'Miguel' con 'Eduardo': " + lista);

		// Obtener tamaño

		System.out.println("Tamaño de la lista: " + lista.size());
		
		// Obtener uno especifico
		
		System.out.println(lista.get(2));
		
		// Devuelve true si lo contiene, si no
		
		System.out.println(lista.contains("Julia"));
		
		// Devuelve posición de lo que indicas
		
		System.out.println(lista.indexOf("Eduardo"));
		
		// Quitar de la lista
		
		System.out.println(lista.remove(3));
		
		// Sobreescribe el elemento que se encuentra en una posición
		
		System.out.println(lista.set(2, "Alejandro"));

		// Convertir a array

		String[] array = lista.toArray(new String[0]);
		System.out.println("Array convertido: ");
		for (String s : array) {
			System.out.println(s);
		}

		// Limpiar la lista

		lista.clear();
		System.out.println("Lista después de limpiarlo: " + lista);

	}
}