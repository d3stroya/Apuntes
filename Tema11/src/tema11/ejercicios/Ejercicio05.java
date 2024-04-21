
package tema11.ejercicios;

import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

/**
 *
 * @author d3stroya
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {
        Map<Integer, String> arbol = new TreeMap();
        Map<Integer, String> enlazado = new LinkedHashMap();
        String[] meses = {
            "Enero", 
            "Febrero", 
            "Marzo", 
            "Abril", 
            "Mayo", 
            "Junio", 
            "Julio",    
            "Agosto", 
            "Septiembre", 
            "Ocubre", 
            "Noviembre", 
            "Diciembre"
        };
        
        for(int i = 11; i >= 0; i--) {
            arbol.put((i + 1), meses[i]);
            enlazado.put((i + 1), meses[i]);
        }
        
        System.out.println("TREE MAP (orden ascendente por clave)");
        arbol.forEach((clave, valor) -> System.out.println(clave + " - " + valor));
        
        System.out.println("\nLINKED HAS MAP (orden de inserción)");
        enlazado.forEach((clave, valor) -> System.out.println(clave + " - " + valor));
        
    }
}
