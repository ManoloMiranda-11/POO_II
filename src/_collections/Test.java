package _collections;

// CLASE Test: Crea un parking, añade coches y muestra los informes.
public class Test {
    public static void main(String[] args) {
        // Se crea un parking llamado "P-1" con 10 plazas.
        Parking p1 = new Parking("Mi Primer Parking", 10);
        
        // Se añaden 8 coches aleatorios al parking.
        for (int i = 0; i < 8; i++) {
            p1.entraCoche(new Coche());
        }

        // Se muestran los distintos informes del parking.
        p1.reportParking();      // Informe de la lista de coches.
        p1.reportColores();      // Informe de cantidad de coches por color.
        p1.reportMarcas();       // Informe de cantidad de coches por marca.
        p1.reportCochesIguales(); // Informe de coches iguales (según su representación).
        p1.reportSetCoches();    // Informe del conjunto de coches (sin duplicados).
    }
}