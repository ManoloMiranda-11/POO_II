package _collections;

import java.util.Objects;

// CLASE Coche: Representa un coche con un color y una marca.
public class Coche {
    private Color color;
    private Marca marca;

    // Constructor que recibe color y marca.
    public Coche(Color color, Marca marca) {
        this.color = color;
        this.marca = marca;
    }

    // Constructor por defecto: asigna valores aleatorios.
    public Coche() {
        this(Color.aleatorio(), Marca.aleatorio());
    }

    // Obtiene el color del coche.
    public Color getColor() {
        return color;
    }

    // Obtiene la marca del coche.
    public Marca getMarca() {
        return marca;
    }

    // Representación en cadena del coche, incluyendo su hashCode.
    @Override
    public String toString() {
        return "Coche [color=" + color + ", marca=" + marca + "] (" + hashCode() + ")";
    }

    // hashCode basado en color y marca.
    @Override
    public int hashCode() {
        return Objects.hash(color, marca);
    }

    // Dos coches son iguales si tienen el mismo color y la misma marca.
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return color == other.color && marca == other.marca;
	}
}