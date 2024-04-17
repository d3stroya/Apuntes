
package tema11.ejercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author d3stroya
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        Set<String> conjuntoHash = new HashSet();
        Set<String> conjuntoLinkedHash = new LinkedHashSet();
        
        /**
         * Recorro el array de meses y voy añadiendo 
         * cada uno a ambos conjuntos.
         * De esta forma, sólo itero una vez sobre el array.
         */            
        for(int i = 0; i < meses.length; i++) {
            conjuntoHash.add(meses[i]);
            conjuntoLinkedHash.add(meses[i]);
        }
        
        /**
         * Recorro los conjuntos
         */
        System.out.println("HASH SET (Orden por código hash)");
        conjuntoHash.forEach(System.out::println);
        
        System.out.println("\nLINKED HASH SET (Orden de inserción)");
        conjuntoLinkedHash.forEach(System.out::println);
    }
}
