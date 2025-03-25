package colecciones;

import java.util.Arrays;

public class Frase {
	
	private String[] palabras;

	public Frase(String Frase) {
		this.palabras = Frase.split(" ");
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
		String[] nuevasPalabras = new String[palabras.length + 1];
		for(int i = 0; i < palabras.length; i++) {
			nuevasPalabras[i] = palabras[i];
		}
		
		nuevasPalabras[palabras.length] = palabra;
		palabras = nuevasPalabras;
		
	}
	
	public static void main(String[] args) {
		Frase f1 = new Frase("Hola soy yo");
		System.out.println(f1);
		f1.addPalabra("Manuel");
		System.out.println(f1);
		
	}
	
	

}
