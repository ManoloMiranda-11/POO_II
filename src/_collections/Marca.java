package _collections;

import java.util.*;

// ENUM Marca: Define las marcas disponibles con su abreviatura y nombre completo.
public enum Marca {
    VW("VW", "Volkswagen"), 
    BM("BM", "BMW"), 
    AU("AU", "Audi"), 
    ME("ME", "Mercedes"), 
    TO("TO", "Toyota");

    private final String abreviatura;
    private final String nombreCompleto;
    // Generador de números aleatorios para seleccionar una marca al azar.
    private static final Random random = new Random();

    Marca(String abreviatura, String nombreCompleto) {
        this.abreviatura = abreviatura;
        this.nombreCompleto = nombreCompleto;
    }

    // Devuelve el nombre completo de la marca.
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    // Retorna una marca aleatoria de las definidas.
    public static Marca aleatorio() {
        Marca[] marcas = Marca.values();
        return marcas[random.nextInt(marcas.length)];
    }

    // Representación en cadena: abreviatura y nombre completo.
    @Override
    public String toString() {
        return abreviatura + ": " + nombreCompleto;
    }
}