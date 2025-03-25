package _collections;

import java.util.*;

// ENUM Color: Define los colores disponibles con su abreviatura y nombre completo.
public enum Color {
    RO("RO", "Rojo"), 
    NA("NA", "Naranja"), 
    AM("AM", "Amarillo"), 
    VE("VE", "Verde"), 
    AZ("AZ", "Azul"), 
    IN("IN", "Índigo"), 
    VI("VI", "Violeta");

    private final String abreviatura;
    private final String nombreCompleto;
    // Generador de números aleatorios para seleccionar un color al azar.
    private static final Random random = new Random();

    Color(String abreviatura, String nombreCompleto) {
        this.abreviatura = abreviatura;
        this.nombreCompleto = nombreCompleto;
    }

    // Devuelve el nombre completo del color.
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    // Retorna un color aleatorio de los definidos.
    public static Color aleatorio() {
        Color[] colores = Color.values();
        return colores[random.nextInt(colores.length)];
    }

    // Representación en cadena: abreviatura y nombre completo.
    @Override
    public String toString() {
        return abreviatura + ": " + nombreCompleto;
    }
}