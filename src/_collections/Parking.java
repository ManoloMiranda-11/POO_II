package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {
    
    private String nombre;
    private int plazasTotales;
    private int plazasLibres;
    
    // Lista para mantener los coches en orden de entrada
    private List<Coche> listaCoches;
    
    // Conjunto para almacenar coches sin duplicados (según equals/hashCode de Coche)
    private Set<Coche> conjuntoCoches;
    
    // Map para llevar la cuenta de cuántos coches hay de cada color
    private Map<Color, Integer> mapaColores;
    
    // Map para llevar la cuenta de cuántos coches hay de cada marca
    private Map<Marca, Integer> mapaMarcas;
    
    /**
     * Constructor principal: recibe el nombre del parking y el número de plazas.
     */
    public Parking(String nombre, int plazasTotales) {
        this.nombre = nombre;
        this.setPlazasTotales(plazasTotales);
        this.plazasLibres = plazasTotales;
        
        this.listaCoches = new ArrayList<>();
        this.conjuntoCoches = new HashSet<>();
        
        this.mapaColores = new HashMap<>();
        this.mapaMarcas = new HashMap<>();
    }
    
    /**
     * Devuelve la lista de coches (orden de entrada).
     */
    public List<Coche> getListaCoches() {
        return listaCoches;
    }
    
    /**
     * Devuelve el conjunto de coches (sin duplicados).
     */
    public Set<Coche> getConjuntoCoches() {
        return conjuntoCoches;
    }

    /**
     * Añade un coche al parking, si hay plazas libres y no está ya dentro.
     * @return true si entra con éxito, false si no
     */
    public boolean entraCoche(Coche coche) {
        // Comprobamos si queda sitio
        if (plazasLibres <= 0) {
            return false;
        }
        // Comprobamos si ya está dentro (según equals, color y marca)
        if (listaCoches.contains(coche)) {
            return false;
        }
        
        // Añadimos el coche a la lista y al set
        listaCoches.add(coche);
        conjuntoCoches.add(coche);
        plazasLibres--;
        
        // Actualizamos recuento de color
        Color color = coche.getColor();
        mapaColores.put(color, mapaColores.getOrDefault(color, 0) + 1);
        
        // Actualizamos recuento de marca
        Marca marca = coche.getMarca();
        mapaMarcas.put(marca, mapaMarcas.getOrDefault(marca, 0) + 1);
        
        return true;
    }
    
    /**
     * Saca aleatoriamente un coche del parking (si hay alguno).
     * @return true si se ha podido sacar un coche, false si no hay ninguno
     */
    public boolean saleCocheAleatorio() {
        if (listaCoches.isEmpty()) {
            return false;
        }
        // Elegimos un índice aleatorio
        Random random = new Random();
        int indice = random.nextInt(listaCoches.size());
        
        // Quitamos el coche de la lista y del set
        Coche cocheASalir = listaCoches.remove(indice);
        conjuntoCoches.remove(cocheASalir);
        plazasLibres++;
        
        // Actualizamos mapa de colores
        Color color = cocheASalir.getColor();
        int cuentaColor = mapaColores.getOrDefault(color, 0);
        if (cuentaColor > 1) {
            mapaColores.put(color, cuentaColor - 1);
        } else {
            mapaColores.remove(color);
        }
        
        // Actualizamos mapa de marcas
        Marca marca = cocheASalir.getMarca();
        int cuentaMarca = mapaMarcas.getOrDefault(marca, 0);
        if (cuentaMarca > 1) {
            mapaMarcas.put(marca, cuentaMarca - 1);
        } else {
            mapaMarcas.remove(marca);
        }
        
        return true;
    }
    
    /**
     * Reporte de todos los coches (la lista completa) con plazas libres.
     */
    public void reportParking() {
        System.out.println("LISTADO COCHES");
        System.out.println("--------------");
        System.out.println("Parking: " + nombre);
        
        for (Coche c : listaCoches) {
            // Puedes ajustar la forma de mostrar el coche
            System.out.println("Coche: " + c.getMarca() + " - " + c.getColor());
        }
        
        System.out.println("Total coches: " + listaCoches.size()
                           + ", plazas libres: " + plazasLibres);
    }
    
    /**
     * Reporte de colores con recuento (usa el mapa de colores).
     */
    public void reportColores() {
        System.out.println("REPORT DE COLORES");
        System.out.println("-----------------");
        System.out.println("Parking: " + nombre);
        
        for (Map.Entry<Color, Integer> entry : mapaColores.entrySet()) {
            Color color = entry.getKey();
            int count = entry.getValue();
            
            if (count == 1) {
                System.out.println("El coche de color " + color + " se repite 1 vez.");
            } else {
                System.out.println("El coche de color " + color
                                   + " se repite " + count + " veces.");
            }
        }
        
        System.out.println("Total coches: " + listaCoches.size());
    }
    
    /**
     * Reporte de marcas con recuento (usa el mapa de marcas).
     */
    public void reportMarcas() {
        System.out.println("REPORT DE MARCAS");
        System.out.println("----------------");
        System.out.println("Parking: " + nombre);
        
        for (Map.Entry<Marca, Integer> entry : mapaMarcas.entrySet()) {
            Marca marca = entry.getKey();
            int count = entry.getValue();
            
            if (count == 1) {
                System.out.println("El coche de marca " + marca + " se repite 1 vez.");
            } else {
                System.out.println("El coche de marca " + marca
                                   + " se repite " + count + " veces.");
            }
        }
        
        System.out.println("Total coches: " + listaCoches.size());
    }
    
    /**
     * Reporte de "coches iguales" agrupados por marca y color.
     */
    public void reportCochesIguales() {
        System.out.println("REPORT DE COCHES IGUALES");
        System.out.println("------------------------");
        System.out.println("Parking: " + nombre);
        
        // Mapa temporal para agrupar por "marca color"
        Map<String, Integer> mapaIguales = new HashMap<>();
        
        for (Coche c : listaCoches) {
            // Clave que combina la marca y el color
            String clave = c.getMarca() + " " + c.getColor();
            mapaIguales.put(clave, mapaIguales.getOrDefault(clave, 0) + 1);
        }
        
        // Mostramos el recuento de cada grupo
        for (Map.Entry<String, Integer> entry : mapaIguales.entrySet()) {
            String clave = entry.getKey();
            int count = entry.getValue();
            
            if (count == 1) {
                System.out.println("Coche: " + clave + " -> 1 vez");
            } else {
                System.out.println("Coche: " + clave + " -> " + count + " veces");
            }
        }
        
        System.out.println("Total coches: " + listaCoches.size());
    }
    
    /**
     * Reporte del Set de coches. Aquí se ven los coches "distintos" 
     * según equals y hashCode (color + marca).
     */
    public void reportSetCoches() {
        System.out.println("REPORT SET DE COCHES");
        System.out.println("--------------------");
        System.out.println("Parking: " + nombre);
        
        for (Coche c : conjuntoCoches) {
            System.out.println("Coche: " + c.getMarca() + " - " + c.getColor());
        }
        
        System.out.println("Total items: " + conjuntoCoches.size());
    }

	public int getPlazasTotales() {
		return plazasTotales;
	}

	public void setPlazasTotales(int plazasTotales) {
		this.plazasTotales = plazasTotales;
	}

}