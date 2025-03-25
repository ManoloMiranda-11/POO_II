package colecciones;

import java.util.ArrayList;

public class Frase2 {
	
	private ArrayList<String> palabras;

	public Frase2(String frase) {
		palabras = new ArrayList<String>();
		String[] arrayPalabras = frase.split(" ");
		for(String palabra : arrayPalabras) {
			palabras.add(palabra);
		}
	}
	
	@Override
    public String toString() {
		String resultado = "";
        for (String palabra : palabras) {
			resultado = resultado + palabra + " ";
		}
        return resultado;
    }
	
	void addPalabra(String palabra) {
		palabras.add(palabra);
		
	}
		
	
	public static void main(String[] args) {
		Frase2 f1 = new Frase2("Hola soy yo");
		System.out.println(f1);
		f1.addPalabra("Manuel");
		System.out.println(f1);
		
	}
	
	

}
