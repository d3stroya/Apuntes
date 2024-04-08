/*
 * Sets y maps
 */
package tema11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author anabel
 */
public class Tema11 {

    public static void main(String[] args) {
        // 1. CONJUNTOS (SET)
        System.out.println("1. CONJUNTOS (SET)");
//        Set<String> conjunto = new Set();   // ERROR: Set es una interfaz y no se puede instanciar
        Set<String> conjunto = new HashSet<>();   // HashSet es una clase que implementa la interfaz Set y sí se puede instanciar
        
        // Insertar elementos
        conjunto.add("Pan");
        conjunto.add("Leche");
        conjunto.add("Macarrones");
        conjunto.add("Macarrones");
        conjunto.add("Macarrones");
        conjunto.add("Jamón");
        conjunto.add("Lubina");
        
        // Imprimir conjunto
        System.out.println("\nLISTA DE LA COMPRA");
        System.out.println(conjunto);
        
        // Eliminar elementos
        System.out.println("\nLISTA DE LA COMPRA (FOR EACH X2)");
        conjunto.remove("Pan");
        
        // Recorrer el conjunto con bucles
        conjunto.forEach(System.out::println);
        
        for(String producto : conjunto) {
            System.out.println(producto);
        }    
        
        // Iterar sobre el conjunto
        System.out.println("\nLISTA DE LA COMPRA (ITERADOR)");
        Iterator<String> it = conjunto.iterator();
        int i = 0;
        
        while(it.hasNext() && i < 2) {
            System.out.println(" · " + it.next());
            i++;
        }        
        
        // Obtener tamaño del conjunto
        System.out.println("\nTamaño: " + conjunto.size());
        
        // ¿Está vacío?
        System.out.println("¿Está vacío? " + conjunto.isEmpty());
        
        // ¿Contiene un elemento dado?
        System.out.println("¿Contiene Leche? " + conjunto.contains("Leche"));

        // Vaciar el conunto
        System.out.println("CONJUNTO VACÍO");
//        conjunto.clear();
        System.out.println(conjunto);
        
        // Insertar todos los elementos de otra estructura, eliminando los duplicados
        System.out.println("\nNUEVA LISTA");
        List<String> lista = new LinkedList<>();
        lista.add("Queso");
        lista.add("Queso");
        lista.add("Salsa barbacoa");
        conjunto.addAll(lista);
        System.out.println(conjunto);
        
        // Diferencias entre HashSet (inserta los elementos por orden de su código hash), 
        // LinkedHashSet (orden de inserción)
        // y TreeSet (orden natural)
        System.out.println("\nDIFERENCIAS ENTRE CONJUNTOS");
        Set<String> conjuntoOrdenado = new LinkedHashSet<>();
        conjuntoOrdenado.add("Leche");
        conjuntoOrdenado.add("Macarrones");
        conjuntoOrdenado.add("Jamón");
        conjuntoOrdenado.add("Lubina");
        conjuntoOrdenado.add("Queso");
        conjuntoOrdenado.add("Salsa barbacoa");
        
        Set<String> conjuntoArbol = new TreeSet<>();
        conjuntoArbol.add("Leche");
        conjuntoArbol.add("Macarrones");
        conjuntoArbol.add("Jamón");
        conjuntoArbol.add("Lubina");
        conjuntoArbol.add("Queso");
        conjuntoArbol.add("Salsa barbacoa");
        
        System.out.println("HashSet");
        System.out.println(conjunto);
        
        System.out.println("\nLinkedHashSet");
        System.out.println(conjuntoOrdenado);
        
        System.out.println("\nTreeSet");
        System.out.println(conjuntoArbol);
        
        
        
        // 2. MAPAS
        System.out.println("2. MAPAS");
        // Instanciar un mapa
        Map<Integer, String> mapa = new HashMap<>();
        
        // Insertar elementos (pares clave - valor)
        mapa.put(23, "Cata Coll");
        mapa.put(2, "Ona Batlle");
        mapa.put(11, "Alexia Putellas");
        mapa.put(6, "Aitana Bonmatí");
        mapa.put(10, "Jenni Hermoso");
        
        // Acceder a un elemento por su clave
        System.out.println("\nACCEDER A UN ELEMENTO");
        System.out.println(mapa.get(6));
        
        // Recorrer el mapa
        System.out.println("\nALINEACIÓN (forEach)");
        mapa.forEach((clave, valor) -> System.out.println(clave + " " + valor));
        
        // Iterar sobre el mapa
        System.out.println("\nALINEACION (Iterator)");
        Iterator<Integer> mapIt = mapa.keySet().iterator();
        while(mapIt.hasNext()) {
            Integer clave = mapIt.next();
            System.out.println(clave + " " +mapa.get(clave));
        }
        
        // Diferencias entre mapas:
        //  - HashMap (orden de hashcode),
        //  - TreeMap (orden natural) y
        //  - LinkedHashMap (orden de inserción)
        System.out.println("\nHashMap");
        mapa.forEach((clave, valor) -> System.out.println(clave + " " + valor));
        
        System.out.println("\nTreeMap");
        Map<Integer, String> mapaArbol = new TreeMap<>();
        mapaArbol.put(23, "Cata Coll");
        mapaArbol.put(2, "Ona Batlle");
        mapaArbol.put(11, "Alexia Putellas");
        mapaArbol.put(6, "Aitana Bonmatí");
        mapaArbol.put(10, "Jenni Hermoso");
        mapaArbol.forEach((clave, valor) -> System.out.println(clave + " " + valor));
        
        System.out.println("\nLinkedHashMap");
        Map<Integer, String> mapaOrdenado = new LinkedHashMap<>();
        mapaOrdenado.put(23, "Cata Coll");
        mapaOrdenado.put(2, "Ona Batlle");
        mapaOrdenado.put(11, "Alexia Putellas");
        mapaOrdenado.put(6, "Aitana Bonmatí");
        mapaOrdenado.put(10, "Jenni Hermoso");
        mapaOrdenado.forEach((clave, valor) -> System.out.println(clave + " " + valor));
        
        // Eliminar un par clave - valor
        System.out.println("\nEliminamos el par con clave 2: " + mapa.get(2));
        mapa.remove(2);
        System.out.println(mapa);
        
    }

    // EJERCICIO 1
    

}
