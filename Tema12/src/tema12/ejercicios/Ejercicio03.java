
package tema12.ejercicios;

import java.io.File;

/**
 *
 * @author d3stroya
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        File dir = new File("ejercicio03/DiasSemana");        
        String[] listaDias = dir.list();

        System.out.println("Nº de archivos en el directorio: " + listaDias.length);
        
        System.out.println("\nArchivos en el directorio:");
        for (int i = 0; i < listaDias.length; i++) {
            System.out.println(listaDias[i]);
            
        }
        
    }
}
