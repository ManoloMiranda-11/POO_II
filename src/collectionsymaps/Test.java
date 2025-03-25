package collectionsymaps;

import java.util.*;

public class Test {
	
	public static void main(String[] args) {
String cuento = CuentaCuentos.obtenerCuento();


        
        String[] palabras = devuelvePalabras(cuento);
        arrayPalabras(palabras);
        arrayListPalabras(palabras);
        hashSetPalabras(palabras);
        treeSetPalabras(palabras);
        mapConteoPalabras(palabras);
        mapConteoPalabrasOrdenadas(palabras);
        treeSetPalabrasOrdenadasInversas(palabras);
        treeSetPalabrasOrdenadasLongitud(palabras);
    }
    
    public static String[] devuelvePalabras(String texto) {
        texto = texto.replaceAll("[.,\\n]", "");
        return texto.split(" ");
    }

    public static void arrayPalabras(String[] palabras) {
        System.out.println("Array de palabras\n=================");
        System.out.println(Arrays.toString(palabras));
        System.out.println("Lista original tiene " + palabras.length + " palabras.\n");
    }

    public static void arrayListPalabras(String[] palabras) {
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(palabras));
        System.out.println("ArrayList de palabras\n=================");
        System.out.println(lista);
        System.out.println("Lista en ArrayList tiene " + lista.size() + " palabras.\n");
    }

    public static void hashSetPalabras(String[] palabras) {
        Set<String> set = new HashSet<>(Arrays.asList(palabras));
        System.out.println("HashSet de palabras\n=================");
        System.out.println(set);
        System.out.println("Lista en HashSet tiene " + set.size() + " palabras.\n");
    }

    public static void treeSetPalabras(String[] palabras) {
        Set<String> set = new TreeSet<>(Arrays.asList(palabras));
        System.out.println("TreeSet de palabras\n=================");
        System.out.println(set);
        System.out.println("Lista en TreeSet tiene " + set.size() + " palabras.\n");
    }

    public static void mapConteoPalabras(String[] palabras) {
        Map<String, Integer> mapa = new HashMap<>();
        for (String palabra : palabras) {
            mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
        }
        System.out.println("Conteo de repeticiones de palabras\n=================");
        System.out.println(mapa);
        System.out.println();
    }

    public static void mapConteoPalabrasOrdenadas(String[] palabras) {
        Map<String, Integer> mapa = new TreeMap<>();
        for (String palabra : palabras) {
            mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
        }
        System.out.println("Conteo de repeticiones de palabras ordenadas\n=================");
        System.out.println(mapa);
        System.out.println();
    }

    public static void treeSetPalabrasOrdenadasInversas(String[] palabras) {
        Set<String> set = new TreeSet<>(Collections.reverseOrder());
        set.addAll(Arrays.asList(palabras));
        System.out.println("Lista de palabras únicas en orden inverso\n=================");
        System.out.println(set);
        System.out.println("Lista en TreeSet tiene " + set.size() + " palabras.\n");
    }

    public static void treeSetPalabrasOrdenadasLongitud(String[] palabras) {
        Set<String> set = new TreeSet<>(Comparator.comparingInt(String::length));
        set.addAll(Arrays.asList(palabras));
        System.out.println("Lista de palabras únicas en orden de longitud\n=================");
        System.out.println(set);
        System.out.println("Lista en TreeSet tiene " + set.size() + " palabras.\n");
    }
	}
