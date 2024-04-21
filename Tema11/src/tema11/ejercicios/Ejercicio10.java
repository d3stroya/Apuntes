
package tema11.ejercicios;

import java.util.*;

/**
 *
 * @author d3stroya
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        //TREESET
        Set<Persona> conjunto = new TreeSet<Persona>();
        conjunto.add(new Persona("Quique", 38));
        conjunto.add(new Persona("Elena", 26));
        conjunto.add(new Persona("Alba", 33));
        conjunto.add(new Persona("Julian", 45));
        conjunto.add(new Persona("Martin", 7));
        
        System.out.println("\nMostrando TreeSet (orden descendente por edad)");
        mostrarConjunto(conjunto);
        
        //HASHSET
        Set<Persona> conjuntoHash = new HashSet<Persona>();
        conjuntoHash.add(new Persona("Quique", 38));
        conjuntoHash.add(new Persona("Elena", 26));
        conjuntoHash.add(new Persona("Alba", 33));
        conjuntoHash.add(new Persona("Julian", 45));
        conjuntoHash.add(new Persona("Martin", 7));
        
		System.out.println("\nMostrando HashSet (orden por código hash)");
        mostrarConjunto(conjuntoHash);
        
        //ARRAYLIST
        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona("Quique", 38));
        lista.add(new Persona("Elena", 26));
        lista.add(new Persona("Alba", 33));
        lista.add(new Persona("Julian", 45));
        lista.add(new Persona("Martin", 7));
        
        Collections.sort(lista);
        System.out.println("\nMostrando ArrayList (orden descendente por edad)");
        mostrarLista(lista);
        
        //TREEMAP
        Map<Integer, Persona> mapa = new TreeMap<>();
        mapa.put(4, new Persona("Julian", 45));
        mapa.put(2, new Persona("Elena", 26));
        mapa.put(1, new Persona("Quique", 38));
        mapa.put(5, new Persona("Martin", 7));
        mapa.put(3, new Persona("Alba", 33));
        
        System.out.println("\nMostrando Mapa (orden ascendente por clave)");
        mostrarMapa(mapa);
    }

    private static void mostrarConjunto(Set<Persona> conjunto) {
        conjunto.forEach(System.out::println);
    }

    private static void mostrarLista(List<Persona> lista) {
        lista.forEach(System.out::println);
    }

    private static void mostrarMapa(Map<Integer, Persona> mapa) {
        mapa.forEach((clave, valor) -> System.out.println(clave + " " + valor));
    }
}
